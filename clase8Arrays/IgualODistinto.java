package clase8Arrays;
import java.util.Arrays;
public class IgualODistinto {
    /*
* Escribe un programa que compare dos arreglos de enteros utilizando el método
* Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.
*/
public static void main(String[] args) {
    
    
    int[] arr = {1,3,2};
    int[] arr2 = {1,3,2};

boolean esIgual = Arrays.equals(arr, arr2);

if(esIgual){
System.out.println("Los arreglos son iguales!");
}else{
System.out.println("Los arreglos son distintos");
}
}
}