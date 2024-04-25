package objetos;

import jefes.JefesPrincipales;
import jefes.JefesSecundarios;

public class Armaduras extends Objetos{
	
	private int proteccion;
	private double peso;
	public Armaduras(String nombre, String lore,JefesPrincipales jefesPrincipales, int proteccion,double peso2) {
		super(nombre, lore,jefesPrincipales);
		// TODO Auto-generated constructor stub
		this.proteccion=proteccion;
		this.peso= peso2;
	}
	
	public Armaduras(String nombre, String lore, int proteccion, double peso) {
		super(nombre, lore);
		this.proteccion = proteccion;
		this.peso = peso;
	}

	public Armaduras(String nombre, String lore,JefesSecundarios jefesSecundarios, int proteccion,double peso2) {
		super(nombre, lore,jefesSecundarios);
		// TODO Auto-generated constructor stub
		this.proteccion=proteccion;
		this.peso= peso2;
	}

	/**
	 * @return the proteccion
	 */
	public int getProteccion() {
		return proteccion;
	}
	
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @param proteccion the proteccion to set
	 */
	public void setProteccion(int proteccion) {
		this.proteccion = proteccion;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Armaduras su nombre es "+nombre+",su proteccion es" + proteccion + ",con un peso de" + peso 
				  + "y  pertenecia al Jefe " + perteneciaJefe ;
	}

	/* (non-Javadoc)
	 * @see objetos.Objetos#tipoObjetoSegunPeso(double)
	 */



	
	



	}
