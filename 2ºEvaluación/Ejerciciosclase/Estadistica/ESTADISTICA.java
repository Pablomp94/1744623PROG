import java.util.*;

public class ESTADISTICA {

    int numeromayor, numeromenor, suma;

    double media, i;



    private List<Integer> listaNumeros;

    public ESTADISTICA() {

        listaNumeros = List.of(1, 2, 3, 4, 5, 4, 2, 8, 3, 4);

    }

    public void mayor() {
        
        for(Integer numero: listaNumeros){

            if(numero > numeromayor){
                numeromayor = numero; 
            }
        }
        System.out.println("El numero mayor es: " + numeromayor);
    }

    public void menor() {

        numeromenor = 999999999;
        
        for(Integer numero: listaNumeros){
            
            if(numero < numeromenor){
                numeromenor = numero;
            }        
        } 
        System.out.println("El numero menor es: " + numeromenor);    
    }

    public void media() {

        i = 0;
        
        for(Integer numero: listaNumeros){

            i = numero + i;
        }
        
        media = i / listaNumeros.size();
        
        System.out.println("La media de los numeros es: " + media);
    }


    public void contarPares() {

        int contpar;
        contpar = 0;

        for(Integer numero : listaNumeros){

            if(numero % 2 == 0){
                contpar ++;
            }
        }
        System.out.println("Tiene un total de : " + contpar + " numeros pares");
    }

    public void contarPrimos() {

        int contpar = 0;

        for(Integer numero : listaNumeros){

            


        }
    }


}
