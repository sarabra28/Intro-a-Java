package clase7WHile;
import java.util.Scanner;

public class ContraseñaWhile {
public static void main(String[] args) {
    System.out.println("\033\143");

Scanner sc = new Scanner(System.in);
String respuesta = "";
do{
System.out.println("Ingrese la contrasena");
respuesta = sc.nextLine();

} while (!respuesta.equals("secreto"));
System.out.println("Contraseña correcta");
sc.close();
}
}
    
