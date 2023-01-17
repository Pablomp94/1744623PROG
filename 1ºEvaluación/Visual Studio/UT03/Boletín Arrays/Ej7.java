//Pablo Morales Puertas NRE: 1744623//
//20 numeros, 10 un array y 10 para otro, luego compararlos y decir si son iguales o no//

import java.util.*;

public class Ej7 {
    
    public static void main(String[] args) {
     
        System.out.println("Introduce 20 numeros");

        Scanner sc = new Scanner(System.in);

        int i, prinum, segnum, cont;

        cont = 0;

        int[] arrayuno = new int[10];

        int[] arraydos = new int[10];

        for(i=0; i < 10; i++){

            prinum = sc.nextInt();

            arrayuno[i] = prinum;

        }

        for(i=0; i < 10; i++){

            segnum = sc.nextInt();

            arraydos[i] = segnum;

        }
        
        for(i=0; i<10; i++){

            if(arrayuno[i] == arraydos[i]){
                cont ++;
            }

        }

        System.out.println(Arrays.toString(arrayuno));
        System.out.println(Arrays.toString(arraydos));

        if(cont == 10){
            System.out.println("Los arrays son iguales");
        }else{
            System.out.println("Tiene en común " + cont + " numeros");
        }
    }
}
