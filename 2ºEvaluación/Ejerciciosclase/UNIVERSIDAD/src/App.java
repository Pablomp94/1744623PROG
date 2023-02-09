import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.event.SwingPropertyChangeSupport;

public class App {

  // Creo la lista de matriculas
  static ArrayList<Matriculas> listaMatriculas = new ArrayList<Matriculas>();

  public static void main(String[] args) throws Exception {
    int opcion, idAlumno;
    opcion = 200;

    //Inicializo las Matriculas
    for (int i = 1; i <= 25; i++) {
      Matriculas miMatricula = new Matriculas(i, "Programación", 1);
      listaMatriculas.add(miMatricula);
    }

    //Creo el menú
    var listaOpciones = new ArrayList<String>();
    listaOpciones.add("MODIFICAR UNA NOTA");
    Menu miMenu = new Menu(listaOpciones);

    //Muestro el menú por pantalla
    while (opcion != 0) {
      miMenu.verMenu();
      opcion = miMenu.leerOpcion();
      if (opcion == 1) {
        modificarNota();
      } else if (opcion == 0) {
        System.out.println("HASTA LUEGUITO");
      } else {
        System.out.println("OPCIÓN NO VÁLIDA");
      }
    }
    System.out.println(" ");

    opcion = 1;

    //Ver nota de un alumno en concreto o todas las notas//

    while (opcion != 0) {
      System.out.println("1.Ver todas las notas");
      System.out.println("2.Ver la nota de un alumno en concreto");
      System.out.println("0.Salir");

      opcion = miMenu.leerOpcion();

      if (opcion == 1) {
        for (Matriculas estaMatricula : listaMatriculas) {
          System.out.println(estaMatricula.toString());
        }
      }

      if (opcion == 2) {
        idAlumno = miMenu.idAlumno();
        for (Matriculas estaMatricula : listaMatriculas) {
          if (estaMatricula.getAlumnoId() == idAlumno) {
            System.out.println(estaMatricula.toString());
          }
        }
      }
    }

    //Media//
    System.out.println("REALIZANDO MEDIA DE NOTAS");
    double nota;
    nota = 0;
    for (Matriculas estaMatricula : listaMatriculas) {
      nota = estaMatricula.getNotaMateria();
      nota = nota + nota;
    }
    double media = (nota / 25);

    System.out.println("La media de las notas es de: " + media);
  

  //APROBADOS//
    opcion = 200;
    
    while (opcion != 0) {

        int contapr, contsus;
        contapr = 0;
        contsus = 0;

        System.out.println("1.Mostrar numero de aprobados");
        System.out.println("2.Mostrar el numero de suspensos");
        System.out.println("0.Salir");

        opcion = miMenu.leerOpcion();

        if(opcion == 1){

            for (Matriculas estaMatricula : listaMatriculas) {
                int notas = estaMatricula.getNotaMateria();
                if(notas >= 5){
                    contapr ++;
                }
            }
            System.out.println("Hay un total de " + contapr + " aprobados");
        
        } if(opcion == 2){

            for (Matriculas estaMatricula : listaMatriculas) {
                int notas = estaMatricula.getNotaMateria();
                if(notas >= 5){
                    contsus ++;
                }
            }
            System.out.println("Hay un total de " + contsus + " suspensos");
        }
        
    }}

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
