 //Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero.
//Utiliza el método Integer.parseInt() para convertir la cadena en un número entero.
//Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada
//no pueda ser convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje 
//apropiado en la pantalla.
import java.util.Scanner;

public class TercerTryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Ingrese un número:");
        String respuesta = scan.nextLine();
        try {
            int numero = Integer.parseInt(respuesta);
            System.out.println(numero);
        } catch (Exception e) {
            System.out.println("Lo siento, no es válido.");
        }


        scan.close();
    }
}
