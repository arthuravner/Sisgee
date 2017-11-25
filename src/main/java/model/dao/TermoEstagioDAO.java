package model.dao;

import java.util.List;

import model.entity.TermoEstagio;
import persistence.GenericDAO;
import persistence.PersistenceManager;

public class TermoEstagioDAO extends GenericDAO<TermoEstagio> {
	
	public TermoEstagioDAO() {
		super(TermoEstagio.class, PersistenceManager.getEntityManager());
	}
	public List<TermoEstagio> buscarPorNome(String nome){
		return null;
	}
	
}



