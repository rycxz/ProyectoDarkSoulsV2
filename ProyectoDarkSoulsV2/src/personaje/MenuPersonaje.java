package menuPersonajes;

import java.util.Scanner;

import clases.Personaje;
import comprobacionEntrada.Comprobaciones;
import otros.CambiarAtributosPersonaje;

public class MenuPersonaje {
	static   Scanner numeros = new Scanner(System.in);
	static  Scanner letras = new Scanner(System.in);
	
	/**
	 * menu para cambiar los atributos del objeto personaje mediante llamdas a otros metodos
	 * @param personajePrincipal le entra el personaje principal ya creado y cambia los atributos si asi quiere el usuario
	 */
	public static void menuPersonaje(Personaje personajePrincipal) {
		
		
		System.out.println("Bienvendio al menu de personaje");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		System.out.println(" \"\"\"  .oKXXKKKKK00K00Oxddooooollcclokkdlcccccllllooodk0KK0klccccccccccokOO0Odlllllooooddxxxkkxxxxxxxxolccccc:ccccccc:::ccccllccccllcc:::::::::::::::::ccccccccllllooodxxkO0KKKKKOxOOo.  \r\n" + 
				"  .cOKKKK0000000OOkxxxxxxxxddddxOOkxddddddddddxxxOOOOOkdddddddddddxkOOOOkddddddxxxxxxkkOOkkkkkkkxoccc::::::ccc:::::::cccccccccccc:::::::::::::::;:::::::::cccccllloodxkkkkkkkxkko.  \r\n" + 
				"   ..............................................................................................................................................................................   \r\n" + 
				"              .........                         ....                   ....         ...      ...................     ..    ...........              ...................             \r\n" + 
				"                ...........                                                                           ....                   .........                              ..              \r\n" + 
				"                ...'::,...',''''..''..'.,,'..''.',,''.                                                                       ...                                                    \r\n" + 
				"                ...:cc:cl,';,,ccllll:,,',cllcclc:lll;.                                           ........  .....  .......   .........                                               \r\n" + 
				"                ...'':oxd;..;'.''......'.. ...... ..                 .  .                         .......  ............       ......                                       .        \r\n" + 
				"                .'''.:xd:'.';;;::,.,::;;,.                                                                   ..  ...                                                                \r\n" + 
				"               .';co:,cc;;;,'''''''...........''''''''''''''',;;;;:;;,''..'',,,,,,'''''..'..'''',,,'''''''''',''''..                                                  ...           \r\n" + 
				"              .;::lc::cccccccccccc:;;,,,,,,;;::ccc::::::::c:::;::;::;:::::::cccccc::::;;;;;;::::cccc::::::::::::c::'     ........... ....      ..... ..          ...  ...           \r\n" + 
				"              .;::c. .,;;;;;;;;;;;;;;;;,,,;;;;;;;;;;;;;;;;;;;;'. .,'....    ...... .,,...,,'.'..,''''','..   .:cc::;.   ....                                      ..                \r\n" + 
				"              .;::;. .,,,,,,,,,,,,,;;,,,,,,,;;;,;;;;;;;;;;;;;;'  .,;;;,.    ...... .,::,':::c:'';;::;:::;. ...:clc:,...... ..                                         .....         \r\n" + 
				"              .;c:;. .,,..         ..         .;,'''','........  .,'...      . ...     .',,..'',,'.''.     ...;colc;..                      ,l,                       .....         \r\n" + 
				"              .:::;. .,;;'         ..         .;::cccc:......... .;::;.        ....    .,cc:;:llc:',;.      ..:locc,..                    .lOK0c.                     .....         \r\n" + 
				"              '::;;.  ......       ..         .,..'','.......... ...'...       .....  .,,'.',.,:'''''..    ...:cccc,..                    .dO00o.                     ...           \r\n" + 
				"              ':;,,. ..';;:'       ..         ':;:llc:'......... .,;c:;.       ...    .;cccc:,,::cccc;.     ..:cccc'..                    .lxxx:';:.                  ..            \r\n" + 
				"              .::,'.  ..'.         ..      .','.'''',;'.........  ..           ...     . ..  .. .....        .;clc:,..                .,;;:ccodxOKKOkd;               ..            \r\n" + 
				"              .,:,'. .';:;.        ..      .:lcccll,;l:c,.....................................................:coc:;..              .;looclddxxxKNNWNN0;              ..  ..        \r\n" + 
				"              .,;,,.  ',.........  ... ........',,'.''.;;'',.... .'.....,,,,,;:::;'...'collccloolloooooooollcclllcc,..              'docokXNXKKK0KNNXXO;              ... ..        \r\n" + 
				"              .,,,;..'clcccclllc,......,cclldl;:oddooo:cdoooc,''.';'...,ll:::col::,...;odoooloxxkxxkkkkkkdoolloolcl:...       ..   .cdlxKNX00XWWXK0xoOk'  .'.         ..  ..        \r\n" + 
				"              ..''::;;:clc::ccccccclllllllllolcllooooollllllddxxdddddlllcllolllolllllclooooooooooooddddddddoolllllo;...       .  . .oOk00xdkOKKXXKOocdxo:,:c'.        ..            \r\n" + 
				"                  ...,;c;.............................'......';;,,,,;'................................................. ..  .      .cdodxlldoldxxoccloxOxxoc:. ..     ..            \r\n" + 
				"                 .. .:okd.',,,;;.                    .:. ......  .....                            ..................... .:l,. .. .':c:;lxdoolclll;.,ccx0Okdlxo.       ..            \r\n" + 
				"              ..     :dxo..'.....                    ... ..........'..  ..        ...        ..  .....................   .cxd;....cdlclddddlldkkxoc,':kXX0dlox:..     ..            \r\n" + 
				"              .      cO0d..;:c:::;.                 .:;...........:o:. ',.       .ld,       .;,. .....................  ...'oOx:.,oo:,clodc;;okOOOdcc::kKklloxd'...   ..            \r\n" + 
				"              .      cO0d....'.....                ..,,............''..,,.  .... .:;. .     .,'. .....................    ...,dkddx:.,lldo;;:lxOkxdcc;.:0kood0Xc...   ..            \r\n" + 
				"              .      cOOo.':::;;;;::;;,.           .'c:............,'..:,..      ....            ..,....       . .. ..    ....'cloc'':lc:,,;:ldkOkxdo;.,kklodOKd.     ..            \r\n" + 
				"              .      ;ooc..............           ...,'. ... ... .;kl.'o;....    .::. .          .;c'...         ..  .     ....,'',clcc::;;coxxddxkxdl. cOdldxkx'   . ..            \r\n" + 
				"              .      :odl.,:;::;,;;;;'.           ..':;.      .. ..'...'.......  ........   .... .... .........  ..  .    ..........;lcc:;;;:cccokOxo:. .,;,cdkd,...  ..            \r\n" + 
				"              .      ;dxo...........               ..'..      .....''..:,...co:.  ',. .,. ..     ..............  ..  .     .........;clc:;'. ..':oxxl:.     .:xx:...  ..            \r\n" + 
				"              .      :kkl.,c:;;:cc:.             . ..;,.      ....,kd.'o:. 'xx:. .;'  'l,        .cc,. .  ..     ..  .     ........l0koc;,..   .;okKKx,  .....;ox;... ..            \r\n" + 
				"              .      :xxl...........               ..'..   . ......,'..'.. .;;...''....,'.       ..'...........  ..  .     .......'kNX0o:..... .,xKNWK;..  ....':,... ..            \r\n" + 
				"              .     .ckko..:;,,;;;:,.              ..;'.      .. .  ............ .........  ......   .........   ..  .      ......;OX0ko:.....  .:k0KKo.   .......... ..            \r\n" + 
				"          .   .     .:xxl............               .'..      .. .                      .':'.                    .. ..      .......okOkd:.....   'lxOKo.  ........... ..            \r\n" + 
				"              .      ckkl.';,::::;;,,.              .;,.      .. .   ..                  .,..                    .. ..    . ........cooc'.....   .':ll:. ...  ... ... ..            \r\n" + 
				"              .      :kxl......'......               ...      .. .                                               .. ..       ..... .ldo;......    .:ldl.         .... ..            \r\n" + 
				"              .      :xxl..;;;;:c:;;,,.              .,.      .. .                                               ..  .         ... .ldc'......    .,lxd'  ..     .. . ..            \r\n" + 
				"              .      :xxl.......                    ...       .. .                                               .. ..        .....'oxc.......     .:dx,  ..          ..            \r\n" + 
				"              .      :kkl.';;;;'                    .,.       .. .                                               .. ..        ....,lxd;......       ,ox;              ..   .        \r\n" + 
				"              .      'cc;.                                    .. .                                               .....       ...,lkxl;'....         .:oc.             ..   .        \r\n" + 
				"              ..     :xdo''c;,;;;,,;'                .,.     ... .                                               ......      ...';:,......          .,ll,             ..            \r\n" + 
				"                 .   .,,,......''..'..               ..    .        .                                         .. .........   ..............          .,c:.        ... ..  ..        \r\n" + 
				"                  ...         .  ...........    ..  .   ...          ........                               ...   ....  .......................  ... ......     .....    ....       \r\n" + 
				"                 ............::..'.....;;..'.....,c;.''....            .................................. ...               .........................,clcclccclcccclccccccllccc:,   \r\n" + 
				"                .lc,;cccc;;',dd;;lccc''oo';lc;;:'cKk:cc,;:::;.                                                                                      .,ododxdodxdooxxddodxxdddddo:.  \r\n" + 
				"          .      .............'......  ...........'...........           ....  ..............  .. ....     ...         .......       .              .':c:::::ccc::cc;,,,;,,,;,,,.   \r\n" + 
				"                              .....                                                                         ..           .....                       .',,,''',''','',,'''''''...    \r\n" + 
				"                                                                                                                                                        ......................      \r\n" + 
				"                                                                                                                                                        .',.','.,'..',.',.',,;.     \r\n" + 
				"\"\"\"");
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("Tienes 2 opciones ");
		int numElegir ;
		do {
			System.out.println("1-Cambiar atributos");
			System.out.println("2-Informacion atributos");
			System.out.println("3- Salir");
			numElegir= numeros.nextInt();
			switch(numElegir) {
			case 1:
				MenuPersonaje.cambiarAtributos(personajePrincipal);
				break;
			case 2:
				System.out.println(personajePrincipal);
				break;
			case 3:
				System.out.println("Ha salido!");
				break;
				default:
					System.out.println("opcion no valida");
			}
			
		}while(numElegir!=3);
		
	}
	/**
	 * mendu donde el usuario le es pemitido cambiar los atibutos del personaje
	 * @param personajePrincipal
	 */
	public static  void cambiarAtributos(Personaje personajePrincipal) {
		System.out.println("Que atributo quieres cambiar?");
		int numElegirAtributo = 0;
		do {
			System.out.println("1-Nombre");
			String nombreCambiar;
			System.out.println("2-Sexo");
			String sexoCambiar;
			System.out.println("3-Clase");
			System.out.println("4-Salir");
			numElegirAtributo=numeros.nextInt();
			switch(numElegirAtributo) {
			case 1:
				System.out.println("Dime tu nuevo nombre: ");
				nombreCambiar= letras.nextLine();
				nombreCambiar= Comprobaciones.comprobacionNombre(nombreCambiar);
				CambiarAtributosPersonaje.cambiarNombre(personajePrincipal, nombreCambiar);
				break;
			case 2:
				System.out.println("Dime el nuevo sexo para tu personaje, recuerda que el anterior " + personajePrincipal.getSexo());
				sexoCambiar = letras.nextLine();
				sexoCambiar = Comprobaciones.comprobacionSexo(sexoCambiar);
				CambiarAtributosPersonaje.cambiarSexo(personajePrincipal, sexoCambiar);
				break;
			case 3:
				CambiarAtributosPersonaje.cambiarClase(personajePrincipal);
				break;
			case 4:
				System.out.println("ha salido");
				break;
				default:
					System.out.println("opcion no valida");
			}
		}while(numElegirAtributo!=4);
		
	}

}
