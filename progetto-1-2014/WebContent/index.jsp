<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>progetto-1-2014</title>
</head>
<body>
	<f:view>
		<h1>Progetto-1-2014</h1>
		<ul>
		<li><a href='<c:url value="/faces/nuovoProdotto.jsp" />'>Inserisci
					prodotto</a></li>
			<li><h:form>
					<h:commandLink action="#{prodottoController.listProdotti}"
						value="Catalogo prodotti" />
				</h:form></li>
		</ul>
	</f:view>
</body>
</html>