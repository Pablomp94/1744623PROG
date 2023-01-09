//Dentro del 1 al 20; mostrar los numeros pares a partir de un bucle//

import java.util.Scanner;

public class Numerospares20numeros{

    public static void main(String[] args){

   System.out.println("Introduce el numero para calcular sus pares en sus proximos 20 numeros");
   
    Scanner sc = new Scanner(System.in);
    
    int numero = sc.nextInt();

    int limite = numero + 20;
    while (numero <= limite){

        if (numero % 2 == 0 ){

            System.out.print(numero + " / ");
        }
    
        numero++;
    }
    
    }
}
