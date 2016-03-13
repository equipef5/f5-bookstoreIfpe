package br.com.equipef5.library.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.library.model.Aluno;
import br.com.equipef5.library.model.Emprestimo;
import br.com.equipef5.library.model.Livro;
import br.com.equipef5.library.util.ConnectionFactory;

public class BibliotecaDao {

	private Connection connection;

	public BibliotecaDao() {

		try {
			this.connection = (Connection) new ConnectionFactory().getConnection();
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
				listarLivrosE.add(montarObjetoLivro(rs));
			}

			rs.close();
			stmt.close();

			return listarLivrosE;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	

	public void alterar(Livro livro) {
		// TODO Auto-generated method stub
		String sql = "UPDATE livros SET titulo = ? , autor = ? , editora = ? , ano  = ? , quantidade = ? , imagem = ? WHERE id = ?";

		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, livro.getTitulo());
			stmt.setString(2, livro.getAutor());
			stmt.setString(3, livro.getEditora());
			stmt.setString(4, livro.getAno());
			stmt.setInt(5, livro.getQuantidade());
			stmt.setString(6, livro.getImagem());
			stmt.setInt(7, livro.getIdLivro());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void remover(Livro livro) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM livros WHERE id = ?");
			stmt.setLong(1, livro.getIdLivro());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	private Livro montarObjetoLivro(ResultSet rs) throws SQLException {

		Livro livro = new Livro();
		livro.setIdLivro(rs.getInt("id"));
		livro.setEditora(rs.getString("editora"));
		livro.setAno(rs.getString("ano"));
		livro.setImagem(rs.getString("imagem"));
		livro.setTitulo(rs.getString("titulo"));
		livro.setAutor(rs.getString("autor"));

		return livro;

	}


	
}
