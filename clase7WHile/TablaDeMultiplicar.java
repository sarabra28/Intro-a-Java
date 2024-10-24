package clase7WHile;

/* */

import java.util.Scanner;

public class TablaDeMultiplicar {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int cont, num;

do {
num = scanner.nextInt();
cont=1;
while (cont<=12) {
System.out.println( num + " x " + cont + "=" + (num*cont) );
cont++;
}
System.out.println("----------------------------");
} while (num!=0);
scanner.close();
}
}