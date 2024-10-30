package clase7WHile;

import java.util.Scanner;

/*Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente. */
public class AdivinandoWhile {
    public static void main(String[] args) {
        System.out.println("\033\143");

        Scanner scan= new Scanner(System.in);
        int ran = (int) (Math.random()*(20-1)+1);
        System.out.println(ran);
        System.out.println("Adivina el número");
        int resp = scan.nextInt();
        do {
            if (resp<ran) {
                System.out.println("El número que ingresaste es menor, intenta de nuevo");
                resp= scan.nextInt();
            } else if (resp>ran) {
                System.out.println("EL número que ingresaste es mayor, intenta de nuevo");
                resp= scan.nextInt();
            }
        } while (resp != ran);
        System.out.println("¡Felicidades! Lo adivinaste");
        scan.close();
    }
}
