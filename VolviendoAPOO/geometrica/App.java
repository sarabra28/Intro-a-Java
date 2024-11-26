package VolviendoAPOO.geometrica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Rectangulo[] rectangulos = new Rectangulo[10];
        int opcion;
        do {

            System.out.println("Elija la opción que desee: ");
            System.out.println("1. Crear rectángulo");
            System.out.println("2. Calcular área y perímetro de un rectángulo");
            System.out.println("3. Ver número total de rectángulos creados");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");   
            opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                System.out.println("Ingrese el ancho de su rectángulo");
            double ancho = scan.nextDouble();
            System.out.println("Ingrese el alto de su rectángulo");
            double alto = scan.nextDouble();
            Rectangulo nuevoRectangulo = new Rectangulo(ancho, alto);
            rectangulos[Rectangulo.getContadorRectangulos() - 1] = nuevoRectangulo;
            System.out.println("Rectangulo ingresado");
            System.out.println("________________________________________");
            break;
            case 2:
            System.out.println("Ingrese el índice del rectángulo:");
            int indice = scan.nextInt();
            if (indice >= 0 && indice < Rectangulo.getContadorRectangulos()) {
                System.out.println("El área del rectángulo "+ indice + " es: " + rectangulos[indice].area());
                System.out.println("El perímetro del rectángulo " + indice + " es: " + rectangulos[indice].perimetro());
                System.out.println("________________________________________");
            } else {
                System.out.println("Índice inválido. Por favor, ingrese un índice entre 0 y " + (Rectangulo.getContadorRectangulos() - 1) + ".");
                System.out.println("________________________________________");
            }
            
            break;
            case 3: System.out.println("Hay un total de "+ Rectangulo.getContadorRectangulos() + " rectángulos creados");
            System.out.println("________________________________________");

            break;
            case 4: 
                System.out.println("Saliendo...");
                System.out.println("________________________________________");

                break;
            default: System.out.println("Ingrese una opción válida");
            System.out.println("________________________________________");

            break;
        }  
    } while (opcion != 4);
        scan.close();
}
}
