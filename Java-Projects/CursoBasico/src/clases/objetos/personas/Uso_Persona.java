package clases.objetos.personas;

import java.util.*;

public class Uso_Persona {
	public static void main(String[] args) {
		Jefe jefe = new Jefe("Angela", 500, 2001, GregorianCalendar.NOVEMBER, 25);
		jefe.setIncentivo(5000);
		
		List<Persona> personaList = new ArrayList<Persona>();
		//Set<Persona> personaList = new HashSet<Persona>();
		//Hero el set no es ordenado y no permite ordenar.
		
		
		personaList.add(new Empleado("Carlos", 100, 2018, GregorianCalendar.JANUARY, 15));
		personaList.add(new Empleado("Maria", 300, 2019, GregorianCalendar.MARCH, 26));
		personaList.add(new Empleado("Jose", 200, 2021, GregorianCalendar.FEBRUARY, 1));
		personaList.add(new Empleado("Francisco"));
		personaList.add(new Estudiante("Pedro", "Ing. Sistemas"));
		personaList.add(jefe);
	
		for (Persona persona : personaList) {
			if (persona instanceof Empleado || persona instanceof Jefe) {	
				Empleado empleado = (Empleado) persona;
				empleado.subirSueldo(10);
			}
			
			if (persona instanceof Jefe) {
				System.out.println(((Jefe)persona).tomarDecisiones("Dar aunmento del 5%"));

			}
		}

		personaList.sort(null);
//		for (Persona persona : personaList) {
//			System.out.println(persona.dameDescripcion());
//		}
		//iterator
		Iterator<Persona> personaIterator = personaList.iterator();
		while (personaIterator.hasNext()) {
			System.out.println(personaIterator.next().dameDescripcion());
		}
		
		
		
		System.out.println(personaList.size());
	}

}
