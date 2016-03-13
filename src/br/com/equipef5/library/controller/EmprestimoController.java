package br.com.equipef5.library.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.equipef5.library.Dao.AlunoDao;
import br.com.equipef5.library.Dao.EmprestimoDao;
import br.com.equipef5.library.Dao.LivroDao;
import br.com.equipef5.library.model.Aluno;
import br.com.equipef5.library.model.Emprestimo;
import br.com.equipef5.library.model.Livro;

@Controller
public class EmprestimoController {

	@RequestMapping("/exibirEmprestimoLivro")
	public String exibirEmprestimoLivro(Model model, Livro livro, String titulo, Aluno aluno,String id) {

		LivroDao daoLivro = new LivroDao();
		List<Livro> listarLivroE = daoLivro.listar();
		model.addAttribute("listarLivroE", listarLivroE);

		EmprestimoDao daoAluno = new EmprestimoDao();
		List<Aluno> listarAlunoE = daoAluno.listarAlunosE(id);
		model.addAttribute("listarAlunoE", listarAlunoE);
		
		EmprestimoDao dao = new EmprestimoDao();

		Livro livroEConsultado = dao.buscarLivroEmprestimo(titulo);
		model.addAttribute("LivroE", livroEConsultado);

		Calendar dataEmprestimo = Calendar.getInstance();
		model.addAttribute("dataEmprestimo", dataEmprestimo.getTime());

		dataEmprestimo.add(Calendar.DAY_OF_MONTH, 7);
		model.addAttribute("dataDevolucao", dataEmprestimo.getTime());

		return "Biblioteca/emprestimoLivro";
	}

	@RequestMapping("/exibirGerenciarAlunoE")
	public String exibirGerenciarAlunoE(Model model, @RequestParam("titulo") String titulo) {

		AlunoDao dao = new AlunoDao();
		List<Aluno> listarAlunos = dao.listar();
		model.addAttribute("listarAlunos", listarAlunos);
		model.addAttribute("titulo", titulo);
		return "Biblioteca/DadosDoAluno";
	}

	@RequestMapping("/AlunoE")
	public String AlunoE(Model model, String id, Aluno aluno, @RequestParam("id") String titulo) {

		EmprestimoDao dao = new EmprestimoDao();
		System.out.println(titulo);
		Aluno AlunoE = dao.buscarAlunoEmprestimo(id);
		model.addAttribute("AlunoE", AlunoE);
		return "forward:exibirEmprestimoLivro";
	}


	@RequestMapping("incluirEmprestimo")
	public String incluirEmprestimo(Emprestimo emprestimo) {

		EmprestimoDao dao = new EmprestimoDao();
		dao.salvarEmprestimo(emprestimo);
		return "forward:exibirListaEmprestimo";
	}
	@RequestMapping("/exibirListaEmprestimo")
	public String exibirListaEmprestimo(Model model) {
		
	EmprestimoDao dao = new EmprestimoDao();
	List<Emprestimo> listarEmprestimo = dao.listarEmprestimo();
	model.addAttribute("listarEmprestimo", listarEmprestimo);
	
	return "Biblioteca/listaEmprestimo";
	}
	@RequestMapping("alterarStatusEmprestimo")
	public String alterarStatusEmprestimo( @RequestParam("id") int  id,  @RequestParam("STATUS") String status) {
        status = "Devolvido";
		EmprestimoDao dao = new EmprestimoDao();
	    Emprestimo emprestimo = new Emprestimo();
	    emprestimo.setId(id);
		dao.alterarStatusEmprestimo(emprestimo, status);
		return "forward:exibirListaEmprestimo";
	}

}


