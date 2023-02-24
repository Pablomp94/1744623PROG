//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para insertar un elemento en la ArrayList en la primera posición.//

import java.util.*;

public class Ej3 {

  public static void main(String[] args) {
    String palabra;

    int opc;

    Scanner sc = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>(
      List.of("Pepe", "Juan", "Pedro", "Maria")
    );

    do {
      System.out.println("1.Añadir nueva palabra al inicio del arraylist");
      System.out.println("2.Ver arraylist");
      System.out.println("0.Salir");

      opc = sc.nextInt();

      if (opc == 1) {
        System.out.println("Introduce la palabra");
        palabra = sc.next();
        list.add(0, palabra);
      }
      if (opc == 2) {
        System.out.println(list);
      }
    } while (opc != 0);
  }
}
