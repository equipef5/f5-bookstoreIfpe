package testeLivro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class guardarLivro {
	
	public void Salvar(livro livro){
		try {
			Connection connection = null;

			String sql = "Insert INTO livro(titulo,autor,imagem,qtd) VALUES(?,?,?,?)";
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			
			stmt.setString(1, livro.getTitulo());
			stmt.setString(2, livro.getAutor());
			stmt.setString(3, livro.getImagem());
			stmt.setInt(4, livro.getQtd());
			
			stmt.execute();
			connection.close();
			
		} catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}