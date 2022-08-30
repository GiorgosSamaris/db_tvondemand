package user;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class AdminTableModel extends AbstractTableModel{
	private String[] columnNames= { "ID", "Name", "Last Name", "Email" };
	private List<Admin> admins;
	
	public AdminTableModel(List<Admin> a) {
		admins = a;
	}
	@Override
	public int getRowCount() {
		return admins.size();
	}
	@Override
	public String getColumnName(int index) {
		return columnNames[index];
	}
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Admin tempAdmin = admins.get(rowIndex);
		switch(columnIndex) {
		case 0:
			return tempAdmin.getId();
		case 1:
			return tempAdmin.getName();
		case 2:
			return tempAdmin.getLastName();
		case 3:
			return tempAdmin.getEmail();
		}
		return tempAdmin.getId();
	}
}
