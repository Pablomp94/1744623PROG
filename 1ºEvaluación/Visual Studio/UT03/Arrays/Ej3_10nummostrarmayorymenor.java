//Pablo Morales Puertas NRE: 1744623//
//Crear array meter 10 num, mostrarlos y poner el mayor y el menor//

import java.util.Scanner;

public class Ej3_10nummostrarmayorymenor {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            //Variables//

        int i, mayor, menor;

        i = 0; 

        mayor = 0;

        menor = 1000000;

        int[] num = new int[10];
        
            //Codigo//

        for(i = 0; i <= 9; i++){

            System.out.println("Introduce el valor " + (i + 1) + " :");

            num[i] = sc.nextInt();

            if(num[i] > mayor){

                mayor = num[i]; 
            }

            if(num[i] < menor){

                menor = num[i];
            }
        }

        System.out.println("El numero mayor es : " + mayor);

        System.out.println("El numero menor es : " + menor);
    }
}
