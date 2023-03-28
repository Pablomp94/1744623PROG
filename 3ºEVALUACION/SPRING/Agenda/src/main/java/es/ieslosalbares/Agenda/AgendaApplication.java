package es.ieslosalbares.Agenda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonaRepositorio repositorio) {
        return (args) -> {
            
            Persona pepe = new Persona();

            /*pepe.setNombre("Pepe");
            pepe.setApellidos("Moreno");
            pepe.setNumTelefono(123456);
            pepe.setEmail("sadsad@gmail.com");
            pepe.setFechaNacimiento("2001/02/02");

            repositorio.save(pepe);*/

            System.out.println(pepe);
        };
    }


}
