package admingui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import queryToDB.Query;

public class PanelChangePrc extends JPanel {
	private JTextField textFieldPrice;

	/**
	 * Create the panel.
	 */
	public PanelChangePrc(Query q) {
		setBackground(new Color(105, 105, 105));
		setSize(593,503);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 28, 561, 394);
		add(tabbedPane);
		
		JScrollPane scrollFilms = new JScrollPane();
		tabbedPane.addTab("Films", null, scrollFilms, null);
		
		JList list_Films = new JList();
		scrollFilms.setViewportView(list_Films);
		
		JScrollPane scrollPane_Series = new JScrollPane();
		tabbedPane.addTab("Series", null, scrollPane_Series, null);
		
		JList list_Series = new JList();
		scrollPane_Series.setViewportView(list_Series);
		
		JButton btnChangePricing = new JButton("Change Pricing");
		btnChangePricing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SAVE CHANGED PRICES
			}
		});
		btnChangePricing.setForeground(new Color(244, 164, 96));
		btnChangePricing.setFont(new Font("Dialog", Font.BOLD, 15));
		btnChangePricing.setBounds(309, 442, 147, 38);
		add(btnChangePricing);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Serif", Font.BOLD, 15));
		textFieldPrice.setBounds(123, 453, 96, 20);
		add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JLabel lbPrice = new JLabel("Price:");
		lbPrice.setFont(new Font("Serif", Font.BOLD, 15));
		lbPrice.setBounds(69, 443, 52, 37);
		add(lbPrice);
	}
}
