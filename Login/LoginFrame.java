package Login;

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
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
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
		panel.setBackground(Color.LIGHT_GRAY);
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
				
				
			}
		});
		btnNewButton.setBounds(5, 227, 424, 29);
		contentPane.add(btnNewButton);
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(119, 136, 153));
		
		JTextArea txtrWelcomeToCeid = new JTextArea();
		txtrWelcomeToCeid.setBackground(Color.LIGHT_GRAY);
		txtrWelcomeToCeid.setFont(new Font("Serif", Font.BOLD, 25));
		txtrWelcomeToCeid.setText("Welcome to CEID Streaming \r\nService!");
		txtrWelcomeToCeid.setForeground(Color.BLACK);
		txtrWelcomeToCeid.setBounds(58, 11, 333, 76);
		contentPane.add(txtrWelcomeToCeid);
	}

}
