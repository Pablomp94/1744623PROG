import java.util.Arrays;
import java.util.Scanner;

public class boletinArrays {
    
    public int[] ejercicioUno(int numeros[]) {
        
        int numeroActual = numeros[numeros.length-1];
        for (int i=numeros.length-1; i>0; i--) {                         
            numeros[i] = numeros[i-1];                
        }
        numeros[0] = numeroActual;
        return numeros;
        
    }

    public int[] ejercicioTres(int numeros[]) {
            
            double numeros2[] = new double[10];
            double numero;
            int mayores=0;
    
            for (int i=0; i<numeros.length ; i++) {
                numeros2[i] = Math.random();
            }
            System.out.println("Valores creados->");
            System.out.println(Arrays.toString(numeros2));
    
            System.out.println("Introduce numero entre 0 y 1");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextDouble();
    
            for (int i=0; i<numeros2.length ; i++) {
                if (numeros2[i] >= numero) {
                    mayores++;
                }
            }
            System.out.println("Hay " + mayores +
            " numeros mayores de " + numero);
            
            entrada.close();
        }
    }

