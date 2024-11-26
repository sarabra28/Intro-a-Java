package clasepoo;
public class esPrimo {
        public static void main(String[] args) {
        // System.out.println( esPrimo(4) );
        for (int i = 0; i < 20; i++) {
        System.out.println( i + ": " + esPrimoRecursivo(i, 2 ) );
        }
        }
        
        
        public static Boolean esPrim(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n) ; i++) {
        if( n%i == 0 ) return false;
        }
        return true;
        }
        
        
        public static Boolean esPrimoRecursivo(int num, int divisor) {
        if(num<=2) return true;
        if( num%divisor == 0 ) return false;
        if( divisor*divisor >= num ) return true;
        return true && esPrimoRecursivo(num, divisor+1);
        }
        }

