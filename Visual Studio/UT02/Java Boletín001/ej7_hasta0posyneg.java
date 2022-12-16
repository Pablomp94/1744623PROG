//Pablo Morales Puertas NRE: 1744623//
//Introducir numeros y cuando numero = 0 romper bucle// 
//decir cuantos son positivos y cuantos negativos//





import java.util.Scanner;

public class ej7_hasta0posyneg{
    

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numeros y cuandointroduzcas 0 se romperá el bucle y te mostraré datos sobre los numeros introducidos anteriormente");

            //variables//

        int numero , i , contadorpositivo , contadornegativo;

        i = 0;

        contadorpositivo = 0;

        contadornegativo = 0; 
  
        numero = 1;
        
        //Bucle//
        while(numero!=0){

            numero = sc.nextInt();

            if(numero > 0){

                contadorpositivo ++;
            }

            if(numero < 0){

                contadornegativo ++;
            }

        }

            //Resultado//
        System.out.println("Has introducido un total de " + contadornegativo + " numeros negativos");

        System.out.println("Has introducido un total de " + contadorpositivo + " numeros positivos");

    }


}
