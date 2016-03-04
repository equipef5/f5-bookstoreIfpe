package br.com.equipef5.bookstore.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.bookstore.Dao.AdmDao;
import br.com.equipef5.bookstore.model.Adm;

@Controller
public class AdministradorController {
	
	@RequestMapping("/exibirIncluirAdministrador")
	public String exibirIncluirAdministrador() {
	return "Administrador/incluirAdministrador";
	}
	
	@RequestMapping("incluirAdministrador")
	public String incluirAdministrador(@Valid Adm adm, BindingResult result) {
		
	if (result.hasErrors()) {
	   return "forward:exibirIncluirAdministrador";
	}
		
	AdmDao dao = new AdmDao();
	dao.salvar(adm);
	return "index";
	}
	
	@RequestMapping("efetuarLogin")
	public String efetuarLogin(Adm adm, HttpSession session, Model model) {
		
	AdmDao dao = new AdmDao();
	Adm administradorLogado = dao.buscarUsuario(adm);
		
	if (administradorLogado != null) {
	session.setAttribute("administradorLogado", administradorLogado);
    return "MenuPrincipal/home";
	}
		
	model.addAttribute("msg", "Não foi encontrado um usuário com o login e senha informados.");
	return "index";
	}
	
	
	@RequestMapping("/exibirAlterarSenha")
    public String exibirAlterarSenha(Model model, Adm adm) {

	AdmDao dao = new AdmDao();
	Adm admConsultado = dao.buscar(adm.getLogin());
	model.addAttribute("Adm", admConsultado);
	return "Administrador/alterar";
    }
    
    @RequestMapping("alterarUsuario")
    public String alterarLivro(Adm adm, Model model) {

    AdmDao dao = new AdmDao();
	dao.alterar(adm);
	model.addAttribute("Adm", adm);
	return "MenuPrincipal/home";
    }
    
    @RequestMapping("logout")
    public String logout(HttpSession session) {
    session.invalidate();
    return "index";
    }

}
