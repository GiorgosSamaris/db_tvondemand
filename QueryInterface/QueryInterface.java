package QueryInterface;

import java.util.*;
import java.sql.*;
import java.io.*;

public class QueryInterface {
	
	private Connection con;
		
	public QueryInterface(Connection con)
	{
		this.con = con;
	}
	
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
	
	public void loginAttempt(String email) throws Exception
	{
		String user_type;
		user_type = checkTypeOfUser(email);
		System.out.println(user_type);
		if(user_type == "customer") ;
		else if (user_type == "employee");
		else if (user_type == "admin");
		else ;
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
	        //wrong email
	    } 
		else 
		{
			//login
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
	        //wrong email
	    } 
		else 
		{
			//login
			do 
			{
		          String data = rs.getString("title");
		          System.out.println(data);
	        } while (rs.next());
		}
	
	};


}