<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Categorias</title>
</head>
<body>
	<form method="post" action="/academia/category">
		<div>
			<label for="title">Nome: </label>
			<input type="text" name="title" id="title"/>
		</div>
		<div>
			<input type="submit" value="enviar"/>
		</div>
	</form>
</body>
</html>