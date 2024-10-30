package clase8Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class BusquedaBinaria {
public static void main(String[] args) {

String clear = "\033\143";
System.out.print(clear);

/*
* La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en
* una lista ordenada de elementos. La clase Arrays ya incluye su implementación
* mediante el método binarySearch(). Escribe un programa que realice una
* búsqueda binaria en un arreglo ordenado de enteros utilizando el método
* Arrays.binarySearch(). El programa debe imprimir el arreglo generado
* originalmente, solicitar al usuario el valor buscado e imprimir el índice del
* valor buscado si está presente en el arreglo.
*/

int[] arr = new int[10];
Scanner miScanner = new Scanner(System.in);

for (int i = 0; i < arr.length; i++) {
arr[i] = (int) (Math.random() * 100) + 1; //genero el arreglo con num del 1 al 100

}

Arrays.sort(arr); //ordeno el arreglo antes del binary search
System.out.println(Arrays.toString(arr));

System.out.print("Ingrese un numero para buscar dentro del arreglo: ");
int num = miScanner.nextInt(); // atrapa el numero deseado x el usuario

int indice = Arrays.binarySearch(arr, num);

if(indice>=0){
System.out.println("El numero se encuentra en el indice: " + indice + "el numero es: " + arr[indice]);
}else {
System.out.println("El numero no esta dentro del array :(");
}
miScanner.close();

}
}