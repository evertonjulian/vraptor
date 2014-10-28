package br.com.aceleradora.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;

import br.com.aceleradora.models.BancoDeDados;
import br.com.aceleradora.models.Pessoa;
import br.com.aceleradora.models.Tweet;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {
	
	private BancoDeDados bd;
	

	public IndexController(BancoDeDados bancoDeDados) {
		this.bd = bancoDeDados;
	}

	@Path("/")
	public void index(Result result){		
		result.forwardTo(this).listar();
	}
	
	@Path("/twitar")	
	public void twitar(Result result){			
	
	}
	
	//public String quantidadeTweets(String autor, Result result){
		//result.include("quantidadeTweets", bd.getQuantidadeTweets(autor));
		//result.forwardTo(this).index(result);
//		return bd.getQuantidadeTweets(autor);
//	}
	
//	public void salvarTweet(Tweet tweet, Result result){		
//		salvar(tweet, result);
//		result.forwardTo(this).twitar(result);
//	}
	
	public void salvar(Tweet tweet, Result result){
		Date dt = new Date();
		
		tweet.setHoraTweet(dt);
		bd.adicionaTweet(tweet);	
		result.forwardTo(this).twitar(result);		
	}
	
	public void remover(int id, Result result){		
		bd.removeTweet(id);	
		result.forwardTo(this).index(result);		
	}
	
	public void editar(int id, String mensagem, Result result) {
		bd.editaTweet(id, mensagem);
		result.forwardTo(this).index(result);
	}
	
	public List<Tweet> listar(){		
		return bd.todosTweets();
	}

	
}
