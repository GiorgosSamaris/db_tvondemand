package DBMain;


import QueryInterface.*;
import java.sql.Connection;

public class DBMain {


	public static void main(String[] args) 
	{
		Connection con = null;
		EstablishConnection cnct = new EstablishConnection("java","password");
		try
		{
			con = cnct.connect();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		QueryInterface qri = new QueryInterface(con);
		try
		{
			qri.loginAttempt("VIRGINIA.GREEN@sakilacustomer.org");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		

	}

}
