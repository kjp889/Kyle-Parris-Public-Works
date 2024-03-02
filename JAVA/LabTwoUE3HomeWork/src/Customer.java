
public class Customer {
	private String firstName;
	private String lastName;
	private String address;
	private int idNum;
	private Agent agent;
	
	//Constructor
	public Customer(String firstName, String lastName, String address, int idNum, String agentName, String teleNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.idNum = idNum;
		Agent agent = new Agent(agentName, teleNumber);
		this.agent = agent;
	}
	
	//Mutators or Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	//Accessors or Getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public int getIdNum() {
		return idNum;
	}
	
	public void display() {
		System.out.println("Name: " + firstName +" " + lastName);
		System.out.println("Address: " + address);
		System.out.println("ID Number: " + idNum);
		agent.display();
	}

}
