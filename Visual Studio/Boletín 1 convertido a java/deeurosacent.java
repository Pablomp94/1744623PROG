//Hecho por: Pablo Morales Puertas NRE: 1744623
//
//
//

import java.util.Scanner; 
    public class deeurosacent 
    {
        
    public static void main(String[] args)
    {
    System.out.println("Introduzca la cantidad de euros a convertir");

    Scanner sc = new Scanner(System.in);
        
    double numero;
    double centimos;
    numero = sc.nextDouble();
        
    centimos = numero * 100;

    System.out.println(numero + "euros equivalen a " + centimos + " centimos");


    }
    }
