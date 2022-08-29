package queryToDB;

import user.*;
import mockFrame.*;
import java.util.*;

import content.Film;
import content.Rent;
import content.Series;
import content.TopContent;
import customerGui.CustomerDashboard;
import employeeGui.EmployeeDashboard;
import loginGUI.LoginFrame;
import loginGUI.error;
import mockFrame.MockMenu;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import admingui.AdminDashboard;

import java.sql.*;
import java.sql.Date;
import java.io.*;

public class Query {
	
	private Connection con;
	public static User usr = null;
	
	public void setUser(User usr)
	{
		this.usr= usr;
	}
	
	public Query(Connection con)
	{
		this.con = con;
	}
	
	//given email return user type
	public String checkTypeOfUser(String email) throws Exception
	{
		String user_type;
		CallableStatement cs = con.prepareCall("CALL userType(?,?);");
		cs.setString(1,email);
		cs.registerOutParameter(2,Types.VARCHAR);
		ResultSet rs = cs.executeQuery();
		user_type = cs.getString(2);
		cs.close();
		return user_type;
	}
	
	//given email call appropriate navigation GUI
	public void loginAttempt(String email) throws Exception
	{
		String user_type;
		createUserObject(email);
		user_type = usr.getUser_type();
		System.out.println(user_type);
		if(user_type.equals("customer"))CustomerDashboard.initiateCustomerDashboard(this); 			//starts customer GUI
		else if (user_type.equals("employee")) EmployeeDashboard.initiateEmployeeDashBoard(this);	//starts employee GUI
		else if (user_type.equals("admin"))	AdminDashboard.initiateAdminDashboard(this);	//TODO Administrator GUI
		else {
			LoginFrame.initiateLogin(this);		//Recall login window 
			error.invokeError();				//display error dialog				
		}
	}
	

