import java.util.Scanner;

public class SegundaDeString {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Por favor ingrese su nombre");
String nombre = scan.nextLine();
System.out.println("Por favor ingrese su apellido");
String apellido = scan.nextLine();
String nombreCompleto = nombre.concat(" ");
nombreCompleto = nombreCompleto.concat(apellido);
System.out.println("su nombre completo es "+nombreCompleto);

scan.close();
}
}