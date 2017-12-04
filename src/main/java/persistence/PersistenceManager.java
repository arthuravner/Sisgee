package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersistenceManager {
	
	private static PersistenceManager instance;
		
	private static EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("SisgeePU");
	private static EntityManager manager = factory.createEntityManager();
	
	public static EntityManager getEntityManager(){
		return manager;
	}
		
	public static <T> GenericDAO<T> createGenericDAO(Class<T> t) {
		return new GenericDAO<T>(t, manager);
	}
	
	public static EntityTransaction getTransaction(){
		return manager.getTransaction();
	}

	public static void begin(){
		manager.getTransaction().begin();;
	}
	
	public static void rollback(){
		manager.getTransaction().rollback();;
	}
	
	public static void commit(){
		manager.getTransaction().commit();;
	}
	
	public static PersistenceManager getInstance() {
		if (instance == null)
			instance = new PersistenceManager();
		return instance;
	}
	
	public static Query createQuery(String query) {
		return manager.createQuery(query);
	}
}
