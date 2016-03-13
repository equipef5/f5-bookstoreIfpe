package TesteLivro;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.equipef5.library.Dao.LivroDao;
import br.com.equipef5.library.model.Livro;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testeLivro {
	@Test
	public void guardarInformacoes() throws Exception {
		LivroDao dao = new LivroDao();
		Livro modelLivro= new Livro();
		Livro modelLivroPesquisa = new Livro();

		modelLivro.setTitulo("java");
		modelLivro.setAutor("ifpe");
		modelLivro.setEditora("ifppe");
		modelLivro.setAno("1998");;
		modelLivro.setImagem("ifpe.png");;

		dao.salvar(modelLivro);
		modelLivroPesquisa = dao.buscar(modelLivro.getTitulo());
		dao.close();
		Assert.assertEquals ("java",modelLivroPesquisa.getTitulo());
	}
	@Test
	public void removerLivro() throws SQLException {
		LivroDao dao = new LivroDao();
	Livro modelLivro = new Livro();
		modelLivro = dao.buscar("java");
		dao.remover(modelLivro);
		modelLivro = dao.buscar("java");
		dao.close();
		Assert.assertEquals (null,modelLivro);

	}
	
		
			



	}
	
	
	
	

