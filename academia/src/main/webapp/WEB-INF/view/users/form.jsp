<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Exercícios</title>
</head>
<body>
	<form method="post" action="/academia/users">
		<div>
			<label for="name">Nome: </label>
			<input type="text" name="title" id="title"/>
		</div>
		<div>
			<label for="adress">Endereço: </label>
			<input type="text" name="adress" id="adress"/>
		</div>
		<div>
			<label for="document">Documento: </label>
			<input type="text" name="document" id="document"/>
		</div>
		<div>
			<label for="date">Data de Nascimento: </label>
			<input type="date" name="date" id="date"/>
		</div>
		<div>
			<label for="weight">Peso: </label>
			<input type="number" name="weight" id="weight"/>
		</div>
		<div>
			<label for="width">Altura: </label>
			<input type="text" name="width" id="width"/>
		</div>
		<div>
			<input type="submit" value="enviar"/>
		</div>
	</form>
</body>
</html>