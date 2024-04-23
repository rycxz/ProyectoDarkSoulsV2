/**
 * el jugador dara valor a todos los atributos y el atributo vida se le dara un valor segun las clases que tenga.
 * 
 * el estado es un atributo el cual el jugador no tendra acceso y no podra modifcar
 */

package personaje;

public class Personaje {
	private String nombre;
	private String sexo;
	private ClasesPersonaje clase;
	private int vida;
	private int ataque;
	private int capacidadCarga;

	public Personaje(String nombre, String sexo, ClasesPersonaje clase, int vida, int ataque, int capacidadCarga) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.clase = clase;
		this.vida = vida;
		this.ataque = ataque;
		this.capacidadCarga = capacidadCarga;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ClasesPersonaje getClase() {
		return clase;
	}

	public void setClase(ClasesPersonaje clase) {
		this.clase = clase;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return "Tu personaje se llama: " + nombre + " y es del sexo: " + sexo + ", es de la Clase " + clase + ", tiene "
				+ vida + " puntos de vida" + " , y hace " + ataque + " puntos de ataque " + "puediendo cargar hasta "
				+ capacidadCarga + " kgs";
	}

	/**
	 * @return the capacidadCarga
	 */
	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	/**
	 * @param capacidadCarga the capacidadCarga to set
	 */
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

}
