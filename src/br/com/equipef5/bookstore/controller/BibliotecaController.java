package br.com.equipef5.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.bookstore.Dao.AlunoDao;
import br.com.equipef5.bookstore.Dao.LivroDao;
import br.com.equipef5.bookstore.model.modelAluno;
import br.com.equipef5.bookstore.model.modelLivro;

@Controller
public class BibliotecaController {
	@RequestMapping("/exibirCadastrarAluno")
	public String exibirCadastrarAluno() {
	return "incluirAluno";
	}

	@RequestMapping("incluirAluno")
	
	public String incluirAluno(modelAluno aluno) {
	AlunoDao dao = new AlunoDao();
	dao.salvar(aluno);
	return null ;
	}
	
	@RequestMapping("/exibirCadastrarLivro")
	public String exibirCadastrarLivro() {
	return "incluirLivro";
	}

	@RequestMapping("incluirLivro")
	
	public String incluirLivro(modelLivro livro) {
	LivroDao dao = new LivroDao();
	dao.salvar(livro);
	return null ;
	}
}
