//Pablo Morales Puertas NRE: 1744623//
//Fecha : 12/12/2022
//Introducir numeros primos del 2 al 100

public class Ej09_Numprimo {
    
    public static void main(String[] args) {
        
                //Variables//
        int num, comprobacion, resto, i;

        

        comprobacion = 0; 

        
                //Codigo//
        
        for( num = 2 ; num <= 100 ; num++){

            for( i = 0; i < num ; i ++){ 
                
                resto = num % (0 + 1); 
            
                if(resto == 0){
                    comprobacion++;
                }

                if((num % 2 == 0) && (num != 2)) {
                    comprobacion++; 
                }
            }   
            
            if(comprobacion <= 2){
                System.out.println(num);
            }
        }
    }
}