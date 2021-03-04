package eg1;

public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address current = new Address(2000, "Street 1", "Austing", 93948); 
		Project project1 = new Project(222200, "Project 1", "James Client");
		
		Employee bob = new Employee(2001, "Bob", 20, "employee@emmail.com"
				,project1, current);
		
		System.out.println(bob);
	}
	

}
