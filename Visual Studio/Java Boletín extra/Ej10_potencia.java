//Pablo Morales Puertas NRE: 1744623//
//Introducir programa que calcule una potencia sin usar la potencia// 




import java.util.Scanner;

public class Ej10_potencia {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);


        //variable//

        int numero, potencia, elevado, tope, resultado ;

        System.out.println("Introduce un numero para calcular su potencia");

        numero = sc.nextInt();

        System.out.println("Introduce un numero para elevar el anterior numero");

        elevado = sc.nextInt();
        
        resultado = 1;
        
        tope = 0; 
        
        potencia = 0; 

        for( ; tope < elevado; tope ++){

            potencia = numero * resultado;

            resultado = potencia;  

        }

        System.out.println("La potencia de " + numero + " elevado a " + elevado + " es igual a " + potencia);


    }
}
