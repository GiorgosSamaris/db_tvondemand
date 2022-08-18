package DBMain;
import Login.*;

import QueryInterface.*;
import java.sql.Connection;

public class DBMain {


	public static String email;
	public static void setEmail(String e) {
		email = e;
	}
	public static void main(String[] args) {
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
			qri.loginAttempt("'BESSIE.MOSON@sakilacustomer.org'");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

		LoginFrame.initiateLogin();
		System.out.println(email + "auto einai");
	} 
}
