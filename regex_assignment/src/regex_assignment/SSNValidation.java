package regex_assignment;

public class SSNValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "111-11-111";
		String ssn2 = "111-111-11";
		
		System.out.println("SSN number to validate " + ssn); 

		if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{3}")) {
			System.out.println("Valid number");
		} else {
			System.out.println("Invalid number");
		}
	}

}
