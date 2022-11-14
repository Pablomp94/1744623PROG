//Pablo Morales Puertas NRE: 1744623//
//Mostrar el numero mas grande de 10 pedidos//

import java.util.Scanner;

public class Ej2_numeromasgrande {

    public static void main(String[] args){


        System.out.println("Introduzca 10 numeros");

        Scanner sc = new Scanner(System.in);

        int veces = 0;

        int numero, mayor, contador;

        mayor = 0;
        
        for(contador = 0; contador < 10; contador ++){
            
            numero = sc.nextInt();

            if(numero > mayor){

                mayor = numero;     
            }

        }
        
        System.out.println("El numero mas grande introducido es: " + mayor);


    }
}