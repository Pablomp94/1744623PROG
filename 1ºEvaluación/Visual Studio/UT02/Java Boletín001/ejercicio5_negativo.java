//Pablo Morales Puertas NRE: 1744623//
//Introducir 10 numeros e identificar los numeros negativos//        


import java.util.Scanner;

public class ejercicio5_negativo{
    
    public static void main(String[] args){


    //Variables//

    int i;

    int numero;

    int contador;

    i = 1;

    contador = 0;


    
    Scanner sc = new Scanner(System.in); 
    
    //Bucle //
    for(i = 1; i < 11; i ++){

        System.out.println("Introduce 1 numeros");

        numero = sc.nextInt();

            if(numero < 0){
                contador ++ ;
            }
    }
    //Resultado//
    System.out.println("Has introducido un total de " + contador + " numeros negativos");



    }
}
