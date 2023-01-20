//Pablo Morales Puertas NRE: 1744623//

import java.util.*;

public class boletinArrays {
    
    //variable estatica para definir el tamaño del aray
    public static  int TAMANYO = 10;
    public static boletinArrays.miArray miBoletin;
    // Guardo el array con el que voy a trabajar
    public int[] miArray = new int[] {};

    
    Scanner sc = new Scanner(System.in);


    private  int i,menorArray, mayorArray, longit;


     //El constructor 
    public boletinArrays (int[] pepe) {
        miArray = pepe;
    }

   
    
    public void rotarArray() {

        int miarrayActual = miArray[miArray.length - 1];

        for(i = (miArray.length - 1); i > 0; i --){
            miArray[i] = miArray[i - 1];
        }    
        miArray[0] =  miarrayActual;
    }

    
    public void mediaArray(){

        int suma = 0;

        for(i = 0; i < TAMANYO; i++){

            suma = suma + miArray[i];
        }

        double division;
        division = (double)suma / (double)TAMANYO;

        System.out.println("La media es " + division);
    }


    public void mayorArray(){

        int mayor=-999999999;

        for(i=0; i < TAMANYO; i ++){

            if(miArray[i] > mayor){
                mayor = miArray[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }

    public void menorArray(){

        int menor = 999999999;

        for(i=0; i < TAMANYO; i++){

            if(miArray[i] < menor){
                menor = miArray[i];
            }
        }
        System.out.println("El numero menor es: " + menor);
    }

    public void modificarArray(){

        int pos, num; 

        System.out.println("Array inicial:");
        System.out.println(Arrays.toString(miArray)); 
        System.out.println("...............................");
        System.out.println("Introduce la posición a modificar:");
        pos = sc.nextInt();

        System.out.println("Introduce el numero a cambiar:");

        num = sc.nextInt();

        miArray[pos] = num;

        System.out.println(" ");
    }

    public void mostrarArray(){
        
        System.out.println("...............................");
        System.out.println("Array actual:");
        System.out.println(Arrays.toString(miArray));
        System.out.println("...............................");
    }

    public class miArray {
    }


}