package customerGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private PanelHome panelHome;
	private PanelSettings panelSettings;
	private PanelShowMyRents panelShowMyRents;
	private PanelCatalogue panelCatalogue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dashboard() {
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
		
		JLabel settingsdash = new JLabel("Settings");
		settingsdash.setForeground(new Color(255, 255, 255));
		settingsdash.setFont(new Font("Dialog", Font.BOLD, 15));
		settingsdash.setHorizontalAlignment(SwingConstants.CENTER);
		settingsdash.setBounds(74, 122, 208, 60);
		panel.add(settingsdash);
		
		JLabel showmyrents = new JLabel("Show My Rents");
		showmyrents.setForeground(new Color(255, 255, 255));
		showmyrents.setFont(new Font("Dialog", Font.BOLD, 15));
		showmyrents.setHorizontalAlignment(SwingConstants.CENTER);
		showmyrents.setBounds(74, 183, 208, 60);
		panel.add(showmyrents);
		
		JLabel cataloguedash = new JLabel("Catalogue");
		cataloguedash.setForeground(new Color(255, 255, 255));
		cataloguedash.setFont(new Font("Dialog", Font.BOLD, 15));
		cataloguedash.setHorizontalAlignment(SwingConstants.CENTER);
		cataloguedash.setBounds(74, 242, 208, 60);
		panel.add(cataloguedash);
		
		JLabel signoutdash = new JLabel("Sign Out");
		signoutdash.setForeground(new Color(255, 255, 255));
		signoutdash.setFont(new Font("Dialog", Font.BOLD, 15));
		signoutdash.setHorizontalAlignment(SwingConstants.CENTER);
		signoutdash.setBounds(74, 307, 208, 60);
		panel.add(signoutdash);
		
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
		
		JLabel lblNewLabel = new JLabel("Welcome Email");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 11));
		lblNewLabel.setBounds(114, 11, 128, 39);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(280, 0, 522, 378);
		contentPane.add(panel_1);
	}

}
