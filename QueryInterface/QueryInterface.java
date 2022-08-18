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
	
	public ResultSet loginAttempt(String email) throws Exception
	{
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query+email+";");
		if (rs.next() == false) 
		{
	        System.out.println("ResultSet in empty in Java");
	    } 
		else 
		{
			do 
			{
		          String data = rs.getString("email");
		          System.out.println(data);
	        } while (rs.next());
		}
		return rs;
	}

}