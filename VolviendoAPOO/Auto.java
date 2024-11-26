package VolviendoAPOO;

public class Auto {
    private String marca;
    private String modelo;
    private int año;

    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public Auto(String marca){
        this.marca = marca;
    }
    public Auto(){
        this("desconocida", "desconocido", 0);
    }
    /*Escribe el método “imprimirDatos” dentro de la clase “Auto”, que al ser invocado imprima en consola su marca, modelo y año. Teniendo en cuenta que algunos atributos pueden no ser inicializados, el método “print” debe detectar e imprimir sólo aquellos atributos con valor asignado o mostrar un mensaje en el caso de haber sido inicializado con el constructor sin parámetros.  */
    public void imprimirDatos(){
        if (this.marca == null && this.modelo == null && this.año == 0) {
            System.out.println("Este OBJETO fue creado con constructor  vacío, no hay datos para mostrar");
            
            } else {
            if (this.marca != null) {
            System.out.println("Marca: " + this.marca);
            } else {
            System.out.println("Marca: No especificada");
            }
            if (this.modelo != null) {
            System.out.println("Modelo: " + this.modelo);
            } else {
            System.out.println("Modelo: No especificado");
            }
            if (this.año != 0) {
            System.out.println("Año: " + this.año);
            } else {
            System.out.println("Año: No especificado");
            }
            System.out.println("------------------------------");

    }
    }
}
