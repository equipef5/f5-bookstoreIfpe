package br.com.equipef5.bookstore.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Livro {
	//Atributos
	private int idLivro;
	
	@NotEmpty(message="O campo título deve ser preenchido")
    @Size(max = 50, message="O campo título deve ter um tamanho máximo de 50 caracteres")
	private String titulo;
	
	@NotEmpty(message="O campo autor deve ser preenchido")
    @Size(max = 50, message="O campo autor deve ter um tamanho máximo de 50 caracteres")
	private String autor;
	
	@NotEmpty(message="O campo editora deve ser preenchido")
    @Size(max = 30, message="O campo editora deve ter um tamanho máximo de 30 caracteres")
	private String editora;
	
	@NotEmpty(message="O campo ano deve ser preenchido")
    @Size(max = 6, message="O ano nome deve ter um tamanho máximo de 6 caracteres")
	private String ano;
	
	@NotEmpty(message="O campo quantidade eve ser preenchido")
    @Size(max = 6, message="O campo quantidade deve ter um tamanho máximo de 6 caracteres")
	private int quantidade;
	
	private String imagem;
	
	public int getidLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	//MÃ©todos

  
	


	
}
