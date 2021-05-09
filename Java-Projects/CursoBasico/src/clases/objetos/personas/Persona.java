package clases.objetos.personas;

@SuppressWarnings("rawtypes")
public abstract class Persona implements Comparable {

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
