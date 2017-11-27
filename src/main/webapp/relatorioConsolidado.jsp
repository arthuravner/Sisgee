<html lang="en">
  <head>
    <%@ include file="head_imports.jspf" %>
    <title><fmt:message key="br.cefetrj.sisgee.menu.nom_sistema"/></title>
  </head>
  <body>
  	<%@ include file="menu.jspf" %>
  	<div class="container">
  		<br/>
  		<br/>
  		<p align="center"><fmt:message key="br.cefetrj.sisgee.menu.relatorioConsolidado"/></p>
  		
  		
  		<label class="form-check-label">
      	<input type="checkbox" class="form-check-input">
     	 Estágio Obrigatório
    	</label>
    
    	<label class="form-check-label">
      	<input type="checkbox" class="form-check-input">
      	Estágio Não Obrigatório
    	</label>
  		
  		<button type="submit" class="btn btn-primary" align="right"><fmt:message key="br.cefetrj.sisgee.pesquisar"/></button>
  		
  		
  	</div>
  	
  	<div class="container">
  	
  	
  	</div>
  	
  	
    <%@ include file="scripts_imports.jspf" %>
  </body>
</html>