package eg1;

import java.util.Scanner;

public class ArrayPalindrome {

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

		System.out.println("Palindrome numbers in Array");
		for (int i = 0; i < n; i++) {
			if (Palindrome(ar[i]) == true) {
				System.out.println(ar[i] + " is a Palindrome ");
			} 
		}

	}

	public static boolean Palindrome(int p) {
		int remainder;
		int sum = 0;
		int n = p;// N is the number variable to be checked for palindrome
		int temp = n;

		while (n > 0) {
			remainder = n % 10; // getting remainder
			sum = (sum * 10) + remainder;
			n = n / 10;
		}

		// Prints of the number being checked is a palindrome
		if (temp == sum) {
			return true;
		} else {
			return false;
		}

	}

}
