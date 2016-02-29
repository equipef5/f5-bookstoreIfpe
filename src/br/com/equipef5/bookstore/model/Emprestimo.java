package br.com.equipef5.bookstore.model;

import java.util.Date;

public class Emprestimo {
	String Aluno;
    private Livro Livro;
	Date dataEmprestimo;
	Date dataDevolucao;
	
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
