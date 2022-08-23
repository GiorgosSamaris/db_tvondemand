package customerGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(112, 128, 144));
		setForeground(new Color(255, 255, 255));
		setSize(522,378);
		setLayout(null);
		
		JTextArea txtrAStreamingService = new JTextArea();
		txtrAStreamingService.setLineWrap(true);
		txtrAStreamingService.setWrapStyleWord(true);
		txtrAStreamingService.setEditable(false);
		txtrAStreamingService.setFont(new Font("Serif", Font.BOLD, 15));
		txtrAStreamingService.setBounds(10, 11, 476, 79);
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
		filmshome.setBounds(10, 101, 151, 69);
		add(filmshome);
		
		JTextArea txtrSeiries = new JTextArea();
		txtrSeiries.setWrapStyleWord(true);
		txtrSeiries.setText("Series:");
		txtrSeiries.setLineWrap(true);
		txtrSeiries.setFont(new Font("Serif", Font.BOLD, 30));
		txtrSeiries.setEditable(false);
		txtrSeiries.setBackground(new Color(112, 128, 144));
		txtrSeiries.setBounds(10, 178, 151, 69);
		add(txtrSeiries);
		
		JTextArea txtrDatabaseSystemsProjectceiduop = new JTextArea();
		txtrDatabaseSystemsProjectceiduop.setWrapStyleWord(true);
		txtrDatabaseSystemsProjectceiduop.setText("Database Systems Project,CEID,UoP,2022");
		txtrDatabaseSystemsProjectceiduop.setLineWrap(true);
		txtrDatabaseSystemsProjectceiduop.setFont(new Font("Serif", Font.BOLD, 11));
		txtrDatabaseSystemsProjectceiduop.setEditable(false);
		txtrDatabaseSystemsProjectceiduop.setBackground(new Color(112, 128, 144));
		txtrDatabaseSystemsProjectceiduop.setBounds(355, 345, 131, 34);
		add(txtrDatabaseSystemsProjectceiduop);
		
		JTextArea seriesnum = new JTextArea();
		seriesnum.setWrapStyleWord(true);
		seriesnum.setText("seires arithmos");
		seriesnum.setLineWrap(true);
		seriesnum.setFont(new Font("Serif", Font.BOLD, 30));
		seriesnum.setEditable(false);
		seriesnum.setBackground(new Color(112, 128, 144));
		seriesnum.setBounds(221, 178, 134, 69);
		add(seriesnum);
		
		JTextArea filmsnum = new JTextArea();
		filmsnum.setWrapStyleWord(true);
		filmsnum.setText("movies arithmos");
		filmsnum.setLineWrap(true);
		filmsnum.setFont(new Font("Serif", Font.BOLD, 30));
		filmsnum.setEditable(false);
		filmsnum.setBackground(new Color(112, 128, 144));
		filmsnum.setBounds(221, 101, 134, 69);
		add(filmsnum);
	}
}
