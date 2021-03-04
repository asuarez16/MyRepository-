package eg1;

public class Employee {

	private int id; 
	private String name;
	private int age; 
	private String email;
	private Project employeeProject;
	private Address employeeAddress;
	
	
	public Employee(int id, String name, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public Employee(int id, String name, int age, String email, Project employeeproject, Address currentaddress) 
	{
		this(id,name,age,email); 
		this.employeeProject = employeeproject; 
		this.employeeAddress = currentaddress;
	
	}
	
	
@Override//annoatiation 
	
	public String toString()
	{
		return "Employee [ id = " + id +" , name = " + name + ", email = " + email + ", age = " + age + ", project = " + 
	employeeProject +", employeAddress = " + employeeAddress + "]";
	}
	
	
}
