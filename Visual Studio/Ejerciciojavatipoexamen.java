//Pablo Morales Puertas NRE: 1744623//
//Numeros positivos y cuando 0 poner pares y mult de 3//
//Fecha: 15/11/2022//

import java.util.Scanner;

public class Ejerciciojavatipoexamen {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Introducir numeros positivos cuando 0 fin//

        System.out.println("Introduce numeros positivos y cuando 0 fin");


            //variables//

        int numero, par, mult3;

        par = 0;

        mult3 = 0;

        numero = 1; 
        
            //Bucle//

        while(numero != 0){

            numero = sc.nextInt();

            if(numero<0){
                System.out.println("El numero introducido no es valido debido a que es negativo");
            }

            if(numero > 0){

                if(numero%2 == 0){
                  par ++;
                }
        
                if(numero%3 == 0){
                    mult3 ++;
                }
            }
        }

        System.out.println("Has introducido " + par + " numeros pares y " + mult3 + " numeros que son multiplos de 3");

    }
}
