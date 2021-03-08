package eg;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionLogic ex = new ExceptionLogic(); 
		
		try {
			if (ex.isValidPassportNumber(123456789)) {
				System.out.println("Valid Passport Number");
			}
		} catch (InvalidPassportNumberException e) {
			System.out.println(e.getMessage());
		}

		try {
		if (ex.isValidDLNumber(1234567)) {
			System.out.println("Valid DL Number");
		}
		}catch(InvalidDLNumberException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
