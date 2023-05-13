package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PublicationRepository {

    // La colección de libros de la base de datos
    private ArrayList<Publication> repositorio = new ArrayList<Publication>();

    // Id del proximo elemento a insertar//
    private int proximoId;

    // nos conectamos a la base de datos
    CrearConexion miConexion = new CrearConexion();

    //Este es el constructor de la clase `PublicationRepository`. Inicializa el repositorio,
    //recuperando todas las publicaciones de la tabla de la base de datos `publication` y agregándolas a la
    //`repositorio` ArrayList. También establece la variable `proximoId` a la próxima identificación disponible para un
    //nueva publicación a insertar. Si hay un error al conectarse a la base de datos, imprime un
    //mensaje de error.
    
    public PublicationRepository() {
        try (Connection conexion = miConexion.hazConnection();
                Statement sentencia = conexion.createStatement();) {
            // sentencia e ejecutar
            String query = "select * from publication";
            // ejecuto la sentencia y guardo el resultado en rs
            ResultSet rs = sentencia.executeQuery(query);
            Integer id = 0;
            while (rs.next()) {
                // obtengo los datos del resultado
                String bookTitle = rs.getString("book_title");
                String publishDate = rs.getString("publish_date");
                String publishCo = rs.getString("publish_co");
                id = rs.getInt("id");

                // Lo asigno a un objeto Publication
                Publication p = new Publication(
                        id, bookTitle, publishDate,
                        publishCo);
                // Lo agregamos a la colección
                repositorio.add(p);
            }

            proximoId = id + 1;

        } catch (SQLException e) {
            System.out.println("Error al conectar");
            e.printStackTrace();
        }
    }

    public int getProximoId() {
        return proximoId;
    }

    /**
     *Esta función de Java busca un objeto de publicación en un repositorio por su ID y lo devuelve.
     *
     *@param id El parámetro "id" es un número entero que representa el identificador único de una publicación
     *que hay que buscar en la lista de "repositorio".
     *@return El método `buscarPorId` devuelve un objeto `Publication` con el `id` especificado. Si no
     *se encuentra una publicación con el `id` especificado, devuelve `null`.
     */
    public Publication buscarPorId(Integer id) {
        Publication p = null;
        for (Publication pub : repositorio) {
            if (pub.getId() == id) {
                p = pub;
                break;
            }
        }
        return p;
    }

    /**
     *Esta función devuelve un ArrayList de objetos de Publicación llamado "repositorio".
     *
     *@return Un ArrayList de objetos Publicación llamado "repositorio".
     */
    public ArrayList<Publication> getRepositorio() {
        return repositorio;
    }

    /**
     *Esta función agrega una publicación a un repositorio e incrementa el siguiente ID.
     *
     *@param libro un objeto de tipo Publicación que representa un libro o publicación a agregar
     *al repositorio.
     */
    public void insertar(Publication libro) {
        repositorio.add(libro);
        proximoId++;
    }

   /**
    *Esta función de Java inserta una publicación de libro en una tabla de base de datos.
    *
    *@param libro un objeto de tipo Publicación que representa un libro para ser insertado en una base de datos
    *tabla llamada "publicación".
    */
    public void insertarLibro(Publication libro) {

        String query = "";

        try (Connection conexion = miConexion.hazConnection();
                Statement sentencia = conexion.createStatement();) {
            query = "INSERT INTO publication VALUES (0 , '"
                    + libro.getBookTitle() + "' , '" +
                    libro.getPublishDate() + "' , '" +
                    libro.getPublishCo() + "')";
            sentencia.executeUpdate(query);
            // close connection
            sentencia.close();
        } catch (Exception e) {
            System.out.println("Error->" + query);
        }

    }

   /**
    *La función borra una tabla en una base de datos y luego inserta una lista de publicaciones en ella.
    */
    public void grabarRepositorio() {
        try (Connection conexion = miConexion.hazConnection();
                Statement sentencia = conexion.createStatement();) {
            String borrado = "TRUNCATE TABLE publication";
            sentencia.executeUpdate(borrado);
            // close connection
            sentencia.close();
        } catch (Exception e) {
            System.out.println("Error al borrar");
        }
        for (Publication libro : repositorio) {
            insertarLibro(libro);
        }
    }

    /**
     *Esta función modifica los atributos de un objeto de publicación en función de la identificación, el título y el
     *fecha y editorial.
     *
     *@param id El ID de la publicación a modificar.
     *@param titulo Una cadena que representa el título del nuevo libro que se establecerá para un objeto Publicación con
     *la identificación dada.
     *@param fecha fecha es un parámetro String que representa la fecha de publicación de una publicación.
     *@param editorial El nombre de la editorial o editorial que editó la publicación.
     */
    public void modificar(Integer id, String titulo, String fecha, String editorial) {

        // Bucle para que busque por id y ponerle los datos, setters//

        for (Publication pub : repositorio) {
            if (pub.getId() == id) {

                if (!titulo.isBlank()) {
                    pub.setBookTitle(titulo);
                }

                if (!fecha.isBlank()) {
                    pub.setPublishDate(fecha);
                }

                if (!editorial.isBlank()) {
                    pub.setPublishCo(editorial);
                }
                break;
            }
        }

    }

    /**
     *Esta función de Java elimina un objeto de un repositorio en función de su ID.
     *
     *@param id El parámetro "id" es un número entero que representa el identificador único del objeto
     *que necesita ser borrado de la lista de "repositorio". El método recorre la lista y
     *elimina el objeto que coincide con la identificación dada.
     */
    public void borrar(Integer id) {

        for (int i = 0; i < repositorio.size(); i++) {

            if (repositorio.get(i).getId() == id) {
                repositorio.remove(repositorio.get(i));

            }
        }
    }

}
