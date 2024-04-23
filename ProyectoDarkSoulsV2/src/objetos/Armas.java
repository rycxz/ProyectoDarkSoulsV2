package objetos;


import jefes.JefesPrincipales;
import jefes.JefesSecundarios;

public class Armas extends Objetos {
	
	
	private String tipoArama;
	private int danio;
	private String tipoDanio;
	private double peso;
	
	public Armas(String nombre, String lore, JefesPrincipales perteneciaJefe,String tipoArama,int danio,String tipoDanio,double peso) {
		super(nombre, lore, perteneciaJefe);
		// TODO Auto-generated constructor stub
		this.tipoArama=tipoArama;
		this.danio=danio;
		this.tipoDanio=tipoDanio;
		this.peso=peso;
		
	}
	public Armas(String nombre, String lore, String tipoArama, int danio, String tipoDanio, double peso) {
		super(nombre, lore);
		this.tipoArama = tipoArama;
		this.danio = danio;
		this.tipoDanio = tipoDanio;
		this.peso = peso;
	}
	public Armas(String nombre, String lore, JefesSecundarios perteneciaJefe,String tipoArama,int danio,String tipoDanio,double peso) {
		super(nombre, lore, perteneciaJefe);
		// TODO Auto-generated constructor stub
		this.tipoArama=tipoArama;
		this.danio=danio;
		this.tipoDanio=tipoDanio;
		this.peso=peso;
		
	}

	/**
	 * @return the tipoArama
	 */
	public String getTipoArama() {
		return tipoArama;
	}

	/**
	 * @param tipoArama the tipoArama to set
	 */
	public void setTipoArama(String tipoArama) {
		this.tipoArama = tipoArama;
	}

	/**
	 * @return the danio
	 */
	public int getDanio() {
		return danio;
	}

	/**
	 * @param danio the danio to set
	 */
	public void setDanio(int danio) {
		this.danio = danio;
	}

	/**
	 * @return the tipoDanio
	 */
	public String getTipoDanio() {
		return tipoDanio;
	}

	/**
	 * @param tipoDanio the tipoDanio to set
	 */
	public void setTipoDanio(String tipoDanio) {
		this.tipoDanio = tipoDanio;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "El arma" +nombre+" es de tipo " + tipoArama + ", con un  daño " + danio + ",y el tipo de daño " + tipoDanio + ",con un  peso de" + peso
				+  ", lore=" + lore + "y pertenecia a" + perteneciaJefe.getNombre();
	}
	
	
	

	

	
	
	

}
