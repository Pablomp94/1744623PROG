package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persona {

    /**
     * Valores de las propiedades de Persona
     * Se generan los getters y setters 
     */
    private final String nombre;
    private String apellidos; 
    private String numTelefono;
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
    public String getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(String telefono) {
        this.numTelefono = telefono;
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


    /**
     * Almacena los datos anteriores en un ArrayList de tipo String, el cual se va a usar mas a delante para escribir dicha informacion en el documento de texto agenda.
     * @return devuelve la informacion de listaDatos.
     */

    public ArrayList <String> datosPersona(){

        ArrayList <String> listaDatos = new ArrayList<>();

        listaDatos.add(nombre);
        listaDatos.add(apellidos);
        listaDatos.add(String.valueOf(numTelefono));
        listaDatos.add(email);

       // String fecha = fechaNacimiento.getYear() + "-" + fechaNacimiento.getMonth() + "-" + fechaNacimiento.getDayOfMonth();
         listaDatos.add(fechaNacimiento.toString());
         return listaDatos;
    }

   
    
}
