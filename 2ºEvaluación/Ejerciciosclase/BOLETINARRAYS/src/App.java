//Pablo Morales Puertas NRE: 1744623//

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        boletinArrays miBoletin = new boletinArrays();
        Scanner sc = new Scanner (System.in);
        int opcion=-1;
        do {
            System.out.println("******************************");
            System.out.println("*     METODOS DE ARRAYS      *");
            System.out.println("******************************");

            //Introducir el Array con valores que el cliente escoja//
            
            //miBoletin.crearArray();

            //Programa//

            System.out.println("ESCRIBE TU OPCIÓN:"); 
            System.out.println("1: Desplazar el ARRAY");
            System.out.println("2: Obtener el mayor valor del ARRAY");
            System.out.println("3: Obtener el menor valor del ARRAY");
            System.out.println("4: Modificar un valor del ARRAY");
            System.out.println("5: Obtener la media de los valores del ARRAY");
            System.out.println("6. Mostrar ARRAY");
            System.out.println("0: SALIR");
            opcion = sc.nextInt();
            switch  (opcion) {
                case 1:
                System.out.println("has elegido 1");
                System.out.println(" ");
                miBoletin.rotarArray();
                System.out.println("_________________________");
                break;
                case 2:
                System.out.println("has elegido 2");
                System.out.println(" ");
                miBoletin.mayorArray();
                System.out.println("_________________________");
                break;
                case 3:
                System.out.println("has elegido 3");
                System.out.println(" ");
                miBoletin.menorArray();
                System.out.println("_________________________");
                break;
                case 4:
                System.out.println("has elegido 4");
                System.out.println(" ");
                miBoletin.modificarArray();
                System.out.println("_________________________");

                break;
                case 5:
                System.out.println("Has elegido 5");
                System.out.println(" ");
                miBoletin.mediaArray();
                System.out.println("_________________________");
                break;
                case 6:
                System.out.println("Has elegido 6");
                System.out.println(" ");
                miBoletin.mostrarArray();
                System.out.println("_________________________");
                break;
                default:
                break;
            }
            
        } while (opcion!=0);
        System.out.println(" ");
        System.out.println("Salistes");
        
    }
}