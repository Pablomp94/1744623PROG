//Pablo Morales Puertas NRE: 1744623//
//Declarar 5 variables de tipo char. A continuación, Realiza otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. //

import java.util.*;

public class Ej1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String palabrastring = "coche";

    char char1 = palabrastring.charAt(0);

    char char2 = palabrastring.charAt(1);

    char char3 = palabrastring.charAt(2);

    char char4 = palabrastring.charAt(3);

    char char5 = palabrastring.charAt(4);

  
    
    char[] palabra = {char1 , char2 , char3, char4, char5};

    String cadena = new String(palabra);

    System.out.println(cadena);

    //No deja convertir de tipo char a string por lo que habrá que hacer una conversión// 
  }
}
