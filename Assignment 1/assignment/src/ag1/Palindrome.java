package ag1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Prints all Palindrome numbers between 100 to 999
		for (int i = 100; i <= 999; i++) 
		{
			//converts int i to string
			String pal = Integer.toString(i);
			
			
			//converts char value to numeric value 
			int first = Character.getNumericValue(pal.charAt(0));
			int last = Character.getNumericValue(pal.charAt(2));
			

		    //checks if number is a palindrom and prints if true
		    if ( first == last)
		    {
		    	System.out.println(i + " is a Palindrome");
		    	
		    }
			
			
		}


	}

}