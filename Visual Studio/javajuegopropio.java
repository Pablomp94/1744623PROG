import java.util.Scanner;

public class javajuegopropio {
     
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("*************************");
    System.out.println("Bienvenido a Survey");
    System.out.println("*************************");
    System.out.println("                         ");
    System.out.println("Introduzca el nombre de su personaje");

    String nombre = sc.nextLine();

    System.out.println("Muy bien " + nombre + " , ahora introduzca su genero");

    System.out.println("A) Chico");
    System.out.println("B) Chica");
    System.out.println("C) Chique");

    String genero = sc.nextLine();
    

    if ( genero == "C" ){
    System.out.println("");
    System.out.println("Enserio, la gente como tu no la soporto, y la gente de por aqui aun menos.");
    System.out.println("Esto te puede meter en lios mas de una vez, andate con cuidado, todo cambio desde aquel incidente ... ");

    }
    else {
        System.out.println("Menos mal que no eres de esos o esas, la verdad que nos hacen un lio, y lo peor de todo que son ellos/as las/los que se ofenden");
        System.out.println("No te sugiero que te juntes con personas asi, en estas zonas no son muy bien vistas debido a aquel incidente ...");

    }

    System.out.println("__________________________________");

    System.out.println("EhMm, Bueno, creo que ya es hora de que me presente, me llamo Hoack.");
    System.out.println("Y soy el cientifico de este pequeño pueblo");

    System.out.println("");

    System.out.println("En este mundo existen criaturas las cuales te acompañaran en tu gran aventura, al igual que habra otras que te estorben");

    System.out.println("Antes este sitio era un lugar muy turistico y famoso por la zona, pero por desgracia hoy en dia es muy distinto");

    System.out.println("Sera mejor que lo veas por tu cuenta.");
    System.out.println("");
    System.out.println(nombre + ": (susurro) menuda ayuda");

    System.out.println("Hoack : Has dicho algo?");

    System.out.println(" Pulsa 1 - repetirlo en voz alta -, pulsa 2 - no decir nada - ");

    int respuesta1;

    respuesta1 = sc.nextInt();

    if(respuesta1 == 1){
        System.out.println("Hoack: (............) (no escucho nada) (a veces esta sordo) ._. ");
    }
    else{
        System.out.println("Me habia parecido escuchar algo, ya puedes irte");
    }

    System.out.println("______________________________________________________________________________");

    int accion1;

    System.out.println("Introduce 1 para salir, 2 para quedarte");

    accion1 = sc.nextInt();
    
    do{
        System.out.println("Hoack: Aun sigues aqui, pirate ya");
        
        System.out.println("Introduce 1 para salir, 2 para quedarte");

        accion1 = sc.nextInt();
    
    }while(accion1 == 2);

    System.out.println("Salistes a la calle (no ves nada)");

    System.out.println(nombre + ": cre..creo  que es de noche...." );
    System.out.println(".................");
    System.out.println("(obviamente que es de noche, tu personaje parece un poco corto ...)");

    System.out.println("");




    }
}