package br.com.equipef5.bookstore.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.equipef5.bookstore.Dao.LivroDao;
import br.com.equipef5.bookstore.model.Livro;
import br.com.equipef5.bookstore.util.Util;

@Controller
public class LivroController {

	@RequestMapping("/exibirCadastrarLivro")
	public String exibirCadastrarLivro() {
	return "Livro/incluirLivro";
	 }

	@RequestMapping("incluirLivro")
	public String incluirLivro(Livro livro, @RequestParam ("file") MultipartFile imagem, Model model) {
		
	if (Util.fazerUploadImagem(imagem)) {
	livro.setImagem(Calendar.getInstance().getTime() + " - " + imagem.getOriginalFilename());
	 }
		
	LivroDao dao = new LivroDao();
	dao.salvar(livro);
	return "forward:exibirCadastrarLivro";
	 }

	@RequestMapping("/exibirGerenciarLivro")
	public String exibirGerenciarLivro(Model model) {
		
	LivroDao dao = new LivroDao();
	List<Livro> listarLivros = dao.listar();
	model.addAttribute("listarLivros", listarLivros);
	return "Livro/gerenciarLivro";
	 } 
	
	@RequestMapping("/pesquisarLivro")
    public String PesquisarLivro(Model model, String titulo) {
	 	 
	LivroDao dao = new LivroDao();
	Livro listarLivros = dao.buscar(titulo);
	model.addAttribute("listarLivros", listarLivros);
	return "Livro/gerenciarLivro";
     }    
	
    @RequestMapping("/exibirAlterarLivro")
    public String exibirAlterarLivro(Model model, Livro livro) {

  	LivroDao dao = new LivroDao();
	Livro livroConsultado = dao.buscar(livro.getTitulo());
	model.addAttribute("LivroL", livroConsultado);
    return "forward:exibirGerenciarLivro";
    }
    
    @RequestMapping("alterarLivro")
    public String alterarLivro(Livro livro, Model model) {

   	LivroDao dao = new LivroDao();
	dao.alterar(livro);
	model.addAttribute("Livro", livro);
	return "forward:exibirGerenciarLivro";
    }
    
    @RequestMapping("removerLivro")
    public String removerLivro(Livro livro, Model model) {

    LivroDao dao = new LivroDao();
	dao.remover(livro);
	return "forward:exibirGerenciarLivro";
    }

}
