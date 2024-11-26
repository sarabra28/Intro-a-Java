package VolviendoAPOO.geometrica;

public class Rectangulo {
    private double ancho;
    private double alto;
    static private int contadorRectangulos =0;
/*Diseña un constructor con argumentos que inicialice los valores del 'ancho' y 'alto', y que incremente en uno el valor de 'contadorRectangulos'.  */
public Rectangulo(double ancho, double alto){
    this.ancho = ancho;
    this.alto= alto;
    contadorRectangulos++;
}
/*Implementa un método llamado 'area()' y otro método llamado 'perimetro()', responsables de calcular el área y el perímetro del rectángulo, respectivamente. */
public double area() {
return ancho * alto;
}
public double perimetro() {
    return 2*(ancho + alto);
}
public static int getContadorRectangulos() {
    return contadorRectangulos;
    }
}

