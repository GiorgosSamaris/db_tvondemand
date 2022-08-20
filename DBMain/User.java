package DBMain;

public class User 
{
	int user_id;
	String first_name;
	String last_name;
	String email;
	int address_id;

}

class Customer extends User
{
	boolean active;
	String create_date;
	char subscription_type;
}return user_type

class Employee extends User
{
	boolean active;
	String create_date;
}

class Admin extends User
{
	String create_date;
}