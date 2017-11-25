package model.dao;

import model.entity.Pessoa;
import persistence.GenericDAO;
import persistence.PersistenceManager;

public class PessoaDAO extends GenericDAO<Pessoa>{
	public PessoaDAO(){
		super(Pessoa.class, PersistenceManager.getEntityManager());
	}
}
