public class Perro extends Mascotas{

    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
       return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    private boolean pulgas;


    @Override
    public void habla(){
        System.out.println("Guau Guau");
    }

    public void muestra(){
        
    }

    
}
