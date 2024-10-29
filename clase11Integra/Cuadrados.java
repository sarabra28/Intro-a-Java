package clase11Integra;

import java.util.Scanner;

/*Realiza un programa para crear un cuadrado de N elementos por lado utilizando el carácter “*”.
Para ello  simplemente dibuja una línea de N asteriscos. Repite este proceso N veces para completar el cuadrado. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente */
public class Cuadrados {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número de lado: ");
        int n = scan.nextInt();

        for (int i=0; i<n;i++){
            System.out.print("*");
        }

        for (int i=0; i<(n-2);i++){
            System.out.println();
        System.out.print("*");
            for (int j=1; j<(n-1);j++){
                System.out.print(" ");
        }
        System.out.print("*");
        }
        
    System.out.println("");
    for (int i=0; i<n;i++){
        System.out.print("*");
    }

        scan.close();
}
}