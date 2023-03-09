public class Moto extends Terrestre{

    private int Cilintrada;

    public Moto(String matricula, String modelo, int ruedas){
        super(matricula, modelo, ruedas);
    }

    public int getCilintrada() {
        return Cilintrada;
    }

    public void setCilintrada(int cilintrada) {
        Cilintrada = cilintrada;
    }
    
}
