//Pablo Morales Puertas NRE:1744623//
//Escribe un programa Java para invertir elementos en una ArrayList.//

import java.util.*;

public class Ej11 {
    public static void main(String[] args) {
        
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        //Este metodo invierte las valores del arrayList//

        Collections.reverse(list);

        System.out.println(list);
    }
}
