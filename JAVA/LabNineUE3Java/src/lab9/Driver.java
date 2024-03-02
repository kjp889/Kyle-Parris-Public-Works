package lab9;

public class Driver {

	public static void main(String[] args) {
		
		Animal animal;// = new Animal();
		//animal.makeSound();
		
		//Bird bird = new Bird();
		//bird.makeSound();
		animal = new Bird();
		//animal.makeSound();
		processSound(animal);
		
		/*Dog dog = new Dog();
		dog.makeSound();*/
		animal = new Dog();
		animal.makeSound();
		
		//Horse horse = new Horse();
		//horse.makeSound();
		animal = new Horse();
		animal.makeSound();
	}
	
	public static void processSound(Animal animal) {
		animal.makeSound();
	}

}
