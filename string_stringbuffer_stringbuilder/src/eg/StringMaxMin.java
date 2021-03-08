package eg;

import java.util.Scanner;

public class StringMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to read");
		String s = sc.nextLine();

		String ar[] = s.split(" ");
		String max="";
		String min="";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			String temp =ar[i]; 
			if (i==0) {
				max=ar[i]; 
				
			} 
			
			
			else if (ar[i].length()) {
				
			}

		}
		System.out.println("The longest word is " + max);
		System.out.println("The shortest word is " + min);
	}

}
