package clases.udemy.consumer;

import java.util.List;
import java.util.logging.Logger;

import clases.udemy.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		// Para poder usar MySorting en el módulo de servicio se debe registrar el
		// paquete que se quiere exportar.
		// En java module del consumidor también se debe indicar q se va a importar
		// tanto logger como MySortingUtil
		MySortingUtil util = new MySortingUtil();
		List<String> sorted = util.sort(List.of("Maria", "Carlos", "Camilo", "Pedro"));
		logger.info(sorted.toString());
	}
}
