package tarefa8;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class Tarefa8 {

    public static void main(String[] args) {
        
        Integer[][] array = {{3, 7, 8, 13}, {4, 7, 9, 10}};

        System.out.println("Minimo do array: " + Calculos.elementoMinimo(array));
        System.out.println("Maximo do array: " + Calculos.elementoMaximo(array));
        System.out.print("Que quieres encontrar: ");
        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();
        Calculos.buscarObjeto(array, valor);
        System.out.print("Que valor quieres eliminar: ");
        valor = sc.nextInt();
        Calculos.eliminarObjeto(array, valor);
        
    }
}
