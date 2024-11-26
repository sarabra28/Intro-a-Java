package clasepoo;

public class Application {
    public static void main(String[] args) {
        Persona gente = new Persona();
        gente.nombre= "Sara";
        gente.edad= 23;
        
       Persona.imprimirDatos(gente.nombre, gente.edad);

    }
}
