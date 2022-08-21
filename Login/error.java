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

public class error extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setForeground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JTextArea txtrError = new JTextArea();
			txtrError.setForeground(Color.RED);
			txtrError.setFont(new Font("Serif", Font.BOLD, 15));
			txtrError.setText("Error!We couldnt find your email.\r\nPlease contact an administrator to sign you up. ");
			txtrError.setBackground(Color.CYAN);
			txtrError.setBounds(59, 73, 346, 97);
			contentPanel.add(txtrError);
		}
	}
}
