//Pablo Morales Puertas NRE: 1744623//

import java.util.*;

public class boletinArrays {

    //variable estatica para definir el tamaño del aray
    private static int TAMANYO=10;
    // Guardo el array con el que voy a trabajar
    private int[] miArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    Scanner sc = new Scanner(System.in);


    private  int i,menorArray, mayorArray;
    

    
    public void rotarArray() {

        System.out.println("Introduce el numero a desplazar el Array");

        int numero;

        numero = sc.nextInt();

        for (i=miArray.length-numero; i>0; i--) {                         
            miArray[i] = miArray[i+numero];                
        }
                
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


}