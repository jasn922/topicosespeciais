package fvs.edu.br.topicos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fvs.edu.br.topicos.domain.Categoria;
import fvs.edu.br.topicos.repositories.CategoriaRepository;

@SpringBootApplication
public class ProjetoTopicosEspeciaisApplication implements CommandLineRunner {
	@Autowired
	CategoriaRepository catRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoTopicosEspeciaisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritório");

		catRepository.saveAll(Arrays.asList(cat1, cat2));

	}
}
