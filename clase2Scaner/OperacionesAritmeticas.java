//Declara dos variables, y asígnales un valor a cada una de ellas.
//Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola.
//Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado,
//Ej: La suma de las 2 variables es : “[resultado]”;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println();
        System.err.println("La suma de " + a + " + " + b + " es igual a " + (a+b));
        System.out.println();
        System.err.println("La resta de " + a + " - " + b + " es igual a " + (a-b));
        System.out.println();
        System.err.println("El producto de " + a + " x " + b + " es igual a " + (a*b));
        System.out.println();
        double divi= (double) a/ (double) b;        //Al ponerle el double a todo, hace que me de los decimales sin truncarlo.
        System.err.println("La división de " + a + " / " + b + " es igual a " + divi);
        System.out.println();
        System.err.println("El módulo de " + a + " resto de " + b + " es igual a " + (a%b));

//Posteriormente, pide al usuario que ingrese dos números, 
//guardarlos en variables previamente declaradas, realiza la suma de los números y muestra el resultado.
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ahora, ingresa dos números");
        double c = lectura.nextDouble();
        double d = lectura.nextDouble();
        System.out.println();
        System.err.println("La suma de " + c + " + " + d + " es igual a " + (c+d));
        lectura.close();
    }
}
