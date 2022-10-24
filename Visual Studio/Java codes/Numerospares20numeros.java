//Dentro del 1 al 20; mostrar los numeros pares a partir de un bucle//

import java.util.Scanner;

public class Numerospares20numeros{

    public static void main(String[] args){

    int numero = 0;

    while (numero <= 20){

        if (numero % 2 == 0 ){

            System.out.print(numero + " / ");
        }
    
        numero++;
    }
    
    }
}
