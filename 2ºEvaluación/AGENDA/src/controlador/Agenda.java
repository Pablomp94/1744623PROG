package controlador;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Archivos;
import modelo.Persona;

public class Agenda {
    // El arrchivo que guarda los datos
    public Archivos archivoAgenda = new Archivos("agenda.txt");
    // La agenda en memoria
    public ArrayList<Persona> agendaViva = new ArrayList<Persona>();

    public Agenda() {
        guardaArchivo();
    }

    public ArrayList<Persona> getAgendaViva() {
        return agendaViva;
    }

    public void setAgendaViva(ArrayList<Persona> agendaViva) {
        this.agendaViva = agendaViva;
    }

    public void insertarContacto(Persona pepe) {
        agendaViva.add(pepe);
        guardar();
        
    }

    public void guardar() {

        ArrayList<String> todosContactos = new ArrayList<>();

        for (Persona p : agendaViva) {

            for (String dato : p.datosPersona()) {
                todosContactos.add(dato + ";");
            }

            todosContactos.add("\n");
        }

        archivoAgenda.escribe(todosContactos);
    }

    public void guardaArchivo(){

        ArrayList<String> miArrayList = new ArrayList<>();

        miArrayList = archivoAgenda.lee();

        for(String a : miArrayList){

            String[] miArray = a.split(";");

            Persona persona = new Persona(miArray[0]);

            persona.setApellidos(miArray[1]);
            
            persona.setEmail(miArray[2]);

            persona.setNumTelefono(miArray[3]);

            persona.setFechaNacimiento(LocalDate.parse(miArray[4]));

            agendaViva.add(persona);
        }

    }


    public void leerContactos(){

        //System.out.println(miAgenda.getAgendaViva());

        ArrayList<String> todosContactos = new ArrayList<>();

        for (Persona p : agendaViva) {

            for (String dato : p.datosPersona()) {
                todosContactos.add(dato + ";");
            }

            todosContactos.add("\n");
        }

        System.out.println(todosContactos);

    }



    public void modificarContacto(int i, String apellidos, String email, String telefono, String fechanacimiento){

        Persona p = agendaViva.get(i);

        p.setApellidos(apellidos);

        p.setEmail(email);

        p.setNumTelefono(telefono);

        p.setFechaNacimiento(LocalDate.parse(fechanacimiento));

        guardar();
    }



      /**
     * Metodo para comprobar si hoy es el dia de su cumpleaños
     * @return Si es el cumpleaños devuelve el numero de años que cumple y si no pues te indica que no es su cumpleaños.
     */


    public  int comprobarCumple(int i){

        int res = 0;

        Persona p = agendaViva.get(i);

        p.getFechaNacimiento();

        LocalDate hoy = LocalDate.now();

        if (hoy.getDayOfMonth()==p.getFechaNacimiento().getDayOfMonth() &&
        hoy.getMonthValue()==p.getFechaNacimiento().getMonthValue()) {

            System.out.println("Hoy es su cumpleanyos y cumple: " + (hoy.getYear() - p.getFechaNacimiento().getYear()) + " años");
            
        }
        else {
             res = -1;
        }

        if(res == -1){
            System.out.println("Hoy no es su cumpleaños");
        }
        return res;

    }

}


