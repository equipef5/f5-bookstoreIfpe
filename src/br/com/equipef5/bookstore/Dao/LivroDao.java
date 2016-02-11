package br.com.equipef5.bookstore.Dao;

import java.sql.ResultSet;
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
	  
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}}
	public modelLivro buscar(String titulo) {

		try {
		    java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM livros WHERE titulo = ?");
		    stmt.setString(0, titulo);
		    ResultSet rs = stmt.executeQuery();

		    modelLivro modelLivro = null;
		    if (rs.next()) {
		    	modelLivro = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();
		    
		    return modelLivro;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	}

 
	
	private modelLivro montarObjeto(ResultSet rs) throws SQLException {

		 modelLivro modelLivro = new modelLivro();
		 modelLivro.setId(rs.getInt("id"));
		 modelLivro.setTitulo(rs.getString("titulo"));
		 modelLivro.setAutor(rs.getString("autor"));
		 modelLivro.setEditora(rs.getString("editora"));
		 modelLivro.setAno(rs.getString("ano"));
		 modelLivro.setImagem(rs.getString("imagema"));
		
		 
			return modelLivro;
		   
			   
			
		    }
	public void close() throws SQLException{
		connection.close();
	}
}
