package content;

public class Series {	
	private int id;
	private String title;
	private String description;
	private String rating;
	private int seasons;
	private int totalEpisodes;
	
	public Series(int id, String title, String descString, String rateString, int seas, int ttlEp ){
		this.setDescription(descString);
		this.setId(id);
		this.setRating(rateString);
		this.setSeasons(seas);
		this.setTitle(title);
		this.setTotalEpisodes(ttlEp);
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
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the seasons
	 */
	public int getSeasons() {
		return seasons;
	}
	/**
	 * @param seasons the seasons to set
	 */
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	/**
	 * @return the totalEpisodes
	 */
	public int getTotalEpisodes() {
		return totalEpisodes;
	}
	/**
	 * @param totalEpisodes the totalEpisodes to set
	 */
	public void setTotalEpisodes(int totalEpisodes) {
		this.totalEpisodes = totalEpisodes;
	}
}
