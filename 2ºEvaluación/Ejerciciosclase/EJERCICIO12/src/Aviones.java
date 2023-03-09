public class Aviones extends Aereos{

    private  int cargamaxima;

    public int getCargamaxima() {
        return cargamaxima;
    }

    public Aviones(int matricula, int modelo, int numAsientos, int cargamaxima){
        super(matricula, modelo, numAsientos);
        this.cargamaxima = cargamaxima;
    }
    
}
