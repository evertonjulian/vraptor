<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${linkTo[IndexController].remover}" method="POST">   
	<c:forEach items="${tweetList}" var="tweet">
		<p>Autor: ${tweet.pessoa.nome}
		<br/>Mensagem: ${tweet.mensagem}		
		<br/>Hora: ${tweet.horaTweet}</p>
		<input type="submit" value="apagar">		
	</c:forEach>
</form>
		
	<a href="/twiter/">Voltar</a>
</body>
</html>