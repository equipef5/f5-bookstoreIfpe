package TestCadastrodeAluno;

import org.junit.Test;

import junit.framework.Assert;

public class testCadastroAluno {
	@Test
	
	public void guardarInformações() throws Exception {
	Aluno aluno = new Aluno();
	
	aluno.setnome("Cicero");
	aluno.setCpf("111.111.111-11");
	aluno.setEmail("josecicero@hotmail.com");
	aluno.setMatricula("111");
	aluno.setTelefone(999999999);
		
		Assert.assertEquals ("Cicero",aluno.getnome());
	}

	private void assertEquals() {
		// TODO Auto-generated method stub
		
	}
}
