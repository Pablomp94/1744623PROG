//Pablo Morales Puertas NRE: 1744623//
//Realizar factorial de un numero//

import java.util.Scanner;

public class Ej4_Factorial {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero a factorizar");

        int numero, veces, mult1, factor;

        numero = sc.nextInt();

        veces = 1; 

       mult1 = numero;

        System.out.println("Realizando factorial de " + numero);

        if(numero>0){
            for(; veces == numero; veces ++){

                mult1 = (veces * veces);

            }

            factor = (numero * mult1); 
       
            System.out.println("El factor de " + numero + " es : " + factor);
        }
        else{
            System.out.println("Introduce un numero positivo");
        }
        






    }
}
