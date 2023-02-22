//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para actualizar un elemento de ArrayList específico por otro elemento dado.//

import java.util.*;

public class Ej5 {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(
      List.of("Pepe", "Juan", "Pedro", "Maria")
    );

    Scanner sc = new Scanner(System.in);

    int posc;
    String palabra;

    try {
      System.out.println(list);

      System.out.println("Introduce la posición a cambiar el valor");

      posc = sc.nextInt();

      System.out.println("Introduce la nueva palabra");

      palabra = sc.next();

      list.set(posc, palabra);

      System.out.println(list);
    } catch (Exception e) {
      System.out.println("Comprueba que el valor introducido sea valido");
    }
  }
}
