package vista;
import controlador.Publicaciones;

import java.time.LocalDate;
import java.util.Scanner;

class App {

  static Scanner sc = new Scanner(System.in);

  /*
   * Es nueva instancia de la clase `Publicaciones` y asignándola a la variable
   * estática
   * `biblioteca`. Esta variable se utiliza para acceder a los métodos de la clase
   * `Publicaciones`
   * a lo largo de la clase `App`.
   */
  static Publicaciones biblioteca = new Publicaciones();

  public static void main(String[] args) throws Exception {

    int opcion;

    do {
      menu();

      opcion = inNum("Introduce una opción: ");
      System.out.println();

      if (opcion == 1) {
        verRepositorio();
      }
      if (opcion == 2) {
        buscarporId();
      }
      if (opcion == 3) {
        buscarPorTitulo();
      }
      if (opcion == 4) {
        insertar();
      }
      if (opcion == 5) {
        modificar();
      }
      if (opcion == 6) {
        borrarLibro();
      }
      System.out.println();
    } while (opcion != 0);

  }

  /**
   * Este metodo muestra el repositorio de libros.
   */
  public static void verRepositorio() {
    biblioteca.verRepositorio();
  }

  /**
   * Este metodo de Java solicita al usuario que ingrese una ID y luego la busca
   * en un sistema de bibliotecas.
   */
  public static void buscarporId() {
    try {
      System.out.print("Escribe el id a buscar: ");
      int id = Integer.parseInt(sc.nextLine());
      System.out.println(biblioteca.buscarPorId(id));
    } catch (Exception e) {
      System.out.println("Los datos introducidos son erroneos");
    }
  }

  /**
   * Esta función de Java solicita al usuario que ingrese el título de un libro
   * para buscar en una biblioteca,
   * luego muestra los resultados de la busqueda, si se encuentra alguno.
   * 
   * @return si encontro o no el libro.
   */
  public static boolean buscarPorTitulo() {
    boolean encontrado = false;
    try {
      System.out.print("Escribe el titulo a buscar: ");
      String titulo = sc.nextLine();

      var resultado = biblioteca.buscarPorTitulo(titulo);

      if (resultado.size() > 0) {
        System.out.println("Encontrados " + resultado.size() + " resultados:");
        for (String libro : resultado) {
          System.out.println(libro);
        }
        return encontrado = true;
      } else {
        System.out.println("No se encontro ningun resultado");
        return encontrado;
      }
    } catch (Exception e) {
      System.out.println("Los datos introducidos son erroneos");
      return encontrado;
    }
  }

  /**
   * Este metodo solicita al usuario que ingrese el título del libro, la fecha y
   * el editor, y luego inserta
   * el libro en una biblioteca.
   */
  public static void insertar() {
    try {
      System.out.print("Escribe el titulo a insertar: ");
      String tituloL = sc.nextLine();

      String fechaL = "";
      
      do {
        System.out.print("Escribe la fecha (año-mes-fecha): ");
        fechaL = sc.nextLine();
      } while (!validarFecha(fechaL));

      System.out.print("Escribe la editorial: ");
      String editorialL = sc.nextLine();

      biblioteca.insertaLibro(tituloL, fechaL, editorialL);
    } catch (Exception e) {
      System.out.println("Los datos introducidos son erroneos");
    }
  }

  /* 
   * @return si la fecha es valida o no.
   */
  public static boolean validarFecha(String fecha) {
    try {
      LocalDate.parse(fecha);
      return true;
    } catch (Exception e) {
      System.out.println("Fecha no valida, ejemplo: 2001-01-01");
      return false;

    }
  }

  /**
   * Esta función modifica el título, la fecha y la editorial de un libro según la
   * entrada del usuario.
   * 
   */
  public static void modificar() {
    if (buscarPorTitulo()) {
      System.out.print("Escribe el id del libro a modificar: ");
      Integer id = sc.nextInt();
      sc.nextLine();

      String titulo = "";
      String fecha = "";
      String editorial = "";

      titulo = modInput("el título");
      System.out.println();
      fecha = modInput("la fecha");
      System.out.println();
      editorial = modInput("la editorial");

      biblioteca.modificaLibro(id, titulo, fecha, editorial);
    }
  }

  /**
   *He puesto todos los if de modificar y te los he resumido en un
   * metodo.
   * 
   * @param aModificar dato a modificar
   * @return valor del dato a modificar
   */
  public static String modInput(String aModificar) {
    String input;
    String opcion;

    System.out.println("¿Quieres modificar " + aModificar + "?");
    System.out.print("Introduzca \"Si\" para modificar: ");
    opcion = sc.nextLine();

    if (opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("s")) {
      System.out.print("Escribe " + aModificar + " a modificar: ");
      input = sc.nextLine();
      return input;
    } else {
      System.out.println("No se ha modificado " + aModificar + ".");
      return "";
    }
  }

  /**
   * Esta función solicita al usuario que ingrese la ID de un libro que se
   * eliminará y solicita confirmación
   * antes de llamar al método "borradoLibro" para eliminar el libro de la
   * biblioteca.
   */
  public static void borrarLibro() {

    if (buscarPorTitulo()) {
      int id = inNum("Introduce la id del libro a borrar: ");

      System.out.println("¿Estas seguro de que lo quieres eliminar?");
      System.out.println("1. Si");
      System.out.println("2. No");
      int opcion = inNum("Introduce tu opción: ");

      if (opcion == 1) {
        biblioteca.borradoLibro(id);
      } else {
        System.out.println("El libro no se ha borrado.");
      }
    }

  }

  public static void menu() {
    System.out.println("****************************************");
    System.out.println("              BIBLIOTECA");
    System.out.println("****************************************");
    System.out.println("1. Ver todos los libros");
    System.out.println("2. Buscar libro por Id");
    System.out.println("3. Buscar libro por titulo");
    System.out.println("4. Insertar nuevo libro");
    System.out.println("5. Modificar libro");
    System.out.println("6. Borrar libro");
    System.out.println("0. Salir");

  }

  /**
   *Método que controla los inputs numéticos.
   * 
   * @param texto
   * @return
   */
  public static int inNum(String texto) {
    int opcion = -1;
    System.out.print(texto);
    try {
      var leido = sc.nextLine();
      opcion = Integer.parseInt(leido);
    } catch (Exception e) {
      System.out.println("El valor introducido no es valido");
    }
    return opcion;
  }
}
