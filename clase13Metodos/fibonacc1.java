package clase13Metodos;

import java.util.Scanner;

public class fibonacc1 {
    public static void main(String[] args) {
        fibonacci();
    }
        public static void fibonacci() {
            Scanner sc = new Scanner(System.in);
            System.out.println("\033\143");
        System.out.println("De que numero se quiere calcular el Fibonacci?");
        int n = sc.nextInt();
        System.out.println("El fibonacci de " + n + " es: " + fiboAux(n));
        sc.close();
        }
        
        private static int fiboAux(int num) {
        if (num == 0) {
        return 0;
        } else if (num == 1) {
        return 1;
        } else {
            return fiboAux(num - 1) + fiboAux(num - 2);
        }
        }
    }
