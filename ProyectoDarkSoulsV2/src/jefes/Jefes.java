package jefes;

public class Jefes {

	 protected String nombre;
	 protected String tipo;
	 protected  String informacionBreve;
	 protected int vida;
	 protected int ataque;
	 boolean esObligatorio;
	
	public Jefes() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getInformacionBreve() {
		return informacionBreve;
	}
	public void setInformacionBreve(String informacionBreve) {
		this.informacionBreve = informacionBreve;
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

	public Jefes(String nombre, String tipo, int vida, int ataque) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.ataque = ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public Jefes(String nombre, String tipo, String informacionBreve, int vida, int ataque,boolean esObligatorio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.informacionBreve = informacionBreve;
		this.vida = vida;
		this.ataque = ataque;
		this.esObligatorio=true;
	}
	@Override
	public String toString() {
		return " (Jefe al que buscas )\n Nombre " + nombre + " \n "
				+" Tipo: " + " \n" + tipo +" \n "+ " Informacion breve :"+ " \n" + informacionBreve +" \n "+ " Vida "
				+ vida +" \n "+ " Ataque " + ataque +" \n ";
	}

	
	
}
