package br.com.equipef5.bookstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.equipef5.bookstore.Dao.BibliotecaDao;
import br.com.equipef5.bookstore.Dao.LivroDao;
import br.com.equipef5.bookstore.model.Aluno;
import br.com.equipef5.bookstore.model.Livro;
@Controller
public class BibliotecaController {
	
	@RequestMapping("/exibirBiblioteca")
	 public String exibirBiblioteca(Model model, String imagem) {
		 
	 BibliotecaDao dao = new BibliotecaDao();
	 List<Livro> listarLivrosE = dao.listar(imagem);
	 model.addAttribute("listarLivrosE", listarLivrosE);
	 return "Biblioteca/biblioteca";
	  }       
	 
	 @RequestMapping("/exibirEmprestimoLivro")
	 public String exibirEmprestimoLivro(Model model, Livro livro, String titulo) {

	 BibliotecaDao dao = new BibliotecaDao();
	 Livro livroEConsultado = dao.buscarLivroEmprestimo(titulo);
	 model.addAttribute("LivroE", livroEConsultado);
	 return "Biblioteca/emprestimoLivro";
	  }

	 @RequestMapping("/dadosA")
	 public String dadosA(Model model, String id, Aluno aluno,@RequestParam("id") String titulo) {
	 
	 BibliotecaDao dao = new BibliotecaDao();
	 System.out.println(titulo);
	 Aluno dadosA = dao.buscarAlunoEmprestimo(id);
	 model.addAttribute("dadosA", dadosA);
	 return "forward:exibirEmprestimoLivro";
	  }

	  
	  
	

	
}
