package lab1;

public class Dog extends Animal implements AnimalBehaviour{
	private String breed;
	
	public Dog() {
		super();
		this.breed = "";
	}
	
	public Dog(String name, int numberOfLegs, double height, double weight, String breed) {
		super(name, numberOfLegs, height, weight);
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Walk";
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Bark";
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		
	}

}
