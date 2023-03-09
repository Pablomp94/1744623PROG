public class Aereos extends Vehiculos{
    private final int numAsientos;

    public int getNumAsientos() {
        return numAsientos;
    }

    public Aereos(int matricula, int modelo, int numAsientos) {
        super(matricula, modelo);
        this.numAsientos = numAsientos;
    }

    
}
