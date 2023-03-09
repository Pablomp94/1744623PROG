public class Terrestres extends Vehiculos{

    private final int numRuedas;

    public Terrestres(int matricula, int modelo, int numRuedas) {
        super(matricula, modelo);       
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
    
}
