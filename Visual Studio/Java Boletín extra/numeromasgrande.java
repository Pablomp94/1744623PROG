//Pablo Morales Puertas NRE: 1744623//
//Mostrar el numero mas grande de 10 pedidos//

import java.util.Scanner;

public class numeromasgrande {

    public static void main(String[] args){


        System.out.println("Introduzca 10 numeros");

        Scanner sc = new Scanner(System.in);

        int veces = 0;

        int numero, mayor, contador;

        contador = 0;
        mayor = 0;
        
        for(contador = 0; contador < 11; contador ++){
            numero = sc.nextnt();

            if(numero > mayor){

                mayor = numero;

                contador ++;
            }

        }
        
        System.out.println("El numero mas grande introducido es: " + mayor);


    }
}