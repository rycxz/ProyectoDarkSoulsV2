package otros;

import java.util.Scanner;

import clases.Personaje;

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
	public static void cambiarClase(Personaje personajePrincipal) {
		Scanner numeros = new Scanner(System.in);
		int[] vidaClases =  {0,300,500,250,275,400,350,150,350,200,500};
		int[] ataqueClases =  {0,800,500,750,975,500,650,650,550,800,900};
		int numClase;
		String clase = null;
		int vida = 0;
		int ataque = 0;
		do {

			System.out.println("Digame la clase para su personaje.");
			System.out.println("Las opciones son:");
			System.out.println("1-Guerrero");
			System.out.println("2-Caballero");
			System.out.println("3-Vagabundo");
			System.out.println("4-Ladron");
			System.out.println("5-Bandio");
			System.out.println("6-Cazador");
			System.out.println("7-Hechizero");
			System.out.println("8-Piromantico");
			System.out.println("9-Clerigo");
			System.out.println("10-Marginado");
			numClase = numeros.nextInt();

			
			switch (numClase) {
			case 1:
				System.out.println("Intrépido guerrero.\r\n" + "Experto en las armas.\r\n" + "Gran fuerza y destreza.");
				clase = "Guerrero";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 2:
				System.out.println("Caballero de baja categoría.\r\n" + "Altos PS, armadura sólida.\r\n"
						+ "No es fácil de derribar.");
				clase = "Caballero";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 3:
				System.out.println("Peregrino sin rumbo.\r\n" + "Lleva una cimitarra.\r\n" + "Gran destreza.");
				clase = "Vagabundo";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 4:
				System.out.println("Con remordimientos.\r\n" + "Impactos críticos altos.\r\n" + "Tiene llave maestra.");
				clase = "Ladron";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 5:
				System.out.println("Bandido salvaje.\r\n" + "Gran fuerza.\r\n" + "Lleva una pesada hacha de guerra.");
				clase = "Bandio";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 6:
				System.out.println("Caza con arco.\r\n" + "Lucha a corta distancia.\r\n" + "No es bueno con la magia.");
				clase = "Cazador";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 7:
				System.out.println("De la Escuela de Dragones de Vinheim.\r\n" + "Usa magia de Almas.");
				clase = "Hechizero";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 8:
				System.out
						.println("Piromántico del Gran Pantano.\r\n" + "Tira hechizos de fuego y porta hacha de mano.");
				clase = "Piromantico";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 9:
				System.out.println("Clérigo peregrino.\r\n" + "Tiene una maza.\r\n" + "Hace milagros curativos");
				clase = "Clerigo";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 10:
				System.out.println("Enigma sin ropa.\r\n" + "Armado solo con un garrote y un viejo escudo de tablas.");
				clase = "Marginado";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			default:
				System.out.println("opcion no valida.");

			}
		} while (numClase < 0 || numClase > 11);
		personajePrincipal.setClase(clase);
		personajePrincipal.setVida(vida);
		personajePrincipal.setAtaque(ataque);
		System.out.println();
		System.out.println(personajePrincipal);
	
	}

}
