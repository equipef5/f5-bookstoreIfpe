package br.com.equipef5.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.equipef5.bookstore.Dao.AlunoDao;
import br.com.equipef5.bookstore.Dao.LivroDao;
import br.com.equipef5.bookstore.model.modelAluno;
import br.com.equipef5.bookstore.model.modelLivro;
import br.com.equipef5.bookstore.util.Util;

import java.util.Calendar;

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
	
	public String incluirLivro(modelLivro livro,@RequestParam("file")MultipartFile imagem) {
		if (Util.fazerUploadImagem(imagem)) {
			livro.setImagem(Calendar.getInstance().getTime() + " - " + imagem.getOriginalFilename());
		}
	LivroDao dao = new LivroDao();
	dao.salvar(livro);
	return null ;
	}
	}
