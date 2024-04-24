package otros;

import java.util.ArrayList;

import jefes.Jefes;

public class OrdenarJefes {
	/**
	 * 
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * metodo que duevleve los jefes ordenados por el ataque
	 */
	public static void mostrarJefesPorAtaque(ArrayList<Jefes> todosJefes) {

	    for (int i = 0; i < todosJefes.size() - 1; i++) {
            for (int j = i + 1; j < todosJefes.size(); j++) {
                if (todosJefes.get(j).getAtaque() > todosJefes.get(i).getAtaque()) {
                    Jefes aux = todosJefes.get(i);
                    todosJefes.set(i, todosJefes.get(j));
                    todosJefes.set(j, aux);
                }
            }
        }

        for (Jefes jefes : todosJefes) {
            if (jefes instanceof Jefes) {
                System.out.println(jefes);
            }

        }
       
    }
	/**
	 * 
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * metodo que duevleve los jefes ordenados por la vida
	 */
	public static void mostrarJefesPorVida(ArrayList<Jefes> todosJefes) {
		for (int i = 0; i < todosJefes.size() - 1; i++) {
            for (int j = i + 1; j < todosJefes.size(); j++) {
                if (todosJefes.get(j).getVida() > todosJefes.get(i).getVida()) {
                    Jefes aux = todosJefes.get(i);
                    todosJefes.set(i, todosJefes.get(j));
                    todosJefes.set(j, aux);
                }
            }
        }

        for (Jefes jefes : todosJefes) {
            if (jefes instanceof Jefes) {
                System.out.println(jefes);
            }

        }
      


}}
