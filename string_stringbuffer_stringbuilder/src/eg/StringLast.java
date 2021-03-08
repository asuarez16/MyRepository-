package eg;

import java.util.Scanner;

public class StringLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to read");
		String s = sc.nextLine();

		String ar[] = s.split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {

			sb.append(ar[i].substring(0, ar[i].length() - 1))
					.append(Character.toUpperCase(ar[i].charAt(ar[i].length() - 1))).append(" ");

		}
		System.out.println("Capitalizing the last letter of each word of you string");
		System.out.println(sb.toString().trim());
	}

}
