//Pablo Morales Puertas NRE: 1744623//
//Introducir 10 numeros, los cuales van a estar almacenados en un array y luego mostrarlos//x

import java.util.Scanner;

public class Ej1_10nummostrar {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i; 

        i = 0;

        

        int[] num = new int[10];

        

        for(i = 0; i <= 9; i++){

            System.out.println("Introduce el valor " + (i + 1) + " :");

            num[i] = sc.nextInt();

        }

        System.out.println("Valores:");

        for(i = 0; i <= 9; i++){
        
            System.out.println ("El valor " + (i+1) + " es " + (num[i]));
        }

    }
}
