package br.com.yaman.quitanda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitanda.dao.entity.Estoque;
import br.com.yaman.quitanda.repository.EstoqueRepository;

/**
 * 
 * @author tiagoamorim
 *
 */
@Service
public class EstoqueServiceImpl implements EstoqueService{

	@Autowired
	private EstoqueRepository estoqueRepository;
	
	public List<Object[]> estoquePorTipoProduto(){
		return estoqueRepository.estoquePorTipoProduto();
	};
	
	
	@Override
	public List<Estoque> findAll() {
		return estoqueRepository.findAll();
	}

	@Override
	public Estoque save(Estoque t) {
		return estoqueRepository.save(t);
	}

	@Override
	public Estoque findOne(Integer id) {
		return estoqueRepository.findOne(id);
	}

	@Override
	public void delete(Estoque t) {
		estoqueRepository.delete(t); 
	}

}
