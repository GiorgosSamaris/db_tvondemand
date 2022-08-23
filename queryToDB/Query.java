package queryToDB;

import java.util.*;

import customerGui.CustomerDashboard;
import loginGUI.LoginFrame;
import loginGUI.error;
import mockFrame.MockMenu;

import java.sql.*;
import java.io.*;

public class Query {
	
	private Connection con;
		
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
	//given email return user ID
	public int getUserId(String email)throws Exception
	{
		int id;
		String query = "SELECT user_id FROM user WHERE email = ";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query+email+";");		
		id = rs.getInt("user_id");
		return id;
	}
	//given email call appropriate navigation GUI
	public void loginAttempt(String email) throws Exception
	{
		String user_type;
		user_type = checkTypeOfUser(email); 	//TODO try catch block? checkTypeOfUser throws exception!!!
		System.out.println(user_type);
		if(user_type.equals("customer")) CustomerDashboard.initiateCustomerDashboard(this); //starts customer GUI
		else if (user_type.equals("employee")) MockMenu.show(this);							//TODO employee GUI
		else if (user_type.equals("admin"))	MockMenu.show(this);							//TODO Administrator GUI
		else {
			LoginFrame.initiateLogin(this);													//Recall login window 
			error.invokeError();															//display error dialog				
		}
	}
	
	public void showAvailableForRent() throws Exception
	{
	}
	
	public void showFilmsForRent() throws Exception
	{
		
		String query = "SELECT title FROM film;";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");

	    } 
		else 
		{

			do 
			{
		          String data = rs.getString("title");
		          System.out.println(data);
	        } while (rs.next());
		}
	
	}
	public void showSeriesForRent() throws Exception
	{
		
		String query = "SELECT title FROM series;";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");
	    } 
		else 
		{
			do 
			{
		          String data = rs.getString("title");
		          System.out.println(data);
	        } while (rs.next());
		}
	
	};


}