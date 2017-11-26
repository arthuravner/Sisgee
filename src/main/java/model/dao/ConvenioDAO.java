package model.dao;

import model.entity.Convenio;
import persistence.GenericDAO;
import persistence.PersistenceManager;

public class ConvenioDAO extends GenericDAO<Convenio>{
	public ConvenioDAO(){
		super(Convenio.class, PersistenceManager.getEntityManager());
	}
	
}
