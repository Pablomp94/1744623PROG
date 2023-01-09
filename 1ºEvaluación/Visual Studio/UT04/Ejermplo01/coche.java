package EJEMPLO01;

public class coche {

    public double depositoCombustible=5;
    public static int capacidadDeposito = 60;
    public static int consumoMedio = 6;

    public void conducir(int kilometros) {
        // el cliente conduce
        double centenas = kilometros/100;
        double consumido = consumoMedio * centenas;
        if (depositoCombustible < consumido) {
            System.out.println("No tienes gasolina para ir tan lejos");
        }
        else {
            depositoCombustible = depositoCombustible - consumido;
        } 
        System.out.println("Has conducido " +
        kilometros );      
        System.out.println("Te quedan " +
        depositoCombustible + " litros.");      

    }

    public void repostar (int litros) {
        if (depositoCombustible + litros > capacidadDeposito) {
            System.out.println("Te has pasado, no puedes echar tanto");
        }
        else {
            depositoCombustible = depositoCombustible + litros;
        }
        System.out.println("Tu deposito tiene ahora " +
        depositoCombustible + " litros.");
    }

    private void cambiarFiltro() {

    }

}