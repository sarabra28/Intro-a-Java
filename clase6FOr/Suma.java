package clase6FOr;

/*Calcular suma acumulada:

Escribe un programa que recorra un array de enteros y  calcule la suma acumulada de los elementos, reemplazando cada elemento por la suma acumulada hasta ese punto.El tamaño y los números  a contener pueden ser de tu elección. */
//alt + Z
public class Suma {
    public static void main(String[] args) {
        System.out.println("\033\143");
        int[] arrEnteros = { 18, 5, -15, 0, 25, -154, 589, 23 };
        int sumas = 0;
        for (int i=0; i < arrEnteros.length; i++ ) {
            sumas= arrEnteros[i]+ sumas;
            arrEnteros[i]= sumas;
            System.out.println(arrEnteros[i]);
        }


    }
}
