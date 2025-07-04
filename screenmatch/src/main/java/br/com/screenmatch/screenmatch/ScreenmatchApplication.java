package br.com.screenmatch.screenmatch;

import br.com.screenmatch.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.screenmatch.screenmatch.principal.Principal;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {
	//Invoca a interface, é necessário que seja em uma classe que o Spring "controla"
	@Autowired
	private SerieRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
