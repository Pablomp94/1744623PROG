//Pablo Morales Puertas     NRE: 1744623//
//Media de numeros , cuando se introduzca numero negativo para de poner numeros y realiza las cuentas//


import java.util.Scanner;

public class mediadenumerospositivos{
 
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        //variables//

        int numero, media, suma, lista;

    
        lista = 0;

        suma = 0; 

        numero = 0;

        do{
            System.out.println("Introduce una serie de numeros para realizar la media, cuando hayas finalizado escribe un numero negativo");

            numero = sc.nextInt();
            
            
            if(numero >= 0){
                lista ++;
            
                suma = numero + suma; 
            }
                
            

            System.out.println(suma);


            System.out.println(lista);
        
            
        }while(numero >= 0);

        media = suma / lista ; 

        System.out.println("La media de dichos numeros introducidos es de " + media);


    }
}