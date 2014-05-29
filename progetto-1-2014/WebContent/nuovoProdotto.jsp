<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nuovo Prodotto</title>
</head>
<body>
<f:view>
<h:form>
    <div>Nome: <h:inputText value="#{prodottoController.nome}" 
                     required="true"
                     requiredMessage="Name is mandatory"
                     id="name"/> <h:message for="name" />
	</div>
    <div>Codice: <h:inputText value="#{prodottoController.codice}" 
                     required="true"
                     requiredMessage="Code is mandatory"
                     id="code"/> <h:message for="code" />
	</div>
    <div>Prezzo: <h:inputText value="#{prodottoController.prezzo}" 
                     required="true"
                     requiredMessage="Price is mandatory"
                     converterMessage="Price must be a number"
                     id="price"/> <h:message for="price" />
	</div>
    <div>Descrizione: <h:inputTextarea value="#{prodottoController.descrizione}" 
    				required="false" 
    				cols="20" 
    				rows="5" /> 
                     
	</div>
	<div>
		<h:commandButton value="Submit"  action="#{prodottoController.createProdotto}"/>
	</div>
	<h:commandLink action="#{prodottoController.listProdotti}"
						value="Catalogo prodotti" />
</h:form>
</f:view>
</body>
</html>