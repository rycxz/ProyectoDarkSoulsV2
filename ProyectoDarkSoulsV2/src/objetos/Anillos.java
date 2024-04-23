package objetos;

public class Anillos extends Objetos{
	
	

	private int cantidadVidaAlterada;
	private int cantidadDanioAlterado;
	private double peso;
	
	
	public Anillos(String nombre,String lore, int cantidadVidaAlterada,int cantidadDanioAlterado,double peso2) {
		super(nombre, lore);
		this.cantidadVidaAlterada=cantidadVidaAlterada;
		this.cantidadDanioAlterado=cantidadDanioAlterado;
		this.peso=peso2;
		// TODO Auto-generated constructor stub
	}






	
	/**
	 * @return the durabilidad
	 */
	public double getPeso() {
		return peso;
	}


	/**
	 * @param durabilidad the durabilidad to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Anillo llamado " + nombre + " que te altera tu PS en  " + cantidadVidaAlterada + ", y que te altera el da�o de tal forma" 
				+ cantidadDanioAlterado 
				+ "y el siguiente  lore" + lore ;
	}







	/**
	 * @return the cantidadVidaAlterada
	 */
	public int getCantidadVidaAlterada() {
		return cantidadVidaAlterada;
	}







	/**
	 * @param cantidadVidaAlterada the cantidadVidaAlterada to set
	 */
	public void setCantidadVidaAlterada(int cantidadVidaAlterada) {
		this.cantidadVidaAlterada = cantidadVidaAlterada;
	}







	/**
	 * @return the cantidadDanioAlterado
	 */
	public int getCantidadDanioAlterado() {
		return cantidadDanioAlterado;
	}







	/**
	 * @param cantidadDanioAlterado the cantidadDanioAlterado to set
	 */
	public void setCantidadDanioAlterado(int cantidadDanioAlterado) {
		this.cantidadDanioAlterado = cantidadDanioAlterado;
	}







	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	

}
