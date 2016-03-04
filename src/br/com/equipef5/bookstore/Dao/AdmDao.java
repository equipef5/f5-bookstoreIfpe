package br.com.equipef5.bookstore.Dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.equipef5.bookstore.model.Adm;
import br.com.equipef5.bookstore.util.ConnectionFactory;

public class AdmDao {
	

	private Connection connection;
	
	public AdmDao() {
		
	try {
	    this.connection = (Connection) new ConnectionFactory().getConnection();
	} catch (SQLException e) {
	   throw new RuntimeException(e);
	}
	}
	//Fim
	
	public void salvar(Adm adm) {
		
	try {
		String sql = "INSERT INTO administrador (nome, login , senha) VALUES (?,?,?)";
		PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
	    stmt.setString(1, adm.getNome());
		stmt.setString(2, adm.getLogin());
		stmt.setString(3, adm.getSenha());
   	    stmt.execute();
	} catch (SQLException e) {
		    throw new RuntimeException(e);
	}
	}

	public Adm buscarUsuario(Adm adm) {	
		
	try {
		Adm admConsultado = null;
	    PreparedStatement stmt = (PreparedStatement) ((java.sql.Connection) this.connection).prepareStatement("select * from administrador where login = ? and senha = ?");
		stmt.setString(1, adm.getLogin());
		stmt.setString(2, adm.getSenha());
		ResultSet rs = stmt.executeQuery();
		
		if (rs.next()) {
		admConsultado = montarObjeto(rs);
		}
	
		rs.close();
		stmt.close();
		
		return admConsultado;
	 
	} catch (SQLException e) {
	   throw new RuntimeException(e);
	}
	}
	
	  public void alterar(Adm adm) {

			String sql = "UPDATE administrador SET nome = ? , login = ? , senha = ? WHERE id = ?";

			try {

			    PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			    stmt.setString(1, adm.getNome());
			    stmt.setString(2, adm.getLogin());
			    stmt.setString(3, adm.getSenha());
			    stmt.setInt(4, adm.getId());
			    stmt.execute();
			    stmt.close();
			    connection.close();

			} catch (SQLException e) {
			    throw new RuntimeException(e);
			}
		    }
	
	public Adm buscar(String login) {

		try {
		    java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM administrador WHERE login = ?");
		    stmt.setString(1, login);
		    ResultSet rs = stmt.executeQuery();
            
		    Adm adm = null;
		    if (rs.next()) {
		    adm = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();
		    
		    return adm;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
	}


	 private Adm montarObjeto(ResultSet rs) throws SQLException {
		
          Adm adm = new Adm();
          
          adm.setId(rs.getInt("id"));
          adm.setNome(rs.getString("nome"));
		  adm.setLogin(rs.getString("login"));
		  adm.setSenha(rs.getString("senha"));
		 
		  return adm;
  }		
}