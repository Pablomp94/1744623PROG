import java.util.Scanner;

public class javajuegopropio {
    
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Bienvenido a Survey");
    System.out.println("*************************");
    System.out.println("                         ");
    System.out.println("Introduzca el nombre de su personaje");

    String nombre , genero ;

    nombre = sc.nextLine();

    System.out.println("Muy bien " + nombre + " , ahora introduzca su genero");

    System.out.println("A) Chico");
    System.out.println("B) Chica");
    System.out.println("C) Chique");

    genero = sc.nextLine();
    
    if (genero = "C"){
    System.out.println("Enserio, la gente como tu no la soporto, y la gente de por aqui aun menos.");
    System.out.println("Esto te puede meter en lios mas de una vez, andate con cuidado");

    }
    else {
        System.out.println("Menos mal que no eres de esos o esas, la verdad que nos hacen un lio, y lo peor de todo que son ellos/as las/los que se ofenden");
        System.out.println("No te sugiero que te juntes con personas asi, en estas zonas no son muy bien vistas debido a aquel incidente");

    }


    System.out.println("Bueno, creo que ya es hora de que me presente, me llamo Hoack.");
    System.out.println("Y soy el cientifico de este pequeño pueblo");


}
}