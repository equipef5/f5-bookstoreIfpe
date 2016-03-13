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

public class EmprestimoDao {
	private Connection connection;
	public EmprestimoDao() {

		try {
			this.connection = (Connection) new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	public void salvarEmprestimo(Emprestimo emprestimo) {

		try {
			String sql = "INSERT INTO emprestimo (alunos_id,livros_id,dt_emprestimo,dt_devolucao) VALUES (?,?,?,?)";
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
            
			stmt.setInt(1,emprestimo.getAluno().getIdAluno());
			 stmt.setInt(2,emprestimo.getLivro().getIdLivro());
			stmt.setDate(3,new java.sql.Date(emprestimo.getDataEmprestimo().getTime()));
			stmt.setDate(4,new java.sql.Date( emprestimo.getDataDevolucao().getTime()));
			stmt.execute();
			

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}}
		
		public void alterarStatusEmprestimo(Emprestimo emprestimo,String status) {
			// TODO Auto-generated method stub
			String sql = "UPDATE emprestimo SET STATUS = ? WHERE id = ?";
			try {
	            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			    stmt.setString(1, status);
			    stmt.setInt(2, emprestimo.getId());
			    stmt.execute();
			    stmt.close();
			   
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
				livro = montarObjetoLivro(rs);
			}

			rs.close();
			stmt.close();

			return livro;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public Aluno buscarAlunoEmprestimo(String id) {

		try {
			java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM alunos WHERE id = ?");
			stmt.setString(1, id);
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

	public List<Emprestimo> listarEmprestimo() {

		try {
			List<Emprestimo> listarEmprestimo = new ArrayList<Emprestimo>();
			PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("SELECT * FROM emprestimo ORDER BY id");
			ResultSet rse = stmt.executeQuery();

			while (rse.next()) {
				listarEmprestimo.add(montarObjetoEmprestimo(rse));
			}

			rse.close();
			stmt.close();
			connection.close();

			return listarEmprestimo;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}}
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

		private Aluno montarObjetoAluno(ResultSet rsa) throws SQLException {

			Aluno aluno = new Aluno();
			aluno.setIdAluno(rsa.getInt("id"));
			aluno.setNome(rsa.getString("nome"));
			aluno.setCpf(rsa.getString("cpf"));
			aluno.setTelefone(rsa.getString("telefone"));
			aluno.setEmail(rsa.getString("email"));
			aluno.setMatricula(rsa.getString("matricula"));
			System.out.println(aluno.getNome());
			return aluno;
		}
		private Emprestimo montarObjetoEmprestimo(ResultSet rse) throws SQLException {
        
			 Emprestimo emprestimo =new Emprestimo();
         
               emprestimo.setId(rse.getInt("id"));
               emprestimo.setDataEmprestimo(rse.getDate("dt_emprestimo"));
               emprestimo.setDataDevolucao(rse.getDate("dt_devolucao"));
               emprestimo.setDataDevolucao(rse.getDate("dt_devolucao"));
              
               AlunoDao daoAluno = new AlunoDao();
               emprestimo.setAluno(daoAluno.buscarId(rse.getInt("alunos_id")));
               LivroDao daoLivro = new LivroDao();
               emprestimo .setLivro(daoLivro.buscarId(rse.getInt("livros_id")));
               emprestimo.setStatus(rse.getString("STATUS"));
			return emprestimo;
               
		}


		public void close() throws SQLException{
			connection.close();
		}}

	
	


