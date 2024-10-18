import java.util.Scanner;

public class MiSegundoPrograma {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Hola! Cómo te llamas?");
      String nombre = scanner.nextLine();
      System.out.println( "Mucho gusto, " + nombre + ". Cuántos años tienes?");
      int edad;
      edad = scanner.nextInt();
      System.out.println("Qué linda la época de tener " + edad + " años...");
      scanner.close();

   }
}






