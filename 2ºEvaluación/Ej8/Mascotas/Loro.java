public class Loro extends Aves{
    
    private String origen;

    public void saluda(){
        System.out.println("Hola");
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override

    public void volar(){
        System.out.println(("Volando"));
    }

}
