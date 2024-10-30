package clase8Arrays;
/*
* La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en
* una lista ordenada de elementos. La clase Arrays ya incluye su implementación
* mediante el método binarySearch(). Escribe un programa que realice una
* búsqueda binaria en un arreglo ordenado de enteros utilizando el método
* Arrays.binarySearch(). El programa debe imprimir el arreglo generado
* originalmente, solicitar al usuario el valor buscado e imprimir el índice del
* valor buscado si está presente en el arreglo.
*/
import java.util.Arrays;
import java.util.Scanner;
public class BusquedaBinaria2 {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scan = new Scanner(System.in);
        int[] enteros= new int[10];
        for (int i = 0; i<enteros.length;i++) {
            enteros[i]= (int) (Math.random()*100)+1;
            //random del 1 al 100
            System.out.println(enteros[i]);
        }
        Arrays.sort(enteros);
        System.out.println("El arreglo ordenado es:");
        for (int i =0;i<enteros.length;i++) {
            System.out.println(enteros[i]);
        }
        int indice;
        do {

            System.out.println("¿Qué número está buscando?");
            int respuesta= scan.nextInt();
            indice = Arrays.binarySearch(enteros, respuesta);
            if (indice>0) {
                System.out.println("El número ingresado está en el índice: "+indice);
            } else {
                System.out.println("Ese número no se encuentra en el arreglo.");
            } 
        } while (indice<0);
        
scan.close();
    }
}
