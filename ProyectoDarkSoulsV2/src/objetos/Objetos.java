package objetos;

import jefes.Jefes;

public class Objetos {
		protected String nombre;
		protected String lore;
		protected double durabilidad;
		protected Jefes perteneciaJefe;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getLore() {
			return lore;
		}
		public void setLore(String lore) {
			this.lore = lore;
		}
		public Objetos(String nombre, String lore) {
			
			this.nombre = nombre;
			this.lore = lore;
		}
		
		public Objetos(String nombre, String lore, double durabilidad, Jefes perteneciaJefe) {
			super();
			this.nombre = nombre;
			this.lore = lore;
			this.durabilidad = durabilidad;
			this.perteneciaJefe = perteneciaJefe;
		}
		/**
		 * @return the durabilidad
		 */
		public double getDurabilidad() {
			return durabilidad;
		}
		/**
		 * @param peso the durabilidad to set
		 */
		public void setDurabilidad(double durabilidad) {
			this.durabilidad = durabilidad;
		}
		/**
		 * @return the perteneciaJefe
		 */
		public Jefes getPerteneciaJefe() {
			return perteneciaJefe;
		}
		/**
		 * @param perteneciaJefe the perteneciaJefe to set
		 */
		public void setPerteneciaJefe(Jefes perteneciaJefe) {
			this.perteneciaJefe = perteneciaJefe;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "El objetos es " + nombre + ", su lore es " + lore + ",el  peso es" + durabilidad + "y  pertenecia al Jefe"
					+ perteneciaJefe + "]";
		}
		public double estaRota(double desgaste ) {
			durabilidad += desgaste;
			return durabilidad;
		}
		
		

}
