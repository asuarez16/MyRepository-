package ag1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Prints all Palindrome numbers between 100 to 999
		for (int i = 100; i <= 999; i++) 
		{
			//converts int i to string
			String pal = Integer.toString(i);
			
		
			

		    //checks if number is a palindrome and prints if true
		    if ( pal.charAt(0) == pal.charAt(2))
		    {
		    	System.out.println(i + " is a Palindrome");
		    	
		    }
			
			
		}


	}

}
