package ag1;

public class LargestEvenOrOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int oddsum = 0;
		int evensum = 0;
		// find the sum of all even numbers between 1 and 100
		// finds the sum of all odd numbers between 1 and 100 
		for (int i = 1; i <= 100; i++) 
		{

			if (i % 2 == 0) 
			{
				evensum +=i; 
				//System.out.println(evensum);

			} else 
			{
				oddsum += i;
				//System.out.println(oddsum);
			}
		}
		
		//Displays the sum of even numbers between 1 and 100
		//Displays the sum of odd numbers between 1 and 100
		System.out.println("Sum of all even numbers between 1 and 100 is: " + evensum);
		System.out.println("Sum of all odd numbers between 1 and 100 is: " + oddsum);
		
		
		//Displays which one is greater between evensum and oddsum 
		
		if (evensum > oddsum)
		{
			System.out.println("EvenSum is larger: " + evensum);
		}
		else 
		{
			System.out.println("OddSum is larger: " + oddsum);
			
		}
		

	}

}