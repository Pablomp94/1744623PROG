import java.util.Scanner;
public class numeropares {
 
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        int i = 0;
    
        int contadorpares = 0;
    
        int numero;
    
        for (i=0; i<10; i++){
    
            System.out.println("Introduce el numero " + i + ": " + (numero = sc.nextInt()));
    
            if (numero % 2 == 0) {
    
                contadorpares ++;
            
            }
    
        }
    
        System.out.println("El numero de numeros pares introducidos es de " + contadorpares);
    }
}


