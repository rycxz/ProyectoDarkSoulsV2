package salidaDatos;

import java.util.Scanner;

import clases.Objetos;


public class SalidaDatosObjetos {
	
	static Scanner letras = new Scanner(System.in);
	/**
	 * 
	 * @param objetos array de objetos ya cargados 
	 * 
	 *  aqui buscamos los objetos para poder mostrarlos y hacemos un "for" para mostralos 
	 */
	public static void mostrarDatosObjetos(Objetos[] objetos) {
		for (int i = 0; i < objetos.length; i++) {
			if (objetos[i] != null) {
				System.out.println("---------------"
						+ "-----------------------------------------------------------------------------");
				System.out.println("El nombre del objeto es " + objetos[i].getNombre());
				System.out.println("El tipo de objeto es " + objetos[i].getTipo());
				String repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					System.out.println("El lore es: " + objetos[i].getLore());
				}
			
			}
		}

	}
	/**
	 * 
	 * @param objetos array de objetos ya cargados 
	 * @param nombreObjeto string propocionado por el usuario
	 * 
	 *  aqui buscamos los objetos para poder mostrarlos y hacemos un "for" para mostralos  segun el nombre proporcionado por el usuario
	 */
	public static void mostrarDatosObjetosNombre(Objetos[] objetos,String nombreObjeto) {
		for (int i = 0; i < objetos.length; i++) {
			if(objetos[i] != null) {
				if(objetos[i].getNombre().equalsIgnoreCase(nombreObjeto)) {
					System.out.println(objetos[i].toString());
				}
				
			}
		}

	}
	/**
	 * 
	 * @param objetos array de objetos ya cargados 
	 * @param nombreTipo string propocionado por el usuario
	 * 
	 *  aqui buscamos los objetos para poder mostrarlos y hacemos un "for" para mostralos  segun el nombre proporcionado por el usuario
	 */
	public static void mostrarDatosObjetosTipo(Objetos[] objetos,String nombreTipo) {
		for (int i = 0; i < objetos.length; i++) {
			if(objetos[i] != null) {
				if(objetos[i].getTipo().equalsIgnoreCase(nombreTipo)) {
					System.out.println(objetos[i].toString());
				}
				
			}
		}
	}

}
