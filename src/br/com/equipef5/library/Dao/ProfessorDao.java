package br.com.equipef5.library.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.library.model.Aluno;
import br.com.equipef5.library.model.Professor;
import br.com.equipef5.library.util.ConnectionFactory;

public class ProfessorDao {
	
	//Banco
		private Connection connection;
		
		public ProfessorDao() {
			
		try {
		    this.connection = (Connection) new ConnectionFactory().getConnection();
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
		}
		//Fim
		
		public void salvar(Professor professor) {
			
		try {
		    String sql = "INSERT INTO professor (codigo, nome, email) VALUES (?,?,?)";
		    PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		    stmt.setString(1, professor.getCodigo());
			stmt.setString(2, professor.getNome());
			stmt.setString(3, professor.getEmail());
			stmt.execute();
		} catch (SQLException e) {
			 throw new RuntimeException(e);
		}
	}
		
		
		public void alterar(Professor professor) {

			String sql = "UPDATE professor SET codigo = ? , nome = ? , email  = ?  WHERE idProfessor = ?";

			try {
	            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
	            stmt.setString(1, professor.getCodigo());
	            stmt.setString(2, professor.getNome());
			    stmt.setString(3, professor.getEmail());
			    stmt.setInt(4, professor.getIdProfessor());
			    stmt.execute();
			    stmt.close();
			   
			} catch (SQLException e) {
			    throw new RuntimeException(e);
			}
		    }

		    public void remover (Professor professor) {

			try {
			    PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM professor WHERE idProfessor = ?");
			    stmt.setLong(1, professor.getIdProfessor());
			    stmt.execute();
			    stmt.close();
			  
			} catch (SQLException e) {
			    throw new RuntimeException(e);
			}
		    }

		public List<Professor>listar() {

	    	try {
	    	    List<Professor> listarProfessores = new ArrayList<Professor>();
	    	    java.sql.PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM professor ORDER BY idProfessor");

	    	    ResultSet rs = stmt.executeQuery();

	    	    while (rs.next()) {
	    	    	listarProfessores.add(montarObjeto(rs));
	    	    }

	    	    rs.close();
	    	    stmt.close();
	    	   
	    	    return listarProfessores;
	    	
	    	} catch (SQLException e) {
	    	    throw new RuntimeException(e);
	    }
	  }
		
		public Professor buscar(String codigo) {

			try {
			    java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM professor WHERE codigo = ?");
			    stmt.setString(1, codigo);
			    ResultSet rs = stmt.executeQuery();

			    Professor professor = null;
			    if (rs.next()) {
			    	professor = montarObjeto(rs);
			    }

			    rs.close();
			    stmt.close();
			    
			    return professor;
			    
			} catch (SQLException e) {
			    throw new RuntimeException(e);
			}
	    }
			
			private Professor montarObjeto(ResultSet rs) throws SQLException {

				 Professor professor = new Professor();
				 professor.setIdProfessor(rs.getInt("idProfessor"));
				 professor.setCodigo(rs.getString("codigo"));
				 professor.setNome(rs.getString("nome"));
				 professor.setEmail(rs.getString("email"));
				
				 return professor;
	 }
			
			public void close() throws SQLException{
				connection.close();
		}		
	}

