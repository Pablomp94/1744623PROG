//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para reemplazar el segundo elemento de un ArrayList con el elemento especificado.//

import java.util.*;

public class Ej21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        System.out.println(list);

        System.out.println("Introduce la posicion del arraylist a cambiar por la segunda posicion");

        int pos = sc.nextInt();

        String palabra = list.get(1);

        list.set(1, list.get(pos));
        list.set(pos, palabra);

        System.out.println(list);

    }
}

