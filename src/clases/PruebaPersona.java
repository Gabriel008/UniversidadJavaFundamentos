package clases;

public class PruebaPersona {

    public static void main(String[] args) { //psvm + tab
        Persona persona1 = new Persona();

        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        System.out.println("\npersona2 = " + persona2); // Valor espacio en memoria
        persona2.desplegarInformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();

    }
}
