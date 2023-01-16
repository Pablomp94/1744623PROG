//Pablo Morales Puertas NRE:1744623//
//Crear array de 50 digitos aleatoios double de 0.0 a 1.0, introducir numero R y decir cuantos numeros son mayores e iguales//

import java.util.Scanner;

public class Ej3 {
    
    public static void main(String[] args) {
        
        //Inicianizamos variables//
        Scanner sc = new Scanner(System.in);

        double r; 

        double numaleatorio[] = new double[50];

        int i, contadormayor, contadorigual;

        contadormayor = 0;
        contadorigual = 0;

        //Codigo//

                //Introducimos los numeros aleatorios en el array//
        for(i=0; i<50; i ++){

            numaleatorio[i] = Math.random();
            //System.out.println(i + " " + numaleatorio[i]);

        }

            //Introducir el valor del cliente//

        System.out.println("Introduce un numero decimal del 0 al 1");

        r = sc.nextDouble();

            //Mostrar numeros mayores o iguales al del array//
        
        int x = 0;

        for(x=0; x<50; x++){

            if(r < numaleatorio[x]){

                contadormayor ++;
            }

            if(r == numaleatorio[x]){

                contadorigual ++;
            }
        }

            System.out.println("En el array aleatorio tiene " + contadormayor + " numeros superiores al valor introducido");
            System.out.println("El valor introducido coincide con un numero del array  " + contadorigual + " vez/veces");
        
    }
}
