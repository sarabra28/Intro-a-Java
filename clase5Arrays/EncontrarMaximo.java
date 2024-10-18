import java.util.InputMismatchException;
import java.util.Scanner;

public class EncontrarMaximo {
public static void main(String[] args) { 
System.out.println("\033\143");                        //Esto es para que me limpie toda la consola antes de empezar.
try {
Scanner sc = new Scanner(System.in);
int[] elementos = new int[5];
System.out.print("Por favor, ingrese el número para la posición 0 del arreglo: ");
elementos[0] = sc.nextInt();
System.out.print("Por favor, ingrese el número para la posición 1 del arreglo: ");
elementos[1] = sc.nextInt();
System.out.print("Por favor, ingrese el número para la posición 2 del arreglo: ");
elementos[2] = sc.nextInt();
System.out.print("Por favor, ingrese el número para la posición 3 del arreglo: ");
elementos[3] = sc.nextInt();
System.out.print("Por favor, ingrese el número para la posición 4 del arreglo: ");
elementos[4] = sc.nextInt();
sc.close();
int numeroMaximo = (elementos[0]>elementos[1])? elementos[0] : elementos[1];
numeroMaximo = (numeroMaximo>elementos[2])? numeroMaximo : elementos[2];
numeroMaximo = (numeroMaximo>elementos[3])? numeroMaximo : elementos[3];
numeroMaximo = (numeroMaximo>elementos[4])? numeroMaximo : elementos[4];
System.out.println("El valor máximo dentro del arreglo es: "+numeroMaximo);
} catch (InputMismatchException e) {
System.out.println("Error: el valor ingresado por consola debe ser un entero");
} catch (Exception e) {
System.out.println("Error!");
}
}
}