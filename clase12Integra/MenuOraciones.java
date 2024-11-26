package clase12Integra;

import java.util.Scanner;

/*Escribe un programa en Java que permita al usuario realizar diversas operaciones con una oración. El programa debe cumplir con los siguientes requisitos:
-Muestra un menú de opciones al usuario donde podrá:
-Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".
-Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).
-Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.
-Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas alfabéticamente.
-Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".
-Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.
-Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).
-Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.
-Salir: Terminar el programa.

Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir". */
public class MenuOraciones {
    public static void main(String[] args) {
        private static String oracio = ""; // Variable para almacenar la oración
        System.out.println("\033\143");
        Scanner scan = new Scanner(System.in);

        int resp = 0;
        boolean flag= false;
        boolean first= false;
        do {

            System.out.println("Ingrese el número que corresponda a la opción que desea:");
            System.out.println("1 -> Crear o Borrar oración");
            System.out.println("2 -> Conocer cantidad de caracteres");
            System.out.println("3 -> Conocer cantidad de palabras");
            System.out.println("4 -> Ver palabras ordenadas alfabéticamente");
            System.out.println("5 -> Conocer palabra a través de su índice");
            System.out.println("6 -> Buscar palabra");
            System.out.println("7 -> Modificar palabra");
            System.out.println("8 -> Agregar contenido");
            System.out.println("9 -> Salir");
            resp=scan.nextInt();
            switch (resp) {
                case 1:
                //-Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".

                    
                    break;
                case 2:
                //-Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).
              
                
                
                    break;
                case 3:
                //-Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.


                    break;
                case 4:
                //-Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas alfabéticamente.


                    break;
                case 5:
                //-Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".


                    break;
                case 6:
                //-Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.


                    break;
                case 7:
                //-Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).


                    break;
                case 8:
                //-Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.


                    break;
                case 9:
                 System.out.println("Saliendo...");
                 flag=true;
                
                    break;
                default:
                    System.out.println("Ingrese un número válido.");
                    break;
                }
                }while (flag==false);


    }
    
    public static void CrearOBorrar (String oracion, boolean first) {
                //-Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".
                if (first==false) {
                    System.out.println("Crear oración:");
                     
                    
                }

    }
}
