import java.util.Date;

public class Alumno extends Persona{

    private final int nia;

    public int getNia() {
        return nia;
    }

    public Alumno(String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento, int nia){
        super(dni, nombre, apellido1, apellido2, fechaNacimiento);
        this.nia = nia;
    }
}
