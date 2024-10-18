import java.util.Scanner;

public class PrimerComparacion {
    public static void main(String[] args) {
//1. Pide al usuario que ingrese dos números, y:
//  A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado. 
//  B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
//  C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double a = scan.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double b = scan.nextDouble();
        String mayor = (a>b) ? "es mayor" : "no es mayor";
        System.out.println("El primer número " + mayor + " que el segundo.");
        String igual = (a==b) ? "iguales" : "distintos";
        System.out.println("Los números son " + igual);
        String divisible = (a%2 == 0) ? "es divisible" : "no es divisible";
        System.out.println("El primer número "+ divisible + " entre 2"); 
//2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
//  A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
//  B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
        System.out.println("Ingrese ahora otro número: ");
        double c = scan.nextDouble();
        System.out.println("Ingrese otro número más: ");
        double d = scan.nextDouble();
        String mayor2 = (c>d) ? "es mayor" : "no es mayor";
        System.out.println("El tercer número " + mayor2 + " que el cuarto.");
        String mayores = ((a>b) && (c>d)) ? "El primer y tercer número son mayores": "el primer y el tercer número no coinciden";
        System.out.println(mayores);
        String mayorO = ((a>b) || (c>d)) ? "El primer o tercer número son mayores": "el primer y el tercer número coinciden";
        System.out.println(mayorO);
        scan.close();
    }
}
