package br.com.equipef5.library.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.equipef5.library.Dao.AdmDao;
import br.com.equipef5.library.model.Adm;

@Controller
public class AcessoController {
	
	 @RequestMapping("efetuarLogin")
	    public String efetuarLogin(Adm adm, HttpSession session, Model model) {

		AdmDao dao = new AdmDao();
		Adm administradorLogado = dao.buscarUsuario(adm);

		if (administradorLogado != null) {
		    session.setAttribute("administradorLogado", administradorLogado);
		    return "forward:exibirHome";
		}

		model.addAttribute("msg", "N�o foi encontrado um usu�rio com o login e senha informados.");
		return "index";
	    }

	    @RequestMapping("logout")
	    public String logout(HttpSession session) {

		session.invalidate();
		return "index";
	    }

	    @RequestMapping("/exibirHome")
	    public String exibirHome(Adm adm, HttpSession session, Model model) {

		return "Principal/home";
	    }
	    

	   

	}
