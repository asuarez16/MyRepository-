package eg1;

public class Project {

	private int pid;
	private String pname;
	private String clientname;
	
	
	public Project(int pid, String pname, String clientname) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.clientname = clientname;
	} 
	
	@Override
	public String toString()
	{
		return "Project [ pid = " + pid +" , pname = " + pname + ",clientname = " + clientname + "]";
	}
	
	
}
