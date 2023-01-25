import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int saldo1, saldo2, opcion;
        
        Tarjetas tarjetaUno = new Tarjetas();
        Tarjetas tarjetaDos = new Tarjetas();
        Tarjetas tarjeta = new Tarjetas();


        System.out.println("Introduce el saldo de la primera tarjeta en numeros enteros positivos");

        saldo1 = sc.nextInt();

        tarjetaUno.getSaldo1(saldo1);
    
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Introduce el saldo de la segunda tarjeta en numeros enteros positivos");
    
        saldo2 = sc.nextInt();
            
        tarjetaDos.getSaldo2(saldo2);

        System.out.println(" ");
        System.out.println(" ");
    do{
        System.out.println("Acciones a realizar con las tarjetas:");
        System.out.println(" ");
        System.out.println("0.Información de las tarjetas.");
        System.out.println("1.Gastar saldo tarjetas.");
        System.out.println("2.Combinar tarjetas.");
        System.out.println("3.Salir.");

        opcion = sc.nextInt();

        if(opcion == 1){
            tarjeta.gastarsaldo();
        }


    }while(opcion != 3);

    }  
}
