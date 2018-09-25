package eleicao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eleicao.domain.Candidato;
import eleicao.repositories.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository repo;

	public Candidato buscar(Integer id) {
		Optional<Candidato> objeto = repo.findById(id);

		return objeto.orElse(null);

	}

}
