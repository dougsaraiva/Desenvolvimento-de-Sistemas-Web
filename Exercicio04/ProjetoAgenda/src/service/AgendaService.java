package service;

import java.sql.SQLException;
import java.util.List;

import dao.AgendaDAO;
import model.Agenda;

public class AgendaService {
	AgendaDAO dao = new AgendaDAO();
	
	public int criar(Agenda agenda) {
		return dao.criar(agenda);
	}
	
	public void atualizar(Agenda agenda){
		dao.atualizar(agenda);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Agenda carregar(int id){
		return dao.carregar(id);
	}
	
	public List<Agenda>ListarAgenda() throws SQLException{
		return dao.ListarAgenda();
		
	}

}