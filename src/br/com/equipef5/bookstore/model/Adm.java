package br.com.equipef5.bookstore.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Adm {
	
	private int id;
    
	@NotEmpty(message="O campo nome deve ser preenchido")
    @Size(max = 50, message="O campo nome deve ter um tamanho máximo de 50 caracteres")
	private String nome;
	
	@NotEmpty(message="O campo login deve ser preenchido")
    @Size(max = 30, message="O campo login deve ter um tamanho máximo de 30 caracteres")
	private String login;
	
	@NotEmpty(message="O campo senha deve ser preenchido")
    @Size(max = 14, message="O senha título deve ter um tamanho máximo de 14 caracteres")
	private String senha;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
