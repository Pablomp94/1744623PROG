
public class Coche extends Terrestres{
    
    private boolean tieneGPS;

    public Coche(int matricula, int modelo, int numRuedas, boolean tieneGPS) {
        super(matricula, modelo, numRuedas);
        this.tieneGPS = tieneGPS;
    }

    public boolean isTieneGPS() {
        return tieneGPS;
    }

    public void setTieneGPS(boolean tieneGPS) {
        this.tieneGPS = tieneGPS;
    }

    

}
