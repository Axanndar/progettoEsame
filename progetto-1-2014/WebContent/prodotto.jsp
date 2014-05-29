<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Prodotto</title>
</head>
<body>
<f:view>
<h1>${prodottoController.prodotto.nome}</h1>
<h2>Details</h2>
<div>Code: ${prodottoController.prodotto.codice}</div>
<div>Price: ${prodottoController.prodotto.prezzo}</div>
<div>Description: ${prodottoController.prodotto.descrizione}</div>
</f:view>
</body>
</html>