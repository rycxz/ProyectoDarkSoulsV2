package menus;

import java.util.ArrayList;
import java.util.Scanner;

import comprobacionEntrada.Comprobaciones;
import objetos.Anillos;
import objetos.Armaduras;
import objetos.Armas;
import personaje.Personaje;

public class ElecionObjetos {

	public static void elecionItemPesrosnaje(Personaje personajePrincipal, ArrayList<Anillos> anillos,
			ArrayList<Armaduras> armaduraPrimarias, ArrayList<Armaduras> armaduraSecundarias,
			ArrayList<Armas> armasPrimarias, ArrayList<Armas> armasSecundarias, Scanner numeros, Scanner letras) {
		System.out.println("Antes de cotinuar tienes que elegir tus obejtos para tu desafio ");
		System.out.println(
				"////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println();
		System.out.println();
		System.out.println(
				"Elige la opcion que quieres para la eleccion de tus objetos, ten en cuenta que si no eliges ninguno sera mas"
						+ " dificil!");
		int numMenu;
		do {
			System.out.println("1-Eliges tu anillo");
			System.out.println("2-Eliges tus armas");
			System.out.println("3-Eliges tu armadura");
			System.out.println("4-Salir");
			numMenu = numeros.nextInt();

			switch (numMenu) {
			case 1:
				System.out.println("Quieres crear tu un anillo?(Si/no)");
				System.out.println();
				String elecionCrearAnillo = letras.nextLine();
				elecionCrearAnillo = Comprobaciones.comprobacionNombre(elecionCrearAnillo);
				if (elecionCrearAnillo.equalsIgnoreCase("si")) {
					System.out.println("Dame el nombre para tu anillo");
					String nombreAnillo = letras.nextLine();
					nombreAnillo = Comprobaciones.comprobacionNombre(nombreAnillo);
					System.out.println("Añadele una historia");
					String loreAnillo = letras.nextLine();
					System.out.println("Cuanta cantiadad de vida quiere que te sume o reste?");
					int cantidadVidaAlteradaAnillo = numeros.nextInt();
					System.out.println("Cunatos puntos de ataque quieres que te sume o reste?");
					int cantidadDanioAlteradoAnillo = numeros.nextInt();
					System.out.println("y que peso quieres que tenga tu anillo?");
					double pesoAnillo = numeros.nextDouble();
					System.out.println(
							"------------------------Anillo Creado-------------------------------------------");
					Anillos anilloCreado = new Anillos(nombreAnillo, loreAnillo, cantidadVidaAlteradaAnillo,
							cantidadDanioAlteradoAnillo, pesoAnillo);
					anillos.add(anilloCreado);
					personajePrincipal.pesoCargado(anilloCreado.getPeso());
					personajePrincipal.ataqueAlterado(anilloCreado.getCantidadDanioAlterado());
					personajePrincipal.vidaAlterada(anilloCreado.getCantidadVidaAlterada());

				} else {
					System.out.println("Primero tienes que elgir tu anillo");
					int opcionAnillos = 0;
					for (Anillos anillosPersonaje : anillos) {
						System.out.println("Dime el anillo que queres");
						System.out.println(opcionAnillos + " - " + anillosPersonaje.toString());
						opcionAnillos++;

					}
					opcionAnillos = numeros.nextInt();

					personajePrincipal.pesoCargado(anillos.get(opcionAnillos).getPeso());
					personajePrincipal.ataqueAlterado(anillos.get(opcionAnillos).getCantidadDanioAlterado());
					personajePrincipal.vidaAlterada(anillos.get(opcionAnillos).getCantidadVidaAlterada());
				}
				break;
			case 2:
				System.out.println("Ahora tienes que elegir tu arma ");
				System.out.println("Quieres crear tu espada (si/no)");
				String elecionCrearEspada = letras.nextLine();
				elecionCrearEspada = Comprobaciones.comprobacionNombre(elecionCrearEspada);

				if (elecionCrearEspada.equalsIgnoreCase("si")) {
					System.out.println("Dime el nombre que le quieres asignar a  tu arma");
					String nombre = letras.nextLine();
					nombre = Comprobaciones.comprobacionNombre(nombre);
					System.out.println("Añade un lore a tu arma");
					String lore = letras.nextLine();
					System.out.println("Dime  tu tipo de arma (Te recomeindo espadon la mejor opcion)");
					String tipoArama = letras.nextLine();
					tipoArama = Comprobaciones.comprobacionNombre(tipoArama);
					System.out.println("Dime cuanto daño va a hacer tu espada");
					int danio = numeros.nextInt();
					System.out.println("Dime el tipo de daño");
					String tipoDanio = letras.nextLine();
					tipoDanio = Comprobaciones.comprobacionNombre(tipoDanio);
					System.out.println("Dime cunato va a pesar");
					double peso = numeros.nextDouble();
					System.out.println("Arma creada");
					System.out.println(
							"Quieres añadrira a la lista de armas de jefes primarios o secundarios? (primarios/secundarios)");
					String eleccionTipoArmas = letras.nextLine();
					eleccionTipoArmas = Comprobaciones.comprobacionNombre(eleccionTipoArmas);
					if (eleccionTipoArmas.equalsIgnoreCase("primarios")) {
						armasPrimarias.add(new Armas(nombre, lore, tipoArama, danio, tipoDanio, peso));
					} else if (eleccionTipoArmas.equalsIgnoreCase("secundarios")) {
						armasSecundarias.add(new Armas(nombre, lore, tipoArama, danio, tipoDanio, peso));
					}
				} else {
					System.out.println("Quieres armas de jefes primarios (si/no)");
					String eleccionTipoArmas = letras.nextLine();
					eleccionTipoArmas = Comprobaciones.comprobacionNombre(eleccionTipoArmas);
					if (eleccionTipoArmas.equalsIgnoreCase("si")) {
						System.out.println("Primero tienes que elgir tu arma");
						int opcionArma = 0;
						int contadorArmas = 0;
						for (Armas armasPersonaje : armasPrimarias) {
							System.out.println("Dime el arma que queres");
							System.out.println(contadorArmas + " - " + armasPersonaje.toString());
							contadorArmas++;

						}
						opcionArma = numeros.nextInt();

						personajePrincipal.pesoCargado(armasPrimarias.get(opcionArma).getPeso());
						personajePrincipal.ataqueAlterado(armasPrimarias.get(opcionArma).getDanio());
					} else {
						System.out.println("Primero tienes que elgir tu arma ");
						int opcionArma = 0;
						int contadorArmas = 0;
						for (Armas armasPersonaje : armasSecundarias) {
							System.out.println("Dime el arma que queres");
							System.out.println(contadorArmas + " - " + armasPersonaje.toString());
							contadorArmas++;

						}
						opcionArma = numeros.nextInt();

						personajePrincipal.pesoCargado(armasSecundarias.get(opcionArma).getPeso());
						personajePrincipal.ataqueAlterado(armasSecundarias.get(opcionArma).getDanio());
					}

				}

				break;
			case 3:
				System.out.println("Ahora tienes que elegir tu armadura o crearte tu la tuya.");
				System.out.println("Quieres crear tu armadura (si/no)");
				String elecionCrearArmadura = letras.nextLine();
				elecionCrearArmadura = Comprobaciones.comprobacionNombre(elecionCrearArmadura);
				if (elecionCrearArmadura.equalsIgnoreCase("si")) {
					System.out.println("Dime el nombre que le quieres asignar a  tu armadura");
					String nombre = letras.nextLine();
					nombre = Comprobaciones.comprobacionNombre(nombre);
					System.out.println("Añade un lore a tu armadura");
					String lore = letras.nextLine();
					System.out.println("Dime  tu tipo de armadura");
					String tipoArmadura = letras.nextLine();
					tipoArmadura = Comprobaciones.comprobacionNombre(tipoArmadura);
					System.out.println("Dime cuanto daño va a mitigar tu armadura");

					int danioMitigado = numeros.nextInt();
					System.out.println("y cuanto va a pesar");
					double pesoArmadura = numeros.nextDouble();
					System.out.println(
							"Quieres añadrira a la lista de armaduras de jefes primarios o secundarios? (primarios/secundarios)");
					String eleccionTipoArmaduras = letras.nextLine();
					eleccionTipoArmaduras = Comprobaciones.comprobacionNombre(eleccionTipoArmaduras);
					if (eleccionTipoArmaduras.equalsIgnoreCase("primarios")) {
						armaduraPrimarias.add(new Armaduras(nombre, lore, danioMitigado, pesoArmadura));
					} else if (eleccionTipoArmaduras.equalsIgnoreCase("secundarios")) {
						armaduraSecundarias.add(new Armaduras(nombre, lore, danioMitigado, pesoArmadura));
					}

				} else {
					System.out.println("Quieres armaduras de jefes primarios (si/no)");
					String eleccionTipoArmaduras = letras.nextLine();
					eleccionTipoArmaduras = Comprobaciones.comprobacionNombre(eleccionTipoArmaduras);
					if (eleccionTipoArmaduras.equalsIgnoreCase("si")) {
						System.out.println("Primero tienes que elgir tu armadura");
						int opcionArmadura = 0;
						int contadorArmadura = 0;
						for (Armaduras armaduraPersonaje : armaduraPrimarias) {
							System.out.println("Dime el arma que queres");
							System.out.println(contadorArmadura + " - " + armaduraPersonaje.toString());
							contadorArmadura++;

						}
						opcionArmadura = numeros.nextInt();

						personajePrincipal.pesoCargado(armaduraPrimarias.get(opcionArmadura).getPeso());
						personajePrincipal.vidaAlterada(armaduraPrimarias.get(opcionArmadura).getProteccion());
					} else {

						System.out.println("Primero tienes que elgir tu armadura");
						int opcionArmadura = 0;
						int contadorArmadura = 0;
						for (Armaduras armaduraPersonaje : armaduraSecundarias) {
							System.out.println("Dime el arma que queres");
							System.out.println(contadorArmadura + " - " + armaduraPersonaje.toString());
							contadorArmadura++;

						}
						opcionArmadura = numeros.nextInt();

						personajePrincipal.pesoCargado(armaduraSecundarias.get(opcionArmadura).getPeso());
						personajePrincipal.vidaAlterada(armaduraSecundarias.get(opcionArmadura).getProteccion());
					}

				}
				break;
			case 4:
				System.out.println("Has Salido");
				break;
			default:
				System.out.println("Opcion no valida");

			}

		} while (numMenu != 4);
	}
}
