package TestCadastrodeAluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarAluno {
	
	public void Salvar(Aluno aluno){
		try {
			Connection connection = null;

			String sql = "Insert INTO alunos (nome, cpf, telefone, email, matricula) VALUES(?,?,?,?,?)";
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			
			stmt.setString(1, aluno.getnome());
			stmt.setString(2, aluno.getCpf());
			stmt.setInt(3, aluno.getTelefone());
			stmt.setString(4, aluno.getEmail());
			stmt.setString(5, aluno.getMatricula());
			stmt.execute();
			connection.close();
			
		} catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
