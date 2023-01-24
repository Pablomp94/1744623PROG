import java.util.*;

public class Tarjetas {
 
    Scanner sc = new Scanner(System.in);

    private int saldo1, saldo2, saldo3, gastar;
    

public void getSaldo1(int saldo1){
}

public void getSaldo2(int saldo2){
}

int total = saldo1 + saldo2;

public void gastarsaldo(){

    System.out.println("En total tienes " + total + " euros.");
    System.out.println("Ingresa el dinero que quieras gastar de las tarjetas:");

    gastar = sc.nextInt();

    total = total - gastar; 

    System.out.println("Has gastado " + gastar + " euros, te quedan " + " euros." );

}

}

