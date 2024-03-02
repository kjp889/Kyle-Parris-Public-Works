package lab1;

public class Bird extends Animal implements AnimalBehaviour{
	private int numberOfWings;
	
	public Bird() {
		super();
		this.numberOfWings = 0;
	}
	
	public Bird(String name, int numberOfLegs, double height, double weight, int numberOfWings) {
		super(name, numberOfLegs, height, weight);
		this.numberOfWings = numberOfWings;
	}

	public int getNumberOfWings() {
		return numberOfWings;
	}

	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Flight";
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Tweet";
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		if (food == "inorganic") {
			System.out.println("inedible");
		}
		System.out.println("edible");
	}
}
