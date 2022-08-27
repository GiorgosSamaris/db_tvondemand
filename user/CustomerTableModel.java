package user;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import content.Rent;

public class CustomerTableModel extends AbstractTableModel{
	private String[] columnNames= { "ID", "Name", "Last Name", "Email", "Address", "City", "Country","District","Postal","Phone","Sub. Type", "Active" };
	private List<Customer> customers;
	
	public CustomerTableModel(List<Customer> c) {
		customers = c;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return customers.size();
	}
	@Override
	public String getColumnName(int index) {
		return columnNames[index];
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Customer tmpCustomer = customers.get(rowIndex);
		switch(columnIndex) {
		case 0:
			return tmpCustomer.getId();
		case 1:
			return tmpCustomer.getName();
		case 2:
			return tmpCustomer.getLastname();
		case 3:
			return tmpCustomer.getEmail();
		case 4:
			return tmpCustomer.getAddress();
		case 5:
			return tmpCustomer.getCity();
		case 6:
			return tmpCustomer.getCountry();
		case 7:
			return tmpCustomer.getDistrict();
		case 8:
			return tmpCustomer.getPostal();
		case 9:
			return tmpCustomer.getPhone();
		case 10:
			return tmpCustomer.getSubType();
		case 11:
			return tmpCustomer.isActive();
		}
		
		return tmpCustomer.getId();
	}
}
