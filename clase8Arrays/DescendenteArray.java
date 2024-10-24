package clase8Arrays;
/*Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.
/* */
import java.util.Arrays;
public class DescendenteArray {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        
        for ( int i=0; i<arr.length;i++) {
            arr[i]= (int) (Math.random()*100)+1;
        }
        Arrays.sort(arr);
System.out.println("mostrando el arreglo ordenado ASCENDENTE: "+ Arrays.toString(arr) );
int aux = arr.length-1;//tamaño del arreglo


for(int j = 0 ;j<arr.length;j++){

arr2[j]= arr[aux];
aux--;

}


System.out.println("mostrando el arreglo ordenado Descendente: "+ Arrays.toString(arr2));




}
}
