package clases.objetos.personas;

public class Jefe extends Empleado implements JefesInterface{
	private double incentivo;
	
	public Jefe(String nombre, int sueldo, int ano, int mes, int dia) {
		super(nombre, sueldo, ano, mes, dia);
	}
	
	@Override
	public String dameDescripcion() {
		return super.dameDescripcion() + " y el incentivo es: " + getIncentivo();
	}
	
	@Override
	public String tomarDecisiones(String decision) {
		return "Se deció: " + decision;
	}
	
	public double estableceBonus(double bono) {
		double prima = 2000;
		return Trabajadores.bonus_minimo+prima + bono;
	}
	
	public double getSueldo() {
		return super.getSueldo() + this.getIncentivo();
	}
	

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(int incentivo) {
		this.incentivo = incentivo;
	}

}
