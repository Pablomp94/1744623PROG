//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para unir dos ArrayList.//

import java.util.*;

public class Ej15 {
    public static void main(String[] args) {
        ArrayList<String> list1 =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));
        ArrayList<String> list2 =  new ArrayList<> (List.of("Carmen", "Jesus", "Sergio", "Ivan"));

        //Para ello voy a hacer un bucle en el que va cogiendo uno por uno los valores de una lista y poniendolos en la otra//

        System.out.println("  ");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("  ");


        for(int i = 0; i < list2.size(); i++){
            String palabra = list2.get(i);
            list1.add(palabra);
        }
        System.out.println(list1);
    }
}
