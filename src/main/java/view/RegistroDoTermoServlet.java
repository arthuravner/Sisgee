package view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistroDoTermoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idTermoEstagio = request.getParameter("idTermoEstagio");
		String numeroConvenio = request.getParameter("numeroConvenio");
		String idAgenteIntegracao = request.getParameter("idAgenteIntegracao");
		String cnpjEmpresa = request.getParameter("cnpjEmpresa");
		String razaoSocial = request.getParameter("razaoSocial");
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String nomeCurso = request.getParameter("nomeCurso");
		String nomeCampus = request.getParameter("nomeCampus");
		String dataInicioTermoRegistro = request.getParameter("dataInicioTermoRegistro");
		String dataTerminoTermoRegistro = request.getParameter("dataTerminoTermoRegistro");
		String cargaHorariaTermoEstagio = request.getParameter("cargaHorariaTermoEstagio");
		String valorBolsa = request.getParameter("valorBolsa");
		String enderecoTermoEstagio = request.getParameter("enderecoTermoEstagio");
		String complementoEnderecoTermoEstagio = request.getParameter("complementoEnderecoTermoEstagio");
		String bairroEnderecoTermoEstagio = request.getParameter("bairroEnderecoTermoEstagio");
		String cidadeEnderecoTermoEstagio = request.getParameter("cidadeEnderecoTermoEstagio");
		String estadoEnderecoTermoEstagio = request.getParameter("estadoEnderecoTermoEstagio");
		String cepEnderecoTermoEstagio = request.getParameter("cepEnderecoTermoEstagio");
		String eEstagioObrigatorio = request.getParameter("eEstagioObrigatorio");
		String idProfessorOrientador = request.getParameter("idProfessorOrientador");
		
		String msg = "";
		
		if(!(numeroConvenio != null && numeroConvenio.trim().length() > 0)) {
			msg += "Erro! N�mero do Conv�nio � um campo obrigat�rio!";
		}
		
		if(numeroConvenio != null && numeroConvenio.trim().length() > 255) {
			msg += "Erro! N�mero do Conv�nio n�o pode exceder 255 caracteres!";
		}
		
		if(!(cnpjEmpresa != null && cnpjEmpresa.trim().length() > 0)) {
			msg += "Erro! CNPJ � um campo obrigat�rio!";
		}
		
		if(cnpjEmpresa != null && cnpjEmpresa.trim().length() > 14) {
			msg += "Erro! CNPJ n�o pode exceder 14 caracteres!";
		}
		
		if(!(razaoSocial != null && razaoSocial.trim().length() > 0)) {
			msg += "Erro! Raz�o Social � um campo obrigat�rio!";
		}
		
		if(razaoSocial != null && razaoSocial.trim().length() > 255) {
			msg += "Erro! Raz�o Social n�o pode exceder 255 caracteres!";
		}
		
		if(!(matricula != null && matricula.trim().length() > 0)) {
			msg += "Erro! Matr�cula � um campo obrigat�rio!";
		}
		
		if(matricula != null && matricula.trim().length() > 100) {
			msg += "Erro! Matr�cula n�o pode exceder 100 caracteres!";
		}
		
		if(!(nome != null && nome.trim().length() > 0)) {
			msg += "Erro! Nome � um campo obrigat�rio!";
		}
		
		if(nome != null && nome.trim().length() > 100) {
			msg += "Erro! Nome n�o pode exceder 100 caracteres!";
		}
		
		if(!(nomeCurso != null && nomeCurso.trim().length() > 0)) {
			msg += "Erro! Nome do curso � um campo obrigat�rio!";
		}
		
		if(nomeCurso != null && nomeCurso.trim().length() > 255) {
			msg += "Erro! Nome do curso n�o pode exceder 255 caracteres!";
		}
		
		if(!(complementoEnderecoTermoEstagio != null && complementoEnderecoTermoEstagio.trim().length() > 0)) {
			msg += "Erro! Complemento � um campo obrigat�rio!";
		}
		
		if(complementoEnderecoTermoEstagio != null && complementoEnderecoTermoEstagio.trim().length() > 255) {
			msg += "Erro! Complemento n�o pode exceder 255 caracteres!";
		}
		
		if(!(bairroEnderecoTermoEstagio != null && bairroEnderecoTermoEstagio.trim().length() > 0)) {
			msg += "Erro! Bairro � um campo obrigat�rio!";
		}
		
		if(bairroEnderecoTermoEstagio != null && bairroEnderecoTermoEstagio.trim().length() > 255) {
			msg += "Erro! Bairro n�o pode exceder 255 caracteres!";
		}
		
		if(!(cidadeEnderecoTermoEstagio != null && cidadeEnderecoTermoEstagio.trim().length() > 0)) {
			msg += "Erro! Cidade � um campo obrigat�rio!";
		}
		
		if(cidadeEnderecoTermoEstagio != null && cidadeEnderecoTermoEstagio.trim().length() > 150) {
			msg += "Erro! Cidade n�o pode exceder 150 caracteres!";
		}
		
		if(!(estadoEnderecoTermoEstagio != null && estadoEnderecoTermoEstagio.trim().length() > 0)) {
			msg += "Erro! Nenhum estado selecionado!";
		}
		
		if(!(cepEnderecoTermoEstagio != null && cepEnderecoTermoEstagio.trim().length() > 0)) {
			msg += "Erro! CEP � um campo obrigat�rio!";
		}
		
		if(cepEnderecoTermoEstagio != null && cepEnderecoTermoEstagio.trim().length() > 15) {
			msg += "Erro! CEP n�o pode exceder 15 caracteres!";
		}
		
		if(!(eEstagioObrigatorio != null && eEstagioObrigatorio.trim().length() > 0)) {
			msg += "Erro! Especifica��o de est�gio necess�ria!";
		}
		
		if(!(idProfessorOrientador != null && idProfessorOrientador.trim().length() > 0)) {
			msg += "Erro! Nenhum professor orientador selecionado!";
		}
		
		if(msg.equals("")){
			//form v�lido
			
			if(idTermoEstagio != null && idTermoEstagio.trim().length() > 0){
				request.getRequestDispatcher("/AlterarTermoEstagioServlet").forward(request, response);
			}else{
				request.getRequestDispatcher("/IncluirTermoEstagioServlet").forward(request, response);
			}
			
		}else{
			request.setAttribute("msg", msg);
			//form inv�lido
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
