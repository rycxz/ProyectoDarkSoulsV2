package objetos;

import jefes.Jefes;

public class Objetos {
		protected String nombre;
		protected String lore;
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
		
		public Objetos(String nombre, String lore,Jefes perteneciaJefe) {
			super();
			this.nombre = nombre;
			this.lore = lore;
		
			this.perteneciaJefe = perteneciaJefe;
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
			return "El objetos es " + nombre + ", su lore es " + lore + "y  pertenecia al Jefe"
					+ perteneciaJefe + "]";
		}
	
	
		
		

}
