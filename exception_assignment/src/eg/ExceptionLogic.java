package eg;

public class ExceptionLogic {
	
	public boolean isValidPassportNumber(int pa) throws InvalidPassportNumberException 
	{
		
		int temp = String.valueOf(pa).length(); 
		if(temp<8 || temp >8 )
		{
			throw new InvalidPassportNumberException("Passport length must 8 digits long"); 
		}
		
		return true; 
	}
	
	public boolean isValidDLNumber(int dl)
	{
		int temp2 = String.valueOf(dl).length(); 
		if(temp2<8 || temp2 >8 )
		{
			throw new InvalidDLNumberException("DL number must be 8 digits long "); 
		}
		
		return true; 
	}

}
