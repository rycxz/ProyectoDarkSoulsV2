package jefes;

public class JefesSecundarios extends Jefes{

	/**
	 *  los parametros recibiods por el constructor que son heredados
	 * @param nombre
	 * @param tipo
	 * @param vida
	 * @param ataque
	 */

	public JefesSecundarios(String nombre, String tipo,String informacionBreve	, int vida, int ataque) {
		super(nombre, tipo,informacionBreve, vida, ataque);
		// TODO Auto-generated constructor stub
	}

	/* 
	 * los atributos de los jefes y su  categoria en cuanto a la importacia que tienen para el juego son 
	 * motrados en este metodo 
	 */
	@Override
	public String toString() {
		return "Este jefes es secundario y su nombre es " + nombre + ", el tipo es" + tipo + 
				",la breve informacion que tenemos es " + informacionBreve
				+ ", su vida es" + vida + "y su ataque es" + ataque + ".";
	}

}
