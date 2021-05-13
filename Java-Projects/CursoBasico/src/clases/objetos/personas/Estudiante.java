package clases.objetos.personas;

public class Estudiante extends Persona {

	private static final long serialVersionUID = -8740139511094508763L;
	private String carrera;

	public Estudiante(String nombre, String carrera) {
		super(nombre);
		setCarrera(carrera);
	}

	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return getNombre() + " es un estudiante de " + getCarrera();
	}

	public int compareTo(Object miObjeto) {
		return 1;
	}

	public String getCarrera() {
		return carrera;
	}

	private void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
