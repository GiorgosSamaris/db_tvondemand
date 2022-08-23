package loginGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.awt.event.ActionEvent;
import mockFrame.*;
import queryToDB.Query;

public class LoginFrame extends JFrame {
	private Query qri = null;
	private JPanel contentPane;
	private final JPanel panel_2 = new JPanel();
	private static JTextField textField;
			
	public static String getTextField() {
		return textField.getText();
	}

	/**
	 * Launch the application.
	 */
	public static void initiateLogin(Query query){
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
				try {
					LoginFrame frame = new LoginFrame(query);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
//			}
//		});

	}

	/**
	 * Create the frame.
	 */
	public LoginFrame(Query query) {
		this.qri = query;  
		setTitle("CEID SS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 98, 424, 36);
		panel.setBackground(new Color(169, 169, 169));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Enter your email:");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.ITALIC, 15));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*TO DO: check if email exists
				 * An den brei email error.java(thelei kai ekei kodika) or access
				 */
				try {
					qri.loginAttempt(LoginFrame.getTextField());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton.setBounds(5, 227, 424, 29);
		contentPane.add(btnNewButton);
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(119, 136, 153));
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to CEID Streaming \r\n\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(47, -5, 316, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Service!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel_2.setBounds(37, 46, 345, 26);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 153, 204));
		panel_1.setBounds(0, 0, 434, 72);
		contentPane.add(panel_1);
		panel_2.setBackground(new Color(169, 169, 169));
		panel_2.setBounds(5, 72, 424, 189);
		contentPane.add(panel_2);
	}

}
