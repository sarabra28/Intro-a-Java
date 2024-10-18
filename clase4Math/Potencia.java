    import java.util.Scanner;

public class Potencia {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese un número:");
int num = scanner.nextInt();
System.out.println("Ingrese la pontencia: ");
int pot = scanner.nextInt();
System.out.println("La potencia es: " + (int) Math.pow(num, pot));
scanner.close();
}
}

