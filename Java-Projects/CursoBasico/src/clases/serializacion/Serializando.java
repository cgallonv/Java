package clases.serializacion;

import java.io.*;
import java.util.GregorianCalendar;

import clases.objetos.personas.Empleado;
import clases.objetos.personas.Estudiante;
import clases.objetos.personas.Jefe;
import clases.objetos.personas.Persona;

public class Serializando {

	public static void main(String[] args) {
		Jefe jefe = new Jefe("Angela", 500, 2001, GregorianCalendar.NOVEMBER, 25);
		jefe.setIncentivo(5000);

		Persona[] personas = { new Empleado("Carlos", 100, 2018, GregorianCalendar.JANUARY, 15),
				new Empleado("Maria", 300, 2019, GregorianCalendar.MARCH, 26),
				new Empleado("Jose", 200, 2021, GregorianCalendar.FEBRUARY, 1), new Empleado("Francisco"), jefe,
				new Estudiante("Pedro", "Ing. Sistemas") };

		try {

			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(
					"C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/archivoserializado.dat"));
			archivo.writeObject(personas);
			archivo.close();

			ObjectInputStream recuperarArchivo = new ObjectInputStream(new FileInputStream(
					"C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/archivoserializado.dat"));
			Persona[] personaRecuperada = (Persona[]) recuperarArchivo.readObject();
			for (Persona persona : personaRecuperada) {
				System.out.println(persona.dameDescripcion());
			}
			recuperarArchivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
