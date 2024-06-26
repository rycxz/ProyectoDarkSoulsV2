package otros;

import java.util.ArrayList;
import java.util.Iterator;

import objetos.Anillos;
import objetos.Armaduras;
import objetos.Armas;

public class EliminarObjetos {
	/**
	 * metodo que elimina un anillo por el nombre proporcionado por el usuario
	 * 
	 * @param anillos      array de obejtos ya creados y cargados
	 * @param nombreObjeto nombre de un objeto proporcionado por el usuario
	 */
	public static void eliminarAnillosNombre(ArrayList<Anillos> anillos, String nombreObjeto) {
		Iterator<Anillos> iterador = anillos.iterator();
		while (iterador.hasNext()) {
			Anillos anilloClave = iterador.next();
			if (anilloClave.getNombre().equals(nombreObjeto)) {
				iterador.remove();
			}
		}

	}

	/**
	 * metodo que elimina un armadura por el nombre proporcionado por el usuario
	 * 
	 * @param objetos    array de obejtos ya creados y cargados
	 * @param nombreTipo tipo de un objeto proporcionado por el usuario
	 */
	public static void eliminarArmadurasNombre(ArrayList<Armaduras> armaduras, String nombreObjeto) {
		Iterator<Armaduras> iterador = armaduras.iterator();
		while (iterador.hasNext()) {
			Armaduras armadurasClave = iterador.next();
			if (armadurasClave.getNombre().equals(nombreObjeto)) {
				iterador.remove();
			}
		}

	}
	/**
	 * metodo que elimina un armas por el nombre proporcionado por el usuario
	 * 
	 * @param objetos    array de obejtos ya creados y cargados
	 * @param nombreTipo tipo de un objeto proporcionado por el usuario
	 */
	public static void eliminarArmasNombre(ArrayList<Armas> armas, String nombreObjeto) {
		Iterator<Armas> iterador = armas.iterator();
		while (iterador.hasNext()) {
			Armas armasClave = iterador.next();
			if (armasClave.getNombre().equals(nombreObjeto)) {
				iterador.remove();
			}
		}

	}
	
}
