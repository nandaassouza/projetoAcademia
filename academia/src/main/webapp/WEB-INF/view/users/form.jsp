<%@ page language="java" contentType="text/html; text/css; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	<title>Cadastro de Usuário</title>
</head>
<body>
	<fieldset class="campo">
 	<form method="post" action="/academia/users/ok">
		<div>
			<label for="name">Nome: </label>
			<input type="text" name="name" id="name"/>
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
			<label for="date">Data de Nasc.: </label>
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
			<label for="password">Senha: </label>
			<input type="password" name="password" id="password"/>
		</div>
		 <div>
            <label>Aluno?</label>
            <label>
                <input type="checkbox" name="newsletter" value="1"> Sim
            </label>
        </div>
		<div>
			<input type="submit" value="Enviar"/>
		</div>
	</form>
	</fieldset>
</body>
</html>