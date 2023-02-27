//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para extraer una parte de una ArrayList.//

import java.util.*;

public class Ej12 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>(
      List.of("Pepe", "Maria", "Juan", "Jose", "Pedro")
    );
    try {
      System.out.println(list);

      System.out.println(
        "Introduce hasta que elemento quieres eliminar del arrayList, incluyendose este"
      );

      int pos = sc.nextInt();

      for (int i = 0; i < pos; i++) {
        list.remove(0);
      }

      System.out.println(list);
    } catch (java.lang.IndexOutOfBoundsException e) {
      System.out.println(
        "Ha ocurrido un error, compruebe los valores introducidos"
      );
    }
  }
}
