import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boletinArrays miBoletin = new boletinArrays();
        Scanner sc = new Scanner (System.in);
        int opcion=-1;
        do {
            //System.out.print("\033[H\033\2J");
            System.out.println("******************************");
            System.out.println("*  BOLETIN DE EJERCICIOS 03  *");
            System.out.println("*    JOAQUIN RIOS VELASCO    *");
            System.out.println("******************************");
            System.out.print("ESCRIBE EL NUMERO DE EJERCICIO A" 
            + " EJECUTAR (1-6 , 0 -> SALIR): ");
            opcion = sc.nextInt();
            if (opcion == 1 ) {
                Scanner entrada = new Scanner(System.in);
                int numeros[] = new int[10];

                for (int i=0; i<numeros.length ; i++) {
                    numeros[i] = entrada.nextInt();
                }
                System.out.println(Arrays.toString(numeros));
                int resultado[] = miBoletin.ejercicioUno(numeros);
                System.out.println(Arrays.toString(resultado));
            }
            if (opcion == 3 ) {
                miBoletin.ejercicioTres(numeros);
            }
        } while (opcion!=0);
        

        
    }
}
