package br.com.equipef5.bookstore.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.bookstore.model.modelAluno;
import br.com.equipef5.bookstore.util.ConnectionFactory;

public class AlunoDao {
	//Banco
	private Connection connection;
	public AlunoDao() {
	try {
	this.connection = (Connection) new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	throw new RuntimeException(e);
	}
	}
	//Fim
	
	
	public void salvar(modelAluno aluno) {
	try {
	String sql = "INSERT INTO alunos (nome, cpf, telefone, email, matricula) VALUES (?,?,?,?,?)";
	PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
	
	
	stmt.setString(1, aluno.getNome());
	stmt.setString(2, aluno.getCpf());
	stmt.setString(3, aluno.getTelefone());
	stmt.setString(4, aluno.getEmail());
	stmt.setString(5, aluno.getMatricula());
	

	 stmt.execute();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}}
	
	public List<modelAluno>listar() {

    	try {
    	    List<modelAluno> listarAlunos = new ArrayList<modelAluno>();
    	    java.sql.PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM alunos ORDER BY id");

    	    ResultSet rs = stmt.executeQuery();

    	    while (rs.next()) {
    	    	listarAlunos.add(montarObjeto(rs));
    	    }

    	    rs.close();
    	    stmt.close();
    	   
    	    return listarAlunos;
    	} catch (SQLException e) {
    	    throw new RuntimeException(e);
    	}
        }
	
	public modelAluno buscar(String cpf) {

		try {
		    java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM alunos WHERE cpf = ?");
		    stmt.setString(0, cpf);
		    ResultSet rs = stmt.executeQuery();

		    modelAluno modelAluno = null;
		    if (rs.next()) {
		    	modelAluno = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();
		    
		    return modelAluno;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
    }
	public void remover(modelAluno aluno) {

		try {
		    PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM alunos WHERE id = ?");
		    stmt.setLong(1, aluno.getId());
		    stmt.execute();
		    stmt.close();
		    
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	    }
	

	
		private modelAluno montarObjeto(ResultSet rs) throws SQLException {

			 modelAluno modelAluno = new modelAluno();
			 modelAluno.setId(rs.getInt("id"));
			 modelAluno.setNome(rs.getString("nome"));
			 modelAluno.setCpf(rs.getString("cpf"));
			 modelAluno.setEmail(rs.getString("email"));
			 modelAluno.setMatricula(rs.getString("matricula"));
			 modelAluno.setTelefone(rs.getString("telefone"));
			 
				return modelAluno;
			   
				   
				
			    }
		public void close() throws SQLException{
			connection.close();
		}
		

}

	

	
