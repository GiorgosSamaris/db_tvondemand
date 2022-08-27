package dBMain;


import loginGUI.LoginFrame;
import mockFrame.listFrame;
import queryToDB.*;
import user.User;

import java.awt.EventQueue;
import java.sql.Connection;

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
			System.out.println(e);
		}

		Query qri = new Query(con);
<<<<<<< Updated upstream
		LoginFrame.initiateLogin(qri);
		
//		 try {
//			for(Series series : qri.getAvailableSeries()) {
//			        System.out.println(series.getTitle()+" "+series.getDescription());
//			    }
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 
//		 try {
//			for(Film films : qri.getAvailableFilms()) {
//			        System.out.println(films.getTitle()+" "+films.getDescription());
//			    }
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		//System.out.println(qri.getContentTitle(6066));
=======
	
		LoginFrame.initiateLogin(qri);
		
		 
>>>>>>> Stashed changes
	}
}
