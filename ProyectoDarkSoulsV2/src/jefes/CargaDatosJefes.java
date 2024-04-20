package jefes;

import java.util.ArrayList;

public class CargaDatosJefes {

	/**
	 * para este método he creado nombre,tipo,informacionBreve,vida y ataque en
	 * orden así se facilita la inserción de los datos para la creación del
	 * objetivo, primero comprobamos que el espacio este vacio y depués usamos el
	 * constuctor creado para la informacion y depués le atribuimos la vida y el
	 * ataque para el combate
	 * 
	 * @return jefes devuelve los jefes ya creados y cargados
	 * 
	 * 
	 */

	public static ArrayList<JefesPrincipales> cargarContenidoJefesPrincipales() {
		String[] nombre = {

				"Ornstein ", "Smough", "Gwyn, Señor de la Ceniza", "Caballero Artorias", "Los Cuatro Reyes"};
		String[] tipo = { "Caballero", "Gigante", "Dios", "Caballero", "Señor oscuro" };
		String[] informacionBreve = { "Ornstein es un poderoso caballero que protege a Gwyn en Anor Londo",
				"Smough es un brutish y masivo guerrero gigante que sirve como carcelero en Anor Londo",
				"Gwyn, Señor de la Ceniza, es un antiguo dios que luchó contra la oscuridad y encendió la Primera Llama",
				"Artorias fue un noble caballero que cayó en la corrupción al adentrarse en el Abismo",
				"Los Cuatro Reyes son los gobernantes del Vacío Abisal, quienes se enfrentaron a la oscuridad y se volvieron poderosos" };
		int[] vida = { 2500, 3500, 3000, 2000, 2800};
		int[] ataque = { 200, 300, 250, 150, 250};

		int numeroJefes = vida.length;

		// creo los objetos de los jefes y los introduzco al array list y esto es lo que
		// devuelvo
		ArrayList<JefesPrincipales> jefesTotalesPrimarios = new ArrayList<>();

		for (int i = 0; i < numeroJefes; i++) {
			JefesPrincipales jefes = new JefesPrincipales(nombre[i], tipo[i], informacionBreve[i], vida[i], ataque[i]);
			jefesTotalesPrimarios.add((JefesPrincipales) jefes);

		}

		return jefesTotalesPrimarios;

	}

	public static ArrayList<JefesSecundarios> cargarContenidoJefesSecundarios() {
		String[] nombre = {

				"Havel el Roc", "Guardianes de Anor Londo", "Gólem de Hierro", "Demonio Capra", "Gwyndolin" };
		String[] tipo = { "Humano (Caballero)", "Gigante", "Gólem", "Demonio", "Dios" };
		String[] informacionBreve = {
				"Havel el Roc era un poderoso guerrero humano que se oponía a la magia y a la expansión de la oscuridad",
				"Los Guardianes de Anor Londo son gigantescos guerreros que protegen la ciudad de Anor Londo",
				"El Gólem de Hierro es una antigua creación de los dioses, diseñada para proteger la ciudad de Anor Londo",
				"El Demonio Capra es un poderoso demonio que acecha en las calles de los Undead Burg",
				"Gwyndolin es el hijo de Gwyn y uno de los últimos dioses en Anor Londo, custodiando la ciudad en ausencia de su padre" };
		int[] vida = {  3000, 2000, 2700, 2300, 2000 };
		int[] ataque = {  300, 200, 270, 230, 200 };

		int numeroJefes = vida.length;

		// creo los objetos de los jefes y los introduzco al array list y esto es lo que
		// devuelvo

		ArrayList<JefesSecundarios> jefesTotalesSecunadrios = new ArrayList<>();

		for (int i = 0; i < numeroJefes; i++) {
			JefesSecundarios jefes = new JefesSecundarios(nombre[i], tipo[i], informacionBreve[i], vida[i], ataque[i]);
			jefesTotalesSecunadrios.add(jefes);

		}

		return jefesTotalesSecunadrios;

	}

}
