package clases.objetos;

public class PruebaVarFinal {

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Carlos");
		Empleados trabajador2 = new Empleados("Angela");

		trabajador2.setArea("finanzas");
		System.out.println(trabajador1.getNombre() + " pertenece al area de " + trabajador1.getArea()
				+ ". ID: " + trabajador1.getId());

		System.out.println(trabajador2.getNombre() + " pertenece al area de " + trabajador2.getArea()
				+ ". ID: " + trabajador2.getId());
		
		System.out.println(Empleados.metodoEstatico());
	}

}

class Empleados {
	private final String nombre;
	private String area;
	private static int idSiguiente = 1;
	private int id;

	public Empleados(String nombre) {
		this.nombre = nombre;
		setArea("Administración");
		id = idSiguiente;
		idSiguiente++;
	}
	
	public static String metodoEstatico() {
		return "El siguiente id es: " + idSiguiente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getId() {
		return id;
	}

}