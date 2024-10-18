/*Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero. Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de forma manual e imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento. */

import java.util.Scanner;

public class PromedioArray { 
    public static void main(String[] args) {
        System.out.println("\033\143");                        //Esto es para que me limpie toda la consola antes de empezar.
        Scanner scan = new Scanner(System.in);
        int[] arreglo = new int[4]; 
        System.out.println("\\nIngrese el primer número:");               // cursor en la línea + alt + z + arriba o abajo mueve de lineaaaa       
        arreglo[0]= scan.nextInt();     // seleccionar + shift + alt + arriba o abajo PARA DUPLICAR
        System.out.println("Ingrese el segundo número:");
        arreglo[1]= scan.nextInt();
        System.out.println("Ingrese el tercer número:");
        arreglo[2]= scan.nextInt();
        System.out.println("Ingrese el cuarto número:");        
        arreglo[3]= scan.nextInt();
         int suma= arreglo[0] + arreglo[1] + arreglo[2] + arreglo[3];
         System.out.println( "\nLa suma de los números es: " + suma);
         double promedio = (suma)/(arreglo.length);
         System.out.println(promedio);
        scan.close();
    }
}
