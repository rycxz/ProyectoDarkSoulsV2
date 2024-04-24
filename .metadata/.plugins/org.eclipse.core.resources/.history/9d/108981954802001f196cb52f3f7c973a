package cargaDatosObjetos;

import java.util.ArrayList;

import objetos.Anillos;

public class CargaDatosAnillos {
	public  static ArrayList<Anillos> caraDatos() {
		String[] nombreAnillosDanVida = { "Anillo de Acero de Protección", "Anillo de Acero de Protección Azul",
				"Anillo de Corazón de Hueso de Dragón", "Anillo de Corazón de Hierro", "Anillo de Corazón de Plata",
				"Anillo de Corazón de Sombra", "Anillo de Corazón de Veneno", "Anillo de Corazón de Víbora",
				"Anillo de Corazón Oscuro", "Anillo de Corazón Rojo", "Anillo de Fuego",
				"Anillo de Resistencia de Fuego", "Anillo de Piedra de Fuego", "Anillo de Piedra de Lava" };
		int[] cantidadVidaAlteradaAnillos = { 130, -20, 110, 190, 1120, -90, 156, -130, 500, 110, -11, -113, -14 };
		int[] cantidadDanioAlteradoAnillos = { 130, -120, 110, 190, -112, 190, 156, 123, 150, -110, 111, 113, -114 };
		String[] lore = { "Refuerza la defensa física del usuario", "Mejora la resistencia a los golpes críticos",
				"Incrementa la resistencia a la toxicidad y maldición", "Aumenta la defensa física",
				"Incrementa la resistencia a efectos de maldición", "Aumenta la resistencia a efectos de veneno",
				"Proporciona una mayor resistencia a los efectos de veneno",
				"Aumenta la resistencia a los efectos de toxicidad",
				"Mejora la resistencia a los efectos de oscuridad y maldición",
				"Incrementa la resistencia a los efectos de sangrado", "Aumenta el daño de ataques de fuego",
				"Proporciona resistencia adicional al daño de fuego", "Incrementa la defensa contra daño de fuego" };
		double[] peso = { 0.2 ,0.4 ,0.9, 0.1, 0.5 , 0.7, 0.44 , 0.7,0.4,0.56,0.32,0.12,0.34};

		ArrayList<Anillos> anillos = new ArrayList<>();
		for (int i = 0; i < nombreAnillosDanVida.length; i++) {
			anillos.add(new Anillos(nombreAnillosDanVida[i],lore[i],cantidadVidaAlteradaAnillos[i],cantidadDanioAlteradoAnillos[i],peso[i]));
		}
		return anillos;

	}

}
