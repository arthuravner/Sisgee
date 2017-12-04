<html>
	<head>
		<title>Sisgee</title>
		<%@ include file="head_imports.jspf" %>
	</head>
	<body>
		
	    <div class="container-default">
	        <div class="panel panel-default">
	            <div class="panel-heading" align="left">
	                <h4><b><font color="black" style="font-family: Times;">Sisgee</font></b></h4>
	                <%@ include file="menu.jspf" %> 	
	            </div>
	            
	            <p> Termo de Recisão</p>
    	            	           	            
	        </div>
	        <input name="txtNome" value="${ param.txtNome }" type="text" disabled="disabled" style="margin-left: 10px;"/>
	        <%@ include file="form_dados_aluno.jspf" %>
	        <div class="col-md-4 col-md-offset-4">
	            
	            <div class="panel-heading" align="left">
	                <b><font color="black" >Data de recisão</font></b>
	            </div>
	            	        
	 			<div class='col-sm-6' style="width:295px;">
	                <div class="form-group">
	                    <div class='input-group date' id='datetimepicker5'>
	                        <input type='text' class="form-control"/>
	                        <span class="input-group-addon">
	                            <span class="glyphicon glyphicon-calendar"></span>
	                        </span>
	                    </div>
	                </div>
	            </div>
	            <script type="text/javascript">
	            $(function () {
	                $('#datetimepicker5').datetimepicker({
	                    defaultDate: "08/02/2016",
	                    locale: 'pt-br'
	                });
	            });
	            </script>
			             
	        </div>	        
	        <div class="col-md-4 col-md-offset-4">	        	
	  			<button type="submit" class="btn btn-primary">Salvar</button>
	  			<button type="button" class="btn btn-secondary" >Cancelar</button>	  			
	        </div>
	    </div>
	    
	    <%@ include file="scripts_imports.jspf" %>
	    
	</body>
</html>