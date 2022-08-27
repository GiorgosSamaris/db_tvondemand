package content;

import java.sql.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class Rent {
	private int id;
	private Date rentalDate;
	private String contentType;
	private String contentTitle;
	private Float price;
	private int customerId;
	
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
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
