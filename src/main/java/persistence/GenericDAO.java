package persistence;

import java.util.List;

import javax.persistence.EntityManager;

public class GenericDAO<T> {

	private EntityManager manager;
	private Class<T> t;
	
	public GenericDAO(Class<T> t, EntityManager manager){
		this.t = t;
		this.manager = manager;
	}
	
	public List<T> buscarTodos(){
		@SuppressWarnings("unchecked")
		List<T> lista = manager.createQuery("from " + t.getName()).getResultList();
				
		return lista;
	}
	
	public T buscar(Long id){
		return manager.find(t, id);
	}
	
	public void incluir(T entidade){
		manager.persist(entidade);
	}
	
	public void excluir(T entidade){
		manager.remove(entidade);
	}
	
	public void alterar(T entidade){
		manager.merge(entidade);
	}
}
