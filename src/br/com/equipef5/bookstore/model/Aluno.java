package br.com.equipef5.bookstore.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author ifpe
 *
 */
public class Aluno {

	//Atributos
	private int idAluno;
	
	@NotEmpty(message="O campo nome deve ser preenchido")
    @Size(max = 50, message="O campo nome deve ter um tamanho máximo de 50 caracteres")
	private String nome;
	
	@NotEmpty(message="O campo cpf deve ser preenchido")
    @Size(max = 14, message="O campo cpf deve ter um tamanho máximo de 14 caracteres")
	private String cpf;
	
	@NotEmpty(message="O campo telefone deve ser preenchido")
    @Size(max = 20, message="O campo telefone deve ter um tamanho máximo de 20 caracteres")
	private String telefone;
	
	@NotEmpty(message="O campo e-mail deve ser preenchido")
    @Size(max = 50, message="O campo e-mail deve ter um tamanho máximo de 50  caracteres")
	private String email;
	
	@NotEmpty(message="O campo matricula deve ser preenchido")
    @Size(max = 8, message="O campo matricula  deve ter um tamanho máximo de  8 caracteres")
	private String matricula;
	
	
	// MÃ©todos
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

	
}
