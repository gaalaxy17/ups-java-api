package com.gaalaxy.api.Unidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaalaxy.api.Commons.ResponseModel;
import com.gaalaxy.core.enumeration.ResponseStatus;

@RestController()
@RequestMapping(path = "unidade", headers = "Accept=application/json")
public class UnidadeController {
	
	@Autowired
	private UnidadeService unidadeService;
	
	@Autowired
	private UnidadeRepository unidadeRepository;
	
	@PostMapping(path="salvar")
	public ResponseModel salvarUnidade(UnidadeEntity unidade) {
		
		ResponseModel response = new ResponseModel();
		
		try {
			unidadeService.salvarOuCadastrar(unidade);
			response.setData(unidade);
			response.setMessage("Unidade salva com sucesso!");
			response.setResponseStatus(ResponseStatus.OK.getCode());
		}
		catch(Exception e) {
			response.setData(e);
			response.setMessage("Ocorreu um erro ao salvar a unidade!");
			response.setResponseStatus(ResponseStatus.INTERNAL_ERROR.getCode());
		}
		
		return response;
		
	}
	
	@GetMapping(path="listar")
	public ResponseModel listarUnidades() {
		ResponseModel response = new ResponseModel();
		
		try {
			
			List<UnidadeEntity> unidadeList =  unidadeRepository.findAll();
			
			response.setData(unidadeList);
			response.setMessage("Ok");
			response.setResponseStatus(ResponseStatus.OK.getCode());
		}
		catch(Exception e) {
			response.setData(e);
			response.setMessage("Ocorreu um erro ao listar as unidades!");
			response.setResponseStatus(ResponseStatus.INTERNAL_ERROR.getCode());
		}
		
		return response;
		
	}
	

}
