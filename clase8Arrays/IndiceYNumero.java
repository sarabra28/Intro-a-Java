package clase8Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class IndiceYNumero {
    public static void main(String[] args) {
        /*
* Crea un programa en Java que declare y muestre un arreglo de enteros junto
* con sus índices. Luego, solicita al usuario dos índices: un índice inicial y
* un índice final. Con estos dos índices, copia la parte del arreglo original
* comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método
* Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el
* índice inicial es menor que el índice final y que ambos índices están dentro
* del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo
* por consola.
*/

int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };
System.out.println(Arrays.toString(arr));
for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i] + " | " + i);
}
Scanner miScanner = new Scanner(System.in);
int indice = 0;
int indice2 = 0;

do {
System.out.print("Por favor ingrese el primer indice: ");
indice = miScanner.nextInt(); //4
System.out.print("Por favor ingrese el segundo indice: ");
indice2 = miScanner.nextInt(); //2
} while (((indice & indice2) >= 0 && (indice & indice2) <= arr.length ));

try {

int[] copia = Arrays.copyOfRange(arr, indice, indice2 + 1);
System.out.println("La copia del arreglo es:" + Arrays.toString(copia));
} catch (IllegalArgumentException e) {
System.out.println("El primer numero es mayor al segundo!");
System.out.println(e.getMessage());
} catch (Exception e) {
System.out.println(e.getMessage());
}
miScanner.close();
    }

}
