package clase8Arrays;
/*Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos índices están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.

 */
import java.util.Arrays;
import java.util.Scanner;
public class CopiandoArreglos {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan  = new Scanner(System.in);
        System.out.println("Ingrese de qué tamaño desea el arreglo inicial:");
        int a = scan.nextInt();
        int[] arreglo1 = new int[a];
        int[] arreglo2;
        int i;
        for (i=0; i<arreglo1.length; i++) {
            arreglo1[i]= (int) (Math.random()*100)+1;
            System.out.println(arreglo1[i] + " | "+i);
        }
        int indice1;
        int indice2;
        do {
        System.out.println("Ingrese a partir de qué indice quiere copiar:");
        indice1= scan.nextInt();
        System.out.println("Ingrese hasta qué indice quiere copiar:");
        indice2 = scan.nextInt();
        scan.close();
    } while (indice2 < indice1 || indice1 < 0 || indice1 >= arreglo1.length || indice2 < 0 || indice2 >= arreglo1.length);
        arreglo2=Arrays.copyOfRange(arreglo1, indice1, indice2+1);

        System.out.println("El arreglo copiado queda como: ");
            for (i=0; i<arreglo2.length;i++){
                int b = indice1 + i;
                System.out.println(arreglo2[i] + "|" + b);
            }
            
        }
        
    }
    