package menuJefes;

import java.util.Scanner;

import acciones.CombatirContraUnJefe;
import clases.Jefes;
import clases.Personaje;
import salidaDatos.SalidaDatosJefes;

public class CombatirPorBusquedadJefes {
	/**
	 * 	 metodo que busca el jefe por el nombre/tipo y combates contra el 
	 * 
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * 

	 */

	public static void combatirJefesBusquedad(Jefes[] todosJefes, Personaje personajePrincipal) {
		Scanner numeros = new Scanner(System.in);
		Scanner letras = new Scanner(System.in);
		System.out.println("Opciones de busqedad");
		System.out.println("1-Buscar por nombre");
		System.out.println("2.Buscar por tipo");
		int numOpcionesBusquedad = numeros.nextInt();
		switch(numOpcionesBusquedad) {
		case 1:
			System.out.println("Los nombres de los jefes son:");
			for(int i = 0;i<todosJefes.length;i++) {
				System.out.println("("+i+")" + todosJefes[i].getNombre());
			}
			String nombreJefeBuscar= letras.nextLine();
			Jefes combatirJefeNombre=SalidaDatosJefes.combatirJefesNombre(todosJefes, nombreJefeBuscar);
			CombatirContraUnJefe.combateContraJefeBuscado(combatirJefeNombre, personajePrincipal);
			break;
		case 2:
			System.out.println("Los tipos de los jefes son:");
			for(int i = 0;i<todosJefes.length;i++) {
				System.out.println("("+i+")" + todosJefes[i].getTipo());
			}
			String tipoJefeBuscar= letras.nextLine();
			Jefes combatirJefeTipo=SalidaDatosJefes.combatirJefesTipo(todosJefes, tipoJefeBuscar);
			CombatirContraUnJefe.combateContraJefeBuscado(combatirJefeTipo, personajePrincipal);
			break;
			default:
				System.out.println("Opcion no valida");
		
		
		}

		
	}


}
