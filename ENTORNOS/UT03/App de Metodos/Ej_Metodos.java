import java.util.*;

public class Ej_Metodos {

  Scanner sc = new Scanner(System.in);

  public void capicua(int num) {}

  public void primo(int num) {
    int contprim = 0;

    for (int i = 1; i <= num; i++) {
      if ((num % i) == 0) {
        contprim++;
      }
    }

    if (contprim == 2) {
      System.out.println("El numero es primo");
    } else {
      System.out.println("El numero no es primo");
    }
  }

  public void sigprimo(int num) {
    int sigprimo = 0;

    int contprim = 0;

    int i; 

    for(i = (num + 1); i < sigprimo; i++) {
      if ((num % i) == 0) {
        contprim++;
      }
    }
    if (contprim == 2) {
      System.out.println("El siguiente numero primo es: " + sigprimo);
    }
  }

  public void potencia() {
    System.out.println("Introduce la base de la potencia:");

    int base = sc.nextInt();
    System.out.println(" ");
    System.out.println("Introduce el exponente de la potencia:");

    int exponente = sc.nextInt();
    System.out.println(" ");

    int resultado = 1;
    for (int i = 0; i < exponente; i++) {
      int potencia = base * resultado;
      resultado = potencia;
    }
    System.out.println("La potencia es: " + resultado);
  }

  public void digitos() {
    int contdig = 0;

    System.out.println("Introduce un numero para calcular sus digitos: ");

    int num = sc.nextInt();

    for (int div; num >= 1; num = div) {
      div = num / 10;

      contdig++;
    }
    System.out.println("El numero tiene " + contdig + " digitos");
  }
}
