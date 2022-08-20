package DBMain;

public class User 
{
	private int user_id;
	private String user_type;
	private String email;
	
	public User(int user_id,String user_type,String email)
	{
		this.user_id = user_id;
		this.user_type = user_type;
		this.email = email;
		
	}
}