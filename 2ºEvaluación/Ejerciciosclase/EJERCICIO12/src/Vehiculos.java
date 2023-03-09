public class Vehiculos {
    private final int matricula;
    private final int modelo;


    
    public Vehiculos(int matricula2, int modelo2) {
        this.matricula = matricula2;
        this.modelo = modelo2;
    }


    public int getMatricula() {
        return matricula;
    }
    public int getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "{" + "matricula=" + matricula + 
        ", modelo=" + modelo ;        
    }

    
}
