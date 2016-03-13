package br.com.equipef5.library.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.library.Dao.AlunoDao;
import br.com.equipef5.library.Dao.BibliotecaDao;
import br.com.equipef5.library.model.Aluno;
import br.com.equipef5.library.model.Livro;

@Controller
public class BibliotecaController {

	@RequestMapping("/exibirBiblioteca")
	public String exibirBiblioteca(Model model, String imagem) {

		BibliotecaDao dao = new BibliotecaDao();
		List<Livro> listarLivrosE = dao.listar(imagem);
		model.addAttribute("listarLivrosE", listarLivrosE);
		return "Biblioteca/biblioteca";
	}

	}


