package clase10Integra;

import java.util.Random;
import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la contraseña");
        int longitud = scan.nextInt();
        char[] contraseña = new char[longitud];
        String CaracteresDisponibles = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        boolean mayuscula, minuscula, digito;
        Random azar = new Random();
            do {
                mayuscula = false;
                minuscula= false;
                digito = false;
                
                for (int i= 0; i < contraseña.length; i++) {
                    int indice = azar.nextInt(CaracteresDisponibles.length());
                    contraseña[i]= CaracteresDisponibles.charAt(indice);

                        if (Character.isUpperCase(contraseña[i])) {
                            mayuscula= true;
                        };
                        if (Character.isLowerCase(contraseña[i])) {
                            minuscula = true;
                        };
                        if (Character.isDigit(contraseña[i])) {
                            digito= true;
                        };
                    }
                } while (!mayuscula || !minuscula || !digito);
            
                for (int i= 0; i < contraseña.length; i++) {
                    System.out.print(contraseña[i]);
                }
                    scan.close();
}
}