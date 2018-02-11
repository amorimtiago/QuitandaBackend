package br.com.yaman.quitanda.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.yaman.quitanda.dao.entity.Estoque;
import br.com.yaman.quitanda.service.EstoqueServiceImpl;

/**
 * 
 * @author tiagoamorim
 *
 */

@Component
public class EstoqueBusiness implements GenericCrudBusiness<Estoque>{

	@Autowired
	private EstoqueServiceImpl service; 
	
	public List<Object[]> estoquePorTipoProduto(){
		return service.estoquePorTipoProduto();
	};
	
	@Override
	public List<Estoque> findAll() {
		return service.findAll();
	}

	@Override
	public Estoque save(Estoque t) {
		return service.save(t);
	}

	@Override
	public Estoque findOne(Integer id) {
		return service.findOne(id);
	}

	@Override
	public void delete(Estoque t) {
		service.delete(t);		
	}

}
