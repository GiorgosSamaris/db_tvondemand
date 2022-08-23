package customerGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import queryToDB.Query;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class CustomerDashboard extends JFrame {
	private Query qri = null;
	private JPanel contentPane;
	private PanelHome panelHome;
	private PanelSettings panelSettings;
	private PanelShowMyRents panelShowMyRents;
	private PanelCatalogue panelCatalogue;


	/**
	 * Launch the application.
	 */
	public static void initiateCustomerDashboard(Query qri) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDashboard frame = new CustomerDashboard(qri);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	private class PanelButtonMouseAdapter extends MouseAdapter
	
	
	
	/**
	 * Create the frame.
	 */
	public CustomerDashboard(Query qri) {
		setTitle("CEID SS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelHome = new PanelHome();
		panelSettings = new PanelSettings();
		panelShowMyRents = new PanelShowMyRents();
		panelCatalogue = new PanelCatalogue();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 282, 378);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel ceidlogo = new JLabel("Ceid Image");
		ceidlogo.setForeground(new Color(255, 255, 255));
		ceidlogo.setFont(new Font("Dialog", Font.BOLD, 15));
		ceidlogo.setBounds(10, 11, 74, 39);
		panel.add(ceidlogo);
		
		JLabel logohome = new JLabel("HomeImg");
		logohome.setBounds(10, 61, 48, 60);
		panel.add(logohome);
		
		JLabel logosettings = new JLabel("SetImg");
		logosettings.setBounds(10, 122, 48, 60);
		panel.add(logosettings);
		
		JLabel logorents = new JLabel("RentsImg");
		logorents.setBounds(10, 183, 48, 60);
		panel.add(logorents);
		
		JLabel logocatalogue = new JLabel("CatalogueImg");
		logocatalogue.setBounds(10, 242, 48, 60);
		panel.add(logocatalogue);
		
		JLabel signoutlogo = new JLabel("ImgSign");
		signoutlogo.setBounds(10, 307, 48, 60);
		panel.add(signoutlogo);
		
		JLabel lblNewLabel = new JLabel("Welcome Email");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel.setBounds(114, 11, 128, 39);
		panel.add(lblNewLabel);
		
		JPanel homepanel = new JPanel();
		homepanel.setBackground(new Color(0, 128, 128));
		homepanel.setBounds(74, 60, 208, 61);
		panel.add(homepanel);
		homepanel.setLayout(null);
		
		JLabel Homelabel = new JLabel("Home");
		Homelabel.setBackground(new Color(0, 128, 128));
		Homelabel.setHorizontalAlignment(SwingConstants.CENTER);
		Homelabel.setFont(new Font("Dialog", Font.BOLD, 15));
		Homelabel.setBounds(0, 0, 208, 61);
		homepanel.add(Homelabel);
		
		JPanel settingspanel = new JPanel();
		settingspanel.setBackground(new Color(0, 128, 128));
		settingspanel.setBounds(74, 121, 208, 61);
		panel.add(settingspanel);
		settingspanel.setLayout(null);
		
		JLabel settingslabel = new JLabel("Settings");
		settingslabel.setBackground(new Color(0, 128, 128));
		settingslabel.setHorizontalAlignment(SwingConstants.CENTER);
		settingslabel.setFont(new Font("Dialog", Font.BOLD, 15));
		settingslabel.setBounds(0, 0, 208, 61);
		settingspanel.add(settingslabel);
		
		JPanel showmyrentpanel = new JPanel();
		showmyrentpanel.setBackground(new Color(0, 128, 128));
		showmyrentpanel.setBounds(74, 183, 208, 61);
		panel.add(showmyrentpanel);
		showmyrentpanel.setLayout(null);
		
		JLabel myrentslabel = new JLabel("My rents");
		myrentslabel.setBackground(new Color(0, 128, 128));
		myrentslabel.setHorizontalAlignment(SwingConstants.CENTER);
		myrentslabel.setFont(new Font("Dialog", Font.BOLD, 15));
		myrentslabel.setBounds(0, 0, 208, 61);
		showmyrentpanel.add(myrentslabel);
		
		JPanel CataloguePanel = new JPanel();
		CataloguePanel.setBackground(new Color(0, 128, 128));
		CataloguePanel.setBounds(74, 242, 208, 61);
		panel.add(CataloguePanel);
		CataloguePanel.setLayout(null);
		
		JLabel cataloguelabel = new JLabel("Catalogue");
		cataloguelabel.setBackground(new Color(0, 128, 128));
		cataloguelabel.setHorizontalAlignment(SwingConstants.CENTER);
		cataloguelabel.setFont(new Font("Dialog", Font.BOLD, 15));
		cataloguelabel.setBounds(0, 0, 208, 61);
		CataloguePanel.add(cataloguelabel);
		
		JPanel signoutpanel = new JPanel();
		signoutpanel.setBackground(new Color(0, 128, 128));
		signoutpanel.setLayout(null);
		signoutpanel.setBounds(74, 306, 208, 61);
		panel.add(signoutpanel);
		
		JLabel signoutlabel = new JLabel("Sign out");
		signoutlabel.setBackground(new Color(0, 102, 102));
		signoutlabel.setHorizontalAlignment(SwingConstants.CENTER);
		signoutlabel.setFont(new Font("Dialog", Font.BOLD, 15));
		signoutlabel.setBounds(0, 0, 208, 61);
		signoutpanel.add(signoutlabel);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBounds(280, 0, 522, 378);
		contentPane.add(MainPanel);
		MainPanel.add(panelCatalogue);
		MainPanel.add(panelShowMyRents);
		MainPanel.add(panelSettings);
		MainPanel.add(panelHome);
	}
	
}