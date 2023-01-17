//Pablo Morales Puertas NRE: 1744623//
//Array de tamaño 1000 con valores aleatorios entre 0 y 99, pedir un numero y mostrar cuantas veces aparece ese numero en el array//

import java.util.*;

public class Ej8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, cont;

        int[] array = new int[1000];

        for(int i = 0; i < array.length; i++){

            array[i] = Math.random() * 1000; 
        }

        System.out.println("Introduce un valor del 0 al 99");

        n = sc.nextInt();

        for(int i = 0; i < array.length; i ++){

            if(array[i] == n){
                cont ++;
            }

        }
        
        if(cont > 0){
            System.out.println("El valor " + n + " se repite " + cont + " veces.");
        }else{
            System.out.println("El valor no se repite ninguna vez");
        }
    }
}
