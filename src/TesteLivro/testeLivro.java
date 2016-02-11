package TesteLivro;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.equipef5.bookstore.Dao.LivroDao;
import br.com.equipef5.bookstore.model.modelLivro;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testeLivro {
	@Test
	public void guardarInformacoes() throws Exception {
		LivroDao dao = new LivroDao();
		modelLivro modelLivro= new modelLivro();
		modelLivro modelLivroPesquisa = new modelLivro();

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
}
