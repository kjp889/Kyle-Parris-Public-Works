package lab1;

public class Animal {
	private String name;
	private int numberOfLegs;
	private double height;
	private double weight;
	
	public Animal() {
		this.name = "xxxxx";
		this.numberOfLegs = 0;
		this.height = 0.0;
		this.weight = 0.0;
	}
	
	public Animal(String name, int numberOfLegs, double height, double weight) {
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.height = height;
		this.weight = weight;
	}
	
	public Animal(Animal animal) {
		this.name = animal.name;
		this.numberOfLegs = animal.numberOfLegs;
		this.height = animal.height;
		this.weight = animal.weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", numberOfLegs=" + numberOfLegs + ", height=" + height + ", weight=" + weight
				+ "]";
	}
	
	

}
