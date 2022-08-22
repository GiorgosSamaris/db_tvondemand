package Login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class error extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void invokeError() {
		try {
			error dialog = new error();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public error() {
		setTitle("CEID SS");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 261);
		contentPanel.setBackground(new Color(169, 169, 169));
		contentPanel.setForeground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Please consider contacting an ");
		lblNewLabel_1.setBackground(new Color(169, 169, 169));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_1.setBounds(0, 128, 434, 35);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("administrator to sign you up!");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(0, 185, 434, 35);
		contentPanel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("We couldn't find your email!");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(0, 63, 434, 35);
		contentPanel.add(lblNewLabel_1_1);
	}
}
