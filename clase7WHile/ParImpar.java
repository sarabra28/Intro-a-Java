package clase7WHile;
/*Escribe un programa que solicite al usuario ingresar una serie de números enteros. Utiliza un bucle while para contar la cantidad de números pares e impares ingresados hasta que el usuario decida terminar la entrada de números. Al finalizar, muestra la cantidad de números pares e impares ingresados
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int par = 0;
        int impar= 0;
        while (num != 0) {
          System.out.println("Ingrese su número, para salir ponga 0:");
          num=scan.nextInt();
            if (num%2==0 && num!=0){
                par++;     //para no tener que poner par=par+1
            } else {
                impar++;
            }
        } 
        System.out.println("La cantidad de pares es: " + par +"y de impares es: " + impar);
        scan.close();
    }

}

