package clase6FOr;

public class DecreciendoFor {
    public static void main(String[] args) {
        int[] enteros = {1,2,3,4,5};
        
        for (int i = (enteros.length-1); i>=0; i--) {
        System.out.println("El array en posición " +i+ " es " + enteros[i]);
        }
        }
        
}
