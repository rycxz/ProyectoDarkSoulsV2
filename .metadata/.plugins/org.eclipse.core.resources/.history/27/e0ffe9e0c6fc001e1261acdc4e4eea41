package menuPersonajes;

import java.util.Scanner;
import clases.Personaje;
import comprobacionEntrada.Comprobaciones;

public class MenuCrearPersonaje {
	static Scanner letras = new Scanner(System.in);
	static Scanner numeros = new Scanner(System.in);

	/**
	 * 
	 * mostramos el menu de creación de personaje y le damos valor al objeto
	 *         de personaje
	 * 
	 *         y este metodo nos devuelve el objeto Personaje con todos sus
	 *         valores ya creados utilzando su constructor
	 * 
	 * @return Personaje devuelve el personaje principal ya creado con los datos
	 * 
	 *         
	 * 
	 * 
	 */
	public static Personaje crearPersonaje() {
		String nombre;
		String sexo;
		String clase = null;
		int[] vidaClases =  {0,300,500,250,275,400,350,150,350,200,500};
		int[] ataqueClases =  {0,800,500,750,975,500,650,650,550,800,900};
		int vida = 0 ;
		int ataque = 0;
		int numClase = 0;

		System.out.println("Bienvenido a la creación de personaje:");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Digame el nombre para su personaje.");
		nombre = letras.nextLine();
		nombre =Comprobaciones.comprobacionNombre(nombre);
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Digame el sexo para su personaje (Hombre/Mujer).");
		sexo = letras.nextLine();
		sexo =Comprobaciones.comprobacionSexo(sexo);

		do {

			System.out.println("Digame la clase para su personaje.");
			System.out.println("Las opciones son:");
			System.out.println("1-Guerrero");
			System.out.println("2-Caballero");
			System.out.println("3-Vagabundo");
			System.out.println("4-Ladron");
			System.out.println("5-Bandio");
			System.out.println("6-Cazador");
			System.out.println("7-Hechizero");
			System.out.println("8-Piromantico");
			System.out.println("9-Clerigo");
			System.out.println("10-Marginado");
			numClase = numeros.nextInt();

			switch (numClase) {
			case 1:
				System.out.println("Intrépido guerrero.\r\n" + "Experto en las armas.\r\n" + "Gran fuerza y destreza.");
				clase = "Guerrero";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 2:
				System.out.println("Caballero de baja categoría.\r\n" + "Altos PS, armadura sólida.\r\n"
						+ "No es fácil de derribar.");
				clase = "Caballero";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 3:
				System.out.println("Peregrino sin rumbo.\r\n" + "Lleva una cimitarra.\r\n" + "Gran destreza.");
				clase = "Vagabundo";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 4:
				System.out.println("Con remordimientos.\r\n" + "Impactos críticos altos.\r\n" + "Tiene llave maestra.");
				clase = "Ladron";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 5:
				System.out.println("Bandido salvaje.\r\n" + "Gran fuerza.\r\n" + "Lleva una pesada hacha de guerra.");
				clase = "Bandio";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 6:
				System.out.println("Caza con arco.\r\n" + "Lucha a corta distancia.\r\n" + "No es bueno con la magia.");
				clase = "Cazador";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 7:
				System.out.println("De la Escuela de Dragones de Vinheim.\r\n" + "Usa magia de Almas.");
				clase = "Hechizero";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 8:
				System.out
						.println("Piromántico del Gran Pantano.\r\n" + "Tira hechizos de fuego y porta hacha de mano.");
				clase = "Piromantico";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 9:
				System.out.println("Clérigo peregrino.\r\n" + "Tiene una maza.\r\n" + "Hace milagros curativos");
				clase = "Clerigo";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			case 10:
				System.out.println("Enigma sin ropa.\r\n" + "Armado solo con un garrote y un viejo escudo de tablas.");
				clase = "Marginado";
				vida = vidaClases[numClase];
				ataque =ataqueClases[numClase];
				break;
			default:
				System.out.println("opcion no valida.");

			}
		} while (numClase < 0 || numClase > 11);
		System.out.println();

		System.out.println("Personaje creado!");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"         .......'',,.. ........     ..    ..'..'.......                       ..               ..  ...             .                           \r\n"
						+ "...                      .......''',..  ..... ..    ...    .....'.....    .','...                      .....                ...  ...                            \r\n"
						+ ".                        .....'''',...  ..''.  . .. ...  .  .........    .lo:'.....                   ......               ..........                           \r\n"
						+ ".                      .......''''''.. ................ .. ......        .:lc,......        ..        ........  ........    ...'..                              \r\n"
						+ ".                      .....',''........................           .     .,,;,.....        ...         ....... ...............'.                                \r\n"
						+ "                       .....,''..''.......'............     ...     .......';:,. ..                   ..... .  .'.............,'.                               \r\n"
						+ "..                     .....''''','.......''.............  ....    .........':,......     .            ..   ...................;'.                              \r\n"
						+ "...                    .......'',,.... .............. ..    ..     ....................                      ..................'..                 ..           \r\n"
						+ "..                      ......'';,'................  ...         ..''.. .....''',,,'..'.                ..   ...........''.......             ..   ..    .      \r\n"
						+ ".                   .  .........'.............   ...   ..        .':c,.... ..''',;;,..,,.         .     ...............,,........         ...  .   ...   .      \r\n"
						+ "..                     ....  ...'............ ..  ...             .cc'.............. .,;.   ..          ..............',..   .... ..      ...     ...           \r\n"
						+ "...                    ....  ..''...............   ..             .,... .......','.. .,,.  .,..         .. ..........',,............             ...            \r\n"
						+ "..                     ....  .',,''.......... ..                  .'....  ..'..''''.. .....'.          ........  .,,'....   .... ...         .   ...            \r\n"
						+ ".                      ........,''..............                  .,..... ...''''.... .  ....          .......   ';,'...   ...    .              ...            \r\n"
						+ "                         ......,,'.............                   .',.... .......'.....     ..         . .. ..   .,'..........   .                ..            \r\n"
						+ "                    ...  ......,,'...........                     ..''.... ......''.. .'.    ...         ...     .'..........   ...              ..             \r\n"
						+ "            .       ....   ....,,'.............                   ........',,'.''..''..;'..   .,.        ...   ...'..'.. ....   ...                             \r\n"
						+ "          .  .      ..........','..............                    .......',,,''''''''.',,'    .,'       ...   ......... .....   .                         .    \r\n"
						+ "         ..  ...     ...... ...''.................                  .':'........'.........;;.   .,'. .    ..   ...... ... .....          ....     ....  ...    .\r\n"
						+ "             ....      ....  ........'.............. .               .'..',,,;'',.......  .,:.....:,.     ..  ... .... ........  .      ..         ...  ....   .\r\n"
						+ "                        ..       ......................             .....;;;::,'''...'...  .;,',. .:'.        .........................    ...         .....    \r\n"
						+ "                          ...      ...................             ..''':lccc,.'.''..''..  ....   .:,           ..............................          ....    \r\n"
						+ "                                   ...................     ...    ...',collo;....'....'..       ...,'      ..  ............... ...........               .      \r\n"
						+ "                                ..;llc;;::'. ...;l, ..,clc:c:.....:oo::dOOko'.'''.,clloo'  .;:;:cc,,';c:....'c;.':l:,......;:;::'..........                     \r\n"
						+ "                                  ,OKc.',o0x;. ,OWx...'kWd,l0O,  .dWk;o00Ox:.''..'dXd,:d:.oOo;,:okOc.oNx....'dl..dNd.... .o0c.,o;............      .            \r\n"
						+ "..                          ..... .k0' ...oN0,.ldOXl..'kWo.:00:...dWOdKOooc,'''..'dXKo:;.oNx'''.';OX:cNd.....lc..oNl......oKkc,.....................            \r\n"
						+ "..                          ..... .k0,....cXK:cklxNK;..xWkoKK:...'xWNXNkc:,.......':oOKO:dWx,.....xWlcXd.....l:..oNo.......:oOKk;..........  ......   ..        \r\n"
						+ ".                             ..  .k0,   .xKc:d;.'oXx..xWc.lKk, .'dN0dkK0o,......:o,..oNo;OKl'...;0O',0k.   ,o,  lNo....,::...dXl..    .     ....  .            \r\n"
						+ ".                                .:kOo;;:lc;;dl.  ,kOc;d0o..,dd;..o0d;'cOOd:.....;dxc:ll'.;xxlc::oc...,ddc;:c,  .o0d;;:ol:oo::oo'         .......  .........    \r\n"
						+ "                                 ......... .....  ...................',:ooc,.......';;'...'....'..      ....   .............''..         .......  ..    ......  \r\n"
						+ " .                                           .         .... .'.......,,;ll;..''..',;::;;;'...''...... .....  ......................       ..                .   \r\n"
						+ "...       .                            .               .,;'..;,..':;;c:lxo:..,:'...;l;.';;...::,..;'. .,.,'  .     .  ...  ............  .......                \r\n"
						+ "                                         ...        .. .............,clol;,'.'''','';;..','..'.'.......'...   .. ......       ...................      ..       \r\n"
						+ " ..                                        ........ ... .............,oo:;''''.',,,',:,.'.............                        ..               ...   .          \r\n"
						+ " ..                                           ..... ...  ...........',:c:;,;;,,'',;,;;;,,......... ...                    .   .                                 \r\n"
						+ " ...                                                 .   ...........,cdoc;,:c:;,,;;;;;,,'...........                ........                                    \r\n"
						+ " ...                                                      ..........:ddoc;:lol:,,;;;::;;,'...........    ...................                                    \r\n"
						+ "                      .. ...  .                   ..   ..........'',:ool::cxOOkc,;:lc::;'''.....................  ....    .....                                 \r\n"
						+ "                  ...........   .                     ...........'',;cl:::cx0XNOocldc::;,,'''..............       ....    .. ...       ..                       \r\n"
						+ "                 ...... ... ......                    ...........'',;:c::codkXWNNKkdcccc;,,'...'..........         .          ........                          \r\n"
						+ "       ..        .....  ...  ..               .  ..  ..........'',',;:::coO0KNWWNNKxccol;,,''..........   ...  .             ........                           \r\n"
						+ "                             ...               .....  ..........''',:cc::d0XNNWWWX0kl:cc;;;,,'.............                      .....                          \r\n"
						+ "                                               .....  ..........''',;::::ok0NWWWNNXXkc:;;;;;,,'.............        .             ....... .                     \r\n"
						+ "               ...                              .... ...........',,,,;;:cxk0XXKKXXK0xlc:;;,,,'''.............       .               ....     ..                 \r\n"
						+ "                                            ..   ................''',,;:lxkxxxoodkOOOxdc;;,,,''''............. .  ..                      ");

		// atribuimos los valores del personaje
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");

		Personaje personaje = new Personaje(nombre, sexo, clase,vida,ataque);
		return personaje;

	}

}
