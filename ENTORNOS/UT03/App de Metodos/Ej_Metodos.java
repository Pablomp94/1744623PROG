public class Ej_Metodos {

  public void capicua(int num) {
  }

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
    int sigprimo, i;

    int contprim = 0;

    i = 1;

    sigprimo = (num + 1);

    do {
      for (; i <= sigprimo; i++) {
        if ((sigprimo % i) == 0) {
          contprim++;
        }
      }

      if (contprim == 2) {
        System.out.println("El siguiente numero primo es: " + sigprimo);
      } else {
        sigprimo = sigprimo + 1;
        contprim = 0;
        i = 1;
      }
    } while (contprim != 2);

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

  public Integer voltea(int number) {
    String numero = String.valueOf(number);

    int longtd = numero.length();

    int volteado = 0;

    for (int i = 0; i <= longtd; i++) {

      volteado = numero.charAt(longtd - i);

    }

    System.out.println(volteado);

    return number;

  }

  public Integer digitoN(int num, int pos) {

    String numero = String.valueOf(num);

    char c1 = numero.charAt((pos - 1));

    System.out.println("El digito es:");

    System.out.println(c1);

    return num;

  }

  public Integer posicionDeDigito(int num) {
    return num;
  }

  public Integer quitaPorDetras(int num, int n) {

    String numero = String.valueOf(num);

    int longt = numero.length();

    String numero1 = numero.substring(0, (longt - n));

    System.out.println("El numero restante es:");
    System.out.println(numero1);

    return num;

  }

  public Integer quitaPorDelante(int num, int n) {

    String numero = String.valueOf(num);

    int longt = numero.length();

    String numero1 = numero.substring((longt - n) ,  longt);

    System.out.println("El numero restante es:");
    System.out.println(numero1);

    return num;

  }

}
