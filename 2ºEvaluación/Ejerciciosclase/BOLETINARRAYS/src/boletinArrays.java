import java.util.Arrays;
import java.util.Scanner;

public class boletinArrays {

    //variable estatica para definir el tamaño del aray
    private static int TAMANYO=10;
    // Guardo el array con el que voy a trabajar
    private int[] miArray = new int[TAMANYO];
    private int mayor;
    private int menor;
    
    public int[] rotarArray(int numeros[]) {
        
        int numeroActual = numeros[numeros.length-1];
        for (int i=numeros.length-1; i>0; i--) {                         
            numeros[i] = numeros[i-1];                
        }
        numeros[0] = numeroActual;
        return numeros;
        
    }

    public int[] generaArray () {
        int[] numeros = new int[] {8, 10, 2, 3, 5};
        return numeros;
    }

    public void funcion() {
       
    }
}