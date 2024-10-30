package clase9Wrappers;
/*Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena y utiliza Character.isLetter() para verificar si todos los caracteres son letras. Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.
 */
import java.util.Scanner;
public class CadenaLetras {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scan = new Scanner(System.in);
        int bag =0;
        System.out.println("Ingrese su frase:");
        String frase = scan.nextLine();
        for (int i =0; i< frase.length(); i++){
        char letra = frase.charAt(i);
        if (!Character.isLetter(letra) && !Character.isWhitespace(letra)) {
            bag= 1;
            break;         //EXTRA
        } 
        } 
        if (bag==1) {
            System.out.println("Su frase no contiene solo letras.");
        }      else {
            System.out.println("Su frase sólo contiene letras");
        } 
        scan.close();
    }
}
