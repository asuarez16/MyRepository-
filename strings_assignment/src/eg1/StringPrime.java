package eg1;

import java.util.Scanner;

public class StringPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to read");
		String strPrime = sc.nextLine();

		char c;
		
		for (int i = 0; i < strPrime.length(); i++) {

			if (isPrime(i)) {
				c = strPrime.charAt(i);

				if (c >= 65 && c <= 90 || c > 97 && c <= 122) {
					c = Character.toUpperCase(c);
					System.out.print(c);
				}
			}

		}

	
	}
	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
			if(n==1)
			{
				c++;
			}
		}
		if (c == 2) {
			return true;
		} else {
			return false;
		}
	}

}
