package menus;

import java.util.ArrayList;
import java.util.Scanner;

import jefes.Jefes;
import otros.OrdenarJefes;
import salidaDatos.SalidaDatosJefes;


/**
 *  * metodo donde se muestra el menu del apartado de los boses
 * y la llamda a distintos metodos 
 * 
 * @author recur
 * 

 *
 */
public class MenuInfoBoses {
	
	/**
	 *  menu donde hace la llamda a los disitintos metodos segun lo que elioga el usuario hara una cosa u otra
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 */
	public static void menuBoses(ArrayList <Jefes> todosJefes,Scanner numerosMenu,Scanner letras) {
		System.out.println();
		System.out.println("--------------------------------------"
				+ "-----------------------------------------------------------");
		int numJefes=90;
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1-Infromación de todos los jefes");
			System.out.println("2-Buscar por nombre");
			System.out.println("3-Buscar por tipo ");
			System.out.println("4-Mostar Jefes Ordenados");
			System.out.println("5-Salir");
			numJefes= numerosMenu.nextInt();
			switch(numJefes) {
			case 1:
				System.out.println("-----------------------------------------"
						+ "----------------------------------------------------------------------");
				SalidaDatosJefes.mostrarDatosJefes(todosJefes, letras);
				break;
			case 2:
				System.out.println("------------------------------------"
						+ "----------------------------------------------------------------------");
				System.out.println("Jefes: ");
				for(int i = 0;i<todosJefes.size();i++) {
					System.out.println("(" + i + ") "+ todosJefes.get(i).getNombre() );
				}
				System.out.println("Introdce el nombre del jefe que quiere buscar: (el nombre tiene que estar completo!)");
				String nombreJefeBuscar = letras.nextLine();
				SalidaDatosJefes.buscarJefesNombre(todosJefes, nombreJefeBuscar);
				break;
			case 3:
				System.out.println("------------------------------------------"
						+ "----------------------------------------------------------------------------------");
				System.out.println("Introdce el tipo del jefe que quiere buscar: ");
				for(int i = 0;i<todosJefes.size();i++) {
					System.out.println("(" + i + ") "+ todosJefes.get(i).getTipo());
				}
				String tipoJefeBuscar = letras.nextLine();
				SalidaDatosJefes.buscarJefesTipo(todosJefes, tipoJefeBuscar);
			case 4:
				ordenarJefes(todosJefes, letras);
				break;
			case 5:
				System.out.println("Ha salido!");
				break;
				default:
					System.out.println("Opcion no valida!");
				
			}
		}while (numJefes !=5);
		
	}
	/**
	 * metdodo que ordena los jefes segun el atributo que selecione el usuario
	 * @param todosJefes,Scanner numerosMenu  array de objeto de los jefes ya creados y cargados
	 */
	public static  void ordenarJefes(ArrayList<Jefes> todosJefes,Scanner numerosMenu ) {
		System.out.println("Por que opcion los quiere ordenar");
		int numEleccion ;
		do {
			System.out.println("1-Por ataque");
			System.out.println("2-Por vida");
			System.out.println("3-Salir");
			numEleccion = numerosMenu.nextInt();
			switch(numEleccion) {
			case 1:
				OrdenarJefes.mostrarJefesPorAtaque(todosJefes  );
				break;
			case 2:
				OrdenarJefes.mostrarJefesPorVida(todosJefes  );
				break;
			case 3:
				System.out.println("Ha salido");
				break;
				default:
					System.out.println("Opcion no valida");
			}
			
		}while(numEleccion!=3);
	}


}
