package clase6FOr;

/*Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array. 
El tamaño y los números  a contener pueden ser de tu elección.

 */
public class ValorMinimo {
    public static void main(String[] args) {
        int[] arrEnteros = { -2000, 5, -15, 0, 25, -154, 589, 23 };
        int min = arrEnteros[0];

        for (int i = 1; i < arrEnteros.length; i++) {
            if (min > arrEnteros[i]) {
                min = arrEnteros[i];

            }
        }

        System.out.println("El valor mínimo del arreglo es: " + min);
    }
}
