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

public class EmployeeDashboard extends JFrame {

	private JPanel contentPane;

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
		panel.setBounds(0, 0, 318, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel ceidimage = new JLabel("Ceid Image");
		ceidimage.setBounds(93, 11, 105, 31);
		panel.add(ceidimage);
		
		JPanel EmpHome = new JPanel();
		EmpHome.setBounds(75, 106, 243, 68);
		panel.add(EmpHome);
		EmpHome.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 243, 68);
		EmpHome.add(lblNewLabel);
		
		JPanel EdCusInfo = new JPanel();
		EdCusInfo.setBounds(75, 175, 243, 68);
		panel.add(EdCusInfo);
		EdCusInfo.setLayout(null);
		
		JLabel LabelCusEdit = new JLabel("Show Customer Info");
		LabelCusEdit.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCusEdit.setBounds(0, 0, 243, 68);
		EdCusInfo.add(LabelCusEdit);
		
		JPanel ShowCusRent = new JPanel();
		ShowCusRent.setBounds(75, 243, 243, 68);
		panel.add(ShowCusRent);
		ShowCusRent.setLayout(null);
		
		JLabel LbShowCusRent = new JLabel("Show Customer Rents");
		LbShowCusRent.setHorizontalAlignment(SwingConstants.CENTER);
		LbShowCusRent.setBounds(0, 0, 243, 68);
		ShowCusRent.add(LbShowCusRent);
		
		JPanel EditCat = new JPanel();
		EditCat.setBounds(75, 310, 243, 68);
		panel.add(EditCat);
		EditCat.setLayout(null);
		
		JLabel lbEditCat = new JLabel("Edit Catalogue");
		lbEditCat.setHorizontalAlignment(SwingConstants.CENTER);
		lbEditCat.setBounds(0, 0, 243, 68);
		EditCat.add(lbEditCat);
		
		JPanel Top5 = new JPanel();
		Top5.setBounds(75, 378, 243, 68);
		panel.add(Top5);
		Top5.setLayout(null);
		
		JLabel lbTop5 = new JLabel("Top5");
		lbTop5.setHorizontalAlignment(SwingConstants.CENTER);
		lbTop5.setBounds(0, 0, 243, 68);
		Top5.add(lbTop5);
		
		JPanel EmpSignOut = new JPanel();
		EmpSignOut.setBounds(75, 448, 243, 68);
		panel.add(EmpSignOut);
		EmpSignOut.setLayout(null);
		
		JLabel lbEmpSignOut = new JLabel("Sign Out");
		lbEmpSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lbEmpSignOut.setBounds(0, 0, 243, 68);
		EmpSignOut.add(lbEmpSignOut);
		
		JPanel EmpMainContent = new JPanel();
		EmpMainContent.setBounds(319, 0, 601, 561);
		contentPane.add(EmpMainContent);
	}
}
