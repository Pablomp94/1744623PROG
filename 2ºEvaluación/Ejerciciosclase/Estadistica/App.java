import java.util.*;

public class App {

    public static void main(String[] args) {

        int opcion;

        Scanner sc = new Scanner(System.in);

        ESTADISTICA miESTADISTICA = new ESTADISTICA();

        do {
            System.out.println("****************");
            System.out.println("1.Saber el mayor");
            System.out.println("2.Saber el menor");
            System.out.println("3.Saber la media");
            System.out.println("4.Saber los numeros primos");
            System.out.println("5.Salir");
            System.out.println("****************");

            opcion = sc.nextInt();

            if (opcion == 1) {
                miESTADISTICA.mayor();
            }

            if (opcion == 2) {
                miESTADISTICA.menor();
            }

            if (opcion == 3) {
                miESTADISTICA.media();
            }

            if(opcion == 4){
                miESTADISTICA.contarPrimos();
            }
        } while (opcion != 5);

        System.out.println("__________________");
        System.out.println("   HASTA PRONTO   ");
        System.out.println("__________________");
    }
}
