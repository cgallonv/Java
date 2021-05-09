package clases.objetos.personas;

import java.util.*;

public class Uso_Persona {
	public static void main(String[] args) {

		Jefe jefe = new Jefe("Angela", 500, 2001, GregorianCalendar.NOVEMBER, 25);
		jefe.setIncentivo(5000);

		Persona[] personas = { new Empleado("Carlos", 100, 2018, GregorianCalendar.JANUARY, 15),
				new Empleado("Maria", 300, 2019, GregorianCalendar.MARCH, 26),
				new Empleado("Jose", 200, 2021, GregorianCalendar.FEBRUARY, 1), new Empleado("Francisco"),
				jefe, new Estudiante("Pedro", "Ing. Sistemas") };
		
	
		for (Persona persona : personas) {
			if (persona instanceof Empleado || persona instanceof Jefe) {	
				Empleado empleado = (Empleado) persona;
				empleado.subirSueldo(10);
			}
			
			if (persona instanceof Jefe) {
				System.out.println(((Jefe)persona).tomarDecisiones("Dar aunmento del 5%"));

			}
		}

		Arrays.sort(personas);
		for (Persona persona : personas) {
			System.out.println(persona.dameDescripcion());
		}
	}

}
