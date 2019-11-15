package com.gaalaxy.api.Unidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadeService {

	@Autowired
	private UnidadeRepository unidadeRepository;
	
	public void salvarOuCadastrar(UnidadeEntity unidade) {
		
		if(unidade != null) {
			unidadeRepository.save(unidade);
		}
	}
	
}
