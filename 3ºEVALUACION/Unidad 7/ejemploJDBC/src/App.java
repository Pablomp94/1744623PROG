import controlador.Publicaciones;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Publication;
import modelo.PublicationRepository;

class App {

  static Scanner sc = new Scanner(System.in);

  /*Es nueva instancia de la clase `Publicaciones` y asignándola a la variable estática
      `biblioteca`. Esta variable se utiliza para acceder a los métodos de la clase `Publicaciones`
      a lo largo de la clase `App`.*/
  static Publicaciones biblioteca = new Publicaciones();

  public static void main(String[] args) throws Exception {
    verRepositorio();
  }

  /**
   * Este metodo muestra el repositorio de libros.
   */
  public static void verRepositorio() {
    biblioteca.verRepositorio();
  }

  /**
   * Este metodo de Java solicita al usuario que ingrese una ID y luego la busca en un sistema de bibliotecas.
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
   * Esta función de Java solicita al usuario que ingrese el título de un libro para buscar en una biblioteca,
   * luego muestra los resultados de la busqueda, si se encuentra alguno.
   */
  public static void buscarPorTitulo() {
    try {
      System.out.print("Escribe el titulo a buscar: ");
      String titulo = sc.nextLine();

      var resultado = biblioteca.buscarPorTitulo(titulo);

      if (resultado.size() > 0) {
        System.out.println("Encontrados " + resultado.size() + " resultados:");
        for (String libro : resultado) {
          System.out.println(libro);
        }
      } else {
        System.out.println("No se encontro ningun resultado");
      }
    } catch (Exception e) {
      System.out.println("Los datos introducidos son erroneos");
    }
  }

  /**
   * Este metodo solicita al usuario que ingrese el título del libro, la fecha y el editor, y luego inserta
   * el libro en una biblioteca.
   */
  public static void insertar() {
    try {
      System.out.print("Escribe el titulo a insertar: ");
      String tituloL = sc.nextLine();

      System.out.print("Escribe la fecha: ");
      String fechaL = sc.nextLine();

      System.out.print("Escribe la editorial: ");
      String editorialL = sc.nextLine();

      biblioteca.insertaLibro(tituloL, fechaL, editorialL);
    } catch (Exception e) {
      System.out.println("Los datos introducidos son erroneos");
    }
  }

  /**
   * Esta función modifica el título, la fecha y la editorial de un libro según la entrada del usuario.
   */
  public static void modificar() {
    System.out.print("Escribe el id del libro a modificar: ");
    Integer id = sc.nextInt();
    sc.nextLine();

    String titulo = "";
    String fecha = "";
    String editorial = "";

    int opcion;

    System.out.println("¿Quieres modificar el titulo?");
    System.out.println("1. Si");
    System.out.println("2. No");

    opcion = sc.nextInt();
    sc.nextLine();

    if (opcion == 1) {
      System.out.print("Escribe nuevo titulo: ");
      titulo = sc.nextLine();
    } else {
      System.out.println("No se ha modificado el titulo");
    }

    opcion = 3;

    System.out.println("¿Quieres modificar la fecha?");
    System.out.println("1. Si");
    System.out.println("2. No");

    opcion = sc.nextInt();
    sc.nextLine();

    if (opcion == 1) {
      System.out.print("Escribe la fecha a modificar: ");
      fecha = sc.nextLine();
    } else {
      System.out.println("No se ha modificado la fecha");
    }

    System.out.println("¿Quieres modificar la editorial?");
    System.out.println("1. Si");
    System.out.println("2. No");

    opcion = sc.nextInt();
    sc.nextLine();

    if (opcion == 1) {
      System.out.print("Escribe la editorial a modificar: ");
      editorial = sc.nextLine();
    } else {
      System.out.println("No se ha modificado la editorial");
    }

    biblioteca.modificaLibro(id, titulo, fecha, editorial);
  }

  /**
   * Esta función solicita al usuario que ingrese la ID de un libro que se eliminará y solicita confirmación
    * antes de llamar al método "borradoLibro" para eliminar el libro de la biblioteca.
   */
  public static void borrarLibro() {
    System.out.println("Introduce la id del libro a borrar");

    int id = sc.nextInt();

    System.out.println("Estas seguro que lo quieres eliminar?");

    System.out.println("1. Si");
    System.out.println("2. No");

    int opcion = sc.nextInt();

    if (opcion == 1) {
      biblioteca.borradoLibro(id);
    } else {
      System.out.println("El libro no se ha borrado");
    }
  }
}
