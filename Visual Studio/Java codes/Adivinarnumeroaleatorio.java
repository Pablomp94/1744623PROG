import java.util.Scanner;

public class Adivinarnumeroaleatorio{
    
public static void main(String[] args) {

    //Introducir presentacion y numero aleatorio//

    System.out.println("Estoy pensando en un numero del 1 al 10");
    System.out.println("Intenta adivinarlo");

    int aleatorio = 5;

    Scanner sc = new Scanner(System.in);

    int numero;

    numero = sc.nextInt();

    
    while (numero != aleatorio){

        System.out.println("Vuelvelo a intentar");
        
        numero = sc.nextInt();
    }

    if (numero == aleatorio){

        System.out.println("Acertaste");
    }
}

}
