import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
System.out.println("Ingresa un número: ");
int num = miScanner.nextInt();
System.out.println("El número ingresado en número absoluto es: " + Math.abs(num));
miScanner.close();
}
  
}