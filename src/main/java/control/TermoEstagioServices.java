package control;


import java.util.List;
import model.dao.TermoEstagioDAO;
import model.entity.TermoEstagio;
import persistence.GenericDAO;
import persistence.PersistenceManager;

public class TermoEstagioServices {
	//Listar Termos de Estagio
	public static List<TermoEstagio> listarTermoEstagio(){
		GenericDAO<TermoEstagio> termoEstagioDAO = PersistenceManager.createGenericDAO(TermoEstagio.class);
		return termoEstagioDAO.buscarTodos(); //Método buscarTodos() contido na classe GenericDAO
	}
	
	public static void incluirTermoEstagio(TermoEstagio termoEstagio) {
		TermoEstagioDAO termoEstagioDAO = new TermoEstagioDAO();
		PersistenceManager.getTransaction().begin();
		try {
			termoEstagioDAO.incluir(termoEstagio);//Método incluir(obj) contido na classe GenericDAO
			PersistenceManager.getTransaction().begin();
		}catch(Exception e) {
			PersistenceManager.getTransaction().rollback();
		}
	}
}
