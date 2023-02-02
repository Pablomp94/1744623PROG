public class Ej_Metodos {

  public void capicua(int num) {}

  public Integer primo(int num) {
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
    return contprim;
  }

  public Integer sigprimo(int num) {
    int sigprimo = 0;

    int contprim = 0;

    int i;

    for (i = (num + 1); i < sigprimo; i++) {
      if ((num % i) == 0) {
        contprim++;
      }
    }
    if (contprim == 2) {
      System.out.println("El siguiente numero primo es: " + sigprimo);
    }
    return i;
  }

  public Integer potencia(int base, int exponente) {
    
    int resultado = 1;
    for (int i = 0; i < exponente; i++) {
      int potencia = base * resultado;
      resultado = potencia;
    }
    System.out.println("La potencia es: " + resultado);
    return resultado;
  }

  public Integer digitos(int numdig) {
    int contdig = 0;

    for (int div; numdig >= 1; numdig = div) {
      div = numdig / 10;

      contdig++;
    }
    System.out.println("El numero tiene " + contdig + " digitos");
    return contdig;
  }
}
