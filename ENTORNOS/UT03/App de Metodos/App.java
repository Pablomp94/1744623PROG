import java.util.*;

public class App {

  public static void main(String[] args) {
    Ej_Metodos Metodo = new Ej_Metodos();

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un numero entero");

    int num;
    num = sc.nextInt();

    //Metodo.capicua(num);

    Metodo.primo(num);

    Metodo.sigprimo(num);

      //Potencia//
    System.out.println("Introduce la base de la potencia:");

    int base = sc.nextInt();
    System.out.println(" ");
    System.out.println("Introduce el exponente de la potencia:");

    int exponente = sc.nextInt();
    System.out.println(" ");

    Metodo.potencia(base, exponente);

        //Digitos//
    System.out.println("Introduce un numero para calcular sus digitos: ");

    int numdig = sc.nextInt();

    Metodo.digitos(numdig);
  }
}
