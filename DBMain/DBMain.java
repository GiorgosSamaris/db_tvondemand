package DBMain;


public class DBMain {

	EstablishConnection cnct = new EstablishConnection();
	public static void main(String[] args) {
		try
		{
			cnct.connect();
		}
		catch (Exception e)
		{
			
		}

	}

}
