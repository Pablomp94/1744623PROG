import java.util.*;

public class Tarjetas {
 
    Scanner sc = new Scanner(System.in);

    private int saldo1, saldo2, saldo3, gastar, opc;
    

public void getSaldo1(int saldo1){
}

public void getSaldo2(int saldo2){
}

int total = saldo1 + saldo2;

public void gastarsaldo(){
    System.out.println(" ");
    System.out.println("Introduce el numero de tajetas que tienes:");
    System.out.println("1. UNA");
    System.out.println("2. DOS");

    opc = sc.nextInt();

    if(opc == 1){
    System.out.println("En total tienes " + total + " euros.");
    System.out.println("Ingresa el dinero que quieras gastar de las tarjetas:");

    gastar = sc.nextInt();

    total = total - gastar; 

    System.out.println("Has gastado " + gastar + " euros, te quedan " + total + " euros." );
    }else{
        System.out.println("Cual de las dos tarjetas quieres gastar?");
        System.out.println("1. Tarjeta numero uno: " + saldo1 + " $");
        System.out.println("Tarjeta numero dos " + saldo2 + " $");
    }
}

}

