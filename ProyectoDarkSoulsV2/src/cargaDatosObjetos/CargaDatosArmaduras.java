package cargaDatosObjetos;

import java.util.ArrayList;

import jefes.JefesPrincipales;
import jefes.JefesSecundarios;
import objetos.Armaduras;


public class CargaDatosArmaduras {
	/**
	 *  metodo que devuelve un arraylist  cargad ocon los datos que yo le he proporcionado
	 *  @param jefes el array list cargado 
	 * @return
	 */
	public  static ArrayList<Armaduras> cargaDatosArmadurasPrimarias(ArrayList<JefesPrincipales> jefes) {
		String[] nombreArmaduras = { "Lanza Drag�n", "Gran Mazo de Smough", "Gran Espada del Se�or de la Ceniza",
				"Gran Espada de Artorias", "Espada Oscura del Rey" };
		String[] lore = {

				"Ligera y �gil, ideal para ataques r�pidos",
				"Masiva y pesada, proporciona gran defensa pero reduce movilidad",
				"Real, emana poder y prestigio, apariencia majestuosa",
				"Buena defensa contra magia oscura y maldiciones",
				"Ofrece resistencia significativa a la oscuridad y maldiciones"};
		int[] proteccion = { 130, 120, 910, 150, 120};
		
		 
		double[] peso = { 10, 20, 15, 12, 18};
		ArrayList<Armaduras> armaduras = new ArrayList<>();
		
		for (int i = 0; i < nombreArmaduras.length; i++) {
			armaduras.add(new Armaduras(nombreArmaduras[i], lore[i],jefes.get(i), proteccion[i], peso[i]));
		}
		return armaduras;

	}
	/**
	 *  metodo que devuelve un arraylist  cargad ocon los datos que yo le he proporcionado
	 *  @param jefes el array list cqrgado 
	 * @return
	 */
	public  static ArrayList<Armaduras> cargaDatosArmadurasSecundarias(ArrayList<JefesSecundarios>  jefes) {
		String[] nombreArmaduras = {"Armadura de Havel", "Armadura del G�lem", "Armadura del G�lem de Hierro", "Armadura del Demonio Capra",
				"Armadura de Gwyndolin"  };
		String[] lore = {
				"Alta resistencia f�sica y absorbe da�o", "Robusta, ofrece buena defensa f�sica y m�gica",
				"Excelente defensa pero reduce velocidad de movimiento",
				"Oscura y amenazante, buena defensa contra ataques f�sicos",
				"Elegante y m�gica, s�lida defensa m�gica, ideal para estilo de juego centrado en la magia",
				"Versatil y disitintiva que te  acompa�ara en tus adeventuras"};
		int[] proteccion = { 90, 106, 130, 200, 310};
		
		 
		double[] peso = { 25, 22, 28, 13, 24 };
		ArrayList<Armaduras> armaduras = new ArrayList<>();
		
		for (int i = 0; i < nombreArmaduras.length; i++) {
			armaduras.add(new Armaduras(nombreArmaduras[i], lore[i],jefes.get(i), proteccion[i], peso[i]));
		}
		return armaduras;

	}


}