	public void createUserObject(String email) throws Exception
	{
		String user_type="";
		int user_id=0;
		String f_name="";
		String l_name="";
		try
		{
			user_type = checkTypeOfUser(email);
			PreparedStatement ps = con.prepareStatement("SELECT user_id,first_name,last_name FROM user WHERE email = ?;");
			ps.setString(1,email);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				user_id = rs.getInt("user_id");
				f_name = rs.getString("first_name");
				l_name = rs.getString("last_name");
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		User usr = new User(user_id,user_type,email,f_name,l_name);
		this.setUser(usr);				
	}
	
	//get subscription type of selected customer
	public String getCustomerSub(int customer_id) throws Exception
	{
		String sub_type = "";
		try
		{
			PreparedStatement ps = con.prepareStatement("SELECT subscription_type FROM customer WHERE customer_id = ?;");
			ps.setInt(1,customer_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				sub_type = rs.getString("subscription_type");
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		return sub_type;
	}
	
	//get active field of selected user
	public boolean getUserActivity(int user_id) throws Exception
	{
		boolean activity=true;
		try
		{
			PreparedStatement ps = con.prepareStatement("SELECT active FROM user INNER JOIN customer ON user_id"
					+ "= customer_id WHERE user_id = ?;");
			ps.setInt(1,user_id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				do{
					activity = rs.getBoolean("active");
				}while(rs.next());
				
			}
			else
			{
				ps = con.prepareStatement("SELECT active FROM user INNER JOIN employee ON user_id"
						+ "= employee_id WHERE user_id = ?;");
				ps.setInt(1,user_id);
				rs = ps.executeQuery();
				while(rs.next())
				{
					activity =rs.getBoolean("active");
				}
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		return activity;
	}
	
	//set active field for selected user
	public void setUserActivity(int user_id,boolean active) throws Exception
	{
		try
		{
			PreparedStatement ps = con.prepareStatement("UPDATE customer SET  active = ? WHERE customer_id = ?");
            // prepare data for update
            ps.setBoolean(1, active);
            ps.setInt(2, user_id);

            int rowAffected = ps.executeUpdate();
            if(1!=rowAffected) {
            	ps = con.prepareStatement("UPDATE customer SET  active = ? WHERE employee_id = ?");
                // prepare data for update
                ps.setBoolean(1, active);
                ps.setInt(2, user_id);
            }
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	//set subscription type of selected customer
	public void setUserSub(int user_id,String sub_type) throws Exception
	{		
		try
		{
			PreparedStatement ps = con.prepareStatement("UPDATE customer SET  subscription_type = ? WHERE customer_id = ?");
            // prepare data for update
            ps.setString(1, sub_type);
            ps.setInt(2, user_id);
            ps.executeUpdate();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	
	//get all films in inventory
	public List<Film> getAvailableFilms() throws Exception
	{				
		List<Film> list = new ArrayList<Film>();				
		String query = "SELECT * FROM film INNER JOIN film_inventory USING (film_id);";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			do{
				
				Film tempFilm = new Film(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4), rs.getInt(7),rs.getString(8) ,rs.getString(9), rs.getFloat(10));
				list.add(tempFilm);
			}while(rs.next());									
		}
		return list;
	}
	
	
	//get all series in inventory
	public List<Series> getAvailableSeries() throws Exception
	{
		
		List<Series> list = new ArrayList<Series>();				
		String query = "SELECT series_id, title, description, rating, seasons, total_episodes, price FROM series INNER JOIN series_season USING (series_id) INNER JOIN series_episode ON series_season_id = season_id INNER JOIN series_inventory USING (episode_id) GROUP BY series_id;";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			do{
				Series tempSeries = new Series(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getFloat(7));
				list.add(tempSeries);
			}while(rs.next());									
		}
		return list;
	}
	
	//get all rents of current user
	public List<Rent> getUserRents() throws Exception{
		List<Rent> list = new ArrayList<Rent>();
		PreparedStatement st = con.prepareStatement("SELECT rental_id, rental_date, inventory_id FROM rental WHERE customer_id = ?");
		st.setInt(1, usr.getUser_id());
		ResultSet rs = st.executeQuery();
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			do{
				Rent tempSeries = new Rent(rs.getInt(1), rs.getDate(2), this.getContentType(rs.getInt(3)), this.getContentTitle(rs.getInt(3)), this.getContentPrice(rs.getInt(1)));
				list.add(tempSeries);
			}while(rs.next());									
		}
		return list;
	};
	
	//get a list of all rents in database
	public List<Rent> getAllRents() throws Exception{
		List<Rent> list = new ArrayList<Rent>();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT rental_id, rental_date, inventory_id, customer_id FROM rental");
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			do{
				Rent tempSeries = new Rent(rs.getInt(1), rs.getDate(2), this.getContentType(rs.getInt(3)), this.getContentTitle(rs.getInt(3)), this.getContentPrice(rs.getInt(1)));
				tempSeries.setCustomerId(rs.getInt(4));
				list.add(tempSeries);
			}while(rs.next());									
		}
		return list;
	};
	
	//get type of content in inventory
	public String getContentType(int invId) {
		try
		{
			PreparedStatement ps = con.prepareStatement("SELECT * FROM film_inventory WHERE film_inventory_id = ?");
			ps.setInt(1,invId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return "Film";			
			}

		}
		catch(Exception e)
		{			
			throw new RuntimeException(e);
		}
		try
		{
			PreparedStatement ps = con.prepareStatement("SELECT * FROM series_inventory WHERE series_inventory_id = ?");
			ps.setInt(1,invId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return "Series Episode";			
			}

		}
		catch(Exception e)
		{	
			throw new RuntimeException(e);
		}		
		return "not found";
	};
	
	//get title of selected content in inventory
	public String getContentTitle(int invId) {
		try
		{
			PreparedStatement ps = con.prepareStatement("SELECT title FROM film INNER JOIN film_inventory USING(film_id) WHERE film_inventory_id = ?");
			ps.setInt(1,invId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return rs.getString(1);			
			}

		}
		catch(Exception e)
		{			
			throw new RuntimeException(e);
		}
		try
		{
			PreparedStatement ps = con.prepareStatement("SELECT title FROM series INNER JOIN series_season USING (series_id) INNER JOIN series_episode ON series_season_id = season_id INNER JOIN series_inventory USING(episode_id) WHERE series_inventory_id = ?");
			ps.setInt(1,invId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return rs.getString(1);			
			}

		}
		catch(Exception e)
		{			
			throw new RuntimeException(e);
		}		
		return "not found";
	};
	
	//get price of selected rent
	public Float getContentPrice(int rentId) {
		try
		{
			PreparedStatement ps = con.prepareStatement("SELECT amount FROM payment INNER JOIN rental USING(rental_id) WHERE rental_id = ?");
			ps.setInt(1,rentId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return rs.getFloat(1);			
			}

		}
		catch(Exception e)
		{		
			throw new RuntimeException(e);
		}
		return null;
	};
	
	//get number of films in inventory
	public int getSumofFilms() throws SQLException {
		int sum = 0;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT count(*) FROM film_inventory");
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			sum = rs.getInt(1);								
		}
		return sum;
	}

	//get number of series in inventory
	public int getSumofSeries() throws SQLException {
		int sum = 0;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT count(*) FROM series_inventory");
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			sum = rs.getInt(1);								
		}
		return sum;
	}
	
	
	//updates user's address with a new one
	public void newAddress(int uID, String address, String city, String country, String district, String postal, String phone) throws Exception {
		int addrId=0;
		CallableStatement cs = con.prepareCall("CALL newAddress(?,?,?,?,?,?);");
		cs.setString(1,address);
		cs.setString(2, city);
		cs.setString(3, country);
		cs.setString(4, district);
		cs.setString(5, postal);
		cs.setString(6, phone);
		ResultSet rs = cs.executeQuery();
		if (rs.next()) 
		{
			addrId = rs.getInt(1);
	    } 
		cs.close();
		PreparedStatement ps = con.prepareStatement("UPDATE user SET  address_id = ? WHERE user_id = ?;");
        ps.setInt(1, addrId);
        ps.setInt(2, uID);
        ps.execute();
	}
	
	public void updateUserInfo(int uID, int newId, String name, String lastName, String subType, Boolean active) throws Exception {
		int act;
		if(active) act=1;
		else act =0;
		PreparedStatement ps = con.prepareStatement("UPDATE user SET  user_id = ?, first_name = ?, last_name = ? WHERE user_id = ?;");
        ps.setInt(1, newId);
        ps.setString(2, name);
        ps.setString(3, lastName);
        ps.setInt(4, uID);
        ps.execute();
        ps.close();
        ps = con.prepareStatement("UPDATE customer SET  subscription_type = ?, active = ? WHERE customer_id = ?;");
        ps.setString(1, subType);
        ps.setInt(2, act);
        ps.setInt(3, newId);
        ps.execute();
        ps.close();
	}
	
	//get all customers registered in database
	public List<Customer> getAllCustomers() throws Exception{
		List<Customer> customers=new ArrayList<Customer>();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select user_id, first_name, last_name, email, address,city, country, district, postal_code, phone,subscription_type,active\r\n"
				+ "FROM user INNER JOIN address USING(address_id) INNER JOIN city USING(city_id) INNER JOIN country USING(country_id) INNER JOIN customer ON customer_id = user_id;");
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			do{
				Customer tempCustomer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),
						rs.getString(9),rs.getString(10),rs.getString(11), rs.getBoolean(12));
				customers.add(tempCustomer);
			}while(rs.next());									
		}
		return customers;
	}

	//get all employees registered in database
	public List<Employee> getAllEmployees() throws Exception{
		List<Employee> employee=new ArrayList<Employee>();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select user_id, first_name, last_name, email, active\r\n"
				+ "FROM user INNER JOIN employee ON employee_id = user_id;");
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			do{
				Employee tmpEmployee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5));
				employee.add(tmpEmployee);
			}while(rs.next());									
		}
		return employee;
	}
	
	public Boolean idValid(int id) throws Exception {
		PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE user_id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(!rs.next()) return true;
		else return false;
	}
	
	//get all series in inventory
	public List<TopContent> getTopContent(int contentChoice, Date early, Date late) throws Exception
	{
		List<TopContent> list = new ArrayList<TopContent>();
		if(contentChoice==0) {
			CallableStatement cs = con.prepareCall("CALL most_rentals(?,5,?,?);");
			cs.setString(1,"s");
			cs.setDate(2, early);
			cs.setDate(3, late);
			ResultSet rs = cs.executeQuery();
			if (rs.next() == false) 
			{
		        System.out.println("ResultSet in empty in Java");

		    } 
			else 
			{
				do{
					TopContent tempSeries = new TopContent(rs.getInt(1), rs.getString(2), rs.getInt(3));
					list.add(tempSeries);
				}while(rs.next());									
			}
			cs.close();
		}
		else {
			CallableStatement cs = con.prepareCall("CALL most_rentals(?,5,?,?);");
			cs.setString(1,"m");
			cs.setDate(2, early);
			cs.setDate(3, late);
			ResultSet rs = cs.executeQuery();
			if (rs.next() == false) 
			{
		        System.out.println("ResultSet in empty in Java");

		    } 
			else 
			{
				do{
					TopContent tempSeries = new TopContent(rs.getInt(1), rs.getString(2), rs.getInt(3));
					list.add(tempSeries);
				}while(rs.next());									
			}
			cs.close();
		}
			
				return list;
	}
	
	public void deleteUser(String type, int id) throws Exception {
		PreparedStatement ps;
		if(type.equals("e")) ps = con.prepareStatement("DELETE user, employee FROM employee INNER JOIN user where employee_id=? AND user_id = ?;");
		else ps = con.prepareStatement("DELETE user,customer from customer inner join user where customer_id=? AND user_id = ?;");
		ps.setInt(1, id);
        ps.setInt(2, id);
        ps.execute();
        ps.close();
	}
	
	public int addUser(String type, String name, String lastName, String email, String subType) throws Exception {
		int id=0;
		PreparedStatement insertUser;
		PreparedStatement insertType;
		insertUser = con.prepareStatement("insert into user(`first_name`, `last_name`, `email`, `address_id`) values(?,?,?,7);");
		insertUser.setString(1, name);
		insertUser.setString(2, lastName);
		insertUser.setString(3, email);
		if(type.equals("e")) insertType = con.prepareStatement("insert into employee(`employee_id`, `create_date`, `active`) values(LAST_INSERT_ID(),now(),1);");
		else { 
			insertType = con.prepareStatement("insert into customer(`customer_id`, `create_date`, `active`,`subscription_type`) values(LAST_INSERT_ID(),now(),1,?);");
			insertType.setString(1, subType);
		}
		insertUser.execute();
		insertType.execute();
		insertUser.close();
		insertType.close();
		Statement getLastInsertedId = con.createStatement();
		ResultSet rs = getLastInsertedId.executeQuery("SELECT LAST_INSERT_ID();");
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			id = rs.getInt(1);								
		}
		getLastInsertedId.close();
		return id;
		
	}
	
	
	public void updateContentPrice(String content, int id, Float newPrice) throws Exception {
		PreparedStatement ps ;
		if(content.equals("series")) ps = con.prepareStatement("UPDATE series SET  price = ? WHERE series_id = ?;");
		else  ps = con.prepareStatement("UPDATE film SET  price = ? WHERE film_id = ?;");
        ps.setFloat(1, newPrice);
        ps.setInt(2, id);
        ps.execute();
        ps.close();
	}
}