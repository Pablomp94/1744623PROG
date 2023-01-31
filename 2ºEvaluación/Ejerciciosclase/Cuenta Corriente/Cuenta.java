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


   

}