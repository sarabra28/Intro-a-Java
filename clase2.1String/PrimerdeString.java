import java.util.Scanner;

public class PrimerdeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = scan.nextLine();
        System.out.println( frase.length());
        scan.close();
    }
    
}
