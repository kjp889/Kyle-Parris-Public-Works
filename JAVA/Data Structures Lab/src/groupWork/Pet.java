package groupWork;

public class Pet {
	private int ticketNumber;
	private String name;
	private String type;
	private int age;
	
	public Pet() {
		this.ticketNumber = 0;
		this.name = " ";
		this.type = "";
		this.age = 0;
	}
	
	public Pet(int ticketNumber, String name, String type, int age) {
		this.ticketNumber = ticketNumber;
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public Pet(Pet pet) {
		this.ticketNumber = pet.ticketNumber;
		this.name = pet.name;
		this.type = pet.type;
		this.age = pet.age;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Pet [ticketNumber=" + ticketNumber + ", name=" + name + ", type=" + type + ", age=" + age + "]";
	}
		
}
