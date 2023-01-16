
public class Coche {
    
 
    public double gasolinaCoche = 10;
    public static int capacidadDeposito = 60;
     

    //Media de consumo del coche cada 100 Km//
    public static double consumoMedio = 6.2; 
    
    //Inicializamos la acción conducir//

    public void conducir(double kilometros) {

        //Calculo de la gasolina que quedará tras introducir los kilometros a conducir//

        double centenas = kilometros/100;

        double consumido = (centenas * consumoMedio); 

        

        //Calculo y aviso si no se tiene la suficiente gasolina para los kilómetros introducidos//

        if(consumido > gasolinaCoche){
            System.out.println("No tienes suficiente en el depósito, reposta si quieres realizar dicho viaje.");
        }
        else{
            gasolinaCoche = gasolinaCoche - consumido;
            System.out.println("Has consumido " + consumido + " L");
            System.out.println("Y te quedan " + gasolinaCoche + " L");
        }
    }

    

    //Repostar Gasolina// 
    public void repostar(double gasolina){
       
        if(capacidadDeposito >= (gasolinaCoche + gasolina)){
            System.out.println("Tenías " + gasolinaCoche + " L de gasolina");
            gasolinaCoche = gasolinaCoche + gasolina;
            System.out.println("Ahora tiene " + gasolinaCoche + " L " );
        }
        else{
            System.out.println("No puedes hechar más gasolina al coche, debido a que hechas más de la que soporta el coche");
        }    
    }

}
