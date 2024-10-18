import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscarElemento {
public static void main(String[] args) {        
System.out.println("\033\143");
Scanner sc = new Scanner(System.in);
int[] arreglo = {1,5,20};
try {
System.out.print("Por favor, ingresa un número: ");
int num = sc.nextInt();
sc.close();
String validarNum = (num==arreglo[0])? " está en la posición 0" :
(num==arreglo[1])? " está en la posición 1" :
(num==arreglo[2])? " está en la posición 2" : " no está en el arreglo";
System.out.println("El número ingresado "+num+validarNum);
} catch (InputMismatchException e) {
System.out.println("Error: el valor ingresado por consola debe ser un entero");
} catch (Exception e) {
System.out.println("Error!");
}
}
}