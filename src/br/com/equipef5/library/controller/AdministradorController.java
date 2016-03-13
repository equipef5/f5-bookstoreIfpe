package br.com.equipef5.library.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.library.Dao.AdmDao;
import br.com.equipef5.library.model.Adm;

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
	return "forward:mensagemCadastrarAdministrador";
	}
	
	@RequestMapping("mensagemCadastrarAdministrador")
	public String mensagemAluno(Model model) {
	model.addAttribute("mensagem", "Aluno cadastrado com sucesso");
    return "Administrador/mensagem";
	    }
}
