package gui3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CustomerDashboard extends JFrame {

	private JPanel contentPane;
	private final JPanel panelMenu = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDashboard frame = new CustomerDashboard();
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
	public CustomerDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 418);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panelMenu.setBackground(new Color(0, 128, 128));
		panelMenu.setBounds(0, 0, 294, 379);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EIKONA CEID");
		lblNewLabel.setBounds(61, 11, 127, 50);
		panelMenu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome,");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 57, 76, 31);
		panelMenu.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("balte email xristi.");
		lblNewLabel_1_1.setFont(new Font("Serif", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(96, 57, 118, 31);
		panelMenu.add(lblNewLabel_1_1);
		
		JPanel panelHOME = new JPanel();
		panelHOME.setBackground(new Color(0, 139, 139));
		panelHOME.setBounds(0, 100, 294, 50);
		panelMenu.add(panelHOME);
		panelHOME.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Home");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setBounds(0, 0, 284, 50);
		panelHOME.add(lblNewLabel_2);
		
		JPanel panelSETTINGS = new JPanel();
		panelSETTINGS.setBackground(new C10, 2, 71, 50139));
		panelSETTINGS.setBounds(0, 150, 294, 50);
		panelMenu.add(panelSETTINGS);
		panelSETTINGS.setLayout(null);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Home");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_2_2.setBounds(0, 0, 294, 50);
		panelSETTINGS.add(lblNewLabel_2_2_2);
		
		JPanel panelShowMyRents = new JPanel();
		panelShowMyRents.setBackground(new Color(0, 139, 139));
		panelShowMyRents.setBounds(0, 20Label lblNewLabel_4_1 = new JLabel("spitaki");
		lblNewLabel_4_1.setBounds(10, 0, 71, 50);
		panelSETTINGS.add(lblNewLabel_4_1);
		
		J0, 294, 50);
		panelMenu.add(panelShowMyRents);
		panelShowMyRents.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Home");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabShow my rentsnt(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(0, 0, 294, 50);
		panelShowMyRents.add(lblNewLabel_2_2);
		
		JPanel panelRentSubType = new JPanel();
		panelRentSubType.setBackground(new Color(0, 139, 139));
		panelRentSubType.setBounds(0, 250, 294, 5Label lblNewLabel_4_2 = new JLabel("Menei eikonai");
		lblNewLabel_4_2.setBounds(10, 0, 71, 50);
		panelShowMyRents.add(lblNewLabel_4_2);
		
		J0);
		panelMenu.add(panelRentSubType);
		panelRentSubType.setLayout(null);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Rent ");
		lblNewLabel_2_2_1.setToolTipText("See our diverse catalogue");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);ClNewLabel_2_2_1.setForeground(Color.HorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setWHITE);
		lblNewLabel_2_2_1.setFont(new  294, 50);
		panelRentSubType.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("SUBTYPE!!!");
		lblNewL146, 0, 148tForeground(new Color(255, 255, 255));
		lblNewLabel_3.setLabel lblNewLabel_2_2_1_1 = new JLabel("FILM OR MOVIE");
		lblNewLabel_2_2_1_1.setToolTipText("");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_2_1_1.setBounds(77, 0, 98, 50);
		panelRentSubType.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_4_3 = new JLabel("Catalogue eikona");
		lblNewLabel_4_3.setBounds(10, 0, 71, 50);
		panelRentSubType.add(lblNewLabel_4_3);
		
		JFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3.setBounds(191, 0, 103, 50);
		panelRentSubType.add(lblNewLabel_3);
		
		JPanel panelSignOut = new JPanel();
		panelSignOut.setBackground(new Color(0, 139, 139));
		panelSignOut.setBounds(0, 300, 294, 50);
		panelMenu.add(panelSignOut);
		panelSignOut.setLayout(null);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Sign out");
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_2_3	
		JLabel lblNewLabel_4_3_1 = new JLabel("sign out eikona");
		lblNewLabel_4_3_1.setBounds(10, 0, 71, 50);
		panelSignOut.add(lblNewLabel_4_3_1);
	.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2_2_3.setBounds(0, 0, 294, 50);
		panelSignOut.add(lblNewLabel_2_2_3);
	}

}
