package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PublicationRepository {
    
    public static Object repositoriort;
    //La colección de libros de la base de datos
    public ArrayList<Publication> repositorio = 
        new ArrayList<Publication>();

    public PublicationRepository() {
        // nos conectamos a la base de datos
        CrearConexion miConexion = new CrearConexion();

        try (Connection conexion = miConexion.hazConnection();
        Statement sentencia = conexion.createStatement();) {
            //sentencia e ejecutar
            String query = "select * from publication";
            //ejecuto la sentencia y guardo el resultado en rs
            ResultSet rs = sentencia.executeQuery(query);

            while (rs.next()) {
                //obtengo los datos del resultado
                /*String bookTitle = rs.getString("book_title");
                String publishDate = rs.getString("publish_date");
                String publishCo = rs.getString("publish_co");
                Integer id = rs.getInt("id");*/

                Publication p = Publication.fromResulSet(rs);

                repositorio.add(p);

                /*//Lo asigno a un objeto Publication
                Publication p = new Publication(
                    id , bookTitle, publishDate,
                    publishCo
                );
                //Lo agregamos a la colección
                repositorio.add(p);*/
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar");
        }
    }


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


    public ArrayList<Publication> librotitulo =  new ArrayList<Publication>();

    
    public ArrayList<Publication> buscarPorTitulo(String titulo){

        for(Publication pub : repositorio) {

            if(pub.getBookTitle() == titulo){
                
                librotitulo.add(pub);
                
                
            }
        }
        
        return librotitulo;
    }
}
