//Pablo Morales Puertas NRE:1744623//
//Crear dos arrays, uno con los valores del 1 al 100 y otro que sea el inverso del primer array//

import java.util.*;

public class Ej5 {
    
    public static void main(String[] args) {
     
        int array[] = new int[100]; 

        for(int i = 0; i < array.length; i++){

            array[i] = (i + 1);

        }
        System.out.println("De 1 a 100:");
        System.out.println(Arrays.toString(array));
        System.out.println("*********************************************************************************************************************************************************************************************************");
        System.out.println("*********************************************************************************************************************************************************************************************************");

        int inverso[] = new int[100];

        for(int i = 0; i < inverso.length; i++){

            inverso[i] = (100 - i);
        }
        System.out.println("De 100 a 1: ");
        System.out.println(Arrays.toString(inverso));
    }
}
