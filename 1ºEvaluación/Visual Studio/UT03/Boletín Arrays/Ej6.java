//Pablo Morales Puertas NRE: 1744623//
//Crear un array de 10 numeros enteros y realizar varias funciones//

import java.util.*;
public class Ej6 {
    
    public static void main(String[] args) {
     
        int opcion, num, pos;

        int array = new int[]{0,0,0,0,0,0,0,0,0,0};

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Mostrar Array");
        System.out.println("2. Cambiar valor");
        System.out.println("3. Salir");

        opcion = sc.nextInt();

        if(opcion == 1){
            System.out.println(Arrays.toString(array));            
        }

        if(opcion == 2){

            System.out.println("Selecciona la posición a cambiar (entre 0 y 9)");

            pos = sc.nextInt();

            System.out.println("Introduce un entero numero a cambiar");

            num = sc.nextInt();

            array[pos] = num; 

        }



    }
}
