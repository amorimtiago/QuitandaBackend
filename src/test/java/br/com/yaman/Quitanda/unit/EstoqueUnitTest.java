package br.com.yaman.Quitanda.unit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.yaman.quitanda.App;
import br.com.yaman.quitanda.repository.EstoqueRepository;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
@SuppressWarnings("deprecation")
public class EstoqueUnitTest {
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Before
	public void init() {
		Assert.assertNotNull(estoqueRepository);
	}
	
	@Test
	public void estoquePorTipoProdutoTest() {
		List<Object[]> estoque = estoqueRepository.estoquePorTipoProduto();
		
		Assert.assertTrue(estoque.size() == 3);
	}	
}

