package view.commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.AlunoServices;
import control.EmpresaService;
import model.entity.Aluno;
import model.entity.Empresa;

public class RegistroEmpresaCommand implements Command{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Entrou em RegistroEmpresaCommand");
		
		//String intEhAgenteIntegracao = request.getParameter("tglEhAgente");
		String strCnpj = request.getParameter("txtCnpj");
		String strRazaoSocial = request.getParameter("txtRazaoSocial");
					
		Empresa e = new Empresa();
		
		//e.setId(3);
		e.setCnpjEmpresa(strCnpj);
		e.setNomeEmpresa(strRazaoSocial);
		
		EmpresaService.insereEmpresa(e);
		
		System.out.println("CNPJ: " + e.getCnpjEmpresa());
		System.out.println("Razao Social: " + e.getNomeEmpresa());
			
		request.setAttribute("txtCnpj", e.getCnpjEmpresa());
		request.setAttribute("txtRazaoSocial", e.getNomeEmpresa());
		
		request.getRequestDispatcher("/registroDoTermo.jsp").forward(request, response);
		
		
	}

}
