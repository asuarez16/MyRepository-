package eg;

import java.util.Scanner;

public class StringEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to read");
		String s = sc.nextLine();

		String ar[] = s.split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i].length() % 2 == 0) {

				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");

			} else {

				sb.append(ar[i].substring(0, ar[i].length() / 2))
						.append(Character.toUpperCase(ar[i].charAt(ar[i].length() / 2)))
						.append(ar[i].substring(ar[i].length() / 2 + 1, ar[i].length())).append(" ");
			}

		}
		System.out.println(sb.toString().trim());

	}

}
