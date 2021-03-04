package eg1;

import java.util.Scanner;
import java.util.Arrays;
//takes string input and prints how many vowels are in it 
public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to read");
		String vowels = sc.nextLine();
		vowels = vowels.trim();

		String tempvowels = vowels.toUpperCase();
		
		System.out.println("There are " + vowel_count(tempvowels) + " vowels  in your string input");
		sc.close();
	}

	public static int vowel_count(String s) {
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				count++;
			}

			if (s.charAt(i) == 'E') {
				count++;
			}
			if (s.charAt(i) == 'I') {
				count++;
			}
			if (s.charAt(i) == 'O') {
				count++;
			}
			if (s.charAt(i) == 'U') {
				count++;
			}

		}
		
		return count; 
		
	}

}
