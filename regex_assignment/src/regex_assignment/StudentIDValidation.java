package regex_assignment;

public class StudentIDValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sid = "1234-1234";
		String sid2 = " 12341234";
		
		System.out.println("Studnet ID number to validate " + sid);

		if (sid.matches("[0-9]{4}-[0-9]{4}")) {
			System.out.println("Valid number");
		} else {
			System.out.println("Invalid number");
		}

	}

}
