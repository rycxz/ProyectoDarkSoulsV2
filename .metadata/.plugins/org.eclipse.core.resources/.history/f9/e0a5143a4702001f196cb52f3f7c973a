package acciones;

import java.util.Scanner;

import clases.Jefes;
import clases.Personaje;
import otros.ComprobacionMuerte;
import otros.GeneracionNumeroAleatorio;

public class CombatirContraUnJefe {
	/** * 
	 * metodo que proporciona el combate contra el jefe buscado 
	 * 
	 * @param jefePersonalizado  array de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	
	 */
	public static void combateContraJefeBuscado(Jefes jefeBuscado,Personaje personajePrincipal) {
		Scanner saltoLinea = new Scanner(System.in);
		int vidaPersonaje = personajePrincipal.getVida();

		System.out.println("Suena musica epica de Dark Souls");
		System.out.println("Recomiendo escuchar esto ( https://youtu.be/ffLbdhP0auc?si=q6lEjfjV4TL6uDCR )");
		vidaPersonaje = personajePrincipal.getVida();


			int vidaBoss = jefeBuscado.getVida();

			// asignamos valor de cada jefe a la vida, este valor ira cambiando por cada
			// vuelta del "for"

			System.out.println("Estamos ante " + jefeBuscado.getNombre());

			System.out.println("");

			double numeroInicioPelea = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			double aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();

			saltoLinea.nextLine();
			// usando la porbabilidad hacemos que decida quien ataca primero
			if (numeroInicioPelea < 50) {
				System.out.println(jefeBuscado.getNombre() + " lanza el primer golpe");
				System.out.println(" ");
				vidaPersonaje = vidaPersonaje - jefeBuscado.getAtaque();
				System.out.println("Te ha dado, tienes " + vidaPersonaje);
				saltoLinea.nextLine();
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (vidaPersonaje < 0) {
					System.out.println("Te ha matado");
					ComprobacionMuerte.hasMuerto();
					
					
				}

			} else {
				System.out.println("");
				System.out.println("Atacas primero a " + jefeBuscado.getNombre());
				vidaBoss = vidaBoss - personajePrincipal.getAtaque();
				System.out.println("Le has dado, le queda " + vidaBoss);
				saltoLinea.nextLine();
			}
			do {
			
				aciertoBoss = GeneracionNumeroAleatorio.generacionNumeroAciertoBoss();
				if (aciertoBoss < 50) {
					System.out.println(jefeBuscado.getNombre() + " te ataca");
					vidaPersonaje = vidaPersonaje - jefeBuscado.getAtaque();
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
			
			System.out.println("");
			System.out.println();
			System.out.println();

		}

	

}
