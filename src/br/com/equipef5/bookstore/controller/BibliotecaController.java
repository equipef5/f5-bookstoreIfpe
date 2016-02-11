package br.com.equipef5.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.equipef5.bookstore.Dao.AdmDao;
import br.com.equipef5.bookstore.Dao.AlunoDao;
import br.com.equipef5.bookstore.Dao.LivroDao;
import br.com.equipef5.bookstore.model.modelAluno;
import br.com.equipef5.bookstore.model.modelLivro;
import br.com.equipef5.bookstore.util.Util;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

@Controller
public class BibliotecaController {
	@RequestMapping("/exibirLogin")
	public String exibirLogin() {
	return "index";
}
	@RequestMapping("validarLogin")
	public String validarAdm(AdmDao adm, HttpSession session,String login,String senha) {
		AdmDao dao=new AdmDao();
	  if(new AdmDao().ValidarAdm(login, senha)) {
	    session.setAttribute("login", adm);
	    return "menu";
	  }
	  return "redirect:exibirLogin";
	}
   
	
    @RequestMapping("/exibirMenu")
    public String exibirMenu() {
    return "menu";
}

	@RequestMapping("/exibirCadastrarAluno")
	public String exibirCadastrarAluno() {
	return "incluirAluno";
}

	@RequestMapping("incluirAluno")
	
	public String incluirAluno(modelAluno modelAluno) {
	AlunoDao dao = new AlunoDao();
	dao.salvar(modelAluno);
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
	
	@RequestMapping("/exibirGerenciarAluno")
	public String exibirGerenciarAluno(Model model) {
		  AlunoDao dao = new AlunoDao();
		  List<modelAluno> listarAlunos = dao.listar();
		  model.addAttribute("listarAlunos", listarAlunos);
		 return "gerenciarAluno";
	}

     @RequestMapping("/pesquisarAluno")
     public String PesquisarAluno(Model model, String cpf) {
	  AlunoDao dao = new AlunoDao();
	  modelAluno listarAlunos = dao.buscar(cpf);
	  model.addAttribute("listarAlunos", listarAlunos);
	   return "gerenciarAluno";
}
}