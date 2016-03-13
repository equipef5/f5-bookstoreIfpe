package br.com.equipef5.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.library.Dao.AlunoDao;
import br.com.equipef5.library.Dao.ProfessorDao;
import br.com.equipef5.library.model.Aluno;
import br.com.equipef5.library.model.Professor;


@Controller
public class ProfessorController {
	
	@RequestMapping("/exibirCadastrarProfessor")
	public String exibirCadastrarProfessor() {
	return "Professor/incluirProfessor";
	}

	@RequestMapping("incluirProfessor")
	public String incluirAluno(Professor professor) {
		
	ProfessorDao dao = new ProfessorDao();
	dao.salvar(professor);
	return "forward:mensagemCadastrarProfessor";
	}
	
	@RequestMapping("/exibirGerenciarProfessor")
	public String exibirGerenciarProfessor(Model model) {
		
	ProfessorDao dao = new ProfessorDao();
	List<Professor> listarProfessores = dao.listar();
	model.addAttribute("listarProfessores", listarProfessores);
	
	return "Professor/gerenciarProfessor";
	}

	@RequestMapping("/pesquisarProfessor")
	public String PesquisarAluno(Model model, String codigo) {
		
	ProfessorDao dao = new ProfessorDao();
	Professor listarProfessores = dao.buscar(codigo);
	model.addAttribute("listarProfessores", listarProfessores);
	return "Professor/gerenciarProfessor";
	}

	@RequestMapping("/exibirAlterarProfessor")
	public String exibirAlterarProduto(Model model, Professor professor) {

	ProfessorDao dao = new ProfessorDao();
	Professor professorConsultado = dao.buscar(professor.getCodigo());
	model.addAttribute("ProfessorP", professorConsultado);
    return "Professor/alterarProfessor";
	}

	@RequestMapping("alterarProfessor")
	public String alterarAluno(Professor professor, Model model) {

	ProfessorDao dao = new ProfessorDao();
	dao.alterar(professor);
	model.addAttribute("professor", professor);
    return "forward:mensagemAlterarProfessor";
	}

	@RequestMapping("removerProfessor")
	public String removerAluno(Professor professor, Model model) {

	ProfessorDao dao = new ProfessorDao();
	dao.remover(professor);
    return "forward:exibirGerenciarProfessor";
	}
	
	 @RequestMapping("mensagemCadastrarProfessor")
	 public String mensagemProfessor(Model model) {
	 model.addAttribute("mensagem", "Professor cadastrado com sucesso");
	 return "Professor/mensagem";
    }
	 
	 @RequestMapping("mensagemAlterarProfessor")
	  public String mensagemAlterarProfessor(Model model) {
	  model.addAttribute("mensagem", "Professor alterado com sucesso");
	  return "Professor/mensagemAlterar";
	    }
 

}

		