package clases.objetos.personas;

public interface Trabajadores {

	//por defecto es constante y estática. Todas por defecto son public, static y final.
	double bonus_minimo = 1500;
	
	//public y abstract es opcional por que por defecto tienen este acceso. NO SE DEBEN PONER.
	double estableceBonus(double bono);
}
