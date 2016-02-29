package br.com.equipef5.bookstore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.equipef5.bookstore.Dao.AlunoDao;
import br.com.equipef5.bookstore.model.Aluno;

@Controller
public class AlunoController {

	@RequestMapping("/exibirCadastrarAluno")
	public String exibirCadastrarAluno() {
	return "Aluno/incluirAluno";
	}

	@RequestMapping("incluirAluno")
	public String incluirAluno(Aluno modelAluno) {
		
	AlunoDao dao = new AlunoDao();
	dao.salvar(modelAluno);
	return "Aluno/incluirAluno";
	}

	@RequestMapping("/exibirGerenciarAluno")
	public String exibirGerenciarAluno(Model model,@RequestParam("titulo") String titulo) {
		
	AlunoDao dao = new AlunoDao();
	List<Aluno> listarAlunos = dao.listar();
	model.addAttribute("listarAlunos", listarAlunos);
	model.addAttribute("titulo", titulo);
	return "Aluno/gerenciarAluno";
	}

	@RequestMapping("/pesquisarAluno")
	public String PesquisarAluno(Model model, String cpf) {
		
	AlunoDao dao = new AlunoDao();
	Aluno listarAlunos = dao.buscar(cpf);
	model.addAttribute("listarAlunos", listarAlunos);
	return "Aluno/gerenciarAluno";
	}

	@RequestMapping("/exibirAlterarAluno")
	public String exibirAlterarProduto(Model model, Aluno aluno) {

	AlunoDao dao = new AlunoDao();
	Aluno alunoConsultado = dao.buscar(aluno.getCpf());
	model.addAttribute("alunoA", alunoConsultado);
    return "forward:exibirGerenciarAluno";
	}

	@RequestMapping("alterarAluno")
	public String alterarAluno(Aluno aluno, Model model) {

	AlunoDao dao = new AlunoDao();
	dao.alterar(aluno);
	model.addAttribute("Aluno", aluno);
    return "forward:exibirGerenciarAluno";
	}

	@RequestMapping("removerAluno")
	public String removerAluno(Aluno modelAluno, Model model) {

	AlunoDao dao = new AlunoDao();
	dao.remover(modelAluno);
    return "forward:exibirGerenciarAluno";
	}

}
