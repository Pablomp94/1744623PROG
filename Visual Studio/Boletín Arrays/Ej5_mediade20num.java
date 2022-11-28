//Pablo Morales Puertas NRE: 1744623//
//Introducir 20 numeros y hacer la media de dichos numeros//

import java.util.Scanner;

public class Ej5_mediade20num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

                //Variables//
        
        int i, suma, media;

        i = 0;

        suma = 0; 

        int[] num = new int[20];

                //Codigo//

        for( ; i <= 19; i++){

            System.out.println("Introduce el valor para el " + i +"º numero");

            num[i] = sc.nextInt();

            suma = suma + num[i]; 
        }
        
        media = suma / 20;

        System.out.println("La media de los 20 numeros introducidos es de : " + media);
    }
}
