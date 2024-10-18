//Escribe un programa que pida al usuario que
//ingrese dos números enteros y realice la división
//del primer número entre el segundo número.
//Implementa un bloque "try-catch" para manejar
//la excepción en caso de que se intente realizar
//una división por cero. En caso de que ocurra la 
//excepción, muestra un mensaje apropiado en la pantalla.
import java.util.Scanner;

public class PrimerTryCtach {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese dos números enteros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int resultado = 0;
        try{
            resultado= num1/num2;
            System.out.println("El resultado es: "+ resultado);
        } catch (ArithmeticException e){
            System.out.println("No es posible realizar la división");
        }
        scan.close();
    }

}