package customerGui;

import java.sql.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class Rent {
	private int id;
	private Date rentalDate;
	private String contentType;
	private String contentTitle;
	private Float price;
	
	public Rent(int id, Date rentalDate, String contentType, String contentTitle, Float price) {
		this.setId(id);
		this.setRentalDate(rentalDate);
		this.setContentType(contentType);
		this.setContentTitle(contentTitle);
		this.setPrice(price);
	}
	/**
	 * @return the rentalDate
	 */
	public Date getRentalDate() {
		return rentalDate;
	}

	/**
	 * @param rentalDate the rentalDate to set
	 */
	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @return the contentTitle
	 */
	public String getContentTitle() {
		return contentTitle;
	}

	/**
	 * @param contentTitle the contentTitle to set
	 */
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price2 the price to set
	 */
	public void setPrice(Float price2) {
		this.price = price2;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	class RentsTableModel extends AbstractTableModel{
		private String[] columnNames= {"Content Type","Title","Price","Date"};
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
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return columnNames.length;
		}
		
		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			Rent tempRent = rents.get(rowIndex);
			switch(columnIndex) {
			case 1:
				return tempRent.getContentType();
			case 2:
				return tempRent.getContentTitle();
			case 3:
				return tempRent.getPrice();
			case 4:
				return tempRent.getRentalDate();
			}
			
			return tempRent.getContentTitle();
		}
		
	}
}
