//Pablo Morales Puertas NRE: 1744623//
//Introducir 10 numeros y decir cuantos son positivos y cuantos negativos//




import java.util.Scanner;

public class Ej6_posynegatv{
    
    public static void main(String[] args){

     //Variables//

     int i;

     int numero;
 
     int contadornegativo;

     int contadorpositivo;
 
     i = 1;
 
        contadornegativo = 0;
        contadorpositivo = 0; 
 
     
     Scanner sc = new Scanner(System.in); 
     
    //Bucle //
    for(i = 1; i < 11; i ++){
 
         System.out.println("Introduce 1 numero");
 
         numero = sc.nextInt();
 
            if(numero < 0){
                 contadornegativo ++ ;
            }
    
            if(numero > 0){
                contadorpositivo ++;
            }
    }
    
    
     //Resultado//
    System.out.println("Has introducido un total de " + contadornegativo + " numeros negativos");

    System.out.println("Has introducido un total de " + contadorpositivo + " numeros positivos");




    }
}
