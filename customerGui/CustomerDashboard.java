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
		
		JLabel homedash = new JLabel("Home");
		homedash.setBounds(74, 61, 208, 60);
		panel.add(homedash);
		homedash.setForeground(new Color(255, 255, 255));
		homedash.setFont(new Font("Dialog", Font.BOLD, 15));
		homedash.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel(qri.usr.getEmail());
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel.setBounds(114, 11, 128, 39);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(280, 0, 522, 378);
		contentPane.add(panel_1);
	}

}
