package clases.objetos.personas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona implements Trabajadores {
	private static final long serialVersionUID = -7942924976142147028L;
	private double sueldo;
	private Date fecha_alta;
	private static int id_siguiente = 1;
	private int id;

	public Empleado(String nombre, int sueldo, int ano, int mes, int dia) {
		super(nombre);
		setSueldo(sueldo);
		setFecha_alta(new GregorianCalendar(ano, mes, dia).getTime());
		setId(id_siguiente);
		id_siguiente++;
	}

	public String dameDescripcion() {
		String descripcion = new String();
		descripcion = descripcion.concat("El empleado " + getNombre());
		descripcion = descripcion.concat(" con ID " + getId());
		descripcion = descripcion.concat(" Fue dado de alta el" + getFecha_alta().toString());
		descripcion = descripcion.concat(" Y su sueldo es " + getSueldo());
		descripcion = descripcion.concat(". Bonificado con " + estableceBonus(1000));
		return descripcion;
	}

	public Empleado(String nombre) {
		this(nombre, 50, 2021, GregorianCalendar.JANUARY, 1);
	}

	public double estableceBonus(double bono) {
		return Trabajadores.bonus_minimo + bono;
	}

	public void subirSueldo(int porcentaje_aumento) {
		double aumento = this.sueldo * porcentaje_aumento / 100;
		this.sueldo += aumento;
	}

	// metodo implementado de la interfaz comparable.
	public int compareTo(Object miObjeto) {
		if (miObjeto instanceof Estudiante) {
			return -1;
		}
		Empleado otroEmpleado = (Empleado) miObjeto;
		if (this.getId() < otroEmpleado.getId()) {
			return -1;
		} else if (this.getId() > otroEmpleado.getId()) {
			return 1;
		}
		return 0;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
}
