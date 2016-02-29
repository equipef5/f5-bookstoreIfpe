package br.com.equipef5.bookstore.Dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.bookstore.model.Aluno;
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
	} catch (SQLException e) {
		 throw new RuntimeException(e);
	}
}
	
	public void alterar(Aluno aluno) {

		String sql = "UPDATE alunos SET nome = ? , cpf = ? , telefone = ? , email  = ? , matricula = ? WHERE id = ?";

		try {
            PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		    stmt.setString(1, aluno.getNome());
		    stmt.setString(2, aluno.getCpf());
		    stmt.setString(3, aluno.getTelefone());
		    stmt.setString(4, aluno.getEmail());
		    stmt.setString(5, aluno.getMatricula());
		    stmt.setInt(6, aluno.getId());
		    stmt.execute();
		    stmt.close();
		   
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	    }

	    public void remover (Aluno aluno) {

		try {
		    PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("DELETE FROM alunos WHERE id = ?");
		    stmt.setLong(1, aluno.getId());
		    stmt.execute();
		    stmt.close();
		  
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	    }

	public List<Aluno>listar() {

    	try {
    	    List<Aluno> listarAlunos = new ArrayList<Aluno>();
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
	
	public Aluno buscar(String cpf) {

		try {
		    java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM alunos WHERE cpf = ?");
		    stmt.setString(1, cpf);
		    ResultSet rs = stmt.executeQuery();

		    Aluno aluno = null;
		    if (rs.next()) {
		    	aluno = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();
		    
		    return aluno;
		    
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
    }
		
		private Aluno montarObjeto(ResultSet rs) throws SQLException {

			 Aluno aluno = new Aluno();
			 aluno.setId(rs.getInt("id"));
			 aluno.setNome(rs.getString("nome"));
			 aluno.setCpf(rs.getString("cpf"));
			 aluno.setTelefone(rs.getString("telefone"));
			 aluno.setEmail(rs.getString("email"));
			 aluno.setMatricula(rs.getString("matricula"));
			
			 return aluno;
 }
		
		public void close() throws SQLException{
			connection.close();
	}		
}

	

	
