package salidaDatos;

import java.util.ArrayList;
import java.util.Scanner;

import jefes.Jefes;


public class SalidaDatosJefes {

	/**
	 * aqui creamos los jefes para poder mostrarlos y hacemos un "for" para mostrar
	 * todos los jefes en orden
	 * 
	 * @param todosJefes arrayList de objeto de los jefes ya creados y cargados
	 */
	public static void mostrarDatosJefes(ArrayList<Jefes> todosJefes, Scanner numeros) {
		for (int i = 0; i < 10; i++) {
			if (todosJefes.get(i) != null) {
				System.out.println("---------------"
						+ "-----------------------------------------------------------------------------");
				System.out.println("El nombre del jefe es " + todosJefes.get(i).getNombre());
				System.out.println("El tipo de jefe es " + todosJefes.get(i).getTipo());
				System.out.println("Quieres ver la historia de este jefe?");
				System.out.println("1-Si");
				System.out.println("2-No");
				int numMuestroDatos;
				numMuestroDatos = numeros.nextInt();
				switch (numMuestroDatos) {
				case 1:

					System.out.println("------------------------------------"
							+ "--------------------------------------------------------------");
					System.out.println("El lore :");
					System.out.println(todosJefes.get(i).getInformacionBreve());
					System.out.println();
					break;

				case 2:
					System.out.println("Ha acabado!");
					break;
				default:
					System.out.println("opcion no valida!");
				}
			}

		}
	}

	/**
	 * 
	 * @param todosJefes       Introducimos el parametro par que enten los jefe que
	 *                         ya estan creados para si poder mostralos
	 * @param nombreJefeBuscar Este dato se lo pedimos al usuario para que tengamos
	 *                         la referencia para poder buscar
	 * @return todosJefes array de objeto de los jefes ya creados y cargados
	 * 
	 *         Hacemos que el metodo busque por el nombre del usuario
	 * 
	 */
	public static void buscarJefesNombre(ArrayList<Jefes> todosJefes, String nombreJefeBuscar) {
		for (Jefes jefeBuscado : todosJefes) {
			if (jefeBuscado != null) {
				if (jefeBuscado.getNombre().equalsIgnoreCase(nombreJefeBuscar)) {
					System.out.println(jefeBuscado);
				}

			}
		}

	}

	/**
	 * 
	 * @param todosJefes     Introducimos el parametro par que enten los jefe que ya
	 *                       estan creados para si poder mostralos
	 * @param tipoJefeBuscar Este dato se lo pedimos al usuario para que tengamos la
	 *                       referencia para poder buscar
	 * @return todosJefes array de objeto de los jefes ya creados y cargados
	 * 
	 *         Hacemos que el metodo busque por el tipo del usuario
	 * 
	 */

	public static void buscarJefesTipo(ArrayList<Jefes> todosJefes, String tipoJefeBuscar) {
		for (Jefes jefeBuscado : todosJefes) {
			if (jefeBuscado != null) {
				if (jefeBuscado.getTipo().equalsIgnoreCase(tipoJefeBuscar)) {
					System.out.println(jefeBuscado);
				}

			}
		}

	}

	/**
	 * 
	 * @param todosJefes 
	 * Introducimos el parametro par que enten los jefe que ya estan creados para si poder mostralos
	 * @param nombreJefeBuscar
	 * Este dato se lo pedimos al usuario para  que tengamos  la  referencia para poder buscar
	 * @return todosJefes array de objeto de los jefes ya creados y cargados
	 * 
	 * metodo que devuelve un objeto para asi poder luchar contra el , el cula lo hemos buscado por el nombre
	 * 
	 */
	public static Jefes combatirJefesNombre(ArrayList<Jefes> todosJefes,String nombreJefeBuscar) {
		for (Jefes jefeBuscado : todosJefes) {
			if(jefeBuscado != null) {
				if(jefeBuscado.getNombre().equalsIgnoreCase(nombreJefeBuscar)) {

					return jefeBuscado;
				}
				
			}
		}
		return null;
	
	}

	/**
	 * 
	 * @param todosJefes     Introducimos el parametro par que enten los jefe que ya
	 *                       estan creados para si poder mostralos
	 * @param tipoJefeBuscar Este dato se lo pedimos al usuario para que tengamos la
	 *                       referencia para poder buscar
	 * @return todosJefes array de objeto de los jefes ya creados y cargados
	 * 
	 *         metodo que devuelve un objeto para asi poder luchar contra el , el
	 *         cual lo hemos buscado por el tipo
	 * 
	 */

	public static Jefes combatirJefesTipo(ArrayList<Jefes> todosJefes, String tipoJefeBuscar) {
		for (Jefes jefeBuscado : todosJefes) {
			if(jefeBuscado != null) {
				if(jefeBuscado.getTipo().equalsIgnoreCase(tipoJefeBuscar)) {
					System.out.println(jefeBuscado);
				}
				
			}
		}
		return null;

	}

}
