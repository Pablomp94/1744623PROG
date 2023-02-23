//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para mezclar elementos en un ArrayList.//

import java.util.*;

public class Ej10 {
    public static void main(String[] args) {
     
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));

        do{
            System.out.println(list);
            System.out.println("1.Elegir la palabra a cambiar");
            System.out.println("2.Introducir la posicion a cambiarla");
            
            int opcion = sc.nextInt();
            
            if(opcion == 1){
                System.out.println("");
            }
        }
    }
}
