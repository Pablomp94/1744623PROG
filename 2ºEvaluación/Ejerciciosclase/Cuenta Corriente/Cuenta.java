import java.util.*;



public class Cuenta {

    Cuenta miCuenta = new Cuenta();

    Scanner sc = new Scanner(System.in);

    private double cuenta;
    private ArrayList<Double> movimientos; 
    int opcion;

    public Cuenta(){
        cuenta = 10000;
        movimientos = new ArrayList<Double>();
    }

   
    public void ingresarCuenta(){

        System.out.println("Introduce el dinero a ingresar");

        double dinero = sc.nextInt();

        cuenta = cuenta + dinero;

        movimientos.add(dinero);
    }
    
    public void retirarCuenta(){

        System.out.println("Introduce el dinero a retirar");

        double dinero = sc.nextInt();

        if(dinero <= cuenta){

            cuenta = cuenta - dinero;

            movimientos.add(0-dinero);
        }else{
            System.out.println("No puedes retirar mas dinero del que tienes");
        }
    }


    public double consultarsaldoCuenta(){

        return cuenta;
    }


    public ArrayList<Double> movimientos(int opcion) {
        
        return movimientos;
    }

    public void MenuInicio(){
        
        do{

        
        System.out.println(" ");
        System.out.println("********************************************************");
        System.out.println("1.Consultar cuenta");
        System.out.println("2.Ingresar dinero a la cuenta");
        System.out.println("3.Retirar dinero de la cuenta");
        System.out.println("4.Listado de movimientos realizados en la cuenta");
        System.out.println("5.Salir");
        System.out.println("********************************************************");

        opcion = sc.nextInt();

       
        if (opcion == 1) {
            System.out.println("El saldo de tu cuenta es de: " + miCuenta.consultarsaldoCuenta());
        }

        if (opcion == 2) {
            miCuenta.ingresarCuenta();
        }

        if (opcion == 3) {
            miCuenta.retirarCuenta();
        }

        if (opcion == 4){
            System.out.println("Movimientos =" + miCuenta.movimientos(opcion));
        }

        }while(opcion != 5);
                    
        

    }
    

}