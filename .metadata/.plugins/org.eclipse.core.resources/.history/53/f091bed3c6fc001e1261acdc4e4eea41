package acciones;

import java.util.Scanner;

import clases.Jefes;
import clases.Personaje;
import otros.ComprobacionMuerte;
import otros.GeneracionNumeroAleatorio;

public class CombateContraTodosLosJefes {
	/**
	 *   menu donde el usuario seleciona las diferentes
	 *                           opciones a la hora de pelear contra un bosss ,
	 *                           desplegandose asi varios sub menus y el metodo no
	 *                           acabara hasrta eque el usario muero o se pase el
	 *                           jeugo
	 * 
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * 
	 *                         
	 */
	static Scanner saltoLinea = new Scanner(System.in);

	public static void aciertoBoss(Jefes[] todosJefes, Personaje personajePrincipal) {


		// asignamos valor de la vida a una varibale del metodo para asi poder cambiarle
		// la vida y determinar si ha muerto el jugador

		int vidaPersonaje = personajePrincipal.getVida();

		System.out.println("Suena musica epica de Dark Souls");
		System.out.println("Recomiendo escuchar esto ( https://youtu.be/ffLbdhP0auc?si=q6lEjfjV4TL6uDCR )");

		for (int i = 0; i < todosJefes.length; i++) {
			int vidaBoss = 9999;

			// asignamos valor de cada jefe a la vida, este valor ira cambiando por cada
			// vuelta del "for"

			vidaBoss = todosJefes[i].getVida();

			System.out.println("Estamos ante " + todosJefes[i].getNombre());

			System.out.println("");

			double numeroInicioPelea = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			double aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			saltoLinea.nextLine();
			// usando la porbabilidad hacemos que decida quien ataca primero
			if (numeroInicioPelea < 50) {
				System.out.println(todosJefes[i].getNombre() + " lanza el primer golpe");
				System.out.println(" ");
				vidaPersonaje = vidaPersonaje - todosJefes[i].getAtaque();
				System.out.println("Te ha dado, tienes " + vidaPersonaje);
				saltoLinea.nextLine();
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (vidaPersonaje < 0) {
					System.out.println("Te ha matado");
					ComprobacionMuerte.hasMuerto();
			
					
				}
			} else {
				System.out.println("");
				System.out.println("Atacas primero a " + todosJefes[i].getNombre());
				vidaBoss = vidaBoss - personajePrincipal.getAtaque();
				System.out.println("Le has dado, le queda " + vidaBoss);
				saltoLinea.nextLine();
			}
			do {
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (aciertoBoss < 50) {
					System.out.println(todosJefes[i].getNombre() + " te ataca");
					vidaPersonaje = vidaPersonaje - todosJefes[i].getAtaque();
					System.out.println("Te ha dado, tienes " + vidaPersonaje);
					saltoLinea.nextLine();
					if (vidaPersonaje < 0) {
						System.out.println("Te ha matado");
						ComprobacionMuerte.hasMuerto();
					
						
					}

				} else {
					vidaBoss = vidaBoss - personajePrincipal.getAtaque();
					System.out.println("Le has dado, le queda " + vidaBoss);
					saltoLinea.nextLine();
				}

			} while (vidaBoss > 0 && vidaPersonaje>0);
			if(vidaPersonaje<0) {
				break;
			}
			System.out.println();
			System.out.println();

		}

	}

