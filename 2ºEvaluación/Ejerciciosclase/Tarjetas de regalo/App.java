import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int cantidad, saldo, opcion;
        
        Tarjetas tarjetas = new Tarjetas();
        Tarjetas tarjetaUno = new Tarjetas();
        Tarjetas tarjetaDos = new Tarjetas();
        //Tarjetas tarjeta = tarjetaDos.combinar(tarjetaDos);


        System.out.println("Introduce el saldo de la primera tarjeta en numeros enteros positivos");

        cantidad = sc.nextInt();

        tarjetaUno.getSaldo1(cantidad);
    
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Introduce el saldo de la segunda tarjeta en numeros enteros positivos");
    
        cantidad = sc.nextInt();
            
        tarjetaDos.getSaldo2(cantidad);

        System.out.println(" ");
        System.out.println(" ");
    do{
        System.out.println("------------------------------------------");
        System.out.println("|||||||||||||||||||||||||||||||||||||||");
        System.out.println("Acciones a realizar con las tarjetas:");
        System.out.println("|||||||||||||||||||||||||||||||||||||||");
        System.out.println("0.Información de las tarjetas.");
        System.out.println("1.Gastar saldo tarjetas.");
        System.out.println("2.Combinar tarjetas.");
        System.out.println("3.Salir.");

        opcion = sc.nextInt();

        if(opcion == 1){
            tarjetas.gastarsaldo();
        }


    }while(opcion != 3);

    }  
}
