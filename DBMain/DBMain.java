package dBMain;


import loginGUI.LoginFrame;
import mockFrame.listFrame;
import queryToDB.*;
import user.User;

import java.awt.EventQueue;
import java.sql.Connection;
import java.util.Arrays;

import content.Film;
import content.Series;
import customerGui.CustomerDashboard;

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
			throw new RuntimeException(e);
		}

		Query qri = new Query(con);
		LoginFrame.initiateLogin(qri);

	}
}
