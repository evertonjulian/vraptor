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
	function trocaVisibilidade(id){
		if(document.getElementById("idForm"+id).style.visibility=="hidden"){
			 document.getElementById("idForm"+id).style.visibility="";
			 }else{
			 document.getElementById("idForm"+id).style.visibility="hidden";
			 }
	}
	
	function mostrarMensagem(msg){
		alert(msg);
	}
</script>
</head>
<body>
<h1>Lista de Tweets</h1>

	
				<c:forEach items="${tweetList}" var="tweet">
					<br/>**---------------------------------------------------------**
					<p>Autor: ${tweet.autor.nome}
					<br/>Tweets postados: ${tweet.autor.quantidadeTweets}
					<br/>Mensagem: ${tweet.mensagem}		
					<br/>Hora: ${tweet.horaTweet}				
					
					<form action="${linkTo[IndexController].remover}" method="post">
					<input type="text" name="id" value="${tweetList.indexOf(tweet)}" hidden />
					<input type="submit" value="Deletar" />
					</form>										
					
					<input type="button" name="editar" value="Editar" onClick="trocaVisibilidade(${tweetList.indexOf(tweet)})"/>
					<form action="${linkTo[IndexController].editar}" method="post" id="idForm${tweetList.indexOf(tweet)}" style="visibility:hidden" onsubmit="mostrarMensagem('Tweet editado com sucesso!!')">
						<label>Mensagem: </label>
						<input type="text" name="id" value="${tweetList.indexOf(tweet)}" hidden />
						<textarea name="mensagem">${tweet.mensagem}</textarea>
						<input type="submit" value="Enviar">
					</form>					
					
					<br/><br/>**---------------------------------------------------------**</p>					
									
				</c:forEach>		
		
	<a href="/twiter/twitar">Twitar</a>
</body>
</html>