package eg1;

import java.util.Scanner;

//Takes array input and prints all prime numbers from it
public class ArrayPrime {

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
		
		// Displays all prime numbers in input array ar
		System.out.println("Prime Numbers in Array");
		for (int i = 0; i < n; i++) {
			if (isPrime(ar[i]) == true) {
				System.out.println(ar[i] + " is a Prime Number ");
			} else {
				// System.out.println(ar[i] + " is not Prime Number ");

			}
		}

	}

	// Code from previous PrimeNumber Example worked in class
	// Returns true if n is prime
	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		} 
		else {
			return false;
		}
	}

}
