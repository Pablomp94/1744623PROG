//Introducir un codigo , máximo 4 intentos , requisito = 4 cifras , codigo correcto desbloqueado //

import java.util.Scanner;

public class introducircodigojava1234{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

       
       //inicio//


       System.out.println("El codigo debe de tener 4 cifras y tienes 4 intentos ");
       
       
        //variables//

        int i, intentos, codigo; 

        i = 0;

        intentos = 1;

        codigo =0;

        
        
        //bucle//

        //for(i = 0 ; intentos < 5 || codigo <= 1234; ){
        do{
            
            System.out.println("Introduce el codigo ");

            codigo = sc.nextInt();

            do{

                if((codigo != 1234) && (codigo >= 1000 && codigo <= 9999)){

                    System.out.println("El codigo es erroneo");

                    System.out.println("Tienes " + intentos + " intentos ");
                
                
                
                    codigo = sc.nextInt();

                    intentos ++;
                
                }
            
            } while((codigo >= 1000 && codigo <= 9999) && (intentos < 4 && codigo != 1234));

            if(codigo > 9999 || codigo < 1000){

                System.out.println("El codigo es erroneo devido a que has introducido un numero de cifras no valido");

                System.out.println("Vuelve a introducir otro codigo");
    

                    

            }  
       
            
       
        } while(intentos < 4 && codigo != 1234);

            


        if(intentos > 3 || codigo != 1234){

            System.out.println("Has tenido demasiados intentos");
        }
       
        if(codigo == 1234){
            System.out.println("Has abierto la caja");
        }

    }
}