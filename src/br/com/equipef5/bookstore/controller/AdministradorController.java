package br.com.equipef5.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String incluirAdministrador(Adm adm) {
		
	AdmDao dao = new AdmDao();
	dao.salvar(adm);
	return "Login/index";
	}
	
	@RequestMapping("/exibirAlterarSenha")
    public String exibirAlterarSenha(Model model, Adm adm) {

	AdmDao dao = new AdmDao();
	Adm admConsultado = dao.buscar(adm.getLogin());
	model.addAttribute("Adm", admConsultado);
	return "Administrador/alterarSenha";
    }
    
    @RequestMapping("alterarSenha")
    public String alterarLivro(Adm adm, Model model) {

    AdmDao dao = new AdmDao();
	dao.alterar(adm);
	model.addAttribute("Adm", adm);
	return "Login/index";
    }
}
