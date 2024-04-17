package menuObjetos;

import java.util.Scanner;

import clases.Objetos;
import comprobacionEntrada.Comprobaciones;
import salidaDatos.SalidaDatosObjetos;

public class MenuIfnoObjetos {
	
	/**
	 * menu qeu se encuentra dentro de  un metodo y sirve para mostrar el mneu de opciones de objetos
	 * @param objetos array de obejtoss ya creaso y creados 
	 */
	public static void infoObjetos(Objetos[] objetos) {
		Scanner numeros = new Scanner(System.in);
		Scanner letras = new Scanner(System.in);
		System.out.println("Bienvenido al apartado de objetos!");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Tienes varias opciones:");
		int numEleccionObjetos = 0;
		String buscarNombre ;
		String buscarTipo ;
		String repuesta ;
		do {
			System.out.println("1-Mostrar Informacion de todas los objetos (¡No parara hasta que muestre todas !)");
			System.out.println("2-Buscar objetos");
			System.out.println("3-Buscar por tipo");
			System.out.println("4-Eliminar un objeto");
			System.out.println("5-Salir");
			numEleccionObjetos=numeros.nextInt();
			switch(numEleccionObjetos) {
			case 1:
				SalidaDatosObjetos.mostrarDatosObjetos(objetos);
				break;
			case 2:
				System.out.println("Digame el nombre por el cual quiere buscar! ");
				System.out.println("Las opciones que tiene son: ");
				System.out.println("");
				System.out.println("Quieres ver las opciones diponibles? (Si/NO)");
				 repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					for(int i =0;i<objetos.length;i++) {
						System.out.println(i+". " + objetos[i].getNombre());
					}
				}
				System.out.println("Dime el nombre por el cual quieres buscar");
				buscarNombre=letras.nextLine();
				Comprobaciones.comprobacionNombre(buscarNombre);
				SalidaDatosObjetos.mostrarDatosObjetosNombre(objetos, buscarNombre);
				break;
			case 3:
				System.out.println("Digame el tipo por el cual quiere buscar! ");
				System.out.println("Las opciones que tiene son: ");
				System.out.println("");
				System.out.println("Quieres ver las opciones diponibles? (Si/NO)");
				 repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					for(int i =0;i<objetos.length;i++) {
						System.out.println(i+". " + objetos[i].getTipo());
					}
				}
				
				
				buscarTipo=letras.nextLine();
				Comprobaciones.comprobacionNombre(buscarTipo);
				SalidaDatosObjetos.mostrarDatosObjetosTipo(objetos, buscarTipo);
				break;
			case 4:
				MenuEliminarObjetos.eliminarMenu(objetos);
				break;
			case 5:
				System.out.println("Ha salido!");
				break;
				default:
					System.out.println("opcion no valida");
			}
		}while(numEleccionObjetos !=5);

	}

}
