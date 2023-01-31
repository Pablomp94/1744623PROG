import java.util.*;

public class App {

  public static void main(String[] args) {
    Ej_Metodos Metodo = new Ej_Metodos();

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un numero entero");

    int num = sc.nextInt();

    //Metodo.capicua(num);

    //Metodo.primo(num);

    //Metodo.potencia();

    Metodo.digitos();
  }
}
