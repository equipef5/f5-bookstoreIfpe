package br.com.equipef5.bookstore.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.bookstore.model.Livro;
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
	public void salvar(Livro livro) {
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
	public Livro buscar(String titulo) {

		try {
		    java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM livros WHERE titulo = ?");
		    stmt.setString(1, titulo);
		    ResultSet rs = stmt.executeQuery();

		    Livro livro = null;
		    if (rs.next()) {
		    	livro = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();
		    
		    return livro;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	}

 
	 public List<Livro> listar() {

			try {

			    List<Livro> listarLivros = new ArrayList<Livro>();
			    PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("SELECT * FROM livros ORDER BY idLivro");

			    ResultSet rs = stmt.executeQuery();

			    while (rs.next()) {
				listarLivros.add(montarObjeto(rs));
			    }

			    rs.close();
			    stmt.close();
			   

			    return listarLivros;

			} catch (SQLException e) {
			    throw new RuntimeException(e);
			}
		    }
	 
	 public void alterar(Livro livro) {
				// TODO Auto-generated method stub
		 String sql = "UPDATE livros SET titulo = ? , autor = ? , editora = ? , ano  = ? , quantidade = ? , imagem = ? WHERE idLivro = ?";

			try {

			    PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			    stmt.setString(1, livro.getTitulo());
			    stmt.setString(2, livro.getAutor());
			    stmt.setString(3, livro.getEditora());
			    stmt.setString(4, livro.getAno());
			    stmt.setInt(5, livro.getQuantidade());
			    stmt.setString(6, livro.getImagem());
			    stmt.setInt(7, livro.getidLivro());
			    stmt.execute();
			    stmt.close();
			 
			} catch (SQLException e) {
			    throw new RuntimeException(e);
			}
		    }
			
	 
	 public void remover(Livro livro) {
			// TODO Auto-generated method stub
		 try {
			    PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM livros WHERE idLivro = ?");
			    stmt.setLong(1, livro.getidLivro());
			    stmt.execute();
			    stmt.close();
			    
			} catch (SQLException e) {
			    throw new RuntimeException(e);
			}
		    }
		
		

	 private Livro montarObjeto(ResultSet rs) throws SQLException {

		 Livro livro = new Livro();
		 livro.setIdLivro(rs.getInt("idLivro"));
		 livro.setTitulo(rs.getString("titulo"));
		 livro.setAutor(rs.getString("autor"));
		 livro.setEditora(rs.getString("editora"));
		 livro.setAno(rs.getString("ano"));
		 livro.setQuantidade(rs.getInt("quantidade"));
		 livro.setImagem(rs.getString("imagem"));
		
		 
			return livro;
		   
			
		    }
		public void close() throws SQLException{
			connection.close();
		}
		
		
		   
}
