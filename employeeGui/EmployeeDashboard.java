package employeeGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Color;

public class EmployeeDashboard extends JFrame {

	private JPanel contentPane;
	private PanelEmpHome panelEmpHome;
	private PanelEmpCusInf panelEmpCusInf;
	private PanelEmpCusRents panelEmpCusRents;	
	private PanelEmpEditCat panelEmpEditCat;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDashboard frame = new EmployeeDashboard();
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
	public EmployeeDashboard() {
		setTitle("CEID SS EMPLOYEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 0, 318, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panelEmpHome = new PanelEmpHome();
		panelEmpCusInf= new PanelEmpCusInf();
		panelEmpCusRents = new PanelEmpCusRents();
		panelEmpEditCat = new PanelEmpEditCat();
		
		
		
		
		JLabel ceidimage = new JLabel("Ceid Image");
		ceidimage.setBounds(93, 11, 105, 31);
		panel.add(ceidimage);
		
		JPanel EmpHome = new JPanel();
		EmpHome.setBackground(new Color(128, 128, 128));
		EmpHome.setBounds(75, 106, 243, 68);
		panel.add(EmpHome);
		EmpHome.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 243, 68);
		EmpHome.add(lblNewLabel);
		
		JPanel EdCusInfo = new JPanel();
		EdCusInfo.setBackground(new Color(128, 128, 128));
		EdCusInfo.setBounds(75, 175, 243, 68);
		panel.add(EdCusInfo);
		EdCusInfo.setLayout(null);
		
		JLabel LabelCusEdit = new JLabel("Show Customer Info");
		LabelCusEdit.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCusEdit.setBounds(0, 0, 243, 68);
		EdCusInfo.add(LabelCusEdit);
		
		JPanel ShowCusRent = new JPanel();
		ShowCusRent.setBackground(new Color(128, 128, 128));
		ShowCusRent.setBounds(75, 243, 243, 68);
		panel.add(ShowCusRent);
		ShowCusRent.setLayout(null);
		
		JLabel LbShowCusRent = new JLabel("Show Customer Rents");
		LbShowCusRent.setHorizontalAlignment(SwingConstants.CENTER);
		LbShowCusRent.setBounds(0, 0, 243, 68);
		ShowCusRent.add(LbShowCusRent);
		
		JPanel EditCat = new JPanel();
		EditCat.setBackground(new Color(128, 128, 128));
		EditCat.setBounds(75, 310, 243, 68);
		panel.add(EditCat);
		EditCat.setLayout(null);
		
		JLabel lbEditCat = new JLabel("Edit Catalogue");
		lbEditCat.setHorizontalAlignment(SwingConstants.CENTER);
		lbEditCat.setBounds(0, 0, 243, 68);
		EditCat.add(lbEditCat);
		
		JPanel Top5 = new JPanel();
		Top5.setBackground(new Color(128, 128, 128));
		Top5.setBounds(75, 378, 243, 68);
		panel.add(Top5);
		Top5.setLayout(null);
		
		JLabel lbTop5 = new JLabel("Top5");
		lbTop5.setHorizontalAlignment(SwingConstants.CENTER);
		lbTop5.setBounds(0, 0, 243, 68);
		Top5.add(lbTop5);
		
		JPanel EmpSignOut = new JPanel();
		EmpSignOut.setBackground(new Color(128, 128, 128));
		EmpSignOut.setBounds(75, 448, 243, 68);
		panel.add(EmpSignOut);
		EmpSignOut.setLayout(null);
		
		JLabel lbEmpSignOut = new JLabel("Sign Out");
		lbEmpSignOut.setBackground(new Color(255, 255, 255));
		lbEmpSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lbEmpSignOut.setBounds(0, 0, 243, 68);
		EmpSignOut.add(lbEmpSignOut);
		
		JPanel EmpMainContent =  new JPanel();
		EmpMainContent.setBounds(319, 0, 601, 561);
		contentPane.add(EmpMainContent);
	}
}
