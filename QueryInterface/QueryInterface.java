package QueryInterface;

import java.util.*;
import java.sql.*;
import java.io.*;

public class QueryInterface {
	
	private Connection con;
	private String query = 
			"SELECT email FROM user WHERE user.email = ";
	
	public QueryInterface(Connection con)
	{
		this.con = con;
	}
	
	public void loginAttempt(String email) throws Exception
	{
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query+email+";");
		
		//temp statements
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
		          String data = rs.getString("email");
		          System.out.println(data);
	        } while (rs.next());
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