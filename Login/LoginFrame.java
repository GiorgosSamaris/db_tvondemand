package Login;
import DBMain.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import QueryInterface.*;
public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private static JTextField email_in;

	/**
	 * Launch the application.
	 */
	public static void initiateLogin(Connection con) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame(con);
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
	public LoginFrame(Connection con) {
		setBackground(Color.LIGHT_GRAY);
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your email: ");
		lblPleaseEnterYour.setForeground(Color.WHITE);
		lblPleaseEnterYour.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblPleaseEnterYour);
		
		email_in = new JTextField();
		email_in.setBackground(Color.GRAY);
		panel.add(email_in);
		email_in.setColumns(10);
		
		JButton btnLetMeIn = new JButton("Let me in!");
		btnLetMeIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QueryInterface qri = new QueryInterface(con);
				try
				{
					qri.loginAttempt(email_in.getText());
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
		panel.add(btnLetMeIn);
	}

}
