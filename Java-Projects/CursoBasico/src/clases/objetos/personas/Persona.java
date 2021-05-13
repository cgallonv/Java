package clases.objetos.personas;

import java.io.Serializable;

@SuppressWarnings({ "rawtypes", "serial" })
public abstract class Persona implements Comparable, Serializable {

	private String nombre;

	public Persona(String nombre) {
		setNombre(nombre);
	}

	public abstract String dameDescripcion();

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
