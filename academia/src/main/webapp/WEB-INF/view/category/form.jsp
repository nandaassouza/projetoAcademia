<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	<title>Cadastro de Categorias</title>
</head>
<body>
	<form method="post" action="/academia/category/ok">
		<div>
			<label for="name">Nome: </label>
			<input type="text" name="name" id="name"/>
		</div>
		<div>
			<input type="submit" value="enviar"/>
		</div>
	</form>
</body>
</html>