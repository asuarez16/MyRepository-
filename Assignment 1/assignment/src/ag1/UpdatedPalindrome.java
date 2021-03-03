package ag1;

import java.util.Scanner;
/*Reference Material 
 * https://www.javatpoint.com/palindrome-program-in-java
 */
public class UpdatedPalindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// Takes user input for lower limit to find Palindrome
		System.out.println("Enter your low range integer to find palindrome");
		int lower = sc.nextInt();

		// Takes user input for upper limit to find Palindrome
		System.out.println("Enter your high range integer to find palindrome ");
		int upper = sc.nextInt();

		for (int i = lower; i <= upper; i++) {
			
			int remainder;
			int sum = 0;
			int n = i;// N is the number variable to be checked for palindrome
			int temp = n;
			
			while (n > 0) {
				remainder = n % 10; // getting remainder
				sum = (sum * 10) + remainder;
				n = n / 10;
			}

			// Prints of the number being checked is a palindrome
			if (temp == sum) {
				System.out.println(i + " is a palindrome number ");
			} else {
				System.out.println(i + " is not a palindrome");
			}

		}
	}

}