package com.gaalaxy.api.Empresa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gaalaxy.api.Commons.ResponseModel;
import com.gaalaxy.core.enumeration.ResponseStatus;

@RestController()
@RequestMapping(path = "empresa", headers = "Accept=application/json")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@PostMapping(path="salvar")
	public ResponseModel salvarEmpresa(@RequestBody EmpresaEntity empresa) {
		
		ResponseModel response = new ResponseModel();
		
		try {
			empresaService.salvarOuCadastrar(empresa);
			response.setResponseStatus(ResponseStatus.OK.getCode());
			response.setMessage("Salvo com sucesso");
			response.setData(empresa);
		}
		catch(Exception e) {
			response.setResponseStatus(ResponseStatus.INTERNAL_ERROR.getCode());
			response.setMessage("Erro ao salvar a empresa");
			response.setData(e);
		}
		
		return response;
		
	}
	
	@GetMapping(path="inativar")
	public ResponseModel inativarEmpresa(@RequestParam(value="cdEmpresa") Integer cdEmpresa) {
		
		ResponseModel response = new ResponseModel();

		
		try {
			empresaService.inativarEmpresa(cdEmpresa);
			response.setResponseStatus(ResponseStatus.OK.getCode());
			response.setMessage("Inativado com sucesso");
			response.setData(cdEmpresa);
		}
		catch(Exception e) {
			response.setResponseStatus(ResponseStatus.INTERNAL_ERROR.getCode());
			response.setMessage("Erro ao inativar a empresa");
			response.setData(e);
		}
		
		return response;             
		
	}
	
	@GetMapping(path="listar")
	public ResponseModel listarEmpresas() {
		
		ResponseModel response = new ResponseModel();
		
		try {
			
			List<EmpresaEntity> empresaList = new ArrayList<EmpresaEntity>();
			
			empresaList = empresaRepository.findAll();
			
			response.setData(empresaList);
			response.setMessage("Ok");
			response.setResponseStatus(ResponseStatus.OK.getCode());
			
		}
		catch(Exception e) {
			response.setData(e);
			response.setMessage("Ocorreu um erro ao listar as empresas!");
			response.setResponseStatus(ResponseStatus.INTERNAL_ERROR.getCode());
			
		}
		
		return response;
		
	}
	
}
