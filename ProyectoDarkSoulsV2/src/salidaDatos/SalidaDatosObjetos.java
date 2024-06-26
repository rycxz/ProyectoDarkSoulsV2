package salidaDatos;

import java.util.ArrayList;

import objetos.Anillos;
import objetos.Armaduras;
import objetos.Armas;

public class SalidaDatosObjetos {

	/**
	 * 
	 * @param objetos arrayList de objetos ya cargados
	 * 
	 *                muestra todos los anillos
	 */
	public static void mostarTodoAnillos(ArrayList<Anillos> anillos) {
		for (Anillos anilloClave : anillos) {

			System.out.println(anilloClave);

		}

	}

	/**
	 * 
	 * @param objetos arrayList de objetos ya cargados
	 * 
	 *                muestra todos los armaduras
	 */
	public static void mostarTodoArmaduras(ArrayList<Armaduras> armadura) {
		for (Armaduras armaduraClave : armadura) {

			System.out.println(armaduraClave);

		}

	}

	/**
	 * 
	 * @param objetos arrayList de objetos ya cargados
	 * 
	 *                muestra todos los armas
	 */
	public static void mostarTodoArmas(ArrayList<Armas> armas) {
		for (Armas armasClave : armas) {

			System.out.println(armasClave);

		}

	}

	/**
	 * 
	 * @param objetos      arrayList de objetos ya cargados
	 * @param nombreObjeto string propocionado por el usuario
	 * 
	 *                     aqui buscamos los objetos para poder mostrarlos y hacemos
	 *                     un "for" para mostralos segun el nombre proporcionado por
	 *                     el usuario
	 */
	public static void mostrarAnillosNombre(ArrayList<Anillos> anillos, String nombreObjeto) {
		for (Anillos anilloClave : anillos) {
			if (anilloClave != null && anilloClave.getNombre().equalsIgnoreCase(nombreObjeto)) {
				System.out.println(anilloClave);
			}
		}

	}

	/**
	 * 
	 * @param objetos      arrayList de objetos ya cargados
	 * @param nombreObjeto string propocionado por el usuario
	 * 
	 *                     aqui buscamos los objetos para poder mostrarlos y hacemos
	 *                     un "for" para mostralos segun el nombre proporcionado por
	 *                     el usuario
	 */
	public static void mostrarArmadurassNombre(ArrayList<Armaduras> armaduras, String nombreObjeto) {
		for (Armaduras armaduraClave : armaduras) {
			if (armaduraClave != null && armaduraClave.getNombre().equalsIgnoreCase(nombreObjeto)) {
				System.out.println(armaduraClave);
			}
		}

	}
	/**
	 * 
	 * @param objetos    array de objetos ya cargados
	 * @param nombreTipo string propocionado por el usuario
	 * 
	 *                   aqui buscamos los objetos para poder mostrarlos y hacemos
	 *                   un "for" para mostralos segun el nombre proporcionado por
	 *                   el usuario
	 */
	public static void mostarArmasNombre(ArrayList<Armas> armas, String nombre) {
		for (Armas armasClave : armas) {
			if (armasClave != null && armasClave.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(armasClave);
			}
		}
	}


}
