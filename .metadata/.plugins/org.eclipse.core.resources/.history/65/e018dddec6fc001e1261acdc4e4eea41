package menuObjetos;

import java.util.Scanner;

import clases.Objetos;
import comprobacionEntrada.Comprobaciones;
import otros.EliminarObjetos;

public class MenuEliminarObjetos {
	/**
	 * 
	 * @param objetos array de objetos ya creadso ya cargados 
	 * 
	 * metdodo que contiene un menu donde se le permite al usuario elminar varios onjetos de la lista de objetos
	 */
	public static void eliminarMenu(Objetos[] objetos) {
		 Scanner letras = new Scanner(System.in);
		 Scanner numeros = new Scanner(System.in);
		System.out.println("Estas en el partado de eliminar objetos");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Tienes 2 opciones: ");
		int numEliminar = 0;
		do {
			System.out.println("1-Eliminar por nombre");
			System.out.println("2-Eliminar por tipo");
			System.out.println("3-Salir");
			numEliminar=numeros.nextInt();
			String repuesta;
			String buscarNombre;
			String buscarTipo;
			switch(numEliminar) {
			case 1:
				System.out.println("Digame el nombre  por el cual quiere buscar! ");
				System.out.println("Las opciones que tiene son: ");
				System.out.println("");
				System.out.println("Quieres ver las opciones diponibles? (Si/NO)");
				 repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					for(int i =0;i<objetos.length;i++) {
						System.out.println(i+". " + objetos[i].getNombre());
					}
				}
				
				System.out.println("Digame el nombre del objeto por le cual quiere elminar");
				buscarNombre=letras.nextLine();
				Comprobaciones.comprobacionNombre(buscarNombre);
				EliminarObjetos.eliminarDatosObjetosNombre(objetos, buscarNombre);
				System.out.println("Objeto Eliminado");
				break;
			case 2:
				System.out.println("Digame el tipo  por el cual quiere buscar! ");
				System.out.println("Las opciones que tiene son: ");
				System.out.println("");
				System.out.println("Quieres ver las opciones diponibles? (Si/NO)");
				 repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					for(int i =0;i<objetos.length;i++) {
						System.out.println(i+". " + objetos[i].getTipo());
					}
				}
				
				System.out.println("Digmae el tipo de objeto que quiere eliminar");
				
				 buscarTipo = letras.nextLine();
				Comprobaciones.comprobacionNombre( buscarTipo);
				EliminarObjetos.eliminarDatosObjetosTipo(objetos, buscarTipo);
				System.out.println("Objeto Eliminado");
				break;
			case 3:
				System.out.println("Ha salido!");
				break;
				default:
					System.out.println("opcion no valida");
			}
			
		}while(numEliminar!=3);
	}

}
