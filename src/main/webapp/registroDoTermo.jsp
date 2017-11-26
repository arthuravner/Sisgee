<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegistroDoTermoServlet" method="POST">
	<h2>Dados da Empresa Conveniada</h2></br>	
		N�mero do Conv�nio<input type="text" name="numeroConvenio" value="${param.numeroConvenio}"/></br></br>
		� agente de integra��o? 
		<div class="form-check">
  			<label class="form-check-label">
    			<input class="form-check-input" type="checkbox" value="">
    			Sim
  			</label>
		</div>
		<div class="form-check disabled">
  			<label class="form-check-label">
    			<input class="form-check-input" type="checkbox" value="">
    			N�o
  			</label>
		</div></br></br>
		CNPJ<input type="text" name="cnpjEmpresa" value="${param.cnpjEmpresa}"/>     
		Raz�o Social<input type="text" name="razaoSocial" value="${param.razaoSocial}"/></br>
	<h2>Dados do Aluno</h2></br>
		Matr�cula<input type="text" name="matricula" value="${param.matricula}"/>
		Nome<input type="text" name="nome" value="${param.nome}"/></br></br>
		Curso<input type="text" name="nomeCurso" value="${param.nomeCurso}"/>
		Unidade<input type="text" name="nomeCampus" value="${param.nomeCampus}"/></br>
	<h2>Vig�ncia do Est�gio</h2></br>
		Data de In�cio<input type="calendar" name="dataInicioTermoEstagio" value="${param.dataInicioTermoEstagio}"/>
		Data de T�rmino<input type="calendar" name="dataFimTermoEstagio" value="${param.dataFimTermoEstagio}"/></br>
	<h2>Carga Hor�ria do Aluno</h2></br>
		Horas por dia<input type="text" name="cargaHorariaTermoEstagio" value="${param.cargaHorariaTermoEstagio}"/></br>
	<h2>Valor da Bolsa de Est�gio</h2></br>
		Valor<input type="text" name="valorBolsa" value="${param.valorBolsa}"/></br>
	<h2>Local do Est�gio</h2></br>
		Endere�o<input type="text" name="enderecoTermoEstagio" value="${param.enderecoTermoEstagio}"/>
		Complemento<input type="text" name="complementoEnderecoTermoEstagio" value="${param.complementoEnderecoTermoEstagio}"/></br></br>
		Bairro<input type="text" name="bairroEnderecoTermoEstagio" value="${param.bairroEnderecoTermoEstagio}"/>
		Cidade<input type="text" name="cidadeEnderecoTermoEstagio"	value="${param.cidadeEnderecoTermoEstagio}"/>
		Estado<select name="estadoEnderecoTermoEstado">
				<option value="">Selecione um estado</option>
			  </select>
	 	CEP<input type="text" name="cepEnderecoTermoEstagio" value="${param.cepEnderecoTermoEstagio}"/></br>
	 	</br></br>
	 	O Est�gio � Obrigat�rio?
	 	<div class="form-check">
  			<label class="form-check-label">
    			<input class="form-check-input" type="checkbox" value="">
    			Sim
  			</label>
		</div>
		<div class="form-check disabled">
  			<label class="form-check-label">
    			<input class="form-check-input" type="checkbox" value="">
    			N�o
  			</label>
		</div></br></br>
		Professor Orientador<select name="idProfessorOrientador">
				<option value="">Selecione</option>
			  </select></br></br></br>
		<button type="submit">Salvar</button>
		<button type="button" onclick="javascript:location.href='index.jsp'">Voltar</button>
	</form>
</body>
</html>