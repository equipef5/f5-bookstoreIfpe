package br.com.equipef5.bookstore.model;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.bookstore.util.ConnectionFactory;

public class AlunoDao {
	
	private Connection connection;
	public AlunoDao() {
	try {
	this.connection = (Connection) new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	throw new RuntimeException(e);
	}
	}
	public void salvar(Aluno aluno) {
	try {
	String sql = "INSERT INTO alunos (nome, cpf, telefone, email, matricula) VALUES (?,?,?,?,?)";
	PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
	
	
	stmt.setString(1, aluno.getNome());
	stmt.setString(2, aluno.getCpf());
	stmt.setString(3, aluno.getTelefone());
	stmt.setString(4, aluno.getEmail());
	stmt.setString(5, aluno.getMatricula());
	

	 stmt.execute();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
 }
}
	
