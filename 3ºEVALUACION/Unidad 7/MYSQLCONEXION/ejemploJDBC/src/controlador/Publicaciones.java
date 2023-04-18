package controlador;

import java.util.ArrayList;

import modelo.Publication;
import modelo.PublicationRepository;

public class Publicaciones {
    private PublicationRepository repoLibros = new PublicationRepository();

    public String buscarPorId(Integer id){

        Publication libro = repoLibros.buscarPorId(id);

      
        if (libro != null) {
            return "Libro encontrado" + libro.toString();
        } else {
            return "No se encontró el libro";
        }

    }


    ArrayList<Publication> libro; 

    public String buscarPorTitulo(String titulo){

        
        
        for(int x = 0; x < PublicationRepository.librotitulo.size(); x ++){

            libro.add(PublicationRepository.librotitulo.get(x));
        }

        if(libro != null){
            System.out.println("Libro encontrado");
            for(int i = 0; i < libro.size(); i ++){
                libro.get(i);
            }
            return " ";
        }else{
            return "No se encontró el libro";
        }

    }
}
