package eg1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " elements");
		int ar[] = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		
		//Sorting array ar
		Arrays.sort(ar);
		
		//printing Min Value
		System.out.println("The Min value of input array is " + ar[0]);
		
		//Pring Max Value	
		System.out.println("The Max value of input array is "+ ar[n-1]);

	}


}
