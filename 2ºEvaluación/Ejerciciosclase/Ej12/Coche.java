public class Coche extends Terrestre{
    
    private boolean tieneGps;

    public Coche(String matricula, String modelo, int ruedas){
        super(matricula, modelo, ruedas);
    }

    public boolean isTieneGps() {
        return tieneGps;
    }

    public void setTieneGps(boolean tieneGps) {
        this.tieneGps = tieneGps;
    }

    
}
