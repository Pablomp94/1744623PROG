//Pablo Morales Puertas NRE:1744623//
//Ingresar la longitud del array y escribir en sus posiciones//


import java.util.Scanner;

public class Ej6_tamañoyposicionarray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

                //variables//
        
        int i, n, m;

        i = 0;

                //Codigo//

        System.out.println("Introduce la longitud del array (el numero de veces a introducir)");

        n = sc.nextInt(); 

        System.out.println("Introduce el numero que quieras que se introduzca en el array");

        m = sc.nextInt();

        int[] num = new int[n];

        System.out.println("--------------");
        System.out.println("Se va a introducir " + m + " ," +  n + " veces:");
        System.out.println("--------------");


        for( ; i <= (n - 1) ; i++ ){

            num[i] = m; 

            System.out.println(num[i]);

        }

    }
}
