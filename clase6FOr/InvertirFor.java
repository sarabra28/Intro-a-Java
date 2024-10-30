package clase6FOr;

public class InvertirFor {
    public static void main(String[] args) {
        
        int[] enteros = {1,2,3,4,5};
        int[] inverso = new int[enteros.length];
        
        for (int i = (enteros.length-1); i>=0; i--) {
            inverso[i]= enteros[enteros.length-i];
        }
        System.out.println("Su arreglo inverso es: ");
        for (int b=0; b < (enteros.length-1); b++) {
            System.out.print(inverso[b]+",");
        }
    }
    
}