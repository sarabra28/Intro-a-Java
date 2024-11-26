package VolviendoAPOO;

public class App {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Corolla");
        Auto auto2 = new Auto("Hyundai", "Accent");
        Auto auto3 = new Auto();
        Auto auto4 = new Auto("Kia", "Picanto", 2010);

        System.out.println("Datos auto 1");
        auto1.imprimirDatos();

        System.out.println("Datos auto 2");
        auto2.imprimirDatos();

        System.out.println("Datos auto 3");
        auto3.imprimirDatos();
        
        System.out.println("Datos auto 4");
        auto4.imprimirDatos();
        
        
    }
}
