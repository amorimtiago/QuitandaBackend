package br.com.yaman.quitanda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.yaman.quitanda.dao.entity.Estoque;

/**
 * 
 * @author tiagoamorim
 *
 */
@Repository
@Transactional
public interface EstoqueRepository extends JpaCustomRepository<Estoque>{

	@Query(value = "select tipo_produto.cod_tipo_produto as cod_tipo_produto , tipo_produto.nome as nome, sum(estoque.qtd_disponivel) as qtd_disponivel " + 
			"from estoque " +  
			"inner join produto on estoque.cod_produto = produto.cod_produto " + 
			"inner join tipo_produto on produto.cod_tipo_produto = tipo_produto.cod_tipo_produto " + 
			"group by tipo_produto.cod_tipo_produto, tipo_produto.nome",  nativeQuery=true)
	public List<Object[]> estoquePorTipoProduto();
	
}
