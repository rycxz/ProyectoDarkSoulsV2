package cargaDatosObjetos;

import java.util.ArrayList;

import jefes.JefesPrincipales;
import jefes.JefesSecundarios;
import objetos.Armaduras;

public class CargaDatosArmaduras {
	public ArrayList<Armaduras> caraDatos(ArrayList<JefesPrincipales> jefesPrincipales,ArrayList<JefesSecundarios> jefesSecundarios) {

		String[] nombreAraduras = { "Armadura de Ornstein", "Armadura de Smough",
				"Armadura de Gwyn, Se�or de la Ceniza", "Armadura de Artorias", "Armadura de los Cuatro Reyes",
				"Armadura de Havel", "Armadura del G�lem", "Armadura del G�lem de Hierro", "Armadura del Demonio Capra",
				"Armadura de Gwyndolin" };
		int[] proteccion = { 130, 120, 910, 150, 120, 90, 106, 130, 200, 310, 111, 113, 140 };
		String[] lore = {

				"Ligera y �gil, ideal para ataques r�pidos",
				"Masiva y pesada, proporciona gran defensa pero reduce movilidad",
				"Real, emana poder y prestigio, apariencia majestuosa",
				"Buena defensa contra magia oscura y maldiciones",
				"Ofrece resistencia significativa a la oscuridad y maldiciones",
				"Alta resistencia f�sica y absorbe da�o", "Robusta, ofrece buena defensa f�sica y m�gica",
				"Excelente defensa pero reduce velocidad de movimiento",
				"Oscura y amenazante, buena defensa contra ataques f�sicos",
				"Elegante y m�gica, s�lida defensa m�gica, ideal para estilo de juego centrado en la magia" };
		double[] peso = { 10, 20, 15, 12, 18, 25, 22, 28, 13, 24 };

		ArrayList<Armaduras> armaduras = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			armaduras.add(new Armaduras(nombreAraduras[i], lore[i], proteccion[i], peso[i]));
		}
		return armaduras;

	}

}
