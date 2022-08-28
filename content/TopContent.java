package content;

public class TopContent {
	private String title;
	private int id;
	private int rents;
	
	public TopContent(int id, String title, int rents){
		this.setId(id);
		this.setRents(rents);
		this.setTitle(title);
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @return the rents
	 */
	public int getRents() {
		return rents;
	}
	/**
	 * @param rents the rents to set
	 */
	public void setRents(int rents) {
		this.rents = rents;
	}
}
