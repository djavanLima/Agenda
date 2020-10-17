package br.com.djavan.agenda;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.djavan.agenda.model.entity.Contato;
import br.com.djavan.agenda.model.repository.ContatoRepository;

@SpringBootApplication
public class AgendaApplication {

	
	
	//permite que um codigo seja executado logo quando a aplicação é inicializada
	
	@Bean
	public CommandLineRunner commandLineRunner(
			@Autowired ContatoRepository repository) {
		
		
		return args->{
			
			Contato contato = new Contato();
			contato.setNome("Fulano");
			contato.setEmail("fulano@gmail.com");
			contato.setFavorito(false);
			repository.save(contato);
		};
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

}
