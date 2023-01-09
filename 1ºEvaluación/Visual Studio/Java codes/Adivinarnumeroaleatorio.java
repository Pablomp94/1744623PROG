import java.util.Scanner;

public class Adivinarnumeroaleatorio{
    
public static void main(String[] args) {

    //Introducir presentacion y numero aleatorio//

    System.out.println("Estoy pensando en un numero del 1 al 10");
    System.out.println("Intenta adivinarlo");

    int aleatorio = 5;

    Scanner sc = new Scanner(System.in);

    int numero;

    int fallos = 0; 
    
    numero = sc.nextInt();

    
    while (numero != aleatorio && fallos<9){

        if (numero > aleatorio){

            System.out.println("El numero introducido es mayor al numero a adivinar");
        }
        
        if (numero < aleatorio){
            
            System.out.println("El numero introducido es menor al numero a adivinar");
        }

        System.out.println("Vuelvelo a intentar");

        fallos++;

        System.out.println("De momento tienes " + fallos + " fallos.");
        
        numero = sc.nextInt();
    }

    if (numero == aleatorio){

        System.out.println("Acertaste en " + fallos + " fallos.");
    }

    if (fallos == 9){

        System.out.println("Fallaste la prueba por alcanzar el numero maximo de fallos (10).");
    }

}



}
