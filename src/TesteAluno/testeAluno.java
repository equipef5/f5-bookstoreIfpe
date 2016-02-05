package TesteAluno;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.equipef5.bookstore.Dao.AlunoDao;
import br.com.equipef5.bookstore.model.modelAluno;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testeAluno {

	@Test
	public void guardarInformaçoes() throws Exception {
		AlunoDao dao = new AlunoDao();
		modelAluno modelAluno = new modelAluno();
		modelAluno modelAlunoPesquisa = new modelAluno();

		modelAluno.setNome("Cicero");
		modelAluno.setCpf("111.111.111-11");
		modelAluno.setEmail("josecicero@hotmail.com");
		modelAluno.setMatricula("111");
		modelAluno.setTelefone("999999999");

		dao.salvar(modelAluno);
		modelAlunoPesquisa = dao.buscar(modelAluno.getCpf());
		dao.close();
		Assert.assertEquals ("111.111.111-11",modelAlunoPesquisa.getCpf());
	}

	@Test
	public void removerAluno() throws SQLException {
		AlunoDao dao = new AlunoDao();
		modelAluno modelAlunoPesquisa = new modelAluno();
		modelAlunoPesquisa = dao.buscar("111.111.111-11");
		Assert.assertEquals ("111.111.111-11",modelAlunoPesquisa.getCpf());
		dao.remover(modelAlunoPesquisa);
		modelAlunoPesquisa = dao.buscar("111.111.111-11");
		dao.close();
		Assert.assertEquals (null,modelAlunoPesquisa);

	}




}
