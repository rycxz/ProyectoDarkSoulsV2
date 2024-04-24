package otros;

import java.util.ArrayList;

import jefes.Jefes;

public class GeneracionNumeroAleatorio {
	/**
	 * 
	 * @return aleatorio numero aleatorio para la probalibilidad de acierto de un boss 
	 */
	public static double generacionNumeroAciertoBoss() {
		double aleatorio=Math.random()*101;
	     return aleatorio;
	}
	/**
	 * @return aleatorio
	 * 
	 * generador de numeros aleatorios donde sacamos una posicion aleatoria de un boss 
	 */
	public static double generacionNumeroPosicionBoss(ArrayList <Jefes> todoJefes) {
		double aleatorio=Math.random()*todoJefes.size();
	     return aleatorio;
	}

	

	

}
