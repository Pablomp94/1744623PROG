//Pablo Morales Puertas NRE: 1744623//
//Crear array meter 10 num, mostrarlos y sumarlos//

import java.util.Scanner;

public class Ej2_10numyhacerlasumadelosnum {
    
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int i, suma;

    i = 0;

    suma = 0;

    int[] num = new int[10];

    for(i = 0; i <=9 ; i++){

        System.out.println("Introduce el valor " + (i + 1) + " :");

        num[i] = sc.nextInt();

        suma = num[i] + suma;
    }

    for(i = 0; i <= 9; i++){

        System.out.println("El valor " + (i+1) + " es " + num[i]);
    }
    
    System.out.println("La suma de estos numeros es:" + suma);

    }
}
