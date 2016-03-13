package br.com.equipef5.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.library.Dao.AlunoDao;
import br.com.equipef5.library.model.Aluno;

@Controller
public class AlunoController {
	
	@RequestMapping("/exibirCadastrarAluno")
	public String exibirCadastrarAluno() {
	return "Aluno/incluirAluno";
	}

	@RequestMapping("incluirAluno")
	public String incluirAluno(Aluno aluno) {
		
	AlunoDao dao = new AlunoDao();
	dao.salvar(aluno);
	return "forward:mensagemCadastrarAluno";
	}

	@RequestMapping("/exibirGerenciarAluno")
	public String exibirGerenciarAluno(Model model) {
		
	AlunoDao dao = new AlunoDao();
	List<Aluno> listarAlunos = dao.listar();
	model.addAttribute("listarAlunos", listarAlunos);
	
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
    return "Aluno/alterarAluno";
	}

	@RequestMapping("alterarAluno")
	public String alterarAluno(Aluno aluno, Model model) {

	AlunoDao dao = new AlunoDao();
	dao.alterar(aluno);
	model.addAttribute("aluno", aluno);
	return "forward:mensagemAlterarAluno";
	}

	@RequestMapping("removerAluno")
	public String removerAluno(Aluno modelAluno, Model model) {

	AlunoDao dao = new AlunoDao();
	dao.remover(modelAluno);
    return "forward:exibirGerenciarAluno";
	}
	
	 @RequestMapping("mensagemCadastrarAluno")
	 public String mensagemAluno(Model model) {
	 model.addAttribute("mensagem", "Aluno cadastrado com sucesso");
	 return "Aluno/mensagem";
	 }
	 
	 @RequestMapping("mensagemAlterarAluno")
	  public String mensagemAlterarAluno(Model model) {
	  model.addAttribute("mensagem", "Aluno alterado com sucesso");
	  return "Aluno/mensagemAlterar";
	  }

}
