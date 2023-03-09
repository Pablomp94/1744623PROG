public class Helicopteros extends Aereos{

    private  int numhelices;
    private  int distanciamaxima;

    public Helicopteros(int matricula, int modelo, int numAsientos, int numhelices, int distanciamaxima){

        super(matricula, modelo, numAsientos);

        this.numhelices = numhelices;
        this.distanciamaxima = distanciamaxima;
    }

    public int getNumhelices() {
        return numhelices;
    }

    public int getDistanciamaxima() {
        return distanciamaxima;
    }
    
}
