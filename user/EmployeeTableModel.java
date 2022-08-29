package user;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class EmployeeTableModel extends AbstractTableModel{
	private String[] columnNames= { "ID", "Name", "Last Name", "Email", "Active" };
	private List<Employee> employees;
	
	public EmployeeTableModel(List<Employee> e) {
		employees = e;
	}
	@Override
	public int getRowCount() {
		return employees.size();
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
		Employee tempEmployee = employees.get(rowIndex);
		switch(columnIndex) {
		case 0:
			return tempEmployee.getId();
		case 1:
			return tempEmployee.getName();
		case 2:
			return tempEmployee.getLastName();
		case 3:
			return tempEmployee.getEmail();
		case 4:
			return tempEmployee.isActive();
		}
		
		return tempEmployee.getId();
	}
}
