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
		String[] nombreArmaduras = { "Lanza Dragón", "Gran Mazo de Smough", "Gran Espada del Señor de la Ceniza",
				"Gran Espada de Artorias", "Espada Oscura del Rey" };
		String[] lore = {

				"Ligera y ágil, ideal para ataques rápidos",
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
		String[] nombreArmaduras = {"Armadura de Havel", "Armadura del Gólem", "Armadura del Gólem de Hierro", "Armadura del Demonio Capra",
				"Armadura de Gwyndolin"  };
		String[] lore = {
				"Alta resistencia física y absorbe daño", "Robusta, ofrece buena defensa física y mágica",
				"Excelente defensa pero reduce velocidad de movimiento",
				"Oscura y amenazante, buena defensa contra ataques físicos",
				"Elegante y mágica, sólida defensa mágica, ideal para estilo de juego centrado en la magia",
				"Versatil y disitintiva que te  acompañara en tus adeventuras"};
		int[] proteccion = { 90, 106, 130, 200, 310};
		
		 
		double[] peso = { 25, 22, 28, 13, 24 };
		ArrayList<Armaduras> armaduras = new ArrayList<>();
		
		for (int i = 0; i < nombreArmaduras.length; i++) {
			armaduras.add(new Armaduras(nombreArmaduras[i], lore[i],jefes.get(i), proteccion[i], peso[i]));
		}
		return armaduras;

	}


}
