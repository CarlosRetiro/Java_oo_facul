package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Modelo.Contato;

public class ContatoDao {
	
	private Connection connection;

	public ContatoDao() throws Exception {	
		Class.forName("org.mariadb.jdbc.Driver");
		this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/contatos?user=root&password=");		
	}
	public void adiciona(Object obj){
		if (!(obj instanceof Contato)) {
			return;
		}
		
		Contato contato = (Contato) obj;
		String sql = "INSERT INTO contatos "
				+ "(nome,email,endereco,datanascimento) " + "VALUES (?,?,?,?)";

		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
					.getTimeInMillis()));

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<>();

			PreparedStatement stmt = this.connection
					.prepareStatement("SELECT * FROM contatos");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Contato contato = montaContatoComResultSet(rs);
				contatos.add(contato);
			}
			return contatos;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	private Contato montaContatoComResultSet(ResultSet rs) {
		try {
			Contato contato = new Contato();

			contato.setId(rs.getLong("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));

			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(rs.getDate("dataNascimento"));
			contato.setDataNascimento(dataNascimento);

			return contato;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
