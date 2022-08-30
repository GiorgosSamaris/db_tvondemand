package content;

public class SeriesIncome {
	private Float sum;
	private int month;
	private int year;
	
	public SeriesIncome(Float sum, int month, int year) {
		this.setMonth(month);
		this.setSum(sum);
		this.setYear(year);
	}
	/**
	 * @return the sum
	 */
	public Float getSum() {
		return sum;
	}
	/**
	 * @param sum the sum to set
	 */
	public void setSum(Float sum) {
		this.sum = sum;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
}
