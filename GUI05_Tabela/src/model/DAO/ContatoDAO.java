package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Contato;
import util.Conexao;

public class ContatoDAO {

	public static Contato inserir(String nome, String email, String mensagem) {
		Contato contato = null;
		try {
			// cria��o de insert
			String sql = "insert into contato(nome , email, mensagem)values(?,?,?)";

			// obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhst:3303/18_conexaobd",
					"com.mysql.jdbc.Driver", "root", "cpd*1234");
			Connection con = conex.obterConexao();
			// preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);

			// comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		contato = new Contato(nome, email, mensagem);
		return contato;
	}

	public static List<Contato> buscarTodos() {
		List<Contato> contatos = new LinkedList<Contato>();

		try {
			// Cria��o do select
			String sql = "Select * from contato";

			// obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhst:3303/18_conexaobd",
					"com.mysql.jdbc.Driver", "root", "cpd*1234");;

			Connection con = conex.obterConexao();
			/*
			 * Executa a confirma��o direita de acesso ao banco pois n�o sao
			 * necess�rias informa��es para a Query (caracter curinga)
			 */
			Statement comando = con.createStatement();
			/*
			 * ResultSet - Classe java que monta em mem�ria uma matriz com a
			 * resposta das linhas do banco de dados
			 */
			ResultSet rs = comando.executeQuery(sql);
			// vetor de objetos
			
			/*
			 * Passagem de linha de dados do ResultSet para o vetor de objetos
			 * (uma linha de dados da atriz do ResultSet � copiada para um
			 * objeto no vetor contatos)
			 */
			
			while (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
						
						c.setEmail(rs.getString("email"));
						c.setMensagem(rs.getString("mensagem"));
						contatos.add(c);
				// � necess�rio encerrar o acesso ao banco para liberar a
				// conex�o
				rs.close();
				comando.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return contatos;
	}

	public static Contato excluir(int id) {
		Contato contato = null;
		try {
			// cria��o do delete
			String sql = "delete from contato wheew id = ?";
			// obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhst:3303/18_conexaobd",
					"com.mysql.jdbc.Driver", "root", "cpd*1234");
			Connection con = conex.obterConexao();
			// preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setInt(1, id);

			// comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return contato;
	}

	public static Contato atualizar(String mensagem, int id) {
		Contato contato = null;
		try {
			// cria��o de insert
			String sql = "";

			// obter a conex�o com o banco de dados
			Conexao conex = new Conexao(
					"jdbc:mysql://localhst:3303/18_conexaobd",
					"com.mysql.jdbc.Driver", "root", "cpd*1234");
			Connection con = conex.obterConexao();
			// preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);

			comando.setString(1, mensagem);
			comando.setInt(2, id);

			// comando executado
			comando.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return contato;
	}
}
