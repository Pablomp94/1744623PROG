import java.util.*;

public class ESTADISTICA {

    int numeromayor, numeromenor, suma;

    double media, i;



    private List<Integer> listaNumeros;

    public ESTADISTICA() {

        listaNumeros = List.of(1, 2, 3, 4, 5, 4, 2, 8, 3, 4);

    }

    public Integer mayor() {
        
        for(Integer numero: listaNumeros){

            if(numero > numeromayor){
                numeromayor = numero; 
            }
        }
        return numeromayor;
     //   System.out.println("El numero mayor es: " + numeromayor);
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

        for(int numero : listaNumeros){
            
            int contpri = 0;
            
            for(int pri = 1; pri <= numero; pri++){

                if(numero % pri == 0){
                    contpri ++;
                }
            }

            if(contpri == 2 ){
                System.out.println(numero + " es primo.");
            }else{
                System.out.println(numero + " no es primo.");
            }

        }
    }


}
