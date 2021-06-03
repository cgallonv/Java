package clases.objetos.personas;

public class Estudiante extends Persona {

	private static final long serialVersionUID = -8740139511094508763L;
	private String carrera;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrera == null) ? 0 : carrera.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (carrera == null) {
			if (other.carrera != null)
				return false;
		} else if (!carrera.equals(other.carrera))
			return false;
		return true;
	}

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
