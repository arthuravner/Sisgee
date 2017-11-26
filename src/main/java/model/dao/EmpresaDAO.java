package model.dao;

import model.entity.Empresa;
import persistence.GenericDAO;
import persistence.PersistenceManager;

public class EmpresaDAO extends GenericDAO<Empresa>{
	public EmpresaDAO(){
		super(Empresa.class, PersistenceManager.getEntityManager());
	}
}
