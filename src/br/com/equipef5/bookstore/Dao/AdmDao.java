package br.com.equipef5.bookstore.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.equipef5.bookstore.model.modelAdm;
import br.com.equipef5.bookstore.model.modelAluno;
import br.com.equipef5.bookstore.util.ConnectionFactory;

public class AdmDao {
	//Banco
		private Connection connection;
		public AdmDao() {
		try {
		this.connection = (Connection) new ConnectionFactory().getConnection();
		} catch (SQLException e) {
		throw new RuntimeException(e);
		}
		}
		//Fim

	public boolean ValidarAdm(String login,String senha) {

		try {
		    java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM adm WHERE login = ? and senha = ? ");
		    stmt.setString(1, login);
		    stmt.setString(2, senha);
		    ResultSet rs = stmt.executeQuery();

		    modelAdm modelAdm = null;
		    if (rs.next()) {
		    	modelAdm = montarObjeto(rs);
		    }

		    rs.close();
		    stmt.close();
		    
		    return modelAdm != null;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		}
		
	}
		private modelAdm montarObjeto(ResultSet rs) throws SQLException {

			 modelAdm modelAdm = new modelAdm();
			 modelAdm.setLogin(rs.getString("login"));
			 modelAdm.setSenha(rs.getString("senha"));
			 
				return modelAdm;
			   
				   
				
			    }
	
	public void close() throws SQLException{
		connection.close();
	}
	
}
