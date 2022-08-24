package dBMain;


import loginGUI.LoginFrame;
import mockFrame.listFrame;
import queryToDB.*;
import user.User;

import java.awt.EventQueue;
import java.sql.Connection;

import content.Film;
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
			System.out.println(e);
		}

		Query qri = new Query(con);
		listFrame.listFrameRun(qri);
		LoginFrame.initiateLogin(qri);
		
		 try {
			for(Film film : qri.getAvailableFilms()) {
			        System.out.println(film.getTitle()+film.getDescription());
			    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
