package br.com.aceleradora.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@Component
@SessionScoped
public class BancoDeDados {
	
	//private List<Pessoa> pessoas;
	private List<Tweet> tweets;
	
	public BancoDeDados() {		
		//pessoas = new ArrayList<Pessoa>();
		tweets = new ArrayList<Tweet>();
	}	
//
//	public void adicionaPessoa(Pessoa pessoa) {
//		pessoas.add(pessoa);
//	}
//	
//	public List<Pessoa> listarPessoas() {
//		return pessoas;
//	}
	
	public int getQuantidadeTweets(String autor){
		int qtdTweets = 0;
		
		for (Tweet tweet : tweets) {
			if (tweet.getAutor().equals(autor)) {
				qtdTweets++;
			}
		}
		
		return qtdTweets;
	}
	
	public void adicionaTweet(Tweet tweet){		
		tweets.add(tweet);		
	}
	
	public void removeTweet(int id){
		//pessoa.getTweets().remove(id);
		tweets.remove(id);
	}
	
	public List<Tweet> todosTweets(){
//		List<Tweet> tweets = new ArrayList<Tweet>();
//		for (Pessoa pessoa : pessoas) {
//			tweets.addAll(pessoa.getTweets());			
//		}
//		
//		return ordenarPorData(tweets);
		
		return tweets;
	}
	
	public void editaTweet(int id, String mensagem) {
		Date dt = new Date();		
		
//		pessoa.getTweets().get(id).setMensagem(mensagem);
//		pessoa.getTweets().get(id).setHoraTweet(dt);		
		
		tweets.get(id).setMensagem(mensagem);
		tweets.get(id).setHoraTweet(dt);
	}
	
	public List<Tweet> ordenarPorData(List<Tweet> tweets){
		List<Tweet> listaOrdenada = new ArrayList<Tweet>();
		Tweet aux;
		Tweet aux2;
		
		for (int i = 0; i < listaOrdenada.size() - 1; i++) {
			for (int j = i + 1; j < listaOrdenada.size(); j++) {
				if (listaOrdenada.get(i).getHoraTweet().before(listaOrdenada.get(j).getHoraTweet())) {
					aux = listaOrdenada.get(i);
					aux2 = listaOrdenada.get(j);
					
					listaOrdenada.remove(i);
					listaOrdenada.add(aux2);
					listaOrdenada.remove(j);
					listaOrdenada.add(aux);
				}
			}
		}
		
		return listaOrdenada;
	}
}
