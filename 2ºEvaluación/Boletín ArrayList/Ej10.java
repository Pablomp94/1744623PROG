//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para mezclar elementos en un ArrayList.//

import java.util.*;

public class Ej10 {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(
      List.of("Pepe", "Maria", "Juan", "Jose", "Pedro")
    );

    //Con el metodo collections.shuffle cambia aleatoriamente la posicion del arraylist//

    System.out.println(list);

    Collections.shuffle(list);

    System.out.println(list);
  }
}
