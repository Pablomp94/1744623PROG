//Pablo Morales Puertas NRE: 1744623//

import java.util.Scanner;

public class Ej2_ArrayN_M {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num[], n, m, i, cont, tope;

        cont = -1;

        num = new int[cont];

        System.out.println("Introduce la cantidad de numeros a introducir");

        n = sc.nextInt();


        System.out.println("Introduce los numeros, solo se almacenaran los multiplos del numero de valores a introducir");

        for(i = 0; i <=  n ; i++){

            m = sc.nextInt();

            int resto = m % n;

            if((resto == 0)){
                
                cont = cont + 1;

                num[cont] = m;                                 
            }

        }

        tope = cont;
        
        System.out.println("Los valores validos introducidos son:");
        
        for(cont = 0; cont <= tope ; cont++){

            System.out.println(num[cont]);

        }  


    }
}
