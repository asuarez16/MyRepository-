package regex_assignment;

public class DriversLicenseValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dl = "DL 12345678";
		String dl2 = "DL12345678";

		System.out.println("Drivers License number to validate " + dl);

		if (dl.matches("DL [0-9]{8}")) {
			System.out.println("Valid number");
		} else {
			System.out.println("Invalid number");
		}

	}

}
