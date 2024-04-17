package objetos;

public class Anillos extends Objetos{
	
	

	private String maldicion;
	private String beneficios;
	private float peso;
	
	
	public Anillos(String nombre, String lore,String maldicion,String beneficios,float peso) {
		super(nombre, lore);
		this.maldicion=maldicion;
		this.beneficios=beneficios;
		this.peso=peso;
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the maldicion
	 */
	public String getMaldicion() {
		return maldicion;
	}


	/**
	 * @param maldicion the maldicion to set
	 */
	public void setMaldicion(String maldicion) {
		this.maldicion = maldicion;
	}


	/**
	 * @return the beneficios
	 */
	public String getBeneficios() {
		return beneficios;
	}


	/**
	 * @param beneficios the beneficios to set
	 */
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
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
		return "Anillo llamado " + nombre + " que tiene una  maldicion llamda " + maldicion + ", con los  beneficios de" 
				+ beneficios + ", la durabilidad " + durabilidad
				+ "y el siguiente  lore" + lore ;
	}
	
	
	
	

}
