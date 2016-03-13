package br.com.equipef5.library.controller;

import org.springframework.core.convert.converter.Converter;

import br.com.equipef5.library.Dao.LivroDao;
import br.com.equipef5.library.model.Livro;

public class LivroConverter implements Converter<String, Livro> {
	
	public Livro convert(String idLivro) {
		
		LivroDao dao = new LivroDao();
		return dao.buscarId(Integer.valueOf(idLivro));
	}
}
