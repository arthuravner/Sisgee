package view.commands;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.AlunoServices;
import model.entity.Aluno;

public class BuscarAlunoCommand implements Command{

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Entrou em BuscarAlunoCommand");
		
		String strMatricula = request.getParameter("txtMatricula");
		
		System.out.println("Request matrícula: " + strMatricula);
		
		Aluno aluno = AlunoServices.obterAlunoPorMatricula(strMatricula);
		
		request.setAttribute("strMatricula", aluno.getMatricula());
		request.setAttribute("strNome", aluno.getPessoa().getNome());
		request.setAttribute("strCurso", aluno.getCurso().getNomeCurso());
		request.setAttribute("strUnidade", aluno.getCurso().getCampus().getNomeCampus());
		
		request.getRequestDispatcher("/registroDeRecisao.jsp").forward(request, response);
		
		
	}
	
	
}
