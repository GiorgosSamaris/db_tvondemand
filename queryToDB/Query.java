package queryToDB;

import user.*;
import mockFrame.*;
import java.util.*;

import content.Film;
import content.Series;
import customerGui.CustomerDashboard;
import customerGui.Rent;
import loginGUI.LoginFrame;
import loginGUI.error;
import mockFrame.MockMenu;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import java.sql.*;
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
		if(user_type.equals("customer"))CustomerDashboard.initiateCustomerDashboard(this); //starts customer GUI
		else if (user_type.equals("employee")) MockMenu.show(this);							//TODO employee GUI
		else if (user_type.equals("admin"))	MockMenu.show(this);							//TODO Administrator GUI
		else {
			LoginFrame.initiateLogin(this);													//Recall login window 
			error.invokeError();															//display error dialog				
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
			
			user_type = checkTypeOfUser(email); 	//TODO try catch block? checkTypeOfUser throws exception!!!
			
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
			
		}
		User usr = new User(user_id,user_type,email,f_name,l_name);
		this.setUser(usr);
		

		
	}
	
	
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
			
		}
		
		return sub_type;
		
	}
	
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
			
		}
		
		
		return activity;
	}
	
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
			
		}
		
		
	}
	
	
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
			
		}
		
		
	}
	
	
	
	public void showAvailableForRent() throws Exception
	{
	}
	
	
	
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
				
				Film tempFilm = new Film(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4), rs.getInt(7),rs.getString(8) ,rs.getString(9));
				list.add(tempFilm);
			}while(rs.next());									
		}
		return list;
	}
	
	
	
	public List<Series> getAvailableSeries() throws Exception
	{
		
		List<Series> list = new ArrayList<Series>();				
		String query = "SELECT series_id, title, description, rating, seasons, total_episodes FROM series INNER JOIN series_season USING (series_id) INNER JOIN series_episode ON series_season_id = season_id INNER JOIN series_inventory USING (episode_id) GROUP BY series_id;";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{
			do{
				Series tempSeries = new Series(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
				list.add(tempSeries);
			}while(rs.next());									
		}
		return list;
	}

	public List<Rent> getUserRents() throws Exception{
		List<Rent> list = new ArrayList<Rent>();
		String getRentInfo =" ";
		Statement st = con.createStatement();
		ResultSet r1 = st.executeQuery(getRentInfo);
		//TODO no idea how to get info needed for rent, yet
		return list;
	};
}