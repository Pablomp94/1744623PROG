package controlador;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Archivos;
import modelo.Persona;

public class Agenda {
    //El arrchivo que guarda los datos
    private Archivos archivoAgenda = new Archivos("agenda.txt");
    //La agenda en memoria
    private ArrayList<Persona> agendaViva = new ArrayList<Persona>();

    public Agenda() {
    }

    public ArrayList<Persona> getAgendaViva() {
        return agendaViva;
    }

    public void setAgendaViva(ArrayList<Persona> agendaViva) {
        this.agendaViva = agendaViva;
    }

    public void insertarContacto(Persona pepe) {
        agendaViva.add(pepe);
        
        archivoAgenda.escribe(null);
        
    }

    

    
}
