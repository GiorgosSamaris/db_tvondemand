package employeeGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import loginGUI.LoginFrame;
import queryToDB.Query;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class EmployeeDashboard extends JFrame {

	private JPanel contentPane;
	private PanelEmpHome panelEmpHome;
	private PanelEmpCusInf panelEmpCusInf;
	private PanelEmpCusRents panelEmpCusRents;	
	private PanelEmpEditCat panelEmpEditCat;
	private PanelTopRents panelTopRents;
	

	/**
	 * Launch the application.
	 */
	public static void initiateEmployeeDashBoard(Query qri) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDashboard frame = new EmployeeDashboard(qri);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param qri 
	 */
	public EmployeeDashboard(Query qri) {
		ImageIcon ceidIcon = createImageIcon("images/ceid74.png", "CEID");
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
		
		panelEmpHome = new PanelEmpHome(qri);
		panelEmpCusInf= new PanelEmpCusInf(qri);
		panelEmpCusRents = new PanelEmpCusRents(qri);
		panelEmpEditCat = new PanelEmpEditCat();
		panelTopRents = new PanelTopRents();
		
		
		
		
		JLabel ceidimage = new JLabel(ceidIcon);
		ceidimage.setBounds(40, 11, 74, 74);
		panel.add(ceidimage);
		
		JPanel EmpHome = new JPanel();
		EmpHome.addMouseListener(new PanelButtonMouseAdapter(EmpHome){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelEmpHome);
			}
		});
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
		EdCusInfo.addMouseListener(new PanelButtonMouseAdapter(EdCusInfo){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelEmpCusInf);
			}
		});
		EdCusInfo.setBackground(new Color(128, 128, 128));
		EdCusInfo.setBounds(75, 175, 243, 68);
		panel.add(EdCusInfo);
		EdCusInfo.setLayout(null);
		
		JLabel LabelCusEdit = new JLabel("Show Customer Info");
		LabelCusEdit.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCusEdit.setBounds(0, 0, 243, 68);
		EdCusInfo.add(LabelCusEdit);
		
		JPanel ShowCusRent = new JPanel();
		ShowCusRent.addMouseListener(new PanelButtonMouseAdapter(ShowCusRent){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelEmpCusRents);
			}
		});
		ShowCusRent.setBackground(new Color(128, 128, 128));
		ShowCusRent.setBounds(75, 243, 243, 68);
		panel.add(ShowCusRent);
		ShowCusRent.setLayout(null);
		
		JLabel LbShowCusRent = new JLabel("Show Customer Rents");
		LbShowCusRent.setHorizontalAlignment(SwingConstants.CENTER);
		LbShowCusRent.setBounds(0, 0, 243, 68);
		ShowCusRent.add(LbShowCusRent);
		
		JPanel EditCat = new JPanel();
		EditCat.addMouseListener(new PanelButtonMouseAdapter(EditCat){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelEmpEditCat);
			}
		});
		EditCat.setBackground(new Color(128, 128, 128));
		EditCat.setBounds(75, 310, 243, 68);
		panel.add(EditCat);
		EditCat.setLayout(null);
		
		JLabel lbEditCat = new JLabel("Edit Catalogue");
		lbEditCat.setHorizontalAlignment(SwingConstants.CENTER);
		lbEditCat.setBounds(0, 0, 243, 68);
		EditCat.add(lbEditCat);
		
		JPanel ShowTopRents = new JPanel();
		ShowTopRents.addMouseListener(new PanelButtonMouseAdapter(ShowTopRents){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelTopRents);
			}
		});
		ShowTopRents.setBackground(new Color(128, 128, 128));
		ShowTopRents.setBounds(75, 378, 243, 68);
		panel.add(ShowTopRents);
		ShowTopRents.setLayout(null);
		
		JLabel lbTop5 = new JLabel("Top5");
		lbTop5.setHorizontalAlignment(SwingConstants.CENTER);
		lbTop5.setBounds(0, 0, 243, 68);
		ShowTopRents.add(lbTop5);
		
		JPanel EmpSignOut = new JPanel();
		EmpSignOut.addMouseListener(new PanelButtonMouseAdapter(EmpSignOut){
			@Override
			public void mouseClicked(MouseEvent e) {
				//TODO logout and call login again
				dispose();
				LoginFrame.initiateLogin(qri);
			}
		});
		EmpSignOut.setBackground(new Color(128, 128, 128));
		EmpSignOut.setBounds(75, 448, 243, 68);
		panel.add(EmpSignOut);
		EmpSignOut.setLayout(null);
		
		JLabel lbEmpSignOut = new JLabel("Sign Out");
		lbEmpSignOut.setBackground(new Color(255, 255, 255));
		lbEmpSignOut.setHorizontalAlignment(SwingConstants.CENTER);
		lbEmpSignOut.setBounds(0, 0, 243, 68);
		EmpSignOut.add(lbEmpSignOut);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome Employee");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 17));
		lblNewLabel_1.setBounds(143, 24, 165, 46);
		panel.add(lblNewLabel_1);
		
		JPanel EmpMainContent =  new JPanel();
		EmpMainContent.setBounds(319, 0, 601, 561);
		contentPane.add(EmpMainContent);
		EmpMainContent.add(panelEmpCusInf);
		EmpMainContent.add(panelEmpCusRents);
		EmpMainContent.add(panelEmpEditCat);
		EmpMainContent.add(panelEmpHome);
		EmpMainContent.add(panelTopRents);
		EmpMainContent.setLayout(null);
		menuClicked(panelEmpHome);
	}
	
	void menuClicked(JPanel panel) {
		panelEmpCusInf.setVisible(false);
		panelEmpCusRents.setVisible(false);
		panelEmpEditCat.setVisible(false);
		panelEmpHome.setVisible(false);
		panelTopRents.setVisible(false);
		panel.setVisible(true);
	}
	
	protected ImageIcon createImageIcon(String path, String description) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} 
		else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
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
