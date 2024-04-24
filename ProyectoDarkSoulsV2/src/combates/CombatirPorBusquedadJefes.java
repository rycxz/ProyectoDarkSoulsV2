package combates;

import java.util.ArrayList;
import java.util.Scanner;

import jefes.Jefes;
import personaje.Personaje;
import salidaDatos.SalidaDatosJefes;



public class CombatirPorBusquedadJefes {
	/**
	 * 	 metodo que busca el jefe por el nombre/tipo y combates contra el 
	 * 
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * 

	 */

	public static void combatirJefesBusquedad(ArrayList<Jefes> todosJefes, Personaje personajePrincipal,Scanner numeros , Scanner letras) {
		
		System.out.println("Opciones de busqedad");
		System.out.println("1-Buscar por nombre");
		System.out.println("2.Buscar por tipo");
		int numOpcionesBusquedad = numeros.nextInt();
		int contador = 0;
		switch(numOpcionesBusquedad) {
		case 1:
			System.out.println("Los nombres de los jefes son:");
			for(Jefes todosJefes1 : todosJefes ) {
				System.out.println("("+contador+")" + todosJefes1.getNombre());
				contador++;
			}
			String nombreJefeBuscar= letras.nextLine();
			Jefes combatirJefeNombre=SalidaDatosJefes.combatirJefesNombre(todosJefes, nombreJefeBuscar);
			CombatirContraUnJefe.combateContraJefeBuscado(combatirJefeNombre, personajePrincipal, todosJefes, letras);
			break;
		case 2:
			System.out.println("Los tipos de los jefes son:");
			contador = 0;
			for(Jefes todosJefes1 : todosJefes ) {
				System.out.println("("+contador+")" + todosJefes1.getTipo());
				contador++;
			}
			String tipoJefeBuscar= letras.nextLine();
			Jefes combatirJefeTipo=SalidaDatosJefes.combatirJefesTipo(todosJefes, tipoJefeBuscar);
			CombatirContraUnJefe.combateContraJefeBuscado(combatirJefeTipo, personajePrincipal, todosJefes, letras);
			break;
			default:
				System.out.println("Opcion no valida");
		
		
		}

		
	}


}
