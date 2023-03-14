public class Empleado{

    private final String nombre;
    private final int dni;
    private int sueldo_bruto, edad , telefono;
    private String direccion;
    
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public int getSueldo_bruto() {
        return sueldo_bruto;
    }
    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado(String nombre, int dni, int sueldo_bruto, int edad, int telefono, String direccion){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo_bruto = sueldo_bruto;
        edad = 0;
        telefono = 0;
        direccion = " ";
    }

    public void imprimirInfo (){
        System.out.println(nombre + dni + sueldo_bruto + edad + telefono + direccion);
    }

    
}