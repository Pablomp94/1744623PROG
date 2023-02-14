public class Ej_Metodos {

  public void capicua(int num) {

    int number = num;

    String numero = String.valueOf(number);

    StringBuilder reverso = new StringBuilder();

        for (int i = (numero.length() - 1); i >= 0; i--){
			reverso.append(numero.charAt(i));

		}
    String numerofinal = reverso.toString();
    

    if(numerofinal.equals(numero)){
      System.out.println("El numero es capicua");
    }else{
      System.out.println("No es capicua");
    }

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

  public String voltea(int number) {
    String numero = String.valueOf(number);

    StringBuilder reverso = new StringBuilder();

        for (int i = (numero.length() - 1); i >= 0; i--){
			reverso.append(numero.charAt(i));

		}
    String numerofinal = reverso.toString();

    return numerofinal;

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

  public Integer añadirFinal(int num, int añadido){
    
    String numero = String.valueOf(num);

    String añadido1 = String.valueOf(añadido);
    
    String numeroFinal = numero + añadido1;

    Integer numeroFinalint = Integer.valueOf(numeroFinal);

    System.out.println("El numero resultante es: " + numeroFinalint);
    
    return añadido;
  }


  public Integer añadirInicio(int num, int añadido){
    
    String numero = String.valueOf(num);

    String añadido1 = String.valueOf(añadido);
    
    String numeroFinal = añadido1 + numero;

    Integer numeroFinalint = Integer.valueOf(numeroFinal);

    System.out.println("El numero resultante es: " + numeroFinalint);
    
    return añadido;
  }


}
