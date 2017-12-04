package control;

import model.entity.Empresa;
import persistence.GenericDAO;
import persistence.PersistenceManager;

public class EmpresaService {

	public static void insereEmpresa(Empresa e) {
					
		PersistenceManager pm = new PersistenceManager();
		
		pm.begin();
		
		try{
			GenericDAO<Empresa> dao = pm.createGenericDAO(Empresa.class);
			dao.incluir(e);
			pm.commit();
			
		}catch (Exception ex)
		{
			pm.rollback();
		}
				
	}
		
}
