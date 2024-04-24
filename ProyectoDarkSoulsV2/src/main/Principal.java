/**
 * @author Ricardo-Sorin-Almajan
 * 
 * @version  0.0
 * 
 * @since 28/02/24
 *  
 */

package main;

import java.util.ArrayList;
import java.util.Scanner;

import cargaDatosObjetos.CargaDatosAnillos;
import cargaDatosObjetos.CargaDatosArmaduras;
import cargaDatosObjetos.CargaDatosArmas;
import combates.MensajeComabtes;
import jefes.CargaDatosJefes;
import jefes.Jefes;
import jefes.JefesPrincipales;
import jefes.JefesSecundarios;
import menus.ElecionObjetos;
import objetos.Anillos;
import objetos.Armaduras;
import objetos.Armas;
import personaje.MenuCrearPersonaje;
import personaje.MenuPersonaje;
import personaje.Personaje;

public class Principal {
	/**
	 * progrma principal que hace la llamada a los distinos metodos
	 * 
	 * @param args no se sale ya creado
	 */

	public static void main(String[] args) {
		Scanner numerosMenuPrincipal = new Scanner(System.in);
		Scanner letrasMenuPrincipal = new Scanner(System.in);
		System.out.println("Lo primero vamos a crear tu personaje!");
		Personaje personajePrincipal = MenuCrearPersonaje.crearPersonaje();
		System.out.println();
		// damos de alta a todos los jefes
		ArrayList<JefesPrincipales> todosJefesPrincipales = CargaDatosJefes.cargarContenidoJefesPrincipales();
		ArrayList<JefesSecundarios> todosJefesSecundarios = CargaDatosJefes.cargarContenidoJefesSecundarios();
		ArrayList<Jefes> todosJefes = new ArrayList<>();
		todosJefes.addAll(todosJefesPrincipales);
		todosJefes.addAll(todosJefesSecundarios);
		System.out.println();
		// damos de alta todos los objetos
		ArrayList<Anillos> anillos = CargaDatosAnillos.caraDatos();
		// damos de alta las armaduras
		ArrayList<Armaduras> armaduraPrimarias = CargaDatosArmaduras
				.cargaDatosArmadurasPrimarias(todosJefesPrincipales);
		ArrayList<Armaduras> armaduraSecundarias = CargaDatosArmaduras
				.cargaDatosArmadurasSecundarias(todosJefesSecundarios);
		// damos de alta las armas
		ArrayList<Armas> armasPrimarias = CargaDatosArmas.caraDatosJefesPrinciaples(todosJefesPrincipales);
		ArrayList<Armas> armasSecundarias = CargaDatosArmas.caraDatosJefesSecundarios(todosJefesSecundarios);
		ElecionObjetos.elecionItemPesrosnaje(personajePrincipal, anillos, armaduraPrimarias, armaduraSecundarias,
				armasPrimarias, armasSecundarias, numerosMenuPrincipal, letrasMenuPrincipal);
		int numMenu = 0;
		do {
			System.out.println("Opciones a elegir:");
			System.out.println("1-Combate contra jefes");
			System.out.println("2-Infromación jefes");
			System.out.println("3-Infromación objetos");
			System.out.println("4-Menu Personaje");
			System.out.println("5-Salir");
			numMenu = numerosMenuPrincipal.nextInt();
			switch (numMenu) {
			case 1:
				MensajeComabtes.combatesContraJefesPrincipales(todosJefesPrincipales, todosJefesSecundarios,
						personajePrincipal, numerosMenuPrincipal, letrasMenuPrincipal);
				break;

			case 2:
				menus.MenuInfoBoses.menuBoses(todosJefes, numerosMenuPrincipal, letrasMenuPrincipal);

				break;
			case 3:
				menus.MenuIfnoObjetos.infoObjetos(numerosMenuPrincipal, letrasMenuPrincipal,anillos,armaduraPrimarias,armaduraSecundarias,
						armasPrimarias,armasSecundarias);
				break;

			case 4:

				MenuPersonaje.menuPersonaje(personajePrincipal);
				break;
			case 5:
				System.out.println("Ha salido!");
				System.out.println();
				System.out.println("\r\n"
						+ "                                                             ..                                                                                                                     \r\n"
						+ "                                                            ...                                                                                                                     \r\n"
						+ "                                                             ..                                                                                                                     \r\n"
						+ "                                                              .                                                                                                                     \r\n"
						+ "                                                              ..                                                                                                                    \r\n"
						+ "                                                             ...                                                                                                                    \r\n"
						+ "                                                             .'.                                                                                                                    \r\n"
						+ "                                                             .....                                                                                                                  \r\n"
						+ "                                                           .......                                                                                                                  \r\n"
						+ "                                                            ......                                                                                                                  \r\n"
						+ "                                                              .::.                                                                                                                  \r\n"
						+ "                                                               .'.                                                                                                                  \r\n"
						+ "                                                               ...                                                                                                                  \r\n"
						+ "                                                              .'..                                                                                                                  \r\n"
						+ "                                                               ',.  .                                                                                                               \r\n"
						+ "                                                                .. ..                                                                                                               \r\n"
						+ "                                                                .....                                                                                                               \r\n"
						+ "                                                                ..',.                                                                                                               \r\n"
						+ "                                                               ...;;...                                                                                                             \r\n"
						+ "                                                               ...;l;..                                                                                                             \r\n"
						+ "                                                                ..:dl'.                                                                                                             \r\n"
						+ "                                                                ..;ll,..                                                                                                            \r\n"
						+ "                                                               ...',;,..                                                                                                            \r\n"
						+ "                                                           .....'''.''...                                                                                                           \r\n"
						+ "                                                          ...';cllc::loc'.                                                                                                          \r\n"
						+ "                                                          .':ccoddlclddo:'.                                                                                                         \r\n"
						+ "                                                          .,c::clllc:cccc:,..                                                                                                       \r\n"
						+ "                                                         .',,,,;:cc:;;;;;,''..                                                                                                      \r\n"
						+ "                                                      ...,,,,,',;,,;;;,,,'.''................                                                                                       \r\n"
						+ "                                          ...............,;,''',;;;;;;;,,,,,''.',,,'''.........                                                                                     \r\n"
						+ "                                    .......',,;;,'.''.''''''',,,,;;;;,;;;,,,,,,'',;:c:;;,'.....                                                                                     \r\n"
						+ "                               .........',,;:::;,'.''',,'.','',,,;,;;,,,,;,'.',,,;:::cc:;;,,''...                                                                                   \r\n"
						+ "                           .........'''',,;:c::;'..'''''.',;,,,,;;,,;:;,,;;;,,,,',;;;:ccc:;;,'....                                                                                  \r\n"
						+ "                             .......''',,,,;::;;;,,''',,,,,;;;,,;;;,;;;;;;;:::;;;,',,,;;;,,''....                                                                                   \r\n"
						+ "                                 ..........''''',,;::;;;;,;::;,;:c:;;;::ccc::cc:;;,,,''.......                                                                                      \r\n"
						+ "                                   ...............'',,;;;;;;:::;::::::;;;;,'',,.....                                                                                                \r\n"
						+ "                                                 .....',,,,,''''........                                                                                                            \r\n"
						+ "                                                  ................                                                                                                                  \r\n"
						+ "");
				break;
			default:
				System.out.println("opción no valida!");
			}

		} while (numMenu != 6);

		numerosMenuPrincipal.close();
	}

}
