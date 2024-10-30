package clase7WHile;

public class NumeroDeCifras {
    public static void main(String[] args) {
    int num = -123, contDigitos = 0;
    
    if( num == 0 ) {
    contDigitos++;
    }
    
    
    while (num!=0) {
    contDigitos++;
    num = (int)num/10;
    }
    System.out.println(contDigitos);
    }
    
    
}
