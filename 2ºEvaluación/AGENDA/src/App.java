import java.time.LocalDate;

import controlador.Agenda;
import modelo.Persona;

public class App {

    static Agenda miAgenda = new Agenda();
    public static void main(String[] args) throws Exception {        
        crearContacto();
    }


    public static void crearContacto() {
        System.out.println("Introduce nombre");
        String nombre = System.console().readLine();
        var pepe = new Persona(nombre);

        System.out.println("Introduce apellidos");
        String apellidos = System.console().readLine();
        System.out.println("Introduce email");
        String email = System.console().readLine();
        System.out.println("Introduce telefono");
        String telefono = System.console().readLine();
        System.out.println("Dia de nacimiento");
        String dia = System.console().readLine();
        System.out.println("Mes de nacimiento");
        String mes = System.console().readLine();
        System.out.println("Anyo de nacimiento");
        String anyo = System.console().readLine();




        String fecha = anyo + "-" + mes + "-" + dia;

        LocalDate fechaNac = LocalDate.parse(fecha);
        pepe.setFechaNacimiento(fechaNac);
        miAgenda.insertarContacto(pepe);
        

    }
}
