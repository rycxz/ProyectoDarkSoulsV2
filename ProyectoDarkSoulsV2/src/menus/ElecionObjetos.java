package menus;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Anillos;
import objetos.Armaduras;
import objetos.Armas;
import personaje.Personaje;

public class ElecionObjetos {

	public static void elecionItemPesrosnaje(Personaje personajePrincipal, ArrayList<Anillos> anillos, ArrayList<Armaduras> armaduraPrimarias,
			ArrayList<Armaduras> armaduraSecundarias, ArrayList<Armas> armasPrimarias,
			ArrayList<Armas> armasSecundarias, Scanner numerosMenuPrincipal) {
		System.out.println("Antes de cotinuar tienes que elegir tus obejtos para tu desafio ");
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		for(int i =0 ; i<3;i++) {
			switch (i) {
			case 1:
				System.out.println("Primero tienes que elgir tu anillo");
				for(Anillos anillosPersonaje:anillos) {
					
					
				}
			}
		}
	
		
	}

}
