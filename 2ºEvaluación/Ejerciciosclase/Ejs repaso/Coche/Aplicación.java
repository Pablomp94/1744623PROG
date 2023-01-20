import java.util.Scanner; 
public class Aplicación {
    
    public static void main(String[] args) {
        
        Coche miCoche = new Coche(); 

        Scanner sc = new Scanner(System.in); 

        int respuesta;
        int respuesta2; 

    do{
        System.out.println("_______________________________________________________________________________");
        System.out.println("Que quieres hacer con tu coche?");

        System.out.println("1. Conducir");
        System.out.println("2. Repostar");
        System.out.println("3. Nada, salir");

        

        respuesta = sc.nextInt();
        System.out.println("_______________________________________________________________________________");

        if(respuesta == 1){

            System.out.println("4. Ir a Murcia");
            System.out.println("5. Ir a Albacete");
            System.out.println("6. Ir a Madrid");
            System.out.println("7. Kilómetros conducidos a elegir");
            System.out.println("");
            
            respuesta2 = sc.nextInt(); 

            if(respuesta2 == 4){
                
                int kilometros = 50;

                miCoche.conducir(kilometros);

            }

            if(respuesta2 == 5){
                
                int kilometros = 100;

                miCoche.conducir(kilometros);

            }

            if(respuesta2 == 6){
                
                int kilometros = 350;

                miCoche.conducir(kilometros);

            }

            if(respuesta2 == 7){
                   
                System.out.println("Cuantos kilómetros quieres conducir?");

                int kilometros = sc.nextInt();

                miCoche.conducir(kilometros);
            } 
        }
    
        if(respuesta == 2){
            System.out.println("Cuantos litros quiere repostar?");

            double gasolina = sc.nextDouble();

            miCoche.repostar(gasolina);

        }

        if(respuesta == 3){
            System.out.println("Has salido del garaje");
        }

        
    }while(respuesta != 3);
     
    
    }

}
