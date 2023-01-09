//Pablo Morales Puertas NRE:1744623//
//Crear un programa que almacene numeros en un array y rotar las posiciones//

import java.util.Scanner;

public class Ej_1 {

public static void main(String[] args){

    int i; 

    i = 0;

    try (Scanner sc = new Scanner(System.in)) {
        int num[] = new int[15];

    System.out.println("Introduce 15 numeros");

        for( ; i < num.length; i ++){

            //System.out.println("Introduce el numero " +  + ":");
            num[i] = sc.nextInt();
        }

        //Rotamos valores//

        System.out.println("Rotamos valores:");

        System.out.println("(");

        System.out.println(num[14]);

        for(i = 0; i < 14; i++){

            System.out.println(num[(i)]);


        }

        System.out.println(")");
        
    }



    




    }
}
