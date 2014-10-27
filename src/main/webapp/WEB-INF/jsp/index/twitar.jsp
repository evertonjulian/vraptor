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
<h1>Lista de Tweets</h1>

	<br/>**---------------------------------------------------------**
	<form action="${linkTo[IndexController].remover}" method="POST">   
		<c:forEach items="${tweetList}" var="tweet">
			<p>Autor: ${tweet.pessoa.nome}
			<br/>Mensagem: ${tweet.mensagem}		
			<br/>Hora: ${tweet.horaTweet}
			<br/><br/>**---------------------------------------------------------**</p>				
		</c:forEach>
		<input type="submit" value="apagar">	
	</form>

		
	<a href="/twiter/">Home</a>
</body>
</html>