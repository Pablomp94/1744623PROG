import java.util.*;

public class App {
    public static void main(String[] args) {

        Cuenta miCuenta = new Cuenta();

        int opcion;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("********************************************************");
            System.out.println("1.Consultar cuenta");
            System.out.println("2.Ingresar dinero a la cuenta");
            System.out.println("3.Retirar dinero de la cuenta");
            System.out.println("4.Listado de movimientos realizados en la cuenta");
            System.out.println("5.Salir");
            System.out.println("********************************************************");

            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("El saldo de tu cuenta es de: " + miCuenta.consultarsaldoCuenta());
            }
            ;

            if (opcion == 2) {
                miCuenta.ingresarCuenta();
            }

            if (opcion == 3) {
                miCuenta.retirarCuenta();
            }

            if (opcion == 4){
                System.out.println("Movimientos =" + miCuenta.movimientos(opcion));
            }

        } while (opcion != 5);

    }
}
