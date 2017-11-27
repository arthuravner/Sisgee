<!DOCTYPE html>
<html>
	<head>
		<title>Sisgee</title>
		<%@ include file="head_imports.jspf" %>
	</head>
	<body>
		
		<div class="container">
            <h2 class="titulo">Registro de Empresa Ligada ao Agente de Integração</h2>
           
            <form action="RegistroDeEmpresa" method="POST">
                <fieldset>

                    <label for="agenteIntegracao">Agente de Integração</label>
                    <input id="agenteIntegracao" type="text" name="agenteIntegracao" required pattern="[A-Za-z]{2,}" title="Nome do agente de integração." value="${param.agenteIntegracao}">
                    <br />
                    <label for="cnpjAgenteIntegracao">CNPJ</label>
                    <input value="${param.cnpjEmpresa}" id="cnpjAgenteIntegracao" type="text" name="cnpjAgenteIntegracao" required pattern="[A-Za-z0-9]{14}" title="CNPJ da empresa. O número CNPJ possui 14 dígitos">
                    <br /> 
                    <label for="razaoSocial">Razão Social</label>
                   	<input id="razaoSocial" value="${param.razaoSocialEmpresa}" type="text" name="razaoSocial" required title="Razão social da empresa">

                    <div class="botoes">   
                        <button  class="botao" type="submit">Salvar</button>
                        <button class="botao" type="reset">Cancelar</button>
                    </div>
                </fieldset>
			</form>
        </div>
	</body>
</html>
