//Pablo Morales Puertas NRE: 1744623//
//Crear un contador del 1 al 200 que ponga solo los numeros pares sumandole 2. Haciendo uso del bucle for//

public class Ej1_numeroparlista{

    public static void main(String[] args){

    int numero = 1;

    int contador = 0;


    for(numero = 1; numero <= 200; numero ++){

        if(numero % 2 == 0){

            System.out.println(numero);
        
            contador ++;
    
        }
    }
    
    System.out.println("Hay un total de " +  contador + " numeros pares.");
    
    }
}