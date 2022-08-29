package admingui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import loginGUI.LoginFrame;
import queryToDB.Query;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	public static void initiateAdminDashboard(Query q) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard(q);
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
	public AdminDashboard(Query q) {
		setTitle("CEID SS ADMIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelAdminAddEmp = new PanelAdminAdd(q);
		panelAdminDelete = new PanelAdminDelete(q);
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
		
		JLabel welcomeLbl = new JLabel("Welcome");
		welcomeLbl.setFont(new Font("Serif", Font.BOLD, 20));
		welcomeLbl.setBounds(10, 11, 82, 37);
		panel.add(welcomeLbl);
		
		JPanel panelAddUser = new JPanel();
		panelAddUser.setBackground(new Color(128, 128, 128));
		panelAddUser.setBounds(78, 80, 166, 60);
		panel.add(panelAddUser);
		panelAddUser.setLayout(null);
		panelAddUser.addMouseListener(new PanelButtonMouseAdapter(panelAddUser){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAdminAddEmp);
			}
		});
		
		
		JLabel addLbl = new JLabel("Add Customer/Employee");
		addLbl.setFont(new Font("Dialog", Font.BOLD, 12));
		addLbl.setHorizontalAlignment(SwingConstants.CENTER);
		addLbl.setBounds(0, 0, 166, 60);
		panelAddUser.add(addLbl);
		
		JPanel panelDelete = new JPanel();
		panelDelete.setLayout(null);
		panelDelete.setBackground(new Color(128, 128, 128));
		panelDelete.setBounds(78, 150, 166, 60);
		panel.add(panelDelete);
		panelDelete.addMouseListener(new PanelButtonMouseAdapter(panelDelete){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAdminDelete);
			}
		});
		
		
		JLabel deleteLbl = new JLabel("Delete Customer/Employee");
		deleteLbl.setFont(new Font("Dialog", Font.BOLD, 11));
		deleteLbl.setHorizontalAlignment(SwingConstants.CENTER);
		deleteLbl.setBounds(0, 0, 166, 60);
		panelDelete.add(deleteLbl);
		
		JPanel panelRevert = new JPanel();
		panelRevert.setLayout(null);
		panelRevert.setBackground(new Color(128, 128, 128));
		panelRevert.setBounds(78, 220, 166, 60);
		panel.add(panelRevert);
		panelRevert.addMouseListener(new PanelButtonMouseAdapter(panelRevert){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAdminRevert);
			}
		});
		
		
		JLabel changeRoleLbl = new JLabel("Change Role");
		changeRoleLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		changeRoleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		changeRoleLbl.setBounds(0, 0, 166, 60);
		panelRevert.add(changeRoleLbl);
		
		JPanel panelIncomeRents = new JPanel();
		panelIncomeRents.setLayout(null);
		panelIncomeRents.setBackground(new Color(128, 128, 128));
		panelIncomeRents.setBounds(78, 290, 166, 60);
		panel.add(panelIncomeRents);
		panelIncomeRents.addMouseListener(new PanelButtonMouseAdapter(panelIncomeRents){
			
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelRentInc);
			}
		});
		
		
		JLabel changeRentsLbl = new JLabel("Rents Income");
		changeRentsLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		changeRentsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		changeRentsLbl.setBounds(0, 0, 166, 60);
		panelIncomeRents.add(changeRentsLbl);
		
		JPanel panelChangePricing = new JPanel();
		panelChangePricing.setLayout(null);
		panelChangePricing.setBackground(new Color(128, 128, 128));
		panelChangePricing.setBounds(78, 360, 166, 60);
		panel.add(panelChangePricing);
		panelChangePricing.addMouseListener(new PanelButtonMouseAdapter(panelChangePricing){
			@Override
			public void mouseClicked(MouseEvent e) {
//				menuClicked(pane); //TODO call change pricing
			}
		});
		
		
		JLabel changePricingLbl = new JLabel("Change Pricing");
		changePricingLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		changePricingLbl.setHorizontalAlignment(SwingConstants.CENTER);
		changePricingLbl.setBounds(0, 0, 166, 60);
		panelChangePricing.add(changePricingLbl);
		
		JPanel panelSignOut = new JPanel();
		panelSignOut.setLayout(null);
		panelSignOut.setBackground(new Color(128, 128, 128));
		panelSignOut.setBounds(78, 430, 166, 60);
		panel.add(panelSignOut);
		panelSignOut.addMouseListener(new PanelButtonMouseAdapter(panelSignOut){
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LoginFrame.initiateLogin(q);
			}
		});
		
		JLabel signOutLbl = new JLabel("Sign out");
		signOutLbl.setFont(new Font("Dialog", Font.BOLD, 15));
		signOutLbl.setHorizontalAlignment(SwingConstants.CENTER);
		signOutLbl.setBounds(0, 0, 166, 60);
		panelSignOut.add(signOutLbl);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(255, 0, 595, 503);
		panelMainContent.setLayout(null);
		contentPane.add(panelMainContent);
		panelMainContent.add(panelAdminAddEmp);
		panelMainContent.add(panelAdminDelete);
		panelMainContent.add(panelAdminRevert);
		panelMainContent.add(panelRentInc);
		menuClicked(panelAdminAddEmp);
	}
	void menuClicked(JPanel panel) {
		panelAdminAddEmp.setVisible(false);
		panelAdminDelete.setVisible(false);
		panelAdminRevert.setVisible(false);
		panelRentInc.setVisible(false);
		panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel=panel;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(91,91,91));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(128, 128, 128));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(70,70,70));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(128, 129, 128));
		}
	}
}
