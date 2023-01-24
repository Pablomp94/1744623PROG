import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int sal1, sal2;
        
        Tarjetas tarjetaUno = new Tarjetas();
        Tarjetas tarjetaDos = new Tarjetas();


        System.out.println("Introduce el saldo de la primera tarjeta en numeros enteros positivos");

        sal1 = sc.nextInt();

        tarjetaUno.getSaldo1(sal1);
    
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Introduce el saldo de la segunda tarjeta en numeros enteros positivos");
    
        sal2 = sc.nextInt();
            
        tarjetaDos.getSaldo2(sal2);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Acciones a realizar con las tarjetas:");

        System.out.println("1.Gastar saldo tarjetas.");
        System.out.println("2.Combinar tarjetas.");

    }  
}
