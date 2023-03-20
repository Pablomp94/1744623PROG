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
        
        
        String dia = "01";
        
        do{
            System.out.println("Dia de nacimiento");
            dia = System.console().readLine();
            if((dia.matches("[0]" + "[1-9]") == false) && (dia.matches("[1-2]" + "[0-9]") == false) && (dia.matches("[3]" + "[0-1]") == false)){
                System.out.println("El valor introducido no es valido, vuelvelo a intentar");
            }
        }while(((dia.matches("[0]" + "[1-9]") == false) && (dia.matches("[1-2]" + "[0-9]") == false) && (dia.matches("[3]" + "[0-1]") == false)));

        String mes = "01";
       
        do{
        
            System.out.println("Mes de nacimiento");
            
            mes = System.console().readLine();

            if((mes.matches("[0]" + "[1-9]") == false) && mes.matches("[1]" + "[0-2]")== false){
                System.out.println("Los datos introducidos no son validos, vuelve a intentarlo");
            }
        
        }while((mes.matches("[0]" + "[1-9]") == false) && mes.matches("[1]" + "[0-2]") == false);
        
        
        

        String anyo = "2001";

        do{
            System.out.println("Anyo de nacimiento");
            anyo = System.console().readLine();
            if((anyo.matches("[1]" + "[9]" + "[0-9]" + "[0-9]") == false) && (anyo.matches("[2]" + "[0]" + "[0]" + "[0-9]")) == false){
                System.out.println("Los datos introducidos no son validos, vuelve a intentarlo");
            }

        }while((anyo.matches("[1]" + "[9]" + "[0-9]" + "[0-9]") == false) && (anyo.matches("[2]" + "[0]" + "[0]" + "[0-9]")) == false);


        String fecha = anyo + "-" + mes + "-" + dia;

        LocalDate fechaNac = LocalDate.parse(fecha);
        pepe.setFechaNacimiento(fechaNac);
        miAgenda.insertarContacto(pepe);
        

    }
}
