package testeLivro;

import org.junit.Assert;
import org.junit.Test;

public class testeCadastroLivro {
	@Test
	
	public void guardarInformaçoes() throws Exception {
	livro livro = new livro();
	
	livro.setTitulo("misterio");
	livro.setAutor("Machado");
	livro.setImagem("rosto");
	livro.setQtd(1);
	
		
		Assert.assertEquals ("Machado",livro.getAutor());
	}

	private void assertEquals() {
		// TODO Auto-generated method stub
		
	}
}
