package dBMain;

import java.io.*;
import java.sql.*;

public class EstablishConnection 
{
	private String db_url = "jdbc:mysql://localhost:3306/tvondemand";
	private String usrname;
	private String password;
	
	//constructor
	public EstablishConnection(String usrname, String password)
	{
		this.usrname = usrname;
		this.password = password;
	}
	
	public Connection connect() throws Exception
	{
		
		//Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//AttemptConnection
		Connection con = DriverManager.getConnection(
				db_url,usrname,password);
		
		System.out.println("Connection Established Successfully!");
		return con;
		
	}
	
	
}
