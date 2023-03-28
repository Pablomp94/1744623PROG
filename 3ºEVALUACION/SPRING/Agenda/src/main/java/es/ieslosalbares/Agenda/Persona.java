package es.ieslosalbares.Agenda;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    private String apellidos; 
    private int numTelefono;
    private String email;
    private String fechaNacimiento;


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
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String string) {
        this.fechaNacimiento = string;
    }


    @Override
    public String toString() {
        return getNombre() + ";" +
        getApellidos() + ";" +
        getNumTelefono() + ";" +
        getEmail() + ";" +
        getFechaNacimiento()+ ";\n" ;
    }

    
}
