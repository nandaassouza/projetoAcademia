<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	<title>Cadastro do Treino</title>
</head>
<body>
	<form method="post" action="/academia/training/ok">
		<div>
			<label for="title">Nome: </label>
			<input type="text" name="title" id="title"/>
		</div>
		<div>
			<label for="day">Dia: </label>
			<input type="text" name="day" id="day"/>
		</div>
		<div>
			<label for="exercise">Exercício: </label>
			<input type="text" name="exercise" id="exercise"/>
		</div>
		<div>
			<label for="serie">Serie: </label>
			<input type="text" name="serie" id="serie"/>
		</div>
		<div>
			<input type="submit" value="enviar"/>
		</div>
	</form>
</body>
</html>