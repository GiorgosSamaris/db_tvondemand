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
	private PanelAdminAddCus panelAdminAddCus;
	private PanelAdminAddEmp panelAdminAddEmp;
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
		
		panelAdminAddCus = new PanelAdminAddCus(); 
		panelAdminAddEmp = new PanelAdminAddEmp();
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
		
		JPanel panelAddCustomer = new JPanel();
		panelAddCustomer.setBackground(new Color(105, 105, 105));
		panelAddCustomer.setBounds(78, 60, 166, 37);
		panel.add(panelAddCustomer);
		panelAddCustomer.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add Customer");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBounds(0, 0, 166, 37);
		panelAddCustomer.add(lblNewLabel_1);
		
		JPanel panelAddEmployee_1 = new JPanel();
		panelAddEmployee_1.setLayout(null);
		panelAddEmployee_1.setBackground(SystemColor.controlDkShadow);
		panelAddEmployee_1.setBounds(78, 120, 166, 37);
		panel.add(panelAddEmployee_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Add Employee");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(0, 0, 166, 37);
		panelAddEmployee_1.add(lblNewLabel_1_1);
		
		JPanel panelDelete = new JPanel();
		panelDelete.setLayout(null);
		panelDelete.setBackground(SystemColor.controlDkShadow);
		panelDelete.setBounds(78, 180, 166, 37);
		panel.add(panelDelete);
		
		JTextArea DeleteRole = new JTextArea();
		DeleteRole.setEditable(false);
		DeleteRole.setFont(new Font("Dialog", Font.BOLD, 12));
		DeleteRole.setText("Delete Customer/Employee");
		DeleteRole.setBackground(new Color(105, 105, 105));
		DeleteRole.setBounds(0, 0, 166, 37);
		panelDelete.add(DeleteRole);
		
		JPanel panelRevertRole_1 = new JPanel();
		panelRevertRole_1.setLayout(null);
		panelRevertRole_1.setBackground(SystemColor.controlDkShadow);
		panelRevertRole_1.setBounds(78, 240, 166, 37);
		panel.add(panelRevertRole_1);
		
		JLabel lbRR = new JLabel("Revert Role");
		lbRR.setHorizontalAlignment(SwingConstants.CENTER);
		lbRR.setFont(new Font("Dialog", Font.BOLD, 15));
		lbRR.setBounds(0, 0, 166, 37);
		panelRevertRole_1.add(lbRR);
		
		JPanel panelChangePricing1 = new JPanel();
		panelChangePricing1.setLayout(null);
		panelChangePricing1.setBackground(SystemColor.controlDkShadow);
		panelChangePricing1.setBounds(78, 300, 166, 37);
		panel.add(panelChangePricing1);
		
		JLabel lbChPr = new JLabel("Change Pricing");
		lbChPr.setHorizontalAlignment(SwingConstants.CENTER);
		lbChPr.setFont(new Font("Dialog", Font.BOLD, 15));
		lbChPr.setBounds(0, 0, 166, 37);
		panelChangePricing1.add(lbChPr);
		
		JPanel PanelRentsIncome1 = new JPanel();
		PanelRentsIncome1.setLayout(null);
		PanelRentsIncome1.setBackground(SystemColor.controlDkShadow);
		PanelRentsIncome1.setBounds(78, 360, 166, 37);
		panel.add(PanelRentsIncome1);
		
		JLabel lbRentsInc = new JLabel("Rents Income");
		lbRentsInc.setHorizontalAlignment(SwingConstants.CENTER);
		lbRentsInc.setFont(new Font("Dialog", Font.BOLD, 15));
		lbRentsInc.setBounds(0, 0, 166, 37);
		PanelRentsIncome1.add(lbRentsInc);
		
		JPanel panelRentsIncome = new JPanel();
		panelRentsIncome.setLayout(null);
		panelRentsIncome.setBackground(SystemColor.controlDkShadow);
		panelRentsIncome.setBounds(78, 420, 166, 37);
		panel.add(panelRentsIncome);
		
		JLabel lblSignout = new JLabel("SignOut");
		lblSignout.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignout.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSignout.setBounds(0, 0, 166, 37);
		panelRentsIncome.add(lblSignout);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(255, 0, 595, 503);
		contentPane.add(panelMainContent);
	}

}
