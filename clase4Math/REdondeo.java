import java.util.Scanner;

public class REdondeo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número decimal");
        double num = scan.nextDouble();
        System.out.println( Math.round(num));
        scan.close();
    }
}
