package control;

import model.dao.AlunoDAO;
import model.entity.Aluno;

public class AlunoServices {

	public static Aluno obterAlunoPorMatricula(String strMatricula)
	{		
		return AlunoDAO.BuscaAlunoPorMatricula(strMatricula);		
	}
}
