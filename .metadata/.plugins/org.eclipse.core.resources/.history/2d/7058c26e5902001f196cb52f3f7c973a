package otros;

import clases.Objetos;

public class EliminarObjetos {
	/**
	 *  metodo que elimina un objeto por el nombre proporcionado por el usuario
	 * @param objetos array de obejtos ya creados y cargados
	 * @param nombreObjeto nombre de un objeto proporcionado por el usuario
	 */
	public static void eliminarDatosObjetosNombre(Objetos[] objetos,String nombreObjeto) {
		for (int i = 0; i < objetos.length; i++) {
			if(objetos[i] != null) {
				if(objetos[i].getNombre().equalsIgnoreCase(nombreObjeto)) {
					objetos[i] = null;
				}
				
			}
		}

	}
	/**
	 *  metodo que elimina un objeto por el tipo proporcionado por el usuario
	 * @param objetos array de obejtos ya creados y cargados
	 * @param nombreTipo tipo  de un objeto proporcionado por el usuario
	 */
	public static void eliminarDatosObjetosTipo(Objetos[] objetos,String nombreTipo) {
		for (int i = 0; i < objetos.length; i++) {
			if(objetos[i] != null) {
				if(objetos[i].getTipo().equalsIgnoreCase(nombreTipo)) {
					objetos[i] = null;
				}
				
			}
		}
	}

}
