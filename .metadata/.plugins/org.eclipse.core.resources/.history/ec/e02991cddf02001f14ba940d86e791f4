package cargaDatosObjetos;

import java.util.ArrayList;

import jefes.JefesPrincipales;
import jefes.JefesSecundarios;
import objetos.Armas;

public class CargaDatosArmas {
	public  static ArrayList<Armas> caraDatosJefesPrinciaples(ArrayList<JefesPrincipales> jefes) {
		String[] nombre = { "Lanza Dragón", "Gran Mazo de Smough", "Gran Espada del Señor de la Ceniza",
				"Gran Espada de Artorias", "Espada Oscura del Rey" };
		String[] lore = {
				"Una lanza imbuida con la energía del dragón, asociada a un legendario caballero conocido por su habilidad para cazar dragones",
				"Una enorme mazo utilizado por un carcelero, conocido por su brutalidad y su deseo de aplastar a sus enemigos",
				"Una gran espada que perteneció a un poderoso ser, quien la utilizó en su lucha contra la oscuridad antes de encender la Primera Llama",
				"Una poderosa espada asociada a un valiente caballero, quien luchó contra la oscuridad en el Abismo y se sacrificó para proteger a su compañero",
				"Una espada envuelta en la oscuridad, asociada a unos misteriosos señores, quienes desafiaron la oscuridad y se volvieron poderosos en el proceso" };
		String[] tipoArama = { "lance", "martillo", "espada", "espada", "espada" };
		int[] danio = { 700, 900, 500, 400, 700 };
		String[] tipoDanio = { "Perforante", "Contundente", "Cortante", "Cortante", "Cortante" };
		double[] peso = { 15, 25, 10, 8, 7 };

		ArrayList<Armas> armas = new ArrayList<>();
		for (int i = 0; i < nombre.length; i++) {
			armas.add(new Armas(nombre[i], lore[i], jefes.get(i), tipoArama[i], danio[i], tipoDanio[i], peso[i]));
		}
		return armas;

	}

	public static ArrayList<Armas> caraDatosJefesSecundarios(ArrayList<JefesSecundarios> jefes) {
		String[] nombre = { "Gran Mazo de Havel", "Espada recta de los Guardianes", "Gran hacha de Gólem",
				"Gran hacha de Capra", "Arco lunar" };
		String[] lore = {
				"Un gran mazo asociado a un guerrero conocido por su resistencia impenetrable y su lucha contra la magia. El mazo refleja la fuerza abrumadora y la implacable determinación de su portador",
				"Una espada recta utilizada por quienes protegen la ciudad de los intrusos. Forjada con habilidad y destreza, esta espada refleja la dedicación y la lealtad de aquellos que la empuñan",
				"Un gran hacha asociada a antiguas creaciones destinadas a proteger la ciudad. Esta hacha encarna la fuerza y la resistencia de los guardianes en su deber de proteger",
				"Un gran hacha utilizada por un poderoso demonio que acecha en los oscuros callejones. Esta hacha emana una malévola energía que refleja la brutalidad y la ferocidad de su portador",
				"Un arco imbuido con la magia de la luna, se dice que canaliza el poder para lanzar flechas etéreas contra sus enemigos" };
		String[] tipoArama = {"Lanza", "Martillo", "Hacha", "Hacha", "Arco"};
		int[] danio = {700,900,800,800,500};
		String[] tipoDanio = {"Perforante", "Contundente", "Cortante Fuerte", "Cortante Fuerte", "Distancia" };
		double[] peso = {15,25,20,20,5};
		ArrayList<Armas> armas = new ArrayList<>();
		for (int i = 0; i < nombre.length; i++) {
			armas.add(new Armas(nombre[i], lore[i], jefes.get(i), tipoArama[i], danio[i], tipoDanio[i], peso[i]));
		}
		return armas;

	}

}
