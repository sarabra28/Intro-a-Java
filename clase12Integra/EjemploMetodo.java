package clase12Integra;

import java.util.Arrays;

public class EjemploMetodo {
    public static void main(String[] args) {
        int[] array2 = crearArrayAleatorio();
        imprimirArray(array2);
        ordernarDeFormaAscendente(array2);
        imprimirArray(array2);
    }

    public static int[] crearArrayAleatorio() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11 + 1);
        }
        return array;
    }

    public static void imprimirArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println();
    }

    public static void ordernarDeFormaAscendente(int[] array) {
        Arrays.sort(array);


    }
}
