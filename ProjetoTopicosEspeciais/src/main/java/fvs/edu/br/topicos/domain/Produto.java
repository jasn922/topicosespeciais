package fvs.edu.br.topicos.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Produto {
	private Integer id;
	private String nome;
	private Double preço;

	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA", joinColumns = @JoinColumn(name = "produto_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	List<Categoria> categorias = new ArrayList<>();

}
