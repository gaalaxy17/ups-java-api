package com.gaalaxy.api.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public void salvarOuCadastrar(EmpresaEntity empresa) {
		
		if(empresa != null) {
			empresaRepository.save(empresa);
		}
		
	}
	
	public void inativarEmpresa(Integer cdEmpresa) {
		
		EmpresaEntity empresa = empresaRepository.getOne(cdEmpresa);
		
		if(empresa != null) {
			
			empresa.setFgAtivo(0);
			
			empresaRepository.save(empresa);
		}
		
	}

}
