public class Animal {
	String species;
	
	public Animal(String species) {
		this.species = species;
	}
	
	public String makeSounds() {
		return "Animal make sounds! ";
	}
	
	public static void main(String[] args) {
		Dog animal1 = new Dog("Dog");
		Pig animal2 = new Pig("Pig");
		Animal[] myAnimals = { animal1, animal2 };
		for (Animal obj : myAnimals) {
			System.out.println(obj);
		}
	}
}

class Dog extends Animal {
	
	public Dog(String species) {
		super(species);
	}
	
	public String makeSounds() {
		return "Woof! Woof!";
	
	}
	
	public String toString() {
		return "I am a Dog \n" + makeSounds();
	}
}

class Pig extends Animal {
	
	public Pig(String species) {
		super(species);
	}
	
	public String makeSounds() {
		return "Wee! Wee!";
	}
	
	public String toString() {
		return "I am a Pig \n" + makeSounds();
	}
}

