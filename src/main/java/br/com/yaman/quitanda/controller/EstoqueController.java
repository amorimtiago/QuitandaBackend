package br.com.yaman.quitanda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.business.EstoqueBusiness;
import br.com.yaman.quitanda.business.GenericCrudBusiness;
import br.com.yaman.quitanda.dao.entity.Estoque;

/**
 * 
 * @author tiagoamorim
 *
 */

@RestController
@RequestMapping(value = "estoque")
public class EstoqueController extends CrudControllerBase<Estoque>{

	@Autowired
	private EstoqueBusiness business;
	
	@Override
	public GenericCrudBusiness<Estoque> getBusinessClass() {
		return business;
	}
	
	/**
	 * Retorna soma de quantidades disponíveis para cada tipo de produto no estoque
	 * @return
	 */
	@RequestMapping(value = "tipo-produto", method = RequestMethod.GET)
	public List<Object[]> estoquePorTipoProduto() {
		return business.estoquePorTipoProduto();
	}

}
