import java.time.LocalDate;

import controlador.Agenda;
import modelo.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        var miAgenda = new Agenda();

        var agenda = miAgenda.getAgendaViva();

        var unapersona = agenda.get(0);

        System.out.println(unapersona.getNombre());
    }
}
