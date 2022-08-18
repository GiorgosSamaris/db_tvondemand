package DBMain;


public class DBMain {


	public static void main(String[] args) {
		EstablishConnection cnct = new EstablishConnection("java","password");
		try
		{
			cnct.connect();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
