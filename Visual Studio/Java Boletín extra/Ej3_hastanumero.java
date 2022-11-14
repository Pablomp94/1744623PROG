//Pablo Morales Puertas NRE: 1744623//
//Introducir un numero menor de 100 y escribir el numero de numeros del 1 hasta ese numero//


import java.util.Scanner;

public class Ej3_hastanumero {
    

    public static void main(String[] args){

        
        //Pedir el numero a introducir//
        System.out.println("Introduce un numero menor o igual a 100 y mayor o igual a 1");


        int numero; 

        Scanner sc = new Scanner(System.in);

        int veces;

        veces = 0; 

        //Introducir numero//
        numero = sc.nextInt();


        int suma = 0; 

        //Bucle para la suma de numeros hasta el numero introducido y realizar la suma de dichos numeros//

        if(numero <= 100 && numero >= 1){

            while(veces <= numero){
             
            
                suma = suma + veces;
    
                System.out.println(veces);
                System.out.println(suma);
    
                veces ++;
            }
        }
        
        while(numero > 100 || numero < 1){

            System.out.println("Vuelve a introducir un numero entre 1 y 100");

            numero = sc.nextInt();
        
        }

        
        

        //Calcular sin contar ni 1 ni el numero introducido//
       
        int vecestotal;

        vecestotal = veces - 1; 

       
        //Resultado//
       
       
        System.out.println("Del 1 al " + numero +  " hay " + vecestotal + " numeros."); 

        System.out.println("Y la suma de todos estos numeros es de:");
        System.out.println(suma);


    }
}
