package content;

public class Episode {
	private int season_id;
	private int episode_id;
	private String episode_name;
	private int lenght;
	
	public Episode (int season_id,int episode_id,String episode_name,int lenght)
	{
		this.setSeason_id(season_id);
		this.setEpisode_id(episode_id);
		this.setEpisode_name(episode_name);
		this.setLenght(lenght);
	}
	
	public int getSeason_id() {
		return season_id;
	}
	public void setSeason_id(int season_id) {
		this.season_id = season_id;
	}
	public int getEpisode_id() {
		return episode_id;
	}
	public void setEpisode_id(int episode_id) {
		this.episode_id = episode_id;
	}
	public String getEpisode_name() {
		return episode_name;
	}
	public void setEpisode_name(String episode_name) {
		this.episode_name = episode_name;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

}
