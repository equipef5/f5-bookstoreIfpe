package br.com.equipef5.bookstore.Dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.bookstore.model.modelLivro;
import br.com.equipef5.bookstore.util.ConnectionFactory;

public class LivroDao {
	
	private Connection connection;
	public LivroDao() {
	try {
	this.connection = (Connection) new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	throw new RuntimeException(e);
	}
	}
	public void salvar(modelLivro livro) {
	try {
	String sql = "INSERT INTO livros (titulo, autor, editora, ano, quantidade,imagem) VALUES (?,?,?,?,?,?)";
	PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
	
	
	stmt.setString(1, livro.getTitulo());
	stmt.setString(2, livro.getAutor());
	stmt.setString(3, livro.getEditora());
	stmt.setString(4, livro.getAno());
	stmt.setInt(5, livro.getQuantidade());
	stmt.setString(6, livro.getImagem());
	

	 stmt.execute();
	    connection.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
 }

}
