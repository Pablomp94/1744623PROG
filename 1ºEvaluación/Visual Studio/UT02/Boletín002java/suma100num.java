//Pablo Morales Puertas DNI: 1744623//
//Poner un numero positivo y sumar sus 100 numeros siguientes//

import java.util.Scanner;

public class suma100num {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            //Variables//

        int numero, tope, suma; 

        suma = 0;

            //Codigo//

        System.out.println("Introduce un numero para calcular la suma de sus 100 numeros siguientes");
        
        numero = sc.nextInt();
        
        
        tope = numero;
    

        while(numero <= -1){
            System.out.println("El numero introducido debe de ser positivo");

            numero = sc.nextInt();

        }

        
            
        for(tope = numero + 1 ; tope <= (numero + 100) ; tope ++){

            suma = tope + suma;

        }
        

    
        System.out.println(tope);
        System.out.println(suma);
        
        System.out.println("La suma de los 100 numeros entre " + numero + " y " + (tope -1) + " es " + suma); 
    }
}
