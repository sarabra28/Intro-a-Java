/*Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados. Posteriormente, genera una copia del mismo con una extensión de 2 elementos adicionales.
Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.
Finalmente, muestra por consola el contenido del nuevo array. */

import java.util.Scanner;

public class CopiandoElementos {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scan = new Scanner(System.in);
        int[] primero= new int[3];
        primero[0]=5;
        primero[1]=4;
        primero[2]=3;
        int[] copia= new int[5];
        copia[0]= primero[0];
        copia[1]= primero[1];
        copia[2]= primero[2];
        System.out.println("\tEscribe un número para la posición 4"); // la \t es para tabulador omggg
        copia[3]= scan.nextInt();
        System.out.println("\tEscribe un número para la posición 5"); 
        copia[4]= scan.nextInt();
        System.out.println(copia[0] + " "+copia[1]+" "+copia[2]+ " "+copia[3]+" "+copia[4]);


        scan.close();
    }
}
