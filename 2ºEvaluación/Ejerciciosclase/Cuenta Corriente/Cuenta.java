
import java.util.*;

public class Cuenta {
    
    Scanner sc = new Scanner(System.in);

    int cuenta = 10000;

    ArrayList<Integer> movimientos = new ArrayList<Integer>();

    public void ingresarCuenta(){

        int dinero = sc.nextInt();

        cuenta = cuenta + dinero;

    }
    
    public void retirarCuenta(){

        int dinero = sc.nextInt();

        cuenta = cuenta - dinero;

    }


    public void consultarsaldoCuenta(){

        System.out.println("En tu cuenta tienes actualmente " + cuenta + "$");

    }


}
