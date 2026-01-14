package chapter09;

public class AnimalMain_02 {

	//animalSound 메서드 만들어서 사용
	public static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		System.out.println(animal.kind);
	}
	
	public static void main(String[] args) {
		
		animalSound(new Dog());
		animalSound(new Cat());
		

	}

}
