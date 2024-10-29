package clase9Wrappers;
/*Escribe un programa que lea una cadena que represente un número entero como entrada utilizando la clase Scanner. Luego, convierte la cadena en un número entero utilizando la clase de envoltura Integer.
 */
import java.util.Scanner;
public class CadenaNumero {
  public static void main(String[] args) {
    System.out.println("\033\143");
    Scanner scan = new Scanner(System.in);
    int nuevo=0;
    boolean flag;
   do {
    try {
        System.out.println("Ingrese un número:");
        String resp = scan.nextLine();
        nuevo = Integer.valueOf(resp);
        flag=false;
    } catch (Exception e) {
        System.out.println("Inválido. Intente de nuevo.");
        flag=true;
    }
} while (flag==true);
    System.out.println("El número es un entero: "+nuevo);
    scan.close();
  }  
}
