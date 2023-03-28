package es.ieslosalbares.Agenda;

import java.util.Optional;

public class Agenda {
    
    PersonaRepositorio miRepositorio;



    public Agenda(PersonaRepositorio mRepositorio){
        this.miRepositorio = miRepositorio;
    }  

    public Persona  verPorId(long Id){
        Optional<Persona> devolver = miRepositorio.findById(Id);

        if(devolver.isPresent()){
            return devolver.get();
        }else{
            return new Persona();
        }
   }
}
