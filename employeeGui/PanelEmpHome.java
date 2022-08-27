package employeeGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;

import queryToDB.Query;

import java.awt.Font;
import java.sql.SQLException;

public class PanelEmpHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelEmpHome(Query q) {
		setBackground(new Color(112, 128, 144));
		setForeground(new Color(255, 255, 255));
		setBounds(0, 0, 601,561);
		setLayout(null);
		
		JTextArea txtrAStreamingService = new JTextArea();
		txtrAStreamingService.setLineWrap(true);
		txtrAStreamingService.setWrapStyleWord(true);
		txtrAStreamingService.setEditable(false);
		txtrAStreamingService.setFont(new Font("Serif", Font.BOLD, 20));
		txtrAStreamingService.setBounds(10, 11, 537, 142);
		txtrAStreamingService.setText("CEID SS is  streaming service made Androutsopoulos-Agiotatos Vasileios-Georgios, Samaris Georgios,Triantafyllopoulos Panagiotis supported by C.E.I.D University.The service provides more than:");
		txtrAStreamingService.setBackground(new Color(112, 128, 144));
		add(txtrAStreamingService);
		
		JTextArea filmshome = new JTextArea();
		filmshome.setWrapStyleWord(true);
		filmshome.setText("Films:");
		filmshome.setLineWrap(true);
		filmshome.setFont(new Font("Serif", Font.BOLD, 30));
		filmshome.setEditable(false);
		filmshome.setBackground(new Color(112, 128, 144));
		filmshome.setBounds(27, 177, 151, 69);
		add(filmshome);
		
		JTextArea txtrSeiries = new JTextArea();
		txtrSeiries.setWrapStyleWord(true);
		txtrSeiries.setText("Series:");
		txtrSeiries.setLineWrap(true);
		txtrSeiries.setFont(new Font("Serif", Font.BOLD, 30));
		txtrSeiries.setEditable(false);
		txtrSeiries.setBackground(new Color(112, 128, 144));
		txtrSeiries.setBounds(27, 342, 151, 69);
		add(txtrSeiries);
		
		JTextArea txtrDatabaseSystemsProjectceiduop = new JTextArea();
		txtrDatabaseSystemsProjectceiduop.setWrapStyleWord(true);
		txtrDatabaseSystemsProjectceiduop.setText("Database Systems Project,CEID,UoP,2022");
		txtrDatabaseSystemsProjectceiduop.setLineWrap(true);
		txtrDatabaseSystemsProjectceiduop.setFont(new Font("Serif", Font.BOLD, 11));
		txtrDatabaseSystemsProjectceiduop.setEditable(false);
		txtrDatabaseSystemsProjectceiduop.setBackground(new Color(112, 128, 144));
		txtrDatabaseSystemsProjectceiduop.setBounds(460, 516, 131, 34);
		add(txtrDatabaseSystemsProjectceiduop);
		
		JTextArea seriesnum = new JTextArea();
		seriesnum.setWrapStyleWord(true);
		try {
			seriesnum.setText(Integer.toString(q.getSumofSeries()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		seriesnum.setLineWrap(true);
		seriesnum.setFont(new Font("Serif", Font.BOLD, 30));
		seriesnum.setEditable(false);
		seriesnum.setBackground(new Color(112, 128, 144));
		seriesnum.setBounds(251, 342, 134, 69);
		add(seriesnum);
		
		JTextArea filmsnum = new JTextArea();
		filmsnum.setWrapStyleWord(true);
		try {
			filmsnum.setText(Integer.toString(q.getSumofFilms()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		filmsnum.setLineWrap(true);
		filmsnum.setFont(new Font("Serif", Font.BOLD, 30));
		filmsnum.setEditable(false);
		filmsnum.setBackground(new Color(112, 128, 144));
		filmsnum.setBounds(251, 177, 134, 69);
		add(filmsnum);
	}
}
