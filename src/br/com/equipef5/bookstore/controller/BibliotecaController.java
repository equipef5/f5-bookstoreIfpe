package br.com.equipef5.bookstore.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.equipef5.bookstore.Dao.AlunoDao;
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
		
		Calendar dataEmprestimo = Calendar.getInstance();
		model.addAttribute("dataEmprestimo", dataEmprestimo.getTime());
		
		dataEmprestimo.add(Calendar.DAY_OF_MONTH, 7);
		model.addAttribute("dataDevolucao", dataEmprestimo.getTime());
		
		return "Biblioteca/emprestimoLivro";
	}

	@RequestMapping("/dadosA")
	public String dadosA(Model model, String id, Aluno aluno, @RequestParam("id") String titulo) {

		BibliotecaDao dao = new BibliotecaDao();
		System.out.println(titulo);
		Aluno dadosA = dao.buscarAlunoEmprestimo(id);
		model.addAttribute("dadosA", dadosA);
		return "forward:exibirEmprestimoLivro";
	}
	@RequestMapping("/exibirGerenciarAlunoE")
	public String exibirGerenciarAlunoE(Model model,@RequestParam("titulo") String titulo) {
		
	AlunoDao dao = new AlunoDao();
	List<Aluno> listarAlunos = dao.listar();
	model.addAttribute("listarAlunos", listarAlunos);
	model.addAttribute("titulo", titulo);
	return "Aluno/gerenciarAluno";
	}
	
	@RequestMapping("/exibirIncluirEmprestimo")
	public String exibirIncluirProduto(Model model,Livro livro,Aluno aluno) {
	//Código para popular o combo de categoria de produto
	BibliotecaDao dao = new BibliotecaDao();
	LivroDao dao1 = new LivroDao();
	AlunoDao dao2 =new AlunoDao();
	List<Livro> listarLivrosE = dao1.listar();
	List<Aluno> listarAlunosE = dao2.listar();
	model.addAttribute("listarLivrosE", listarLivrosE);
	model.addAttribute("listarAlunosE ", listarAlunosE );
	return "/incluirProduto";
	}

	
}
