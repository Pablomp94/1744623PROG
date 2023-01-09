//Pablo Morales Puertas NRE: 1744623//
//Introducir numeros, cuando num negativo parar, hacer media numeros impares, poner mayor de los pares//

import java.util.Scanner;

public class Ej7_mediaimparesmayorpares {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

                //variables//

        int num, numimp, mediaimp, mayorpar, sumaimp, contimp;

        mayorpar = 0;
        
        numimp = 0; 


                //codigo//

        System.out.println("Introduce una serie de numeros con los que operar");


        for( ;num >= 0; ){

            num sc = next.Int();

            if((num % 2 = 0) && (num > mayorpar)){

                mayorpar = num; 
            }
            else{
                
                contimp ++;
            
                sumaimp = sumaimp + num; 
            
            }
        }

        mediaimp = sumaimp / contimp;

        System.out.println("El par mayor introducido es: " + mayorpar);

        System.out.println("La media de impares es de: " + mediaimp);

    }
}
