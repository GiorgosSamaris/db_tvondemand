package user;

public class User 
{
	private static int user_id;
	private static String user_type;
	private static String email;
	private static String f_name;
	private static String l_name;
	
	public User(int user_id,String user_type,String email,String f_name,String l_name)
	{
		this.setUser_id(user_id);
		this.setUser_type(user_type);
		this.setEmail(email);
		this.setF_name(f_name);
		this.setL_name(l_name);
		
	}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the user_type
	 */
	public String getUser_type() {
		return user_type;
	}

	/**
	 * @param user_type the user_type to set
	 */
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public static String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public static String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
}