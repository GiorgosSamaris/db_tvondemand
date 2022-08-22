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
		getContentPane().setBackground(new Color(169, 169, 169));
		setTitle("CEID SS");
		setBounds(100, 100, 228, 176);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("We couldn't find your email.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 27, 213, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPleaseConsiderContacting = new JLabel("Please consider contacting");
		lblPleaseConsiderContacting.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseConsiderContacting.setFont(new Font("Serif", Font.BOLD, 12));
		lblPleaseConsiderContacting.setBounds(0, 52, 213, 14);
		getContentPane().add(lblPleaseConsiderContacting);
		
		JLabel lblOurAdministratorTo = new JLabel("our administrator to you up!");
		lblOurAdministratorTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblOurAdministratorTo.setFont(new Font("Serif", Font.BOLD, 12));
		lblOurAdministratorTo.setBounds(0, 80, 213, 14);
		getContentPane().add(lblOurAdministratorTo);
	}
}
