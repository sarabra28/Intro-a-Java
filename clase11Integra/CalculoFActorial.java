package clase11Integra;

/*El objetivo de esta actividad es que desarrolles un programa que solicite al usuario ingresar un número y posteriormente calcule su factorial mediante un bucle do-while. El factorial de un número se define como el producto de todos los enteros desde 1 hasta ese número. A continuación, te presentamos  algunos ejemplos para mayor claridad:
El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.
El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como resultado 120.
Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que da 5040. */

import java.util.Scanner;

public class CalculoFActorial {
public static void main(String[] args) {
System.out.println("\033\143");
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el número del que quiera el factorial: ");
        int resp = scan.nextInt();
        int contador = 1;
        int factorial =1;
        do{
            System.out.println(factorial);
            factorial+=factorial*contador;
            System.out.println(factorial);
            contador=contador+1;
        } while (contador<resp && contador >0);
        System.out.println(factorial);
        scan.close();
    }
}
