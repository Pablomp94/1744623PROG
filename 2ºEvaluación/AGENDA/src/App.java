import java.time.LocalDate;

import controlador.Agenda;
import modelo.Persona;
import java.util.*;

public class App {

    static Agenda miAgenda = new Agenda();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Menu miMenu = new Menu();

        int opcion = 1;

        System.out.println(" ");
        System.out.println("...........................");
        System.out.println("    .....CUMPLEAÑOS.....");
        System.out.println("...........................");

        cumpleanyos();

        System.out.println(" ");

       // Un bucle do while que se utiliza para mostrar el menú y las opciones que el usuario puede
       // elegir.
        do {

            miMenu.menu();

            opcion = sc.nextInt();

            if (opcion == 1) {
                crearContacto();
            }

            if (opcion == 2) {

                modificarContacto();

            }

            if (opcion == 3) {
                miAgenda.leerContactos();
            }

            if(opcion == 4){
                borrarContacto();
            }

        } while (opcion != 0);

    }

    /**
     * Metodo para crear el Contacto, en donde se va a poner los datos en cada
     * propiedad correspondida de la Persona, así como su nombre, apellidos,
     * telefono, email, etc, y lo agrega a la agenda
     * 
     * @return El valor de cada variable, se inserta la fecha de nacimiento de la
     *         persona y se inserta en contactos a la persona.
     */

    public static void crearContacto() {

        String nombre;
        do {
            System.out.println("Introduce nombre");
            nombre = System.console().readLine();
            if (!nombre.matches("[A-z]+")) {
                System.out.println("Introduce valores validos, solo letras");
            }
        } while (!nombre.matches("[A-z]+"));

        var pepe = new Persona(nombre);

        String apellidos;

        do{
            System.out.println("Introduce apellidos");
            apellidos = System.console().readLine();
            if (!apellidos.matches("[A-z]+")) {
                System.out.println("Introduce valores validos, solo letras");
            }
        
        }while(!apellidos.matches("[A-z]+"));
        pepe.setApellidos(apellidos);



        String email;
        do{
            System.out.println("Introduce email");
            email = System.console().readLine();
            if(!email.matches(".*@.*[.].*")){
                System.out.println("Introduce los valores validos, debe de tener @ y un . en el email");
            }
        }while(!email.matches(".*@.*[.].*"));
        pepe.setEmail(email);


        String telefono;
        do{
            System.out.println("Introduce telefono");
            telefono = System.console().readLine();
            if(!telefono.matches("[0-9]+")){
                System.out.println("Introduce los valores validos, solo numeros para el telefono");
            }
        }while(!telefono.matches("[0-9]+"));
        pepe.setNumTelefono(telefono);

        String dia = "01";

        do {
            System.out.println("Dia de nacimiento");
            dia = System.console().readLine();
            if ((dia.matches("[0]" + "[1-9]") == false) && (dia.matches("[1-2]" + "[0-9]") == false)
                    && (dia.matches("[3]" + "[0-1]") == false)) {
                System.out.println("El valor introducido no es valido, vuelvelo a intentar");
            }
        } while (((dia.matches("[0]" + "[1-9]") == false) && (dia.matches("[1-2]" + "[0-9]") == false)
                && (dia.matches("[3]" + "[0-1]") == false)));

        String mes = "01";

        do {

            System.out.println("Mes de nacimiento");

            mes = System.console().readLine();

            if ((mes.matches("[0]" + "[1-9]") == false) && mes.matches("[1]" + "[0-2]") == false) {
                System.out.println("Los datos introducidos no son validos, vuelve a intentarlo");
            }

        } while ((mes.matches("[0]" + "[1-9]") == false) && mes.matches("[1]" + "[0-2]") == false);

        String anyo = "2001";

        do {
            System.out.println("Anyo de nacimiento");
            anyo = System.console().readLine();
            if ((anyo.matches("[1]" + "[9]" + "[0-9]" + "[0-9]") == false)
                    && (anyo.matches("[2]" + "[0]" + "[0]" + "[0-9]")) == false) {
                System.out.println("Los datos introducidos no son validos, vuelve a intentarlo");
            }

        } while ((anyo.matches("[1]" + "[9]" + "[0-9]" + "[0-9]") == false)
                && (anyo.matches("[2]" + "[0]" + "[0]" + "[0-9]")) == false);

        // Concatenamos el anyo, el mes y el dia en una cadena.
        String fecha = anyo + "-" + mes + "-" + dia;

        LocalDate fechaNac = LocalDate.parse(fecha);
        pepe.setFechaNacimiento(fechaNac);
        // Agregando el objeto `pepe` al objeto `miAgenda`.
        miAgenda.insertarContacto(pepe);

    }

    
    /**
     * Modifica un contacto en la agenda
     */
    public static void modificarContacto() {

        System.out.println("Introduce la posicion de la persona a modificar, empezando por el 0");

        //Leer los contactos y luego pedirle al usuario que ingrese la posicion del contacto el cual se modificara
        miAgenda.leerContactos();

        int i = sc.nextInt();

        //Solicitamos al usuario que ingrese los nuevos datos del contacto a cambiar
        
        // Una validación de los datos introducidos por el usuario.
        String apellidos;

        do{
            System.out.println("Introduce apellidos");
            apellidos = System.console().readLine();
            if (!apellidos.matches("[A-z]+")) {
                System.out.println("Introduce valores validos, solo letras");
            }
        
        }while(!apellidos.matches("[A-z]+"));
       


        String email;
        do{
            System.out.println("Introduce email");
            email = System.console().readLine();
            if(!email.matches(".*@.*[.].*")){
                System.out.println("Introduce los valores validos, debe de tener @ y un . en el email");
            }
        }while(!email.matches(".*@.*[.].*"));
      


        String telefono;
        do{
            System.out.println("Introduce telefono");
            telefono = System.console().readLine();
            if(!telefono.matches("[0-9]+")){
                System.out.println("Introduce los valores validos, solo numeros para el telefono");
            }
        }while(!telefono.matches("[0-9]+"));
      

        String dia = "01";

       // Comprobando si la entrada del usuario es una fecha válida.
        do {
            System.out.println("Dia de nacimiento");
            dia = System.console().readLine();
            if ((dia.matches("[0]" + "[1-9]") == false) && (dia.matches("[1-2]" + "[0-9]") == false)
                    && (dia.matches("[3]" + "[0-1]") == false)) {
                System.out.println("El valor introducido no es valido, vuelvelo a intentar");
            }
        } while (((dia.matches("[0]" + "[1-9]") == false) && (dia.matches("[1-2]" + "[0-9]") == false)
                && (dia.matches("[3]" + "[0-1]") == false)));

        String mes = "01";

        do {

            System.out.println("Mes de nacimiento");

            mes = System.console().readLine();

            if ((mes.matches("[0]" + "[1-9]") == false) && mes.matches("[1]" + "[0-2]") == false) {
                System.out.println("Los datos introducidos no son validos, vuelve a intentarlo");
            }

        } while ((mes.matches("[0]" + "[1-9]") == false) && mes.matches("[1]" + "[0-2]") == false);

        String anyo = "2001";

        do {
            System.out.println("Anyo de nacimiento");
            anyo = System.console().readLine();
            if ((anyo.matches("[1]" + "[9]" + "[0-9]" + "[0-9]") == false)
                    && (anyo.matches("[2]" + "[0]" + "[0]" + "[0-9]")) == false) {
                System.out.println("Los datos introducidos no son validos, vuelve a intentarlo");
            }

        } while ((anyo.matches("[1]" + "[9]" + "[0-9]" + "[0-9]") == false)
                && (anyo.matches("[2]" + "[0]" + "[0]" + "[0-9]")) == false);

        // Concatenamos el anyo, el mes y el dia en una cadena.
        String fecha = anyo + "-" + mes + "-" + dia;

        // Llamando al metodo modificarContacto desde la clase Agenda y pasando los parametros i, apellidos, email, telefono, fecha.
        miAgenda.modificarContacto(i, apellidos, email, telefono, fecha);

    }

    /**
     * 
     */
    public static void cumpleanyos() {

       // Comprobando si hay un cumpleanyos hoy.
        ArrayList<Persona> listaContactos = miAgenda.getAgendaViva();

        int i;

        //Iterando a traves de la lista de contactos.
        for (i = 0; i < listaContactos.size(); i++) {

            miAgenda.comprobarCumple(i);
        }

    }

    /**
     * 
     */
    public static void borrarContacto(){

        System.out.println("Introduce la posicion del contacto a eliminar, empezando por el 0");


        miAgenda.leerContactos();

        int i = sc.nextInt();

        ArrayList<Persona> listaContactos = miAgenda.getAgendaViva();

        listaContactos.remove(i);

        miAgenda.guardar();


    }

}
