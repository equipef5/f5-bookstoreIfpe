package br.com.equipef5.bookstore.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.bookstore.model.Aluno;
import br.com.equipef5.bookstore.model.Livro;
import br.com.equipef5.bookstore.util.ConnectionFactory;

public class BibliotecaDao {
	
	private Connection connection;
	
	public BibliotecaDao() {
	
	try {
	    this.connection = (Connection) new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
	}
	
	public void salvarEmprestimo(Livro livroE) {
		
	try {
	    String sql = "INSERT INTO emprestimo (id,titulo,autor,) VALUES (?,?)";
	    PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
	    stmt.setString(1, livroE.getTitulo());
	    stmt.setString(2, livroE.getAutor());
	    stmt.execute();
	  
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
}
	
	public Livro buscarLivroEmprestimo(String titulo) {

	try {
		java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM livros WHERE  titulo = ?");
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
	
	 public List<Livro> listar(String imagem ) {

	 try {

	 List<Livro> listarLivrosE = new ArrayList<Livro>();
	 PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("SELECT * FROM livros ");
     ResultSet rs = stmt.executeQuery();

	   while (rs.next()) {
	    listarLivrosE.add(montarObjeto(rs));
	}

	rs.close();
    stmt.close();

    return listarLivrosE;

 } catch (SQLException e) {
	 throw new RuntimeException(e);
	}
		}
	 
	 public Aluno buscarAlunoEmprestimo(String idAluno) {

	 try {
		 java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM alunos WHERE idAluno = ?");
		 stmt.setString(1, idAluno);
		 ResultSet rsa = stmt.executeQuery();

		 Aluno aluno = null;
		 if (rsa.next()) {
		 aluno = montarObjetoAluno(rsa);
		}

		rsa.close();
		stmt.close();

		return aluno;
	} catch (SQLException e) {
		throw new RuntimeException(e);
			}
		}
	 
	 public List<Aluno> listarAlunosE(String id) {

	 try {
         List<Aluno> listarAlunosE = new ArrayList<Aluno>();
		 PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("SELECT * FROM alunos");
         ResultSet rsa = stmt.executeQuery();

	       while (rsa.next()) {
		   listarAlunosE.add(montarObjetoAluno(rsa));
	}

		  rsa.close();
		  stmt.close();
		  connection.close();

		  return listarAlunosE;

	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
	 
	 public List<Livro> listarEmprestimos() {

     try {
         List<Livro> listarLivros = new ArrayList<Livro>();
	     PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("SELECT * FROM emprestimo ORDER BY id");
         ResultSet rs = stmt.executeQuery();

		   while (rs.next()) {
		   listarLivros.add(montarObjeto(rs));
 }

		rs.close();
		stmt.close();
	    connection.close();

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
		 livro.setImagem(rs.getString("imagem"));
		 livro.setTitulo(rs.getString("titulo"));
		 livro.setAutor(rs.getString("autor"));
		 
		return livro;
		   
   }
	 
	 private Aluno montarObjetoAluno(ResultSet rsa) throws SQLException {

		Aluno aluno = new Aluno();
	    aluno.setNome(rsa.getString("nome"));
		aluno.setEmail(rsa.getString("email"));

		return aluno;
		}
	 
	public void close() throws SQLException{
	connection.close();
		}
		
}
