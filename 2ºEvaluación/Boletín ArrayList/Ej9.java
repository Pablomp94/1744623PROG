//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para copiar un ArrayList en otro.//

import java.util.*;

public class Ej9 {
    public static void main(String[] args) {
     
        try{
        ArrayList<String> list =  new ArrayList<> (List.of("Pepe", "Maria", "Juan", "Jose" , "Pedro"));
        ArrayList<String> list2 = new ArrayList<> ();

        System.out.println("El primer arrayList:");
        System.out.println(list);

        System.out.println(" ");

        //Vamos a copiarlo con la funcion addAll , que sirve para copiar directamente todos los valores de un arraylist a otro//
        System.out.println("El segundo arrayList:");
        list2.addAll(list);

        System.out.println(list2);
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error");
        }
    }
}
