import java.util.*;
public class App {
    public static void main(String[] args) {
        
        Calculadora miCalculadora = new Calculadora();

        Scanner sc = new Scanner(System.in);

        System.out.println("Num 1");

        int numero1 = sc.nextInt();

        System.out.println("Num 2");

        int numero2 = sc.nextInt();

        miCalculadora.suma(numero1, numero2);

        System.out.println( miCalculadora.suma(numero1, numero2));

    }
}
