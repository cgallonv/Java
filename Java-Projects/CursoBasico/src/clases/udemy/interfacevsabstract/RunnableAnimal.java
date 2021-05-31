package clases.udemy.interfacevsabstract;

public class RunnableAnimal {
	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog()};
		for (Animal animal : animals) {
			animal.bark();
		}
	}
}
