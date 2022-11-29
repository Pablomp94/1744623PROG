//Pablo Morales Puertas NRE: 1744623//
//Introducir P y Q, poner en un array desde P a Q// 



import java.util.Scanner;

public class Ej7_arraydesdepaq {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

                //Variables//
            
        int p , q , i ;

        i = 0; 

        System.out.println("Introduce un numero inicial");

        p = sc.nextInt();

        System.out.println("Introduce un numero de limite");

        q = sc.nextInt();

        System.out.println("Se mostrará los valores entre " + p + " y " + q);

        int[] num = new int[(q - p) + 2];
        
                //Codigo//

        for( ;p <= q; i ++ ){

            num[i] = p;

            System.out.println(num[i]);

            p ++; 
        }
    }
}
