package br.com.equipef5.library.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Professor {
	
	private int idProfessor;
	
	@NotEmpty(message="O campo cÛdigo deve ser preenchido")
    @Size(max = 14, message="O campo  cÛdigo deve ter um tamanho m√°ximo de 14 caracteres")
	private String codigo;
	
	@NotEmpty(message="O campo nome deve ser preenchido")
    @Size(max = 50, message="O campo nome deve ter um tamanho m√°ximo de 50 caracteres")
	private String nome;
	
	@NotEmpty(message="O campo e-mail deve ser preenchido")
    @Size(max = 50, message="O campo e-mail deve ter um tamanho m√°ximo de 50 caracteres")
	private String email;

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
