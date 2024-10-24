package clase7WHile;

import java.util.Scanner;

/*Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:
Comprar producto.
Realizar devolución.
Ver mis pedidos.
Preguntas frecuentes.
Salir.
Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. El menú debe seguir apareciendo hasta que el usuario elija la opción para salir del programa. En este ejercicio, no es necesario que las opciones del menú realicen acciones reales, simplemente muestra un mensaje que indique qué opción eligió el usuario.
 */
public class MenuConWhile {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scan =new Scanner(System.in); 
        int resp = 0;
        do {
            System.out.println("Menú:");
            System.out.println("1. Comprar producto:");
            System.out.println("2. Devolución");
            System.out.println("3. pedidos");
            System.out.println("4. FAQ");
            System.out.println("5.Salir"); 
            resp = scan.nextInt();
            System.out.println("Yendo a la opción elegida");

        } while (resp != 5);
        System.out.println("Saliendo del menú...");

        scan.close();
    }
    
}
