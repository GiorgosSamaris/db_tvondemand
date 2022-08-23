package customerGui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelSettings extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelSettings() {
		setBackground(new Color(112, 128, 144));
		setBounds(0, 0, 522,378);
		setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Customer info:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(138, 11, 190, 61);
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 25));
		add(lblNewLabel_5);
		
		JLabel firstname = new JLabel("First Name:");
		firstname.setFont(new Font("Serif", Font.BOLD, 15));
		firstname.setBounds(10, 68, 79, 20);
		add(firstname);
		
		JLabel lastname = new JLabel("Last Name:");
		lastname.setFont(new Font("Serif", Font.BOLD, 15));
		lastname.setBounds(10, 109, 79, 20);
		add(lastname);
		
		JLabel email = new JLabel("Email:");
		email.setFont(new Font("Serif", Font.BOLD, 15));
		email.setBounds(10, 152, 79, 20);
		add(email);
		
		JLabel firstname_1 = new JLabel("First Name:");
		firstname_1.setFont(new Font("Serif", Font.BOLD, 15));
		firstname_1.setBounds(99, 68, 79, 20);
		add(firstname_1);
		
		JLabel lastname_1 = new JLabel("Last Name:");
		lastname_1.setFont(new Font("Serif", Font.BOLD, 15));
		lastname_1.setBounds(99, 109, 79, 20);
		add(lastname_1);
		
		JLabel email_1 = new JLabel("Email:");
		email_1.setFont(new Font("Serif", Font.BOLD, 15));
		email_1.setBounds(99, 152, 79, 20);
		add(email_1);
		
		JLabel lblSubscriptionType = new JLabel("Subscription type:");
		lblSubscriptionType.setFont(new Font("Serif", Font.BOLD, 15));
		lblSubscriptionType.setBounds(10, 183, 118, 39);
		add(lblSubscriptionType);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Dialog", Font.BOLD, 15));
		list.setToolTipText("");
		list.setBounds(198, 211, -58, -14);
		add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Films", "Series", "Both"}));
		comboBox.setBounds(138, 193, 62, 22);
		add(comboBox);
		
		JCheckBox activechckbx = new JCheckBox("");
		activechckbx.setSelected(true);
		activechckbx.setBounds(138, 234, 28, 23);
		add(activechckbx);
		
		JLabel activestatus = new JLabel("Active Account:");
		activestatus.setFont(new Font("Serif", Font.BOLD, 15));
		activestatus.setBounds(10, 233, 106, 20);
		add(activestatus);
		
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TO DO :SAVE INFO TO DATABASE,DEN PREPEI NA ALLAZEI EMAIL
				
			}
		});
		save.setForeground(new Color(139, 69, 19));
		save.setFont(new Font("Serif", Font.BOLD, 15));
		save.setBounds(89, 313, 89, 23);
		add(save);
	}
}
