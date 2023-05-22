package controlador;

import java.util.ArrayList;
import modelo.Publication;
import modelo.PublicationRepository;

public class Publicaciones {

  private PublicationRepository repoLibros = new PublicationRepository();

  /**
   * Esta función de Java busca un libro por su ID y devuelve un mensaje que indica si el
   * libro fue encontrado o no.
   *
   * @param id un Integer que representa el ID del libro a buscar en el repositorio.
   * @return Si se encuentra el libro con el id dado, el método devolverá una cadena con la información del libro.
   * información del libro. Si no se encuentra el libro, el método devolverá una cadena que dice "No se encontró el
   * libro" (que significa "No se encontró el libro" en español).
   */
  public String buscarPorId(Integer id) {
    Publication libro = repoLibros.buscarPorId(id);

    if (libro != null) {
      return "Libro encontrado -> \n" + libro.toString();
    } else {
      return "No se encontró el libro";
    }
  }

  /**
   * Esta función Java busca publicaciones en un repositorio por el título del libro y devuelve una
   * lista de publicaciones coincidentes.
   *
   * @param titulo El parámetro "titulo" es una variable String que representa el título de un libro
   * que queremos buscar en un repositorio de publicaciones. El método "buscarPorTitulo" busca
   * todas las publicaciones del repositorio que contengan el título dado en su atributo bookTitle
   * y devuelve un ArrayList de Strings que
   * @return Una lista de cadenas que contiene la representación toString de todos los objetos de publicación
   * del repositorio repoLibros cuyo título de libro contiene la cadena "titulo" especificada.
   */

  public ArrayList<String> buscarPorTitulo(String titulo) {
    ArrayList<String> lista = new ArrayList<>();

    for (Publication libro : repoLibros.getRepositorio()) {
      if (libro.getBookTitle().contains(titulo)) {
        lista.add(libro.toString());
      }
    }

    return lista;
  }

  /**
   *Esta función inserta un nuevo libro en un repositorio con un título, fecha y editorial determinados.
   *
   *@param titulo El título del libro que se está insertando.
   *@param fecha fecha es un parámetro String que representa la fecha de publicación de un libro.
   *@param editorial El parámetro "editorial" representa el nombre de la editorial del cual se ha
   *publicado el libro.
   */
  public void insertaLibro(String titulo, String fecha, String editorial) {
    int id = repoLibros.getProximoId();
    var libro = new Publication(id, titulo, fecha, editorial);
    repoLibros.insertar(libro);

    repoLibros.grabarRepositorio();
  }

  /**
   *Esta función modifica un libro en un repositorio actualizando su título, fecha y editorial.
   *@param id El identificador único del libro que necesita ser modificado en el repositorio.
   *@param titulo El título del libro que necesita ser modificado.
   *@param fecha fecha es un parámetro String que representa la fecha de publicación de un libro.
   *@param editorial El nombre de la editorial u organización responsable de producir y
   *distribuir el libro.
   */
  public void modificaLibro(
    Integer id,
    String titulo,
    String fecha,
    String editorial
  ) {
    /*var libro = new Publication( id ,titulo, 
        fecha , editorial);*/
    //repoLibros.modificar(id, libro);
    repoLibros.modificar(id, titulo, fecha, editorial);
    repoLibros.grabarRepositorio();
  }

  /**
   *Esta función de Java muestra el repositorio de libros.
   */
  public void verRepositorio() {
    for(Publication p : repoLibros.getRepositorio()){
      System.out.println(p.toString());
    }
  }

  /**
   *La función "guardar" guarda el repositorio de libros usando el método "grabarRepositorio" del
   *Objeto "repoLibros".
   */
  public void guardar() {
    repoLibros.grabarRepositorio();
  }

  /**
   *Esta función de Java elimina un libro de un repositorio en función de su ID.
   *
   *@param id El parámetro "id" es un número entero que representa el identificador único de un libro.
   * Samuel: Aunque no me gusta esta forma de hacerlo (yo lo he hecho de otra forma), considero que es más facil de 
   * entender esta.
   * 
   * Primero guardo los cambios, con el arrayList modificado.
   * Segundo lo borro y cargo otra vez los datos.
   */
  public void borradoLibro(Integer id) {
    repoLibros.borrar(id);
    guardar();
    repoLibros.borrarArray();
    repoLibros.cargarDatos();
    guardar();
  }
}
