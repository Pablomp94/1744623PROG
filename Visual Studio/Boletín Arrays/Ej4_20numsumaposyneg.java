//Pablo Morales Puertas NRE: 1744623//
//Introducir 20 numeros en un array y sumar los numeros positivos y negativos//

import java.util.Scanner;

public class Ej4_20numsumaposyneg {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

                //Variables//

        int i, sumapos, sumaneg;

        i = 0;

        sumapos = 0;

        sumaneg = 0;

        int[] num = new int[20];

                //Codigo//
        for(i = 0; i <= 19; i++){

            System.out.println("Introduce el valor " + ( i + 1 ) + ":");

            num[i] = sc.nextInt();

            if(num[i] > 0){
                sumapos = sumapos + num[i]; 
                
            }
            if(num[i] < 0){
                sumaneg = sumaneg + num[i];
                
            }
        }

        System.out.println("La suma de los numeros positivos introducidos es de :" + sumapos);
        System.out.println("La suma de los numeros negativos introducidos es de :" + sumaneg);

    }
}
