package clases.udemy.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
	
	public static void main(String[] args) {
		List<String> listaOrigital = new ArrayList<String>();
		listaOrigital.add("HOLA");
		listaOrigital.add("Mundo");
		
		List<String> copyOf = List.copyOf(listaOrigital);
		
		System.out.println(listaOrigital);
		listaOrigital.add("Otro");
		System.out.println(copyOf);
		copyOf.add("Otro");//Es inmodificable
	}

}
