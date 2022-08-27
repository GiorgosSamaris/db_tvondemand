package content;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class RentsTableModel extends AbstractTableModel{
		private String[] columnNames= { "Content Type", "Title", "Price", "Date", "Customer ID" };
		private List<Rent> rents;
		
		public RentsTableModel(List<Rent> r) {
			rents = r;
		}
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return  rents.size();
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
			Rent tempRent = rents.get(rowIndex);
			switch(columnIndex) {
			case 0:
				return tempRent.getContentType();
			case 1:
				return tempRent.getContentTitle();
			case 2:
				return tempRent.getPrice();
			case 3:
				return tempRent.getRentalDate();
			case 4:
				return tempRent.getCustomerId();
			}
			
			return tempRent.getContentTitle();
		}
		
		public Float getRentSum() {
			Float sum = 0.0f;
			for(int i=0; i<this.getRowCount();i++) sum = sum + Float.parseFloat(this.getValueAt(i, 2)+"");
			return sum;
			
		}
	}