	/**
	 *  el metodo es igual que el anterior pero a
	 *                           diferencia de este, te curas cada vez que "i" sea
	 *                           par
	 * 
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * 
	 *                          
	 */
	public static void PeleaBosesDificil(Jefes[] todosJefes, Personaje personajePrincipal) {
		int vidaPersonaje = personajePrincipal.getVida();

		System.out.println("Suena musica epica de Dark Souls");
		System.out.println("Recomiendo escuchar esto ( https://youtu.be/ffLbdhP0auc?si=q6lEjfjV4TL6uDCR )");

		for (int i = 0; i < todosJefes.length; i++) {

			if (i % 2 == 0) {
				System.out.println("");
				System.out.println("Suena el sonido de un frasco de estus, te has curando en una hoguera");
				vidaPersonaje = personajePrincipal.getVida();
			}

			int vidaBoss = 9999;

			// asignamos valor de cada jefe a la vida, este valor ira cambiando por cada
			// vuelta del "for"

			vidaBoss = todosJefes[i].getVida();

			System.out.println("Estamos ante " + todosJefes[i].getNombre());

			System.out.println("");

			double numeroInicioPelea = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			double aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
		
			saltoLinea.nextLine();
			// usando la porbabilidad hacemos que decida quien ataca primero
			if (numeroInicioPelea < 50) {
				System.out.println(todosJefes[i].getNombre() + " lanza el primer golpe");
				System.out.println(" ");
				vidaPersonaje = vidaPersonaje - todosJefes[i].getAtaque();
				System.out.println("Te ha dado, tienes " + vidaPersonaje);
				saltoLinea.nextLine();
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (vidaPersonaje < 0) {
					System.out.println("Te ha matado");
					ComprobacionMuerte.hasMuerto();
					
			
					
				}

			} else {
				System.out.println("");
				System.out.println("Atacas primero a " + todosJefes[i].getNombre());
				vidaBoss = vidaBoss - personajePrincipal.getAtaque();
				System.out.println("Le has dado, le queda " + vidaBoss);
				saltoLinea.nextLine();
			}
			do {
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				
				if (aciertoBoss < 50) {
					System.out.println(todosJefes[i].getNombre() + " te ataca");
					vidaPersonaje = vidaPersonaje - todosJefes[i].getAtaque();
					System.out.println("Te ha dado, tienes " + vidaPersonaje);
					saltoLinea.nextLine();
					if (vidaPersonaje < 0) {
						System.out.println("Te ha matado");
						ComprobacionMuerte.hasMuerto();
					
			
						
					}
				
					

				} else {
					vidaBoss = vidaBoss - personajePrincipal.getAtaque();
					System.out.println("Le has dado, le queda " + vidaBoss);
					saltoLinea.nextLine();
				}

			} while (vidaBoss > 0 && 	 vidaPersonaje>0);
			if(vidaPersonaje<0) {
				break;
			}
			System.out.println();
			System.out.println();

		}

	}
	/**
	 *  este metodo repite lo de los anteriores pero te "cura" por cada pasada del "for"
	 * @param todosJefes  array de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 *
	 */

	public static void PeleaBosesFacil(Jefes[] todosJefes, Personaje personajePrincipal) {
		int vidaPersonaje = personajePrincipal.getVida();

		System.out.println("Suena musica epica de Dark Souls");
		System.out.println("Recomiendo escuchar esto ( https://youtu.be/ffLbdhP0auc?si=q6lEjfjV4TL6uDCR )");
		vidaPersonaje = personajePrincipal.getVida();
		for (int i = 0; i < todosJefes.length; i++) {

			
				
			
			
				System.out.println("");
				System.out.println("Suena el sonido de un frasco de estus, te has curando en una hoguera");
				
			

			int vidaBoss = 9999;

			// asignamos valor de cada jefe a la vida, este valor ira cambiando por cada
			// vuelta del "for"

			vidaBoss = todosJefes[i].getVida();

			System.out.println("Estamos ante " + todosJefes[i].getNombre());

			System.out.println("");

			double numeroInicioPelea = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			double aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			saltoLinea.nextLine();
			// usando la porbabilidad hacemos que decida quien ataca primero
			if (numeroInicioPelea < 50) {
				System.out.println(todosJefes[i].getNombre() + " lanza el primer golpe");
				System.out.println(" ");
				vidaPersonaje = vidaPersonaje - todosJefes[i].getAtaque();
				System.out.println("Te ha dado, tienes " + vidaPersonaje);
				saltoLinea.nextLine();
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (vidaPersonaje < 0) {
					System.out.println("Te ha matado");
					ComprobacionMuerte.hasMuerto();
					break;
					
				}

			} else {
				System.out.println("");
				System.out.println("Atacas primero a " + todosJefes[i].getNombre());
				vidaBoss = vidaBoss - personajePrincipal.getAtaque();
				System.out.println("Le has dado, le queda " + vidaBoss);
				saltoLinea.nextLine();
			}
			do {
			
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (aciertoBoss < 50) {
					System.out.println(todosJefes[i].getNombre() + " te ataca");
					vidaPersonaje = vidaPersonaje - todosJefes[i].getAtaque();
					System.out.println("Te ha dado, tienes " + vidaPersonaje);
					saltoLinea.nextLine();
					if (vidaPersonaje < 0) {
						System.out.println("Te ha matado");
						ComprobacionMuerte.hasMuerto();

						
					}

				} else {
					vidaBoss = vidaBoss - personajePrincipal.getAtaque();
					System.out.println("Le has dado, le queda " + vidaBoss);
					saltoLinea.nextLine();
				}

			} while (vidaBoss > 0 && vidaPersonaje>0);
			if(vidaPersonaje<0) {
				break;
			}
			
			System.out.println();
			System.out.println();

		}

	}
}
