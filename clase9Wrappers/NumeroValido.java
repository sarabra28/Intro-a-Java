package clase9Wrappers;
import java.util.Scanner;
/*Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un número decimal usando Double.valueOf(). Si la cadena no representa un número válido, Double.valueOf() lanzará una excepción. Captura esta excepción y muestra un mensaje al usuario indicando que la entrada no es un número válido.
 */
public class NumeroValido {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scan = new Scanner(System.in);
        boolean flag= false;
        double nuevo =0;
        do {
            try {
            System.out.println("Ingrese un número: ");
                String resp = scan.nextLine();
                nuevo = Double.valueOf(resp);
                flag=false;
            } catch(Exception e){
                System.out.println("Inválido. Intente de nuevo.");
                flag= true;
            }
        } while (flag==true);
        
        System.out.println("El número es válido: "+nuevo);
        scan.close();
    }
}
