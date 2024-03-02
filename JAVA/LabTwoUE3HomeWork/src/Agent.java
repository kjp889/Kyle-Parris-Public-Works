
public class Agent {
	private String agentName;
	private String teleNumber;
	
	public Agent(String agentName, String teleNumber) {
		this.agentName = agentName;
		this.teleNumber = teleNumber;
	}
	
	public void display() {
		System.out.println("Agent's Name: " + agentName);
		System.out.println("Telephone Number: " + teleNumber);
	}

}
