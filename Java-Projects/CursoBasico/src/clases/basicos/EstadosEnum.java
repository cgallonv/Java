package clases.basicos;

public enum EstadosEnum {
	ACTIVO(0),
	CAIDO(1),
	SUSPENDIDO(2);
	
	private EstadosEnum(int estado) {
		this.estado = estado;
	}
	private int estado;
	
	public int getCodigoEstado() {
		return estado;
	}
}
