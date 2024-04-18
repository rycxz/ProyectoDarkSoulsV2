package otros;

import clases.Jefes;

public class OrdenarJefes {
	/**
	 * 
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * metodo que duevleve los jefes ordenados por el ataque
	 */
	public static void mostrarJefesPorAtaque(Jefes[] todosJefes) {

        for (int i = 0; i < todosJefes.length - 1; i++) {

            if (todosJefes[i] != null) {

                for (int j = i + 1; j < todosJefes.length; j++) {

                	if((todosJefes[j] != null) && (todosJefes[j].getAtaque()) > (todosJefes[i].getAtaque())) {

                        Jefes jefeOrdenadoAtaque = todosJefes[i];

                        todosJefes[i] = todosJefes[j];

                        todosJefes[j] = jefeOrdenadoAtaque;

                    }
                }
            }
        }

        for (int i = 0; i < todosJefes.length; i++) {

            if (todosJefes[i] != null) {

                System.out.println(todosJefes[i]);
            }
        }
    }
	/**
	 * 
	 * @param todosJefes array de objeto de los jefes ya creados y cargados
	 * metodo que duevleve los jefes ordenados por la vida
	 */
	public static void mostrarJefesPorVida(Jefes[] todosJefes) {

        for (int i = 0; i < todosJefes.length - 1; i++) {

            if (todosJefes[i] != null) {

                for (int j = i + 1; j < todosJefes.length; j++) {

                	if((todosJefes[j] != null) && (todosJefes[j].getVida()) > (todosJefes[i].getVida())) {

                        Jefes jefeOrdenadoAtaque = todosJefes[i];

                        todosJefes[i] = todosJefes[j];

                        todosJefes[j] = jefeOrdenadoAtaque;

                    }
                }
            }
        }

        for (int i = 0; i < todosJefes.length; i++) {

            if (todosJefes[i] != null) {

                System.out.println(todosJefes[i]);
            }
        }
    }


}
