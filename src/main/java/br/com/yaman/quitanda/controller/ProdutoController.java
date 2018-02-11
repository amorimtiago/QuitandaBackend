package br.com.yaman.quitanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.business.GenericCrudBusiness;
import br.com.yaman.quitanda.business.ProdutoBusiness;
import br.com.yaman.quitanda.dao.entity.Produto;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController extends CrudControllerBase<Produto> {
	
	@Autowired
	private ProdutoBusiness business;

	@Override
	public GenericCrudBusiness<Produto> getBusinessClass() {		
		return business;
	}

}
