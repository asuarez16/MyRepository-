package eg;

public class InvalidPassportNumberException extends Exception{
	
	public InvalidPassportNumberException()
	{
		super();
	}
	
	public InvalidPassportNumberException(final String message)
	{
		super(message); 
	}

}
