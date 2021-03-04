package eg1;

import java.util.Scanner;

public class AllVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to read");
		String vowels = sc.nextLine();
		vowels = vowels.trim();

		String tempvowels = vowels.toUpperCase();


		if(all_vowels_check(tempvowels))
		{
			System.out.println(vowels + " - true");
		}
		else
		{
			System.out.println(vowels + " - false");
		}
		sc.close();
	}

	public static boolean all_vowels_check(String s) {
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				countA++;
			}

			if (s.charAt(i) == 'E') {
				countE++;
			}
			if (s.charAt(i) == 'I') {
				countI++;
			}
			if (s.charAt(i) == 'O') {
				countO++;
			}
			if (s.charAt(i) == 'U') {
				countU++;
			}

		}

		if (countA>0 && countE>0 && countI>0 && countO>0 && countU >0) {
			return true; 
		}
		else
		{
			return false; 
		}

	}

}
