<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="head_imports.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jspf"%>
	<form action="RegistroDoTermoServlet" method="POST">
		<h2>Dados da Empresa Conveniada</h2>
		</br> Número do Convênio<input type="text" name="numeroConvenio"
			value="${param.numeroConvenio}" /></br>
		</br> É agente de integração?
		<div class="form-check">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox" value=""> Sim
			</label>
		</div>
		<div class="form-check disabled">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox" value=""> Não
			</label>
		</div>
		</br>
		</br> CNPJ<input type="text" name="cnpjEmpresa"
			value="${param.cnpjEmpresa}" /> Razão Social<input type="text"
			name="razaoSocial" value="${param.razaoSocial}" /></br>
		<h2>Dados do Aluno</h2>
		</br> Matrícula<input type="text" name="matricula"
			value="${param.matricula}" /> Nome<input type="text" name="nome"
			value="${param.nome}" /></br>
		</br> Curso<input type="text" name="nomeCurso" value="${param.nomeCurso}" />
		Unidade<input type="text" name="nomeCampus"
			value="${param.nomeCampus}" /></br>
		<h2>Vigência do Estágio</h2>
		</br> Data de Início
		<div class="container">
			<div class="row">
				<div class='col-sm-6'>
					<div class="form-group">
						<div class='input-group date' id='datetimepicker1'>
							<input type='text' class="form-control" /> <span
								class="input-group-addon"> <span
								class="glyphicon glyphicon-calendar"></span>
							</span>
						</div>
					</div>
				</div>
				<script type="text/javascript">
            $(function () {
                $('#datetimepicker1').datetimepicker();
            });
        </script>
			</div>
		</div>
		Data de Término
		<div class="container">
			<div class="row">
				<div class='col-sm-6'>
					<div class="form-group">
						<div class='input-group date' id='datetimepicker1'>
							<input type='text' class="form-control" /> <span
								class="input-group-addon"> <span
								class="glyphicon glyphicon-calendar"></span>
							</span>
						</div>
					</div>
				</div>
				<script type="text/javascript">
            $(function () {
                $('#datetimepicker1').datetimepicker();
            });
        </script>
			</div>
		</div>
		</br>
		</br>
		<h2>Carga Horária do Aluno</h2>
		</br> Horas por dia<input type="text" name="cargaHorariaTermoEstagio"
			value="${param.cargaHorariaTermoEstagio}" /></br>
		<h2>Valor da Bolsa de Estágio</h2>
		</br> Valor<input type="text" name="valorBolsa" value="${param.valorBolsa}" /></br>
		<h2>Local do Estágio</h2>
		</br> Endereço<input type="text" name="enderecoTermoEstagio"
			value="${param.enderecoTermoEstagio}" /> Complemento<input
			type="text" name="complementoEnderecoTermoEstagio"
			value="${param.complementoEnderecoTermoEstagio}" /></br>
		</br> Bairro<input type="text" name="bairroEnderecoTermoEstagio"
			value="${param.bairroEnderecoTermoEstagio}" /> Cidade<input
			type="text" name="cidadeEnderecoTermoEstagio"
			value="${param.cidadeEnderecoTermoEstagio}" /> Estado<select
			name="estadoEnderecoTermoEstagio">
			<option value="">Selecione um estado</option>
			<option value="AC" ${ param.estadoEnderecoTermoEstagio eq "AC" ? "selected" : "" } >Acre</option>
			<option value="AL" ${ param.estadoEnderecoTermoEstagio eq "AL" ? "selected" : "" } >Alagoas</option>
			<option value="AP" ${ param.estadoEnderecoTermoEstagio eq "AP" ? "selected" : "" } >Amapá</option>
			<option value="AM" ${ param.estadoEnderecoTermoEstagio eq "AM" ? "selected" : "" } >Amazonas</option>
			<option value="BA" ${ param.estadoEnderecoTermoEstagio eq "BA" ? "selected" : "" } >Bahia</option>
			<option value="CE" ${ param.estadoEnderecoTermoEstagio eq "CE" ? "selected" : "" } >Ceará</option>
			<option value="DF" ${ param.estadoEnderecoTermoEstagio eq "DF" ? "selected" : "" } >Distrito Federal</option>
			<option value="ES" ${ param.estadoEnderecoTermoEstagio eq "ES" ? "selected" : "" } >Espírito Santo</option>
			<option value="GO" ${ param.estadoEnderecoTermoEstagio eq "GO" ? "selected" : "" } >Goiás</option>
			<option value="MA" ${ param.estadoEnderecoTermoEstagio eq "MA" ? "selected" : "" } >Maranhão</option>
			<option value="MT" ${ param.estadoEnderecoTermoEstagio eq "MT" ? "selected" : "" } >Mato Grosso</option>
			<option value="MS" ${ param.estadoEnderecoTermoEstagio eq "MS" ? "selected" : "" } >Mato Grosso do Sul</option>
			<option value="MG" ${ param.estadoEnderecoTermoEstagio eq "MG" ? "selected" : "" } >Minas Gerais</option>
			<option value="PA" ${ param.estadoEnderecoTermoEstagio eq "PA" ? "selected" : "" } >Pará</option>
			<option value="PB" ${ param.estadoEnderecoTermoEstagio eq "PB" ? "selected" : "" } >Paraíba</option>
			<option value="PR" ${ param.estadoEnderecoTermoEstagio eq "PR" ? "selected" : "" } >Paraná</option>
			<option value="PE" ${ param.estadoEnderecoTermoEstagio eq "PE" ? "selected" : "" } >Pernambuco</option>
			<option value="PI" ${ param.estadoEnderecoTermoEstagio eq "PI" ? "selected" : "" } >Piauí</option>
			<option value="RJ" ${ param.estadoEnderecoTermoEstagio eq "RJ" ? "selected" : "" } >Rio de Janeiro</option>
			<option value="RN" ${ param.estadoEnderecoTermoEstagio eq "RN" ? "selected" : "" } >Rio Grande do Norte</option>
			<option value="RS" ${ param.estadoEnderecoTermoEstagio eq "RS" ? "selected" : "" } >Rio Grande do Sul</option>
			<option value="RO" ${ param.estadoEnderecoTermoEstagio eq "RO" ? "selected" : "" } >Rondônia</option>
			<option value="RR" ${ param.estadoEnderecoTermoEstagio eq "RR" ? "selected" : "" } >Roraima</option>
			<option value="SC" ${ param.estadoEnderecoTermoEstagio eq "SC" ? "selected" : "" } >Santa Catarina</option>
			<option value="SP" ${ param.estadoEnderecoTermoEstagio eq "SP" ? "selected" : "" } >São Paulo</option>
			<option value="SE" ${ param.estadoEnderecoTermoEstagio eq "SE" ? "selected" : "" } >Sergipe</option>
			<option value="TO" ${ param.estadoEnderecoTermoEstagio eq "TO" ? "selected" : "" } >Tocantins</option>
		</select> CEP<input type="text" name="cepEnderecoTermoEstagio"
			value="${param.cepEnderecoTermoEstagio}" /></br> </br>
		</br> O Estágio é Obrigatório?
		<div class="form-check">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox" value=""> Sim
			</label>
		</div>
		<div class="form-check disabled">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox" value=""> Não
			</label>
		</div>
		</br>
		</br> Professor Orientador<select name="idProfessorOrientador">
			<option value="">Selecione</option>
		</select></br>
		</br>
		</br>
		<button type="submit">Salvar</button>
		<button type="button" onclick="javascript:location.href='index.jsp'">Voltar</button>
	</form>
</body>
</html>