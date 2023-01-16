//Pablo Morales Puertas NRE: 1744623//
//Introduir array con 100 numeros  aleatorios con numeros entre 0 y 10, introducir valor N, mostrar en que posiciones aparece el valor N en el array//

import java.util.*;

public class Ej4 {
    public static void main(String[] args) {
        
        //variables//

        Scanner sc = new Scanner(System.in);

        int i, n;

        Random random = new Random();

        int numaleatorio[] = new int[100];

        //Codigo//
            //Introducir valores al array//
        for(i=0; i<100; i++){

            numaleatorio[i] = (1 + random.nextInt(10));
           //System.out.println(i + " " +numaleatorio[i]);
            
        }
            //Pedir numero//
        System.out.println("Introduce un numero positivo del 0 al 10");

        n = sc.nextInt();

            //Calcular posicion//

        System.out.println("El numero introducido coincide con el array en las posiciones:");

        for(i=0; i<100;i++){

            if(n == numaleatorio[i]){
                System.out.println(i);
            }
        }

        

    }
}
