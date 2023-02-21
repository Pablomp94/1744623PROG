//Pablo Morales Puertas NRE: 1744623//
//Escribe un programa Java para crear un nuevo ArrayList, agregue algunos colores (cadena) e imprima la colección.//

import java.util.*;

public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        int opcion = 1;
        String color;
        
        do{
            System.out.println("1.Añadir a la lista un color");
            System.out.println("2.Mostrar lista");
            System.out.println("0.Salir");

            opcion = sc.nextInt();

            if(opcion == 1){
                
                System.out.println("Introduce el color que le quieras agregar al arraylist");

                color = sc.nextLine();
                
                list.add(color);
            }
            else{
                System.out.println(list);
            }
            
        }while(opcion != 0);


    }
}
