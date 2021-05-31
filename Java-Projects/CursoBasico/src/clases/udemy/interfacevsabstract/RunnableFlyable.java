package clases.udemy.interfacevsabstract;

import java.util.List;

public class RunnableFlyable {

	public static void main(String[] args) {
		List<Flyable> listFlyable = List.of(new Bird(), new Aeroplane());
		// no se pueden agregar elementos.
		//listFlyable.add(new Bird());  
		for (Flyable flyable : listFlyable) {
			System.out.println("I am a " + flyable.getClass().getSimpleName() + " and fly " + flyable.fly());
		} 

	}

}

interface Flyable {
	public abstract String fly();
}

class Aeroplane implements Flyable {
	
	public String fly() {
		return "with fuel";
	}
}
