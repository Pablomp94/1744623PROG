//Pablo Morales Puertas NRE: 1744623//
//Introducir si el numero es primo o no//

import java.util.Scanner;

public class numeroprimo {
    
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        
                //variables//

        int numero1, i, comprobacion, resto, tope, x;
    
        x = 1;           
        
        comprobacion = 0; 

        i =0;
        
                    //Codigo//
        System.out.println("Introduce cuantos numeros quieres introducir");
        
        tope = sc.nextInt();

        for( ; x <= tope; x ++){
            
            System.out.println("Introduce el numero a comprobar si es primo o no");
            
            numero1 = sc.nextInt();
            
                for(i=0; i <= numero1; i ++){

                    resto = numero1 % (i + 1); 
            
                    if(resto == 0){
                    comprobacion ++;
                    }

                    if((numero1 % 2 == 0) && (numero1 != 2)) {
                        comprobacion ++; 
                    }

                    i ++; 
                }
            
            if(comprobacion >= 3){
            System.out.println("El numero no es primo");
            }

            if(comprobacion <= 2){
            System.out.println("El numero es primo");
            }
        }
    }
}