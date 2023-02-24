//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para recuperar un elemento (en un índice especificado) de un ArrayList determinado.//

import java.util.*;

public class Ej4 {

  public static void main(String[] args) {
    int posc;

    Scanner sc = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>(
      List.of("Pepe", "Juan", "Pedro", "Maria")
    );

    try {
      System.out.println(list);

      System.out.println("Introduce la posicion de la palabra a mostrar");

      posc = sc.nextInt();

      String palabra = list.get(posc);

      System.out.println("La palabra de la posicion " + posc + " es:");
      System.out.println(palabra);
    
    } catch (Exception e) {
      System.out.println(
        "El valor introducido no es correcto, compruebe que el numero esté entre 0 y 3"
      );
    }
  }
}
