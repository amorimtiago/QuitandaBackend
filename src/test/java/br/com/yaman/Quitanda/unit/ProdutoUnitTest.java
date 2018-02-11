package br.com.yaman.Quitanda.unit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.yaman.quitanda.App;
import br.com.yaman.quitanda.dao.entity.Produto;
import br.com.yaman.quitanda.repository.ProdutoRepository;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
@SuppressWarnings("deprecation")
public class ProdutoUnitTest {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Before
	public void init() {
		Assert.assertNotNull(produtoRepository);
	}
	
	@Test
	public void findAllTest() {
		List<Produto> produtos = produtoRepository.findAll();
		Assert.assertTrue(produtos.size() > 0);
	}
	
	
}
