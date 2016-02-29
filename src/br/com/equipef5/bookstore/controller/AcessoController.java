package br.com.equipef5.bookstore.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.bookstore.Dao.AdmDao;
import br.com.equipef5.bookstore.model.Adm;


@Controller
public class AcessoController {
	
	@RequestMapping("/exibirCadastroLogin")
	public String exibirCadastroLogin() {
    return "Login/incluirLogin";
	}

	@RequestMapping("incluirLogin")
	public String incluirLogin(Adm adm) {
	
	AdmDao dao = new AdmDao();
	dao.salvar(adm);
    return "Login/index";
	}
	
	@RequestMapping("/exibirLogin")
	public String exibirLogin() {
	return "Login/index";
	}
	
	@RequestMapping("efetuarLogin")
	public String efetuarLogin(Adm adm, HttpSession session, Model model) {
		
	AdmDao dao = new AdmDao();
	Adm usuarioLogado = dao.buscarUsuario(adm);
		
	if (usuarioLogado != null) {
	session.setAttribute("usuarioLogado", usuarioLogado);
    return "MenuPrincipal/home";
	}
		
	model.addAttribute("msg", "Não foi encontrado um usuário com o login e senha informados.");
	return "Login/index";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
	  
	session.invalidate();
	return "Login/index";
	}
	 
}
