package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String url;// local de Banco de Dados.
	private String driver;// Classes Java do Framework que foi baixada na web.
	private String login;// Login do usu�rio no SGBD.
	private String senha;// Senha do usu�rio no SGBD.

	public Conexao(String url, String driver, String login, String senha) {
		try {
			this.url = url;
			this.driver = driver;
			this.login = login;
			this.senha = senha;
			Class.forName(driver);
			// registro da Classe de driver na conex�o atrav�s de JDBC.
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public Connection obterConexao() {
		Connection con = null;
		try {

			con = DriverManager.getConnection(url, login, senha);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;

	}

	public String getUrl() {
		return url;
	}

	public String getDriver() {
		return driver;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
	
	

}
