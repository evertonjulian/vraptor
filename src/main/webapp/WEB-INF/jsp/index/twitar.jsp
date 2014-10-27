<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function mostrarMensagem(msg){
		alert(msg);
	}
</script>
</head>
<body>
<h1>Cadastro novo Twitts</h1>

	<form action="${linkTo[IndexController].salvarTweet}" method="post" onsubmit="mostrarMensagem('Tweet enviado com sucesso!!')">
			<label>Autor:</label>		
			<input type="text" name="tweet.autor.nome" value="${autorAnterior}"/><br/>
			<label>Tweet:</label>		 
			<textarea name="tweet.mensagem" rows="5" cols="40"></textarea><br/>
			<input type="submit" value="Enviar"/>
	</form>		
		
	<a href="/twiter/">Lista</a>
</body>
</html>