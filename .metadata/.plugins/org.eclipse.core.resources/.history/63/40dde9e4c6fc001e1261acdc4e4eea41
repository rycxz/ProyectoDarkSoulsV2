package menuZonas;

import java.util.Scanner;

import clases.Zonas;
import comprobacionEntrada.Comprobaciones;
import salidaDatos.SalidaDatosZonas;

public class MenuInfoZonas {
	/**
	 * 
	 *
	 * @param zonas array de objetos de las zonas con todos sus arapaetros ya creados
	 * 
	 * menu que muestra las opciones e las zonas
	 */
	public static void infoZonas(Zonas[] zonas) {
		Scanner numeros = new Scanner(System.in);
		Scanner letras = new Scanner(System.in);
		System.out.println("Bienvenido al apartado de zonas!");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Tienes varias opciones:");
		int numEleccionZonas = 0;
		String buscarNombre ;
		String buscarTipo ;
		String repuesta ;
		do {
			System.out.println("1-Mostrar Informacion de todas las zonas (¡No parara hasta que muestre todas !)");
			System.out.println("2-Buscar Zonas");
			System.out.println("3-Buscar por tipo");
			System.out.println("4-Salir");
			numEleccionZonas=numeros.nextInt();
			switch(numEleccionZonas) {
			case 1:
				SalidaDatosZonas.mostrarDatosZonas(zonas);
				break;
			case 2:
				System.out.println("Digame el nombre por el cual quiere buscar! ");
				System.out.println("Las opciones que tiene son: ");
				System.out.println("");
				System.out.println("Quieres ver las opciones diponibles? (Si/NO)");
				 repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					for(int i =0;i<zonas.length;i++) {
						System.out.println(i+". " + zonas[i].getNombre());
					}
				}
				System.out.println("Dime el nombre por el cual quieres buscar");
				buscarNombre=letras.nextLine();
				Comprobaciones.comprobacionNombre(buscarNombre);
				SalidaDatosZonas.mostrarDatosZonasNombre(zonas,buscarNombre);
				break;
			case 3:
				System.out.println("Digame el tipo por el cual quiere buscar! ");
				System.out.println("Las opciones que tiene son: ");
				System.out.println("");
				System.out.println("Quieres ver las opciones diponibles? (Si/NO)");
				 repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					for(int i =0;i<zonas.length;i++) {
						System.out.println(i+". " + zonas[i].getTipo());
					}
				}
				
				
				buscarTipo=letras.nextLine();
				Comprobaciones.comprobacionNombre(buscarTipo);
				SalidaDatosZonas.mostrarDatosZonasTipo(zonas,buscarTipo);
				break;
			case 4:
				System.out.println("Ha salido!");
				break;
				default:
					System.out.println("opcion no valida");
			}
		}while(numEleccionZonas !=4);

	}

}
