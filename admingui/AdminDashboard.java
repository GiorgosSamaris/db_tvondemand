package admingui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class AdminDashboard extends JFrame {

	private JPanel contentPane;
	
	private PanelAdminAdd panelAdminAddEmp;
	private PanelAdminDelete panelAdminDelete;
	private PanelAdminRevert panelAdminRevert;
	private PanelRentInc panelRentInc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
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
	public AdminDashboard() {
		setTitle("CEID SS ADMIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		panelAdminAddEmp = new PanelAdminAdd();
		panelAdminDelete = new PanelAdminDelete();
		panelAdminRevert = new PanelAdminRevert();
		panelRentInc = new PanelRentInc();
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 0, 254, 503);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Admin = new JLabel("Admin");
		Admin.setFont(new Font("Serif", Font.BOLD, 20));
		Admin.setBounds(102, 11, 121, 37);
		panel.add(Admin);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 82, 37);
		panel.add(lblNewLabel);
		
		JPanel panelAddType = new JPanel();
		panelAddType.setBackground(new Color(105, 105, 105));
		panelAddType.setBounds(78, 80, 166, 60);
		panel.add(panelAddType);
		panelAddType.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add Customer/Employee");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 166, 60);
		panelAddType.add(lblNewLabel_1);
		
		JPanel PanelDelete = new JPanel();
		PanelDelete.setLayout(null);
		PanelDelete.setBackground(SystemColor.controlDkShadow);
		PanelDelete.setBounds(78, 150, 166, 60);
		panel.add(PanelDelete);
		
		JLabel lblNewLabel_1_1 = new JLabel("Delete Customer/Employee");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(0, 0, 166, 60);
		PanelDelete.add(lblNewLabel_1_1);
		
		JPanel PanelRevert = new JPanel();
		PanelRevert.setLayout(null);
		PanelRevert.setBackground(SystemColor.controlDkShadow);
		PanelRevert.setBounds(78, 220, 166, 60);
		panel.add(PanelRevert);
		
		JLabel lblNewLabel_1_2 = new JLabel("Change Role");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(0, 0, 166, 60);
		PanelRevert.add(lblNewLabel_1_2);
		
		JPanel panelIncomeRents = new JPanel();
		panelIncomeRents.setLayout(null);
		panelIncomeRents.setBackground(SystemColor.controlDkShadow);
		panelIncomeRents.setBounds(78, 290, 166, 60);
		panel.add(panelIncomeRents);
		
		JLabel lblNewLabel_1_3 = new JLabel("Rents Income");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(0, 0, 166, 60);
		panelIncomeRents.add(lblNewLabel_1_3);
		
		JPanel panelChangePricing = new JPanel();
		panelChangePricing.setLayout(null);
		panelChangePricing.setBackground(SystemColor.controlDkShadow);
		panelChangePricing.setBounds(78, 360, 166, 60);
		panel.add(panelChangePricing);
		
		JLabel lblNewLabel_1_4 = new JLabel("Change Pricing");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(0, 0, 166, 60);
		panelChangePricing.add(lblNewLabel_1_4);
		
		JPanel panelSignOut = new JPanel();
		panelSignOut.setLayout(null);
		panelSignOut.setBackground(SystemColor.controlDkShadow);
		panelSignOut.setBounds(78, 430, 166, 60);
		panel.add(panelSignOut);
		
		JLabel lblNewLabel_1_5 = new JLabel("Sign out");
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(0, 0, 166, 60);
		panelSignOut.add(lblNewLabel_1_5);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(255, 0, 595, 503);
		contentPane.add(panelMainContent);
	}
}
