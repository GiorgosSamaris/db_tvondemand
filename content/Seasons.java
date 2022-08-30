package content;

import java.util.stream.Stream;

public class Seasons {
	private int series_id;
	private int season_id;
	private String season_name;
	
	public Seasons(int series_id, int season_id, String season_name)
	{
		this.setSeason_id(season_id);
		this.setSeries_id(series_id);
		this.setSeason_name(season_name);
	}
	
	
	
	public int getSeason_id() {
		return season_id;
	}
	
	public void setSeason_id(int season_id) {
		this.season_id = season_id;
	}
	
	public int getSeries_id() {
		return series_id;
	}
	
	public void setSeries_id(int series_id) {
		this.series_id = series_id;
	}
	
	public String getSeason_name() {
		return season_name;
	}
	
	public void setSeason_name(String season_name) {
		this.season_name = season_name;
	}



}
