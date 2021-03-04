package eg1;

public class Address {
	
	private int aid; 
	private String streetname;
	private String city; 
	private int zip;
	
	
	public Address(int aid, String streetname, String city, int zip) {
		super();
		this.aid = aid;
		this.streetname = streetname;
		this.city = city;
		this.zip = zip;
	} 
	
	@Override
	public String toString()
	{
		return "Project [ aid = " + aid +" , streetname = " + streetname + ",city = " + city + ", zip = "+ zip +"]";
	}
	
	
	

}
