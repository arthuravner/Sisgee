package model.dao;

import javax.persistence.Query;

import model.entity.Aluno;
import persistence.PersistenceManager;


public class AlunoDAO {

	public static Aluno BuscaAlunoPorMatricula(String strMatricula){		

		Aluno aluno = null;
		
		try{
		String sql = "SELECT a "
				+ "   FROM Aluno"
				+ "   WHERE matricula = " + strMatricula;
		
		Query q = PersistenceManager.getInstance().createQuery(sql);
		
		aluno = (Aluno) q.getSingleResult();
		
		System.out.println("Obter Aluno por matrícula: " + aluno.toString());
		}
		catch (Exception e)
		{
			System.err.println("Erro ao tentar obter aluno, AlunoDAO. Msg Erro: " + e.getMessage());
		}
		return aluno;
	}
}
