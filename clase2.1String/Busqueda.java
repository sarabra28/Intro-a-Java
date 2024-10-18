import java.util.Scanner;
public class Busqueda {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
System.out.print("Ingresa una palabra: ");
String palabra = leer.nextLine();
System.out.print("Ingresa la letra que deseas buscar: ");
char letra = leer.next().charAt(0);
if (palabra.indexOf(letra)>=0){
System.out.println("La letra "+letra+" se encuentra en la posición "+palabra.indexOf(letra));
} else {
System.out.println("La letra "+letra+" no se encuentra en la palabra.");
}
leer.close();
}
}

