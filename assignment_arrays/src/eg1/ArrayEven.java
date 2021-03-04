package eg1;

import java.util.Scanner;

public class ArrayEven {

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
		int evensum = 0;
		for (int i = 0; i < n; i++) {
			if (ar[i] % 2 == 0) {
				evensum +=ar[i];
				
				

			}

		}
		
		System.out.println("Sum of all even numbers in Array is " + evensum);

	}

}
