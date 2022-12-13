//Pablo Morales Puertas NRE: 1744623//
//Introducir 2 numeros: mostrar numeros entre dichos numeros//
import java.util.Scanner;

public class Ej6_numerosentredosnum{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

                //variables//

        int num1, num2, sol;

                    //Codigo//
        System.out.println("Introduce el numero inicial");

        num1 = sc.nextInt();

        while(num1 < 0){
            System.out.println("El numero introducido debe de ser positivo");

            num1 = sc.nextInt(); 
        }
        
        System.out.println("Introduce el numero final");

        num2 = sc.nextInt();
        
        while(num2 < 0 || num2 == num1){
            System.out.println("El numero introducido debe de ser positivo y distinto al anterior numero");
            num2 = sc.nextInt();
        } 

        sol = num1; 

        for( ; sol <= num2; sol ++){

            System.out.println(sol);
        }
    }
}
