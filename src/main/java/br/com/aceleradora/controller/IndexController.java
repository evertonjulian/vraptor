package br.com.aceleradora.controller;

import java.util.ArrayList;
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
	
	private BancoDeDados bancoDeDados;
	
	public IndexController(BancoDeDados bancoDeDados) {
		this.bancoDeDados = bancoDeDados;
	}

	@Path("/")
	public void index(){
		
	}
	
	public void recebeDados(String dado, Result result){
		result.include("meuNome", dado);
	}
	
	public List<Tweet> remover(Result result){		
		bancoDeDados.removeTweet();	
		//result.forwardTo(this).recebeDados(tweet.getMensagem(), result);
		return bancoDeDados.todosTweets();
	}	
	
	public List<Tweet> twitar(Tweet tweet, Result result){
		tweet.setHoraTweet(DateTime.now());
		bancoDeDados.adicionaTweet(tweet);
		return bancoDeDados.todosTweets();
	}
	
	public List<Tweet> mostrarTweets(){
		
		return bancoDeDados.todosTweets();
	}
	
}
