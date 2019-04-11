package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Agenda;

public class AgendaDAO {
	public int criar(Agenda agenda) {
		String sqlInsert = "INSERT INTO agenda(nome, email, telefone, endereco) "
				+ "VALUES (?, ?, ?, ?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, agenda.getNome());
			stm.setString(2, agenda.getEmail());
			stm.setString(3, agenda.getTelefone());
			stm.setString(4, agenda.getEndereco());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					agenda.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return agenda.getId();
	}

	public Agenda carregar(int id) {
		Agenda agenda = new Agenda();
		agenda.setId(id);
		String sqlSelect = "SELECT nome, email, telefone, endereco FROM agenda WHERE agenda.id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, agenda.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					agenda.setNome(rs.getString("nome"));
					agenda.setEmail(rs.getString("email"));
					agenda.setTelefone(rs.getString("telefone"));
					agenda.setEndereco(rs.getString("endereco"));
				} else {
					agenda.setId(-1);
					agenda.setNome(null);
					agenda.setTelefone(null);
					agenda.setEmail(null);
					agenda.setEmail(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return agenda;
	}
	
	public void atualizar(Agenda agenda) {
		String sqlUpdate = "UPDATE agenda SET nome=?, email=?, telefone=?, endereco=? WHERE id=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, agenda.getNome());
			stm.setString(2, agenda.getEmail());
			stm.setString(3, agenda.getTelefone());
			stm.setString(4, agenda.getEndereco());
			stm.setInt(5, agenda.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void excluir(int id) {
		String sqlDelete = "DELETE FROM agenda WHERE id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, id);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Agenda>ListarAgenda()throws SQLException{
	      List<Agenda> lista = new ArrayList();
	      String sqlSelect = "SELECT id, nome, email, telefone, endereco FROM agenda";
	      
	      try(Connection conn = ConnectionFactory.obtemConexao();
	    	 PreparedStatement stm = conn.prepareStatement(sqlSelect);){
	         ResultSet rs = stm.executeQuery();
	         while(rs.next()){
	            Agenda agenda = new Agenda();
	            agenda.setId(rs.getInt("id"));
	            agenda.setNome(rs.getString("nome"));
	            agenda.setEmail(rs.getString("email"));
	            agenda.setTelefone(rs.getString("telefone"));
	            agenda.setEndereco(rs.getString("endereco"));
	            lista.add(agenda);
	         }
	      }
	      catch (Exception e) {
	         e.printStackTrace();
	      }
	      return lista;
	   }
	   
	
}

