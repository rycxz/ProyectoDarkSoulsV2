package personaje;

import java.util.Scanner;
import personaje.Personaje;

public class CambiarAtributosPersonaje {
	
	/**
	 *  metodo que cambia el atributo "nombre" de personaje principal
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * @param cambioNombre string con el nuevo nombre proporcionado por el usuario 
	 */ 
	public static void cambiarNombre(Personaje personajePrincipal,String cambioNombre) {
		personajePrincipal.setNombre(cambioNombre);
		System.out.println("el nombre de tu personaje es " + personajePrincipal.getNombre());
	}
	/**
	 *  metodo que cambia el atributo "sexo" de personaje principal
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * @param cambioSexo string con el nuevo sexo proporcionado por el usuario 
	 */ 
	public static void cambiarSexo(Personaje personajePrincipal,String cambioSexo) {
		personajePrincipal.setSexo(cambioSexo);
		System.out.println("el sexo de tu personaje es " + personajePrincipal.getSexo());
	}
	/**
	 *  metodo que cambia el atributo "clase " de personaje principal
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
 
	 */
	public static void cambiarClase(Personaje personajePrincipal,Scanner letras) {
		ClasesPersonaje clase = null;
		String claseIntroduccion;
		int[] vidaClases = { 0, 300, 500, 250, 275, 400, 350, 150, 350, 200, 500 };
		int[] ataqueClases = { 0, 800, 500, 750, 975, 500, 650, 650, 550, 800, 900 };
		int[] cantidadesCargaPersonaje = { 0, 90, 100, 120, 105, 130, 50, 90, 100, 75, 150 };
		int capacidadCargaClase = 0;
		int vida = 0;
		int ataque = 0;
		int numClase = 0;
		do {


			System.out.println("Digame la clase para su personaje.");
			System.out.println("Las opciones son:");
			System.out.println("Guerrero");

			System.out.println("Caballero");

			System.out.println("Vagabundo");

			System.out.println("Ladron");

			System.out.println("Bandio");

			System.out.println("Cazador");

			System.out.println("Hechizero");

			System.out.println("Piromantico");

			System.out.println("Clerigo");

			System.out.println("Marginado");

			claseIntroduccion = letras.nextLine();
			claseIntroduccion.toLowerCase();


			switch (claseIntroduccion) {
			case "guerrero":

				numClase = 1;
				capacidadCargaClase = cantidadesCargaPersonaje[numClase];
				System.out
						.println("Intrépido guerrero.\r\n" + "Experto en las armas.\r\n" + "Gran fuerza y destreza.");
				clase = ClasesPersonaje.GUERRERO;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "caballero":
				numClase = 2;
				capacidadCargaClase = cantidadesCargaPersonaje[numClase];
				System.out.println("Caballero de baja categoría.\r\n" + "Altos PS, armadura sólida.\r\n"
						+ "No es fácil de derribar.");
				clase = ClasesPersonaje.CABALLERO;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "vagabundo":
				numClase = 3;
				capacidadCargaClase = cantidadesCargaPersonaje[numClase];
				System.out.println("Peregrino sin rumbo.\r\n" + "Lleva una cimitarra.\r\n" + "Gran destreza.");
				clase = ClasesPersonaje.VAGABUNDO;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "ladron":
				numClase = 4;
				capacidadCargaClase=cantidadesCargaPersonaje[numClase];
				System.out.println("Con remordimientos.\r\n" + "Impactos críticos altos.\r\n" + "Tiene llave maestra.");
				clase = ClasesPersonaje.LADR�N;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "bandio":
				numClase = 5;
				capacidadCargaClase=cantidadesCargaPersonaje[numClase];
				System.out.println("Bandido salvaje.\r\n" + "Gran fuerza.\r\n" + "Lleva una pesada hacha de guerra.");
				clase = ClasesPersonaje.BANDIDO;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "cazador":
				numClase = 6;
				capacidadCargaClase=cantidadesCargaPersonaje[numClase];
				System.out.println("Caza con arco.\r\n" + "Lucha a corta distancia.\r\n" + "No es bueno con la magia.");
				clase = ClasesPersonaje.CAZADOR;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "hechizero":
				numClase = 7;
				capacidadCargaClase=cantidadesCargaPersonaje[numClase];
				System.out.println("De la Escuela de Dragones de Vinheim.\r\n" + "Usa magia de Almas.");
				clase = ClasesPersonaje.HECHIZERO;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "piromantico":
				numClase = 8;
				capacidadCargaClase=cantidadesCargaPersonaje[numClase];
				System.out.println(
						"Piromántico del Gran Pantano.\r\n" + "Tira hechizos de fuego y porta hacha de mano.");
				clase = ClasesPersonaje.HECHIZERO;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "clerigo":
				numClase = 9;
				capacidadCargaClase=cantidadesCargaPersonaje[numClase];
				System.out.println("Clérigo peregrino.\r\n" + "Tiene una maza.\r\n" + "Hace milagros curativos");
				clase = ClasesPersonaje.CL�RIGO;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			case "marginado":
				numClase = 10;
				capacidadCargaClase=cantidadesCargaPersonaje[numClase];
				System.out.println("Enigma sin ropa.\r\n" + "Armado solo con un garrote y un viejo escudo de tablas.");
				clase = ClasesPersonaje.MARGINADO;
				vida = vidaClases[numClase];
				ataque = ataqueClases[numClase];
				break;
			default:
				System.out.println("opcion no valida.");

			}
		} while (numClase < 0 || numClase > 11);
		System.out.println();
		personajePrincipal.setClase(clase);
		personajePrincipal.setVida(vida);
		personajePrincipal.setAtaque(ataque);
		personajePrincipal.setCapacidadCarga(capacidadCargaClase);
		System.out.println();
		System.out.println(personajePrincipal);
	
	}

}
