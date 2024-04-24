package menusCombate;

import java.util.Scanner;

import acciones.CombateContraJefePersonalizado;
import acciones.CombateContraTodosLosJefes;
import acciones.CombatirContraUnJefe;
import clases.Jefes;
import clases.Personaje;
import menuJefes.CombatirPorBusquedadJefes;
import menuJefes.CreacionJefePersonalizado;
import otros.GeneracionNumeroAleatorio;


public class MenuOpcionesCombateBoses {
	/**
	 * metodo que nos muestra las disitintas opciones para los jefes
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * @param personajePrincipal objeto de personaje principal ya creado y cargado
	 */
		public static  void combateBosesOpciones (Jefes[] todosJefes, Personaje personajePrincipal) {
			Scanner numeros = new Scanner(System.in);
			int  numOpcionesCombate =0;
			do {
				System.out.println("Opciones a elegir");
				System.out.println("1-Combate con todos los jefes ");
				System.out.println("2-Combate con el jefe que tu has creado ");
				System.out.println("3-Combate con el jefe que quieras");
				System.out.println("4-Combate contra un jefe al azar");
				System.out.println("5-Salir");
				numOpcionesCombate = numeros.nextInt();
				switch (numOpcionesCombate) {
				case 1:
					System.out.println("Tienes 3 opciones");
					System.out.println();
					System.out.println("------------------------------------------------------------------------");
					int numOpcionesDificultad;
					do {
					
					System.out.println("1-Reto (No te curas)");
					System.out.println("2-Dificil (Te curas cada 2 jefes)");
					System.out.println("3-Facil (Te curas cada jefe)");
					System.out.println("4-Salir");
					numOpcionesDificultad = numeros.nextInt();
					switch(numOpcionesDificultad) {
					case 1:
						CombateContraTodosLosJefes.aciertoBoss(todosJefes,personajePrincipal);
						break;
					case 2:
						CombateContraTodosLosJefes.PeleaBosesDificil(todosJefes,personajePrincipal);
						break;
					case 3:
						CombateContraTodosLosJefes.PeleaBosesFacil(todosJefes, personajePrincipal);
						break;
					case 4:
						System.out.println("Ha salido!");
						break;
						default:
							System.out.println("opcion no valida");
					}	
					}while(numOpcionesDificultad!=4);
					
					break;
				case 2:
					Jefes jefePersonalizado = CreacionJefePersonalizado.menuCombateJefePersonalizado(personajePrincipal);
					CombateContraJefePersonalizado.combateContraJefePersonalizado(jefePersonalizado, personajePrincipal);
					break;
				case 3:
					CombatirPorBusquedadJefes.combatirJefesBusquedad(todosJefes, personajePrincipal);
					break;
				case 4:
					double numeroPosicionBossRandom =GeneracionNumeroAleatorio.generacionNumeroPosicionBoss();
					CombatirContraUnJefe.combateContraJefeBuscado(todosJefes[(int) numeroPosicionBossRandom], personajePrincipal);
					break;
				case 5:
					System.out.println("Ha salido!");
					System.out.println(" ");
					System.out.println("Imagen de Solaire del pacto del sol.");
					System.out.println("@#############################################################MMMMMMMMMMMMMMMMMMBBBBMMMMBB&AMBAHM###MMMMMMM#\r\n" + 
							"@hG&&AA&&A&G&&&&GG&AA&&&&&AAAAAA&&&G&&&GGhh&AAAG93XX39h93X225iiiS5SSSSSSSiSiSSisssssiisssi:.;s;iXX25Sii25SSA\r\n" + 
							"@hAAHAAHAHAAAAAAAAAAAAAAAAAAAAAAAHHHAAAG&&3Ssi5G&GG&&GG9333X2552222222255525rrSSS55SSSiSS5X;:Xri2SX252r ;A9A\r\n" + 
							"@GAHHHHHHAAAAAAAAA&AAAAAAAAAHHHAh25iiS29B@Hr   sAX9GAAGh3333XX22222XXX5iS55Sii552225SS2X2iih&A: ,;X22r:;:ihA\r\n" + 
							"@GAAHHHHAAAAAGG&&&G&&&AA&AA&XSsii55Sirrrs&@#r   s::::r53h9XX3X252252XX2SiiiiS55525SS5irr239GGAHX39222XA3,:hA\r\n" + 
							"@3GAAAAA&AAAA&GGGGhhhGGGGG2i2hAAhir;:.    G@9   .;....:;rr53X25SS5552225rrisiSSiiiiiiir:Shh9999;iX223G&hAA9&\r\n" + 
							"@29&G933GAAAAA&Gh933393&MMM#@HXs:,:,,     ,@@,   r,     ,;;;r52SiiSiiiiisrsiissssrsssSXh399X2222222X99hGAHh&\r\n" + 
							"#5XX2X999hhGGGGGh33XXX2B#AH#MGir:::,,.     r@A   ,r        ::,:iSisssrrsssssssrrrssss5X3XX2222riX2X3333G5.;&\r\n" + 
							"#iS52XX222222X99993XX2X##323HMB9Sr;;;,      &@;   s,         ;;.:srsssrrrrrrr;r;rrsiSS5522252222X3333X3h2:rG\r\n" + 
							"#iS22255225222XXXXXXX5G@#X3#AGAB#A2rrr;,    ,@A.  ;s,        .AS ssrssrrrrrrr;rrrssiiSSiS555222sr9XXX339GA3G\r\n" + 
							"#s52222222552XXXX22225M@Ai####H3X3hAAG2i;,  ,#@r. :Sr.      ,;; ,srrr;rr::;;;rrrrssiiiiSS55222XSs22S2399332h\r\n" + 
							"#s522222255SSSS22252SX@@2;MAX29H#B&XS2HA&32ssA@X;:;Xs;::;sirr::r5rrrr;;;:::;;rrrrrsssssiSSSri3X95S3X33XXXX59\r\n" + 
							"#s5X22222255SiiiSSSSiA@@;5#Xr;;;r5&MMH@#3S5H&B@@2:,SMhSSi:i2ss;.rsrr;;;;;;;;rrrrrrsssii5252rsXXis933X22XX2i3\r\n" + 
							"#i52222222225SSiiiiis#@B:HMXs:,,,...:r2B@@##AA@A;.. @@A2Sr;,   .ssr;;;;;;;rrrrr;,,rsiSSi:rX3X23i;XX255225SsX\r\n" + 
							"#i52222222225SSiiisr5@@&r#HXr;::        .;h@@@@G:   #A:,       rSr;;;;;;rr;rrrr;..riSi,;;;2X22X9hXX2555Siir2\r\n" + 
							"#i5XXXX2222555Siiis;A@@9i#G2ir;;,.         :A#@A.   A;        .ir;;;;;;rs;:rrrrr::sSiS;;93X2X922X2225SSiiir2\r\n" + 
							"#i2XXXXXXX2255SSiirr##@3XB35Siii;:,..       h#@h;. ,B,        :r;;;;;;rrrrrrrrsi;r5iS232Sr.i2r;;25,:2, s5is2\r\n" + 
							"#SX9X33XXXXX255SisiB@##&&AX2SiiSi;;:.      ,A#@X;  ;A.      ..;r;;;;rrrrrrrrrsr;ri22222Si::X5,r5Ss:rSr;sr  X\r\n" + 
							"@23h333333XX225SirB@###AH&X2ssrrs;;:...,.  rA#@5;, X9,      . rr;:;rrrrrrrrrsisrSrr55522X5iiX32SSss5ir2srrrX\r\n" + 
							"@39hhhh9333XX25isr#@MGB#M&2irr;;;::;,,,,:,,iH@#i:, A2:,,.    .rrr;;rrrrrrrrrsriS5s;5SS5irX2525iiS5SSSSSS5X23\r\n" + 
							"@X9GGGG993XXX2Siri@##s:A@#G5sr;:,::::;:,. .5#@Mr:,,BS;;:,  .,;rrrr;;;;rrr;rssrsiS5iriSSSS55SiiiSiiiSSiiS22SX\r\n" + 
							"@XhG&&GGh93X25Sir9@#B9XAH&#@HXi;:,,,,,,,,,;G##A;:,iMrrr;:..:rirr;;;;,;rr;,r;;siiiir;iiiiiiiiiSSiiiSSSiS2XXiX\r\n" + 
							"@3h&&&GGh93X25Sir3@#HhA@M2:;B@@#AXr,.,,,, :A##3;;;AHsr;:;rr3X:r;;;;;;rr;:rrrrsrssssiiisssssiiiiiiSSSS22XX2iX\r\n" + 
							"@3h&AGhh9XXX25Sir3@##&B#AGhsi2A#@@@#Ah9&hi2##M3r;r#Mh95i9A&2 ,;;;;;;;;;;;;rsisrrrrsssrsssssissssiiSS52XX25s2\r\n" + 
							"@3GA&Gh933X225Si;&@#AAM##Gi;..,:;;rS3GH#@@@@##@MB#@MAHBH&S: :r;;;;;;:,:r;;;,..rrrrrrrrrr,;ssrrsssii552225Sr5\r\n" + 
							"@3GGGGh993X22SSi;X@MGAAXG#BS:.            :9M2:,,2@r.;;,    ;;;::::;,:;;;;:   ,:;;;;;;r;;rr;rrrsiiiS55SSSirS\r\n" + 
							"@3hhhhh93XX25Sis;&@MBBAr.rH@#hr,          i@#X,  :Mr.      :;:,:::::,:;;;;;;rr:,:,;;;;;;r;;,;rrrsssiiiiiis;S\r\n" + 
							"@X39h9933X22SSisrM@MAH#M9iX@@@@B5r:,     .i@Hr:  rs    .;: ;;s222srrr:,,,::::;:,:::,;. :;;;;;;;;rrrsrrrsrr;i\r\n" + 
							"@X99993XX225SSiri@#AXAMM#BXh@@@@@@@@#BGX2SAM#&;rXG;:SB@@@sr2M@@#2:sXAHhi;;;;r. ;;::,,,,::,,:;iS23h22s;rr;;:s\r\n" + 
							"@X993XXX225SSisr3@#BAHBXSX2;;h##@@@@@@@@@@#M@#X&@@@@@@@H. ;G@MB&;;2isS9HMHA3i:;XHMXis,,:,;S&&3##H2;:,:::,::s\r\n" + 
							"@X393X2225Sii35s&###BMM3sr;r5H#&ii5GMBAM@@@#@@H@@@Hr. ;i  r##GGr ;srr;;,, :. :rsXM92@HGA#@@2 .hH&G&hX5i593SS\r\n" + 
							"@2X3XX225Sii2#@@#HH###Mh2i;,;HAs:.   ,,,:5ABX;,.Xi     2 2@A&G3Srrrr:::,,:::,,;iAAM@@@@@#HH3iGG99h&H##AX;, r\r\n" + 
							"@2XXX22SS2A#@@@@##M###M&hhiri#&:.,      :A@Bi:  ;r    i:5@B3sX25ir;;:,,,,,,,:.:sS&h#@@#MHA&AHGXXX3hhG&3srr;s\r\n" + 
							"@2XX255XhM@@@@#######@@#HAhX&@Hr:;:     .H@X:is;r:.  :S5@MGr.:;;:,:r;;r;,. .:. s2H@#@@MA&G&&Ss33333h99G&GH#A\r\n" + 
							"@2Xh93MBA@@@#######BB#@@@BAAM#AXi;rr.   .A@9:,::r:.  S3#AX;,.. .,,.:s;,:,, .rs:2A@@Mr;GAGh9h;:3XXi.S33GAA&3&\r\n" + 
							"@X2Si29A@@########B95XB@@@BBB#B&&Srs;  .S#@MA2;rr.  :MAGs:,.,,,,::, ,:.:r5r;9A2XM@#&..&BAGG&A&933X2X3X9hAHHH\r\n" + 
							"#3h2SisSB#BBM##M###A52M#M@##MH&3Xir;:,,;X@#i;;:S;  .HH5i, .,:,::,;, .;;s2939#H9A@@#@@@BG9X999333339X222X9hGH\r\n" + 
							"#2M###A9XBMM#BHBMMMAA##AXG@###ASr;;;:,:;3#3;:,;G;,:AArrr..::;,;:.:;,rh5s9AAM#A&##HHHHAh3XXX3GG3393X2X3X2252A\r\n" + 
							"#sA#M#@#AA#@#&AHAHHH##HA5.:M#3A@hr;;::,:9MAi5,S2:;Ghr;s;,:;:;:;;;;rr3hiiAHAAAXA#MBHAAh9hhGGs :XG9339Gh3XX99A\r\n" + 
							"#iGA2hHMBHHAGGAAGGH#@BAB3  i@@r:M@9r::,:9#B:,:&r;A2s;rssr;;;::srrss5hXiXABBBHB@MHA&AA&&&&&&i  iAhGAAG3XXX39A\r\n" + 
							"@2AHir59MB5rsXAMBAM#AGGAX:;Ar.s, rGM9r:sX#G;.2@BGX;r,;i32iir;r5r5X2AAS2#@@####MMBAGGGX23X9&AMHA&&GhhX22XGAAB\r\n" + 
							"@GHAirShHASi2&&AAAAA99hXsiMG  .9#G&@@@#@##B2r@#Ss;;: ,iXXXh2rhh2&GAH2SM@@###MHAAAAhh99h&HiiBHHA&Ghhh9GAAHAAB\r\n" + 
							"@AAA9GHAHMHBBAhGA&H@BGHHA@@5SB@@@##MBMMBHAB&Xr,,,,;,.rXrShh5S9SX3G&s5@@@#MBHHHAA&GAAAAHAA99BAA&&GGGh3hGAAAAH\r\n" + 
							"@9&HMBBAMBMBAhAA93&BHGGhAB#M@@M35sr;;:;rSXX;.  ,.,;:;X&S9XsrsriA@A;s@@#MMMBHHHHBh;X&&&AX;iHG&&&GhhGGAAAAAHHM\r\n" + 
							"@9AMMMBAhX523&AXS2hhXXhhXX9GGh5srr;;::;i93r:.:2SrS35iA&GAi;r5SH#5:i@@#MBBB#MBHBBM9BBA22BMBAGG&AAHMBAAG9hh&AB\r\n" + 
							"@GGAA32sr;;sSii2XG9irS5522X3XX99hGA&&9hAhS;:;X9siA&52A222Si3AA2;i33@#ABMBH&GHHX3BHM##MX9&AHBHHB#@G3HH&G93X2A\r\n" + 
							"@#H&h333335iiiXX3S;;ihSsi5X9hhh&A&G9GGh2sr;rAA22h5:;3HA3i3MBAX9@@@##BBM2hMS9HHSriAsGBM#BAGAHMM#2   .GAHAAGXA\r\n" + 
							"@BMMM#MAAA9Xh&3h2si5XG5sr;;rsiisssiSirrrsrXBA9GA5::2H9&A2SXG#@@@@@##MBM55MHM##@@#@#G&AHHAAAAB@s     G#AHAHBB\r\n" + 
							"@&ABB#####HH&X399G3X22iS5Sr:;;::sSSs;ri52GH&h3X2SXG95r:,sA..:s9A#@@#@MM@@M###@H.  2@MAAHHHB##   :;sA@@#BHA&B\r\n" + 
							"@&A&AHBM#@@@@MHAGGh3222239X25ShMX552hHHB#@#&GAHMBG5r:,s#@X.:;;;2@@BB##@####MM@     S@@#####@B    ,X@@##MMBAB\r\n" + 
							"@A&HBHMMBH##@@#MMM##@@@A9A#HG@@@@GAHH#@#&X5SsiXS;,  :B@@r .... r@G;H@####BMB#@: ,rr;2@@@@@@@@2;sH@#@@MMMBBAB\r\n" + 
							"@AB#HAHBBH2G2S5X3933hAMMAGX5s#@@@s;rr;::...       .9@@X            S#@#####M#@@  ,rs.r@@@@#2s:rG@@#@##HBBBAB\r\n" + 
							"@HMM359GAirs;;rr;;;;:::::,,, G@@@:             ,2H@@M.           :, ;H@@#####@@@  ;Si;X; s.     i@#&B@MHHHAM\r\n" + 
							"@ABX2@&s;:;;rr;::,,.         #BA#,           2@@@BBB       .  :rrSir;:9@@#####@@@..;;2r   i   ;2M@#H#MHHHHAB\r\n" + 
							"@&Xrr9@@B2r;,.,...          r@93M;         ;#@#BBXr               ....:H#5M###@@2.;;.;r.  S#AGH@@MHHM@#BAHAB\r\n" + 
							"@r;sirS@@@@@&:  ...   ..... ,@AA#H        h@@BA#s                  .,, ;Hi#@@@3      r92:GG@@@@@@#&M#HBMMA&B\r\n" + 
							"#r532i;:A@@@@@5 .,:::;;:,.. 5@HH#@,     ,HB&AA#2                     ..,r.  2@.    . ;A#HB@@@@@@@M@B##MAGHBB\r\n" + 
							"#S22i;;,.:i@@@@@r,          ,@#M#@@    5@@AhAA:                      ...     Xr    :, 3M3s@@@@#M@#@BH#HH#MhH\r\n" + 
							"#iiirrr;:.  2@@@@@&s:   ..   B@#@@@; .B@Bh9A9                        ,,r..r. ,A;  .r. ,2AAM@@@@@@M@AA99MAMHM\r\n" + 
							"#sssssrr;:,.  3@@@@@@@;     5@3rrsX#@@@A3r2&                .,    ...,r:rh,   XA;:,.   r&MM@@#@@H#A&H929G#AB\r\n" + 
							"@iSisrrr;;;,.  r@@@@@@@@&Sh@B,    ..:s&#B&M                 s&;  .:r;2,  i2rsX; ,5;2hs;XGH#@@@@MM#BB#9hhX&5A\r\n" + 
							"#iSisrrrr;;::,   ,r9@@@@@@@2.,;;;;rr:..i#@5           .  ..  :XBX;  :;.   ;Air;,s:,H@@@M#h 2@@@@@#A@B&#3&3SA\r\n" + 
							"#iiirrr;;r;;:,       ,A@@@M;5X222H@B3ir:3@#2AHHAA&GG9#r .  .9hA@@#9s  ;r.  .2,r@@A5X3@@#@#.  5@@@@@@@@@#HAXA\r\n" + 
							"@SSiisisr;;:,..        :#@#H@@BHHA@@@@@, M@@@@@@@@@@@@#&i  :;2@@#B@#X;  ,   ,sH#A#@#XG##AB@X    .;Sh&@@@@B&A\r\n" + 
							"@XXXXXSr;:::,,:::::,,:;rH@M@@@#35A&s29i,,@@#AM@@@@@@@@@@@@@5   .  .#@@s , ,. .H@@HhX3HMH3S5#@B;        s@@#H\r\n" + 
							"@&&h2s;;;;;;;;r;;r2H@@@@@@XhHMhGA@2;59GA9@@@MGSr;:,,,,,,r#@@#s: ,   r@@#@53:s,A@@@#AAHHhXi:,s@@#r        2@#\r\n" + 
							"@XXSrr;;;rrsrrS&@@@@@@@@@@M&AHB#@#&hGG92r2@s               9@@@Ar .  .A@@@@#@###M###MBAh99i;.,5@@X:,   :. :@\r\n" + 
							"@iissiissiS3M@@@@@@@@@@@#@@G&hG#MMHA2r;:,h#B5                S@@@#&:rAB@@@@@@@##A&&ABMHh3GGS;. .3@B;:;, sA,X\r\n" + 
							"@issS252&#@@@@@@@@#H3Sr.,#@2isssi2;::,.:h#AH@@i                ,9@@@@@@@@@@@@@#A3X3&H#MHAGh2s;.  ,9#5,;;.;AG\r\n" + 
							"#rs552B@@@@@@B9Sr;:..  ;@@@#Srr;:,,,.,&HBA59H#@B.                 .2BX,   ,2AB##&iiX39HMHHh32r:.   .9#r.,:5h\r\n" + 
							"#59A@@@@@B3ir;:::,:::,i@@@@@@@GSsrrs3@9  . 5#MM@@i                           .iH@AsrssSAHA#A&2;,     ,AG;2;r\r\n" + 
							"@h#@@#&2isrr;;;:;;;r;r@@@@@@XA@@@@@@@,     .i@@#@@#:                  ..,.,::..rh@#XsrrSAAG@BAs:,      r@@ :\r\n" + 
							"@AMHhX2Ssrrrrrrssiii9@@@@@@r  :@@@@@A  ..    .M@@@@@&;                 .,,;;rrr;S5##S;;riA3X@#As:,     :@2 .\r\n" + 
							"@AA&32irrrrsi5222iS#@@@@@@r ,..@@@#@A ...      ;hM@@@@@X                    :r25is;##, :;sBS2@#ASr:::,:h&  :\r\n" + 
							"@GG32Siiii52X22i;2@@@@@@9. ..  ##AA#5              r@@@@@;   ...       .... ,;s5X:;;#A  .;s#i5#HG2iss2M&.  :\r\n" + 
							"@9hh3XX39h925Ss;A@@@@@X.   ..  S@BH#2                A@#@@h      ......  ..:;rrsX: r:#A   ,;#r2#AAAM@@2: . i\r\n" + 
							"@&HBHHHAGXSsssr#@@@@h,  ,:::;:..@@@@@ .,,,,.....      ;h@@@@,        .:::....;siri, ;,#H,   :M;A#B#@3;;:r,;@\r\n" + 
							"@A##BHAGX55SSr2@@@A;,:riiSiiisr,r@@@@i,;;;;:;;,,:;::,   .s#@@A         .:;rr:,:;;i@,ii,MHr,:rB#i#@9r:,.r,;@@\r\n" + 
							"@A##BA&9X2225rB@@G:ri522222255ir:@@@@3;s;ssrr;,.,,,.        i@@2,...     .,;iSi;:r@@@@S,&h&@@#@##M2i  ,:X@@#\r\n" + 
							"@&HMHG3Xisiir#@&s:;rssrrr;::;r;;,&@@@G.:,,..                   S;.,,:,,.    ,r3&3rB@#5@h;rs9@#&32A#HSsG@@@XH\r\n" + 
							"@&AB&3X2Sssri@s .,:::::::,  ,,,. 5@MG.        .,,::,:::::,..         .,,::::::;i2X@@#;s@#XS::53XS2M@@@@@MMAA\r\n" + 
							"@AHA&G325Sisir,:::,,,,,..         @@9     ,;;;rsis;rr;;::,...........   .:rirr;rr;9@@@H#@@@MAM@@@@@@@@@@@MB#\r\n" + 
							"@h3XXX333X2ir;;;;;;;;;:,,,,,,...  A@@,;rsiiSSiiiir..:,..             ..,:;;;;rsiri&###@#@@@@@@@@@@@@@2r293iH\r\n" + 
							"#255issiiSSSiisr;;;;::;,:;;;;rrrrriBHsssi;,;rrrr;;;:::,,,..            .,::;;rrrs2BMBMMMMBMM#@@@@@@@#9XS292A");
					break;
					default:
						System.out.println("opcion no valida!");
						System.out.println();
				}
				
				
				
			}while(numOpcionesCombate!=5);
		}
}
