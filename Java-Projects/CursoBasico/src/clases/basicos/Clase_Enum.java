package clases.basicos;

public enum Clase_Enum {

	MINI("S"), MEDIO("M"), LARGO("L");

	private String abreviatura;

	private Clase_Enum(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	public String getAbreviatura() {
		return abreviatura;
	}


}
