package br.com.equipef5.library.controller;

import org.springframework.core.convert.converter.Converter;

import br.com.equipef5.library.Dao.AlunoDao;
import br.com.equipef5.library.model.Aluno;

public class AlunoConverter implements Converter<String, Aluno> {
	
	public Aluno convert(String idAluno) {
		
		AlunoDao dao = new AlunoDao();
		return dao.buscarId(Integer.valueOf(idAluno));
	}
}
