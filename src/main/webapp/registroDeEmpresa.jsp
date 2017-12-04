<!DOCTYPE html>
<html>
	<head>
		<title>Sisgee</title>
		<%@ include file="head_imports.jspf" %>
	</head>
	<body>
		<%@ include file="menu.jspf" %>
		<div class="container-default">
            <h2 class="titulo">Registro de Empresa Ligada ao Agente de Integração</h2>
           
            <form action="FrontControllerServlet?action=RegistroDeEmpresa" method="POST">
                <fieldset>

                    <label for="agenteIntegracao">Agente de Integração</label>
                    <input type="text" name="tglEhAgente"  title="Nome do agente de integração." value="${param.agenteIntegracao}">
                    <br />
                    <label for="cnpjAgenteIntegracao">CNPJ</label>
                    <input value="${param.cnpjEmpresa}" type="text" name="txtCnpj" title="CNPJ da empresa. O número CNPJ possui 14 dígitos">
                    <br /> 
                    <label for="razaoSocial">Razão Social</label>
                   	<input value="${param.razaoSocialEmpresa}" type="text" name="txtRazaoSocial" required title="Razão social da empresa">

                    <div class="botoes">   
                        <button  class="botao" type="submit">Salvar</button>
                        <button class="botao" type="reset">Cancelar</button>
                    </div>
                </fieldset>
			</form>
        </div>
		   <%@ include file="scripts_imports.jspf" %>
	</body>
</html>
