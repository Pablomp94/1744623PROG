//Pablo Morales Puertas NRE: 1744623//
//Introducir numeros pares e impares del 100 al 200 y sumarlos// 



import java.util.Scanner;

public class Ej9_Sumaparimpar {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

    
    
    //Variables//

    int numero, par, impar, mayorpar, mayorimpar;

    

    mayorpar = 0;

    mayorimpar = 0;

        for(numero = 100; numero <= 200; numero ++){
            
            if(numero % 2 == 0){

                par = numero + mayorpar;

                mayorpar = par;
            }

            else{

                impar = numero + mayorimpar;
                
                mayorimpar = impar;
            }

        }
    
        System.out.println("La suma total de los pares es de " + mayorpar);
        System.out.println("La suma total de los impares es de " + mayorimpar);
    
    
    }

}
