package admingui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import queryToDB.Query;


public class PanelAdminAdd extends JPanel {
	private JTextField emailTxtFld;
	private JTextField nameTxtFld;
	private JTextField lNameTxtFld;
	private JTextField addressTxtFld;
	private JTextField cityTxtFld;
	private JTextField countryTxtFld;
	private JTextField postalTxtFld;
	private JTextField phoneFldTxt;
	private JTextField districtFldTxt;

	/**
	 * Create the panel.
	 */
	public PanelAdminAdd(Query q) {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JLabel titleLbl = new JLabel("Choose Role:");
		titleLbl.setFont(new Font("Serif", Font.BOLD, 20));
		titleLbl.setBounds(10, 11, 125, 23);
		add(titleLbl);
		
		JTextArea infoTxt = new JTextArea();
		infoTxt.setBackground(new Color(105, 105, 105));
		infoTxt.setFont(new Font("Serif", Font.BOLD, 15));
		infoTxt.setLineWrap(true);
		infoTxt.setText("Added user will appear in next log in.");
		infoTxt.setBounds(10, 424, 557, 53);
		add(infoTxt);
		
		JLabel lastNameLabel = new JLabel("Last Name:");
		lastNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lastNameLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lastNameLabel.setBounds(10, 124, 114, 20);
		add(lastNameLabel);
		
		JLabel firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstNameLabel.setFont(new Font("Serif", Font.BOLD, 15));
		firstNameLabel.setBounds(10, 94, 114, 20);
		add(firstNameLabel);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font("Serif", Font.BOLD, 15));
		emailLabel.setBounds(10, 64, 114, 20);
		add(emailLabel);
		
		JLabel phoneLabel = new JLabel("Phone:");
		phoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phoneLabel.setFont(new Font("Serif", Font.BOLD, 15));
		phoneLabel.setBounds(300, 185, 129, 20);
		add(phoneLabel);
		
		JLabel postalLabel = new JLabel("Postal:");
		postalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		postalLabel.setFont(new Font("Serif", Font.BOLD, 15));
		postalLabel.setBounds(300, 154, 129, 20);
		add(postalLabel);
		
		JLabel districtLabel = new JLabel("District:");
		districtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		districtLabel.setFont(new Font("Serif", Font.BOLD, 15));
		districtLabel.setBounds(310, 216, 121, 20);
		add(districtLabel);
		
		JLabel countryLabel = new JLabel("Country:");
		countryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		countryLabel.setFont(new Font("Serif", Font.BOLD, 15));
		countryLabel.setBounds(300, 124, 129, 20);
		add(countryLabel);
		
		JLabel cityLabel = new JLabel("City:");
		cityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cityLabel.setFont(new Font("Serif", Font.BOLD, 15));
		cityLabel.setBounds(300, 94, 129, 20);
		add(cityLabel);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addressLabel.setFont(new Font("Serif", Font.BOLD, 15));
		addressLabel.setBounds(300, 64, 129, 20);
		add(addressLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(10, 196, 196, 37);
		add(panel);
		
		JLabel subTypeLbl = new JLabel("Subscription type:");
		subTypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		subTypeLbl.setFont(new Font("Serif", Font.BOLD, 15));
		panel.add(subTypeLbl);
		
		JComboBox subTypeCmbBx = new JComboBox();
		subTypeCmbBx.setBounds(134, 15, 92, 22);
		subTypeCmbBx.setModel(new DefaultComboBoxModel(new String[] {"Films", "Series","Both"}));
		panel.add(subTypeCmbBx);
		
		JComboBox userTypeCmbBx = new JComboBox();
		userTypeCmbBx.setModel(new DefaultComboBoxModel(new String[] {"Customer", "Employee"}));
		userTypeCmbBx.setBounds(134, 15, 92, 22);
		add(userTypeCmbBx);
		
		emailTxtFld = new JTextField();
		emailTxtFld.setBounds(130, 66, 125, 20);
		add(emailTxtFld);
		emailTxtFld.setColumns(10);
		
		nameTxtFld = new JTextField();
		nameTxtFld.setColumns(10);
		nameTxtFld.setBounds(130, 93, 125, 20);
		add(nameTxtFld);
		
		lNameTxtFld = new JTextField();
		lNameTxtFld.setColumns(10);
		lNameTxtFld.setBounds(134, 126, 121, 20);
		add(lNameTxtFld);
		
		addressTxtFld = new JTextField();
		addressTxtFld.setColumns(10);
		addressTxtFld.setBounds(432, 66, 121, 20);
		add(addressTxtFld);
		
		cityTxtFld = new JTextField();
		cityTxtFld.setColumns(10);
		cityTxtFld.setBounds(432, 96, 121, 20);
		add(cityTxtFld);
		
		countryTxtFld = new JTextField();
		countryTxtFld.setColumns(10);
		countryTxtFld.setBounds(432, 126, 121, 20);
		add(countryTxtFld);
		
		postalTxtFld = new JTextField();
		postalTxtFld.setColumns(10);
		postalTxtFld.setBounds(432, 156, 121, 20);
		add(postalTxtFld);
		
		phoneFldTxt = new JTextField();
		phoneFldTxt.setColumns(10);
		phoneFldTxt.setBounds(432, 187, 121, 20);
		add(phoneFldTxt);
		
		districtFldTxt = new JTextField();
		districtFldTxt.setColumns(10);
		districtFldTxt.setBounds(432, 218, 121, 20);
		add(districtFldTxt);

		JButton addBtn = new JButton("Add User");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int newId;
				String subType;
				if(subTypeCmbBx.getSelectedIndex()==0) subType="M";
				else if(subTypeCmbBx.getSelectedIndex()==1) subType="S";
				else subType = "B";
				try {
					if(userTypeCmbBx.getSelectedIndex()==1) newId = q.addUser("e", nameTxtFld.getText(), lNameTxtFld.getText(), emailTxtFld.getText(), subType);
					else newId = q.addUser("c", nameTxtFld.getText(), lNameTxtFld.getText(), emailTxtFld.getText(), subType);
					System.out.println(newId);
					q.newAddress(newId, addressTxtFld.getText(), cityTxtFld.getText(), countryTxtFld.getText(), districtFldTxt.getText(), postalTxtFld.getText(), phoneFldTxt.getText());
				} catch (Exception e1) {
					throw new RuntimeException(e1);
				}
			}
		});
		addBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		addBtn.setBounds(221, 362, 134, 23);
		add(addBtn);
		
	}

}
