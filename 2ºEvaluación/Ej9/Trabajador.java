import java.util.Date;

public class Trabajador extends Persona{
    
    private final int nrp;

    public Trabajador(String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento, int nrp){
        super(dni, nombre, apellido1, apellido2, fechaNacimiento);
        this.nrp = nrp;
    }
}
