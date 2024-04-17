package objetos;

public class Armaduras extends Objetos{
	
	private String proteccion;
	private int peso;
	
	public Armaduras(String nombre, String lore,String proteccion,int peso) {
		super(nombre, lore);
		// TODO Auto-generated constructor stub
		this.proteccion=proteccion;
		this.peso= peso;
	}

	/**
	 * @return the proteccion
	 */
	public String getProteccion() {
		return proteccion;
	}
	
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	/**
	 * @param proteccion the proteccion to set
	 */
	public void setProteccion(String proteccion) {
		this.proteccion = proteccion;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Armaduras su nombre es "+nombre+",su proteccion es" + proteccion + ",con un peso de" + peso 
				+ ", una durabilidad de " + durabilidad + "y  pertenecia al Jefe " + perteneciaJefe ;
	}
	public String tipoArmaduraSegunPeso (int peso) {
		if(peso>0 && peso<20 ) {
			return "super lijera";
		}
		if(peso>0 && peso<40 ) {
			return "lijera";
		}
		if(peso>0 && peso<50 ) {
			return "peso medio";
		}
		if(peso>0 && peso>50 ) {
			return "pesada";
		}
		return proteccion;
		
	}

	
	



	}
