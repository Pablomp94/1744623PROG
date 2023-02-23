//Pablo Morales Puertas NRE:1744623//
//Escribe un programa Java para ordenar un ArrayList dado.//

import java.util.*;

public class Ej8 {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(
      List.of("Pepe", "Maria", "Juan", "Jose", "Pedro")
    );

    System.out.println("Sin ordenar:");

    System.out.println(list);

    System.out.println(" ");
    //Ordenamos con la funcion sort//
    System.out.println("Ordenado alfabeticamente:");
    Collections.sort(list);
    System.out.println(list);
  }
}
