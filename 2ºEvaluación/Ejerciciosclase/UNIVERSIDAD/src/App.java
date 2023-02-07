import java.util.ArrayList;
import java.util.Scanner;

public class App {

    // Creo la lista de matriculas
    static ArrayList<Matriculas> listaMatriculas = new ArrayList<Matriculas>();

    public static void main(String[] args) throws Exception {
        
        int opcion=200;
        
        //Inicializo las Matriculas
        for (int i = 1; i <= 25; i++) {
            Matriculas miMatricula = 
                new Matriculas(i, "Programación", 1);
            listaMatriculas.add(miMatricula);
        }


        //Creo el menú
        var listaOpciones = new ArrayList<String>();
        listaOpciones.add("MODIFICAR UNA NOTA");  
        Menu miMenu = new Menu(listaOpciones);

        //Muestro el menú por pantalla
        while (opcion != 0 ) {
            miMenu.verMenu();
            opcion = miMenu.leerOpcion();
            if (opcion==1) {
                modificarNota();
            }
            else if (opcion==0) {
                System.out.println("HASTA LUEGUITO");
            }
            else {
                System.out.println("OPCIÓN NO VÁLIDA");
            }

        }

       

        /*
        


        for (Matriculas estaMatricula : listaMatriculas) {
            System.out.println(estaMatricula.toString());
        }

        */


        
    }


    public static void modificarNota() {
        System.out.print("Introduce id alumno:");
        Scanner sc = new Scanner(System.in);
        Integer numLeido = sc.nextInt();
        System.out.println("------------------------");
        System.out.print("Introduce nota:");
        Integer notaLeida = sc.nextInt();

        for (Matriculas estaMatricula : listaMatriculas) {
            if (estaMatricula.getAlumnoId() == numLeido) {
                estaMatricula.setNotaMateria(notaLeida);
            }
        }
    }
}
