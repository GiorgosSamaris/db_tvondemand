package dBMain;


import loginGUI.LoginFrame;
import queryToDB.*;
import user.User;

import java.awt.EventQueue;
import java.sql.Connection;

import customerGui.CustomerDashboard;

public class DBMain {
	

	public static void main(String[] args) 
	{
		User usr = null;
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

		Query qri = new Query(con);
//		try
//		{
//			qri.loginAttempt("VIRGINIA.GREEN@sakilacustomer.org");
//
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}  	
		LoginFrame.initiateLogin(qri);
		
		
		
	}

}
