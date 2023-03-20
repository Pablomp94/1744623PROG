package modelo;

import java.time.LocalDate;

public class Persona {
    private final String nombre;
    private String apellidos; 
    private int numTelefono;
    private String email;
    private LocalDate fechaNacimiento;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int comprobarCumpleanyos() {
        LocalDate hoy = LocalDate.now();

        if (hoy.getDayOfMonth()==getFechaNacimiento().getDayOfMonth() &&
        hoy.getMonthValue()==getFechaNacimiento().getMonthValue()) {
            return hoy.getYear() - getFechaNacimiento().getYear();   
        }
        else {
            return -1;
        }
    }

    
}
