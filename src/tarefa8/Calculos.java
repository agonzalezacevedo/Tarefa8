package tarefa8;

/**
 *
 * @author agonzalezacevedo
 */
public class Calculos {

    public static Integer elementoMinimo(Integer[][] array) {

        int minimo = array[0][0];

        for (int i = 0; i < array.length; i++) {
            int elementoMinimoFila = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < elementoMinimoFila) {
                    elementoMinimoFila = array[i][j];
                }

            }

            if (elementoMinimoFila < minimo) {
                minimo = elementoMinimoFila;
            }
        }
        return minimo;

    }

    public static Integer elementoMaximo(Integer[][] array) {

        int maximo = array[0][0];

        for (int i = 0; i < array.length; i++) {
            int elementoMaximoFila = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > elementoMaximoFila) {
                    elementoMaximoFila = array[i][j];
                }

            }

            if (elementoMaximoFila > maximo);
            maximo = elementoMaximoFila;
        }
        return maximo;

    }

    public static void eliminarObjeto(Integer[][] array, Integer valor) {
        loop:
        {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != null) {
                        if (array[i][j].equals(valor)) {
                            array[i][j] = null;
                            System.out.println(valor);
                            break loop;
                        }
                    }
                }
            }
            System.out.println("null");
        }
    }
    
    public static void buscarObjeto(Integer[][] array, Integer valor) {
            loop:
            {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] != null) {
                            if (array[i][j].equals(valor)) {
                                System.out.println("Fila: " + i + "\nPosición: " + j);
                                break loop;
                            }
                        }
                    }
                }
                System.out.println("-1");
            }
        }
}
