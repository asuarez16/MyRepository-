package eg;

public class InvalidDLNumberException extends RuntimeException {
	
	public InvalidDLNumberException ()
	{
		super();
	}
	
	public InvalidDLNumberException(final String message)
	{
		super(message); 
	}

}
