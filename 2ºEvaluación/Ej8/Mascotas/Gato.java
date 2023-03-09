public class Gato extends Mascotas{
    
    private String color;
    private boolean peloLargo;
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isPeloLargo() {
        return peloLargo;
    }
    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    
    @Override
    public void habla(){
        System.out.println("MEOW MEOW");
    }
}
