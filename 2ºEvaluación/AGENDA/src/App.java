import java.time.LocalDate;

import modelo.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha.getDayOfMonth());
        System.out.println(fecha.getMonthValue());

        Persona pepe = new Persona("Pepe");
        pepe.setFechaNacimiento("2002-11-04");
    }
}
