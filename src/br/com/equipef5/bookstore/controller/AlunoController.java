package br.com.equipef5.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.bookstore.model.Aluno;
import br.com.equipef5.bookstore.model.AlunoDao;

@Controller
public class AlunoController {
	@RequestMapping("/exibirCadastrarAluno")
	public String exibirCadastrarAluno() {
	return "incluirAluno";
	}

	@RequestMapping("incluirAluno")
	
	public String incluirAluno(Aluno aluno) {
	AlunoDao dao = new AlunoDao();
	dao.salvar(aluno);
	return null ;
	}
}
