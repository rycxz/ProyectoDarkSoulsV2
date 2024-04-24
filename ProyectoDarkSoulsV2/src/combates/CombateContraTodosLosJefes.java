package combates;

import java.util.ArrayList;
import java.util.Scanner;

import jefes.Jefes;
import otros.ComprobacionMuerte;
import otros.GeneracionNumeroAleatorio;
import personaje.Personaje;

public class CombateContraTodosLosJefes {
	/**
	 * menu donde el usuario seleciona las diferentes opciones a la hora de pelear
	 * contra un bosss , desplegandose asi varios sub menus y el metodo no acabara
	 * hasrta eque el usario muero o se pase el jeugo
	 * 
	 * @param todosJefes         arrayList de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * 
	 * 
	 */

	public static void aciertoBoss(ArrayList<Jefes> todosJefes, Personaje personajePrincipal, Scanner saltoLinea) {

		// asignamos valor de la vida a una varibale del metodo para asi poder cambiarle
		// la vida y determinar si ha muerto el jugador

		int vidaPersonaje = personajePrincipal.getVida();

		System.out.println("Suena musica epica de Dark Souls");
		System.out.println("Recomiendo escuchar esto ( https://youtu.be/ffLbdhP0auc?si=q6lEjfjV4TL6uDCR )");

		for (Jefes todosJefes1 : todosJefes) {
			int vidaBoss = 9999;

			// asignamos valor de cada jefe a la vida, este valor ira cambiando por cada
			// vuelta del "for"

			vidaBoss = todosJefes1.getVida();

			System.out.println("Estamos ante " + todosJefes1.getNombre());

			System.out.println("");

			double numeroInicioPelea = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			double aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			saltoLinea.nextLine();
			// usando la porbabilidad hacemos que decida quien ataca primero
			if (numeroInicioPelea < 50) {
				System.out.println(todosJefes1.getNombre() + " lanza el primer golpe");
				System.out.println(" ");
				vidaPersonaje = vidaPersonaje - todosJefes1.getAtaque();
				System.out.println("Te ha dado, tienes " + vidaPersonaje);
				saltoLinea.nextLine();
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (vidaPersonaje < 0) {
					System.out.println("Te ha matado");
					ComprobacionMuerte.hasMuerto();

				}
			} else {
				System.out.println("");
				System.out.println("Atacas primero a " + todosJefes1.getNombre());
				vidaBoss = vidaBoss - personajePrincipal.getAtaque();
				System.out.println("Le has dado, le queda " + vidaBoss);
				saltoLinea.nextLine();
			}
			do {
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (aciertoBoss < 50) {
					System.out.println(todosJefes1.getNombre() + " te ataca");
					vidaPersonaje = vidaPersonaje - todosJefes1.getAtaque();
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

			} while (vidaBoss > 0 && vidaPersonaje > 0);
			if (vidaPersonaje < 0) {
				break;
			}
			System.out.println();
			System.out.println();

		}

	}

	/**
	 * el metodo es igual que el anterior pero a diferencia de este, te curas cada
	 * vez que "i" sea par usando un for each para lo demas 
	 * 
	 * 
	 * @param todosJefes         arrayList de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * 
	 * 
	 */
	public static void PeleaBosesDificil(ArrayList<Jefes> todosJefes, Personaje personajePrincipal,
			Scanner saltoLinea) {
		int vidaPersonaje = personajePrincipal.getVida();

		System.out.println("Suena musica epica de Dark Souls");
		System.out.println("Recomiendo escuchar esto ( https://youtu.be/ffLbdhP0auc?si=q6lEjfjV4TL6uDCR )");

		for (Jefes todosJefes1 : todosJefes) {
			for (int i = 0; i < todosJefes.size(); i++) {

				if (i % 2 == 0) {
					System.out.println("");
					System.out.println("Suena el sonido de un frasco de estus, te has curando en una hoguera");
					vidaPersonaje = personajePrincipal.getVida();
				}

				int vidaBoss = 9999;

				// asignamos valor de cada jefe a la vida, este valor ira cambiando por cada
				// vuelta del "for"

				vidaBoss = todosJefes1.getVida();

				System.out.println("Estamos ante " + todosJefes1.getNombre());

				System.out.println("");

				double numeroInicioPelea = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

				double aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

				saltoLinea.nextLine();
				// usando la porbabilidad hacemos que decida quien ataca primero
				if (numeroInicioPelea < 50) {
					System.out.println(todosJefes1.getNombre() + " lanza el primer golpe");
					System.out.println(" ");
					vidaPersonaje = vidaPersonaje - todosJefes1.getAtaque();
					System.out.println("Te ha dado, tienes " + vidaPersonaje);
					saltoLinea.nextLine();
					aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
					if (vidaPersonaje < 0) {
						System.out.println("Te ha matado");
						ComprobacionMuerte.hasMuerto();

					}

				} else {
					System.out.println("");
					System.out.println("Atacas primero a " + todosJefes1.getNombre());
					vidaBoss = vidaBoss - personajePrincipal.getAtaque();
					System.out.println("Le has dado, le queda " + vidaBoss);
					saltoLinea.nextLine();
				}
				do {
					aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

					if (aciertoBoss < 50) {
						System.out.println(todosJefes1.getNombre() + " te ataca");
						vidaPersonaje = vidaPersonaje - todosJefes1.getAtaque();
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

				} while (vidaBoss > 0 && vidaPersonaje > 0);
				if (vidaPersonaje < 0) {
					break;
				}
				System.out.println();
				System.out.println();

			}
		}

	}

	/**
	 * este metodo repite lo de los anteriores pero te "cura" por cada pasada del
	 * "for"
	 * 
	 * @param todosJefes         arrayList de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 *
	 */

	public static void PeleaBosesFacil(ArrayList<Jefes> todosJefes, Personaje personajePrincipal,
			Scanner saltoLinea) {
		int vidaPersonaje = personajePrincipal.getVida();

		System.out.println("Suena musica epica de Dark Souls");
		System.out.println("Recomiendo escuchar esto ( https://youtu.be/ffLbdhP0auc?si=q6lEjfjV4TL6uDCR )");
		vidaPersonaje = personajePrincipal.getVida();
		for (Jefes todosJefes1:  todosJefes) {

			System.out.println("");
			System.out.println("Suena el sonido de un frasco de estus, te has curando en una hoguera");

			int vidaBoss = 9999;

			// asignamos valor de cada jefe a la vida, este valor ira cambiando por cada
			// vuelta del "for"

			vidaBoss = todosJefes1.getVida();

			System.out.println("Estamos ante " + todosJefes1.getNombre());

			System.out.println("");

			double numeroInicioPelea = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			double aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			saltoLinea.nextLine();
			// usando la porbabilidad hacemos que decida quien ataca primero
			if (numeroInicioPelea < 50) {
				System.out.println(todosJefes1.getNombre() + " lanza el primer golpe");
				System.out.println(" ");
				vidaPersonaje = vidaPersonaje - todosJefes1.getAtaque();
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
				System.out.println("Atacas primero a " + todosJefes1.getNombre());
				vidaBoss = vidaBoss - personajePrincipal.getAtaque();
				System.out.println("Le has dado, le queda " + vidaBoss);
				saltoLinea.nextLine();
			}
			do {

				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (aciertoBoss < 50) {
					System.out.println(todosJefes1.getNombre() + " te ataca");
					vidaPersonaje = vidaPersonaje - todosJefes1.getAtaque();
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

			} while (vidaBoss > 0 && vidaPersonaje > 0);
			if (vidaPersonaje < 0) {
				break;
			}

			System.out.println();
			System.out.println();

		}

	}
}
