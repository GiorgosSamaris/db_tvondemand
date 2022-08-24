package customerGui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTabbedPane;
import queryToDB.*;
import content.*;
public class PanelCatalogue extends JPanel {

	
	private static Query qri =null;
	/**
	 * Create the panel.
	 */
	public PanelCatalogue(Query query) {
		qri = query;
		setBackground(new Color(112, 128, 144));
		setBounds(0, 0, 522,378);
		setLayout(null);
		
		
		JList<Film> list = new JList<Film>();
		try
		{
			list = qri.getAvailableFilms();
			
		}
		catch(Exception e)
		{
			
		}
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 502, 308);
		add(scrollPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(tabbedPane);
		
		JLabel lblNewLabel = new JLabel("Catalogue");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 522, 20);
		add(lblNewLabel);
	}

}
