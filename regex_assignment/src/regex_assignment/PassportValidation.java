package regex_assignment;

public class PassportValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p = "12345678";
		String p2 = "123456789";
		System.out.println("Passport number to validate " + p); 

		if (p.matches("[0-9]{8}")) {
			System.out.println("Valid number");
		} else {
			System.out.println("Invalid number");
		}

	}

}
