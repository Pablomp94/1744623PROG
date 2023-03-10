import java.util.*;

public class Persona{

    private final String dni, nombre , apellido1 , apellido2;
    private final Date fechaNacimiento;
    public String getDni() {
        return dni;
    }
    public String getNomre() {
        return nombre;
    }
    public String getApellido1() {
        return apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }
}