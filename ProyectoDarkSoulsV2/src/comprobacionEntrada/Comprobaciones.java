package comprobacionEntrada;

import java.util.Scanner;

public class Comprobaciones {
	static Scanner letras = new Scanner(System.in);

	/**
	 * 
	 * solo es una comprobacion de que el dato "nombre" introducido
	 *               por el usuario esta bien formado
	 * 
	 * @param nombre stirng mertido por el usuario
	 *  
	 *               
	 */
	public static String comprobacionNombre(String nombre) {
		boolean esNombreValido = true;
		do {
			for (int i = 0; i < nombre.length(); i++) {

				if (nombre.toLowerCase().charAt(i) >= 97 && nombre.toLowerCase().charAt(i) <= 122) {
					esNombreValido = true;
				} else {
					System.out.println("El nombre no puede tener caracteres especiales ni letras !");
					System.out.println("Introduzca su nombre de nuevo : ");
					nombre = letras.nextLine();
					esNombreValido = false;

				}
			}
		} while (esNombreValido == false);
		return nombre;

	}

	/**
	 *  solo es una comprobacion de que el dato "sexo" introducido por el
	 *             usuario esta bien formado
	 * 
	 * @param sexo stirng mertido por el usuario
	 * 
	 *            
	 */
	public static String comprobacionSexo(String sexo) {
		boolean esSexoValido = false;
		do {
			for (int i = 0; i < sexo.length(); i++) {

				if (sexo.toLowerCase().equals("hombre") || sexo.toLowerCase().equals("mujer")) {
					esSexoValido = true;
				} else {
					System.out.println("El sexo no es  no es valido");
					System.out.println("Introduzca su nombre de nuevo : ");
					sexo = letras.nextLine();
					esSexoValido = false;

				}
			}
		} while (esSexoValido == false);
		return sexo;

	}



}
