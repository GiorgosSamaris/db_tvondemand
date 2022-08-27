package customerGui;

import queryToDB.*;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import queryToDB.Query;
import user.User;

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
import javax.swing.JTextField;

public class PanelSettings extends JPanel {
	
	private static Query qri = null;
	private JTextField Address_1;
	private JTextField City_1;
	private JTextField Country_1;
	private JTextField District_1;
	private JTextField Phone_1;
	private JTextField Postal_1;
	/**
	 * Create the panel.
	 */
	public PanelSettings(Query query) {
		qri = query;
		
		setBackground(new Color(112, 128, 144));
		setBounds(0, 0, 522,378);
		setLayout(null);
		
		JLabel infoLabel = new JLabel("Customer info:");
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		infoLabel.setBounds(138, 11, 190, 61);
		infoLabel.setFont(new Font("Serif", Font.BOLD, 25));
		add(infoLabel);
		
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
		
		JLabel firstname_1 = new JLabel(qri.usr.getF_name());
		firstname_1.setFont(new Font("Serif", Font.BOLD, 15));
		firstname_1.setBounds(99, 68, 79, 20);
		add(firstname_1);
		
		JLabel lastname_1 = new JLabel(qri.usr.getL_name());
		lastname_1.setFont(new Font("Serif", Font.BOLD, 15));
		lastname_1.setBounds(99, 109, 100, 20);
		add(lastname_1);
		
		JLabel email_1 = new JLabel(qri.usr.getEmail());
		email_1.setFont(new Font("Serif", Font.BOLD, 15));
		email_1.setBounds(99, 152, 168, 20);
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
		
		String films [] =  {"Films","Series", "Both"};
		String series [] =  {"Series", "Films","Both"};
		String both [] =  {"Both","Films","Series" };
		String current [] = null;
		String sub_type="";
		try
		{
			sub_type = qri.getCustomerSub(qri.usr.getUser_id());
		}
		catch(Exception e)
		{
			
		}
		System.out.print(sub_type);
		if(sub_type.equals("M")) current = films;
		else if(sub_type.equals("S")) current = series;
		else current = both;
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(current));
		comboBox.setBounds(138, 193, 82, 22);
		add(comboBox);
		
		boolean active = true;
		try
		{
			active = qri.getUserActivity(qri.usr.getUser_id());
			
		}
		catch(Exception e)
		{
			
		}

		JCheckBox activechckbx = new JCheckBox("");
		activechckbx.setSelected(active);
		activechckbx.setBounds(138, 234, 28, 23);
		
		add(activechckbx);
		
		JLabel activestatus = new JLabel("Active Account:");
		activestatus.setFont(new Font("Serif", Font.BOLD, 15));
		activestatus.setBounds(10, 233, 106, 20);
		add(activestatus);
		
		JTextArea textArea = new JTextArea("Changes will take effect on next log in.");
		textArea.setBackground(new Color(112, 128, 144));
		textArea.setBounds(250, 313, 250, 39);
		textArea.setLineWrap(true);
		textArea.setVisible(false);
		add(textArea);
		
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TO DO :SAVE INFO TO DATABASE,DEN PREPEI NA ALLAZEI EMAIL
				try
				{
					final boolean changed_active = activechckbx.isSelected();;
					qri.setUserActivity(Query.usr.getUser_id(),changed_active);
					final String changed_selection = comboBox.getSelectedItem().toString();
					
					if(changed_selection.equals("Films"))qri.setUserSub(Query.usr.getUser_id(), "M");
					else if(changed_selection.equals("Series"))qri.setUserSub(Query.usr.getUser_id(), "S");
					else qri.setUserSub(Query.usr.getUser_id(), "B");
					textArea.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
		});
		save.setForeground(new Color(139, 69, 19));
		save.setFont(new Font("Serif", Font.BOLD, 15));
		save.setBounds(89, 313, 89, 23);
		add(save);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Serif", Font.BOLD, 15));
		lblAddress.setBounds(291, 68, 70, 20);
		add(lblAddress);
		
		JLabel firstname_2_1 = new JLabel("City:");
		firstname_2_1.setFont(new Font("Serif", Font.BOLD, 15));
		firstname_2_1.setBounds(291, 109, 64, 20);
		add(firstname_2_1);
		
		JLabel firstname_2_2 = new JLabel("Country:");
		firstname_2_2.setFont(new Font("Serif", Font.BOLD, 15));
		firstname_2_2.setBounds(291, 152, 70, 20);
		add(firstname_2_2);
		
		JLabel firstname_2_3 = new JLabel("District:");
		firstname_2_3.setFont(new Font("Serif", Font.BOLD, 15));
		firstname_2_3.setBounds(291, 197, 70, 20);
		add(firstname_2_3);
		
		JLabel firstname_2_4 = new JLabel("Phone:");
		firstname_2_4.setFont(new Font("Serif", Font.BOLD, 15));
		firstname_2_4.setBounds(291, 238, 70, 20);
		add(firstname_2_4);
		
		Address_1 = new JTextField();
		Address_1.setBounds(366, 70, 96, 20);
		add(Address_1);
		Address_1.setColumns(10);
		
		City_1 = new JTextField();
		City_1.setColumns(10);
		City_1.setBounds(366, 111, 96, 20);
		add(City_1);
		
		Country_1 = new JTextField();
		Country_1.setColumns(10);
		Country_1.setBounds(366, 154, 96, 20);
		add(Country_1);
		
		District_1 = new JTextField();
		District_1.setColumns(10);
		District_1.setBounds(366, 194, 96, 20);
		add(District_1);
		
		Phone_1 = new JTextField();
		Phone_1.setColumns(10);
		Phone_1.setBounds(366, 237, 96, 20);
		add(Phone_1);
		
		JLabel firstname_2_4_1 = new JLabel("Postal Code:");
		firstname_2_4_1.setFont(new Font("Serif", Font.BOLD, 15));
		firstname_2_4_1.setBounds(272, 271, 89, 20);
		add(firstname_2_4_1);
		
		Postal_1 = new JTextField();
		Postal_1.setBounds(366, 273, 96, 20);
		add(Postal_1);
		Postal_1.setColumns(10);
		

	}
}