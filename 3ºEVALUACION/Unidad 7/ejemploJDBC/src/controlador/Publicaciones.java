package controlador;

import java.util.ArrayList;

import modelo.Publication;
import modelo.PublicationRepository;

public class Publicaciones {

    private PublicationRepository repoLibros = new PublicationRepository();


   /* public void insertarDatos (Integer id, String bookTitle, String publishDate, String publishCo){

        Publication publicacion = new Publication(id, bookTitle, publishDate, publishCo);

        repoLibros.insertar(publicacion);


    }*/

    public String buscarPorId (Integer id) {
        Publication libro = repoLibros.buscarPorId(id);

        if (libro != null) {
            return "Libro encontrado -> \n" +
                libro.toString();
        } else {
           return "No se encontró el libro";
        }
    }

    public ArrayList<String> buscarPorTitulo(String titulo) {
        ArrayList<String> lista = new ArrayList<>();

        for (Publication libro: repoLibros.getRepositorio()) {
            if (libro.getBookTitle().contains(titulo)) {
                
                lista.add(libro.toString());
            }
        }

        return lista;
    }

    public void insertaLibro(Integer id, String titulo, String fecha, String editorial) {
        repoLibros.insertar(
            new Publication(id , titulo, 
            fecha , editorial)
        );
    }
}
