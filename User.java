
public class User {
	
	private String name;
	private String state;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	User(String name,String state,String country)
	{
		setName( name);
		setState( state);
		setCountry( country);
	}
	
	User()
	{
		
	}
	public String toString()
	{
		
		return String.format("%-15s %-15s %-15s",name,state,country );
	}
	
	
}
