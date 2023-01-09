
//import java.util.Random;
import java.util.Scanner;

public class Ej11_Adivnum {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        //Random nuRandom = new Random(); 

        //variables//


        int random, numero, respuesta, tope;

        System.out.println("Introduce un numero del 1 al 100 y la máquina intentará adivinarlo, tendrás que ayudarle para que pueda hacertar");

        numero = sc.nextInt(); 


        respuesta = 0; 



        
        for( ; respuesta < 3; ){
        
            random = (int) (Math.random() * 101 + 1); 

            System.out.println(random);

            System.out.println("Introduce 1 para numero mayor o  2 si el  numero  es menor");

            respuesta = sc.nextInt();
        
            tope = random;


            if(respuesta == 1){

                random = (int) (Math.random() * 100 + tope);

                System.out.println(random);

                System.out.println("Introduce 1 para numero mayor o  2 si el  numero  es menor");

                respuesta = sc.nextInt();

                tope = random;
            }

            if(respuesta == 2){

                random = (int) (Math.random() * tope + 1);;

                System.out.println(random);

                System.out.println("Introduce 1 para numero mayor o  2 si el  numero  es menor");

                respuesta = sc.nextInt();
           
                tope = random;
            }

        }

        System.out.println("El numero a sido adivinado");

    }

        



}
