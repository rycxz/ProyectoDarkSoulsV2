package salidaDatos;

import java.util.Scanner;

import clases.Jefes;

public class SalidaDatosJefes {
	static Scanner numeros = new Scanner(System.in);
	/**
	 * aqui creamos los jefes para poder mostrarlos y hacemos un "for"
	 * para mostrar todos los jefes en orden
	 * @param  todosJefes array de objeto de los jefes ya creados y cargados
	 */
	public static void mostrarDatosJefes(Jefes[] todosJefes) {
		for (int i = 0; i < 23; i++) {
			if (todosJefes[i] != null) {
				System.out.println(
						"---------------"
						+ "-----------------------------------------------------------------------------");
				System.out.println("El nombre del jefe es " + todosJefes[i].getNombre());
				System.out.println("El tipo de jefe es " + todosJefes[i].getTipo());
					System.out.println("Quieres ver la historia de este jefe?");
					System.out.println("1-Si");
					System.out.println("2-No");
					int numMuestroDatos;
					numMuestroDatos = numeros.nextInt();
					switch (numMuestroDatos) {
					case 1:

						System.out.println(
								"------------------------------------"
								+ "--------------------------------------------------------------");
						System.out.println("El lore :");
						System.out.println(todosJefes[i].getInformacionBreve());
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
	 * @param todosJefes 
	 * Introducimos el parametro par que enten los jefe que ya estan creados para si poder mostralos
	 * @param nombreJefeBuscar
	 * Este dato se lo pedimos al usuario para  que tengamos  la  referencia para poder buscar
	 * @return todosJefes array de objeto de los jefes ya creados y cargados
	 * 
	 * Hacemos que el metodo busque por el nombre del usuario 
	 * 
	 */
	public static void buscarJefesNombre(Jefes[] todosJefes,String nombreJefeBuscar) {
		for (int i = 0; i < todosJefes.length; i++) {
			if(todosJefes[i] != null) {
				if(todosJefes[i].getNombre().equalsIgnoreCase(nombreJefeBuscar)) {
					System.out.println(todosJefes[i]);
				}
				
			}
		}
	
	}
	/**
	 * 
	 * @param todosJefes 
	 * Introducimos el parametro par que enten los jefe que ya estan creados para si poder mostralos
	 * @param tipoJefeBuscar
	 * Este dato se lo pedimos al usuario para  que tengamos  la  referencia para poder buscar
	 * @return todosJefes array de objeto de los jefes ya creados y cargados
	 *  
	 * Hacemos que el metodo busque por el tipo del usuario 
	 * 
	 */
	
	public static void buscarJefesTipo(Jefes[] todosJefes,String tipoJefeBuscar) {
		for (int i = 0; i < todosJefes.length; i++) {
			if(todosJefes[i] != null) {
				if(todosJefes[i].getTipo().equalsIgnoreCase(tipoJefeBuscar)) {
					System.out.println(todosJefes[i]);
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
	public static Jefes combatirJefesNombre(Jefes[] todosJefes,String nombreJefeBuscar) {
		for (int i = 0; i < todosJefes.length; i++) {
			if(todosJefes[i] != null) {
				if(todosJefes[i].getNombre().equalsIgnoreCase(nombreJefeBuscar)) {
					return todosJefes[i];
				}
				
			}
		}
		return null;
	
	}
	/**
	 * 
	 * @param todosJefes 
	 * Introducimos el parametro par que enten los jefe que ya estan creados para si poder mostralos
	 * @param tipoJefeBuscar
	 * Este dato se lo pedimos al usuario para  que tengamos  la  referencia para poder buscar
	 * @return todosJefes  array de objeto de los jefes ya creados y cargados
	 * 
	 * metodo que devuelve un objeto para asi poder luchar contra el , el cual lo hemos buscado por el tipo
	 * 
	 */
	
	public static Jefes combatirJefesTipo(Jefes[] todosJefes,String tipoJefeBuscar) {
		for (int i = 0; i < todosJefes.length; i++) {
			if(todosJefes[i] != null) {
				if(todosJefes[i].getTipo().equalsIgnoreCase(tipoJefeBuscar)) {
					return todosJefes[i];
				}
				
			}
		}
		return null;
	
	}
	
	

}
