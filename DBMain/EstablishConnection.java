package DBMain;

import java.io.*;
import java.sql.*;

public class EstablishConnection 
{
	public void connect() throws Exception
	{
		String db_url = "jdbc:mysql://localhost::3306/tvondemand";
		String usrname = "java";
		String password = "password";
		
		//Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//AttemptConnection
		Connection con = DriverManager.getConnection(
				db_url,usrname,password);
		
		System.out.println("Connection Established Successfully!");
		
	}
	
	
}
