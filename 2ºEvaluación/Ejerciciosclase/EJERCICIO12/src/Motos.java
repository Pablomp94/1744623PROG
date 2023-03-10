public class Motos extends Terrestres{
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Motos(int matricula, int modelo, int numRuedas, int cilindrada) {
        super(matricula, modelo, numRuedas);
        this.cilindrada = cilindrada;
    }

    
}
