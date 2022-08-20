package QueryInterface;

import DBMain.*;

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
	
	public int getUserId(String email)throws Exception
	{
		int id;
		String query = "SELECT user_id FROM user WHERE email = ";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query+email+";");
		
		id = rs.getInt("user_id");
		return id;
	}
	
	public User loginAttempt(String email) throws Exception
	{
		int id;
		String user_type;
		user_type = checkTypeOfUser(email);
		System.out.println(user_type);
		id = getUserId(email);
		User usr = new User(id,user_type,email);
		return usr;
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
	
	}
	
	public void changeFirstName(String f_name)
	{
	}


}