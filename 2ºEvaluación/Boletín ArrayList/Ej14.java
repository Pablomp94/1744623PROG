//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para intercambiar dos elementos en un ArrayList.//

import java.util.*;

public class Ej14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list1 =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));
        ArrayList<String> list1invertida =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        System.out.println(list1);

        System.out.println("Introduce la primera posicion a cambiar, empezando por el 0");

        int primer = sc.nextInt();

        System.out.println("Introduce la segunda posicion a intercambiar, empezando por el 0");

        int segundo = sc.nextInt();

        String pos1 = list1.get(primer);
        String pos2 = list1.get(segundo);

        list1invertida.set(segundo, pos1);
        list1invertida.set(primer, pos2);

        System.out.println(list1invertida);

    }
}
