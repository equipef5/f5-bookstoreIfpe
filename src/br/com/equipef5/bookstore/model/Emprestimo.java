package br.com.equipef5.bookstore.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Emprestimo {
	
	private int id;
	private String Aluno;
    private Livro Livro;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	Date dataEmprestimo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
	Date dataDevolucao;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAluno() {
		return Aluno;
	}
	public void setAluno(String aluno) {
		Aluno = aluno;
	}
	
	public Livro getLivro() {
		return Livro;
	}
	public void setLivro(Livro livro) {
		Livro = livro;
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
	
	
	

}
