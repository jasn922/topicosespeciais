package fvs.edu.br.topicos.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.topicos.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")

public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)

	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "Bombril");
		Categoria cat2 = new Categoria(2, "Detergente");
		// Categoria cat3 = new Categoria(3, "Bombril");
		// Categoria cat4 = new Categoria(4, "Bombril");
		// Categoria cat5 = new Categoria(5, "Bombril");
		// Categoria cat6 = new Categoria(6, "Bombril");

		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);

		return lista;

	}

}
