/**
 * @author Ricardo-Sorin-Almajan
 * 
 * @version  0.0
 * 
 * @since 28/02/24
 *  
 */


package main;


import java.util.Scanner;

import acciones.Combates;
import cargaDatos.CargaDatosJefes;
import cargaDatos.CargaDatosObjetos;
import cargaDatos.CargaDatosZonas;
import clases.Jefes;
import clases.Objetos;
import clases.Personaje;
import clases.Zonas;
import menuJefes.MenuInfoBoses;
import menuObjetos.MenuIfnoObjetos;
import menuPersonajes.MenuCrearPersonaje;
import menuPersonajes.MenuPersonaje;
import menuZonas.MenuInfoZonas;


public class Principal {
	/**
	 * progrma principal que hace la llamada a los distinos metodos
	 * @param args no se sale ya creado
	 */

	public static void main(String[] args) {
		Scanner numerosMenuPrincipal = new Scanner(System.in);
		System.out.println("Lo primero vamos a crear tu personaje!");
		Personaje personajePrincipal = MenuCrearPersonaje.crearPersonaje();
		System.out.println();
		//damos de alta a todos los jefes
		Jefes[] todosJefes = CargaDatosJefes.cargarContenidoJefes();
		System.out.println();
		//damos de alta todas las zonas
		Zonas[] todasZonas = CargaDatosZonas.cargoZonasDatos();
		
		//damos de alta todos los objetos
		Objetos[] todosObjetos = CargaDatosObjetos.cargoDatosObjetos();
	
		
		int numMenu=0;
		do {
		System.out.println("Opciones a elegir:");
		System.out.println("1-Combate contra jefes");
		System.out.println("2-Infromación zonas");
		System.out.println("3-Infromación jefes");
		System.out.println("4-Infromación objetos");
		System.out.println("5-Menu Personaje");
		System.out.println("6-Salir");
		numMenu= numerosMenuPrincipal.nextInt();
		switch(numMenu) {
		case 1:
			Combates.combatesContraJefes(todosJefes,personajePrincipal);
			break;
		case 2:
			MenuInfoZonas.infoZonas(todasZonas);
			break;
		case 3:
			MenuInfoBoses.menuBoses(todosJefes);
			
			break;
		case 4:
			MenuIfnoObjetos.infoObjetos(todosObjetos);
			break;
		case 5:
			
			MenuPersonaje.menuPersonaje(personajePrincipal);
			break;
		case 6:
			System.out.println("Ha salido!");
			System.out.println();
			System.out.println("\r\n" + 
					"                                                             ..                                                                                                                     \r\n" + 
					"                                                            ...                                                                                                                     \r\n" + 
					"                                                             ..                                                                                                                     \r\n" + 
					"                                                              .                                                                                                                     \r\n" + 
					"                                                              ..                                                                                                                    \r\n" + 
					"                                                             ...                                                                                                                    \r\n" + 
					"                                                             .'.                                                                                                                    \r\n" + 
					"                                                             .....                                                                                                                  \r\n" + 
					"                                                           .......                                                                                                                  \r\n" + 
					"                                                            ......                                                                                                                  \r\n" + 
					"                                                              .::.                                                                                                                  \r\n" + 
					"                                                               .'.                                                                                                                  \r\n" + 
					"                                                               ...                                                                                                                  \r\n" + 
					"                                                              .'..                                                                                                                  \r\n" + 
					"                                                               ',.  .                                                                                                               \r\n" + 
					"                                                                .. ..                                                                                                               \r\n" + 
					"                                                                .....                                                                                                               \r\n" + 
					"                                                                ..',.                                                                                                               \r\n" + 
					"                                                               ...;;...                                                                                                             \r\n" + 
					"                                                               ...;l;..                                                                                                             \r\n" + 
					"                                                                ..:dl'.                                                                                                             \r\n" + 
					"                                                                ..;ll,..                                                                                                            \r\n" + 
					"                                                               ...',;,..                                                                                                            \r\n" + 
					"                                                           .....'''.''...                                                                                                           \r\n" + 
					"                                                          ...';cllc::loc'.                                                                                                          \r\n" + 
					"                                                          .':ccoddlclddo:'.                                                                                                         \r\n" + 
					"                                                          .,c::clllc:cccc:,..                                                                                                       \r\n" + 
					"                                                         .',,,,;:cc:;;;;;,''..                                                                                                      \r\n" + 
					"                                                      ...,,,,,',;,,;;;,,,'.''................                                                                                       \r\n" + 
					"                                          ...............,;,''',;;;;;;;,,,,,''.',,,'''.........                                                                                     \r\n" + 
					"                                    .......',,;;,'.''.''''''',,,,;;;;,;;;,,,,,,'',;:c:;;,'.....                                                                                     \r\n" + 
					"                               .........',,;:::;,'.''',,'.','',,,;,;;,,,,;,'.',,,;:::cc:;;,,''...                                                                                   \r\n" + 
					"                           .........'''',,;:c::;'..'''''.',;,,,,;;,,;:;,,;;;,,,,',;;;:ccc:;;,'....                                                                                  \r\n" + 
					"                             .......''',,,,;::;;;,,''',,,,,;;;,,;;;,;;;;;;;:::;;;,',,,;;;,,''....                                                                                   \r\n" + 
					"                                 ..........''''',,;::;;;;,;::;,;:c:;;;::ccc::cc:;;,,,''.......                                                                                      \r\n" + 
					"                                   ...............'',,;;;;;;:::;::::::;;;;,'',,.....                                                                                                \r\n" + 
					"                                                 .....',,,,,''''........                                                                                                            \r\n" + 
					"                                                  ................                                                                                                                  \r\n" + 
					"");
			break;
			default:
				System.out.println("opción no valida!");
		}

		}while(numMenu!=6);
		
		numerosMenuPrincipal.close();
	}

}
