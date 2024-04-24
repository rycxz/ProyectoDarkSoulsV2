package menuJefes;

import java.util.Scanner;

import clases.Jefes;
import clases.Personaje;
import comprobacionEntrada.Comprobaciones;

public class CreacionJefePersonalizado {
	/**	
	 *   metodo que crea un jefe personalizado fuera del array de objetos de jefes
	 * 
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 * @return  jefePersonalizado devuelve el objeto del jefe creado por el usuario
	 * 

	 */

	public static Jefes menuCombateJefePersonalizado(Personaje personajePrincipal) {
		Scanner numeros = new Scanner(System.in);
		Scanner letras = new Scanner(System.in);
		System.out.println("Lo primero vamos a crear tu jefe! ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Lo primero que vamos a necesitar es un nombre: ");
		String nombreJefeCreado = letras.nextLine();
		nombreJefeCreado = Comprobaciones.comprobacionNombre(nombreJefeCreado);
		String[] tipoDeJefe = { "Demonio", "Gárgolas", "Demonio", "Dragón", "Araña/Demonio", "Demonio",
				"Gólem de Hierro", "Caballeros", "Lobo", "Necrómaco", "Señor de los Muertos", "Espíritus oscuros",
				"Dragón", "Demonio", "Demonio", "Entidad caótica", "Caballero corrompido", "Quimera", "Ser del Abismo",
				"Caballero corrompido", "Dragón", "Señor de la Ceniza" };
		System.out.println("");
		System.out.println("Para la creacion del tipo de jefe primero te muestro todos los tipos de jefes que hay");
		String tipo = null;
		for (int i = 0; i < tipoDeJefe.length; i++) {
			System.out.println("Los tipos disponibles son " + tipoDeJefe[i]);
		}
		System.out.println("Ahora dime el tipo de tu jefe");
		tipo = letras.nextLine();
		System.out.println("Quieres añadir una breve decripcion a tu jefe? (Si/No)");
		System.out.println("");
		String repuestaCrearLore = letras.nextLine();
		String informacionBreve = null;
		if (repuestaCrearLore.equalsIgnoreCase("si")) {
			System.out.println("Pon tu descripcion: ");
			informacionBreve = letras.nextLine();
		}
		System.out.println("");
		System.out.println("Ahora dime la cantidad de vida que va a tener");
		int vida = numeros.nextInt();
		System.out.println("");
		System.out.println("Ahora dime el daño que va a hacer tu jefe (NUMERO)");
		String[] tiposAtaque = { "Daño físico (40)", "cortante (70)", "perforante(110)", "contundente(250)",
				"mágico(120)", "fuego (99)", "eléctrico (177)", "oscuro (322)", "divino (122)", "veneno(1)",
				"tóxico (199)" };
		int[] cantidadPorTipoAtque = { 40, 70, 110, 250, 120, 99, 177, 322, 122, 1, 199 };
		System.out.println("Los tipos de ataques que tienes son: ");
		for (int i = 0; i < tiposAtaque.length; i++) {
			System.out.println("(" + i + ") " + tiposAtaque[i]);
		}
		System.out.println("Dime numero del tipo de ataque que vas a queres");
		int numEleccionAtaque = numeros.nextInt();

		int ataque = cantidadPorTipoAtque[numEleccionAtaque];

		// creamos el objeto de jefe con esos atributos

		Jefes jefePersonalizado = new Jefes(nombreJefeCreado,tipo,informacionBreve,vida,ataque);
		return jefePersonalizado;

	}

	

}
