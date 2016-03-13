package br.com.equipef5.library.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Emprestimo {
	
	private int id;
	private Aluno aluno;
    private Livro livro;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private	Date dataEmprestimo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataDevolucao;
    private String status;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Aluno getAluno() {
		return this.aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	public Livro getLivro() {
		return this.livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
