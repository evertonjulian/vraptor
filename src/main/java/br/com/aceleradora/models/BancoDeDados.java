package br.com.aceleradora.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@Component
@SessionScoped
public class BancoDeDados {

	private List<Tweet> tweets;
	
	public BancoDeDados() {
		tweets = new ArrayList<Tweet>();
	}	

	public void setQuantidadeTweets(String autor){	
		int qntde = 0;
		for (Tweet tweet : tweets) {			
			if (tweet.getAutor().getNome().equals(autor)) {
				tweet.getAutor().addQuantidadeTweets();	
				qntde = tweet.getAutor().getQuantidadeTweets();	
			}
		}	
		for (Tweet tweet : tweets) {			
			if (tweet.getAutor().getNome().equals(autor)) {
				tweet.getAutor().setQuantidadeTweets(qntde);	
			}
		}		
	}
	
	public void adicionaTweet(Tweet tweet){	
		
		tweets.add(0, tweet);	
		//AQUI
		setQuantidadeTweets(tweets.get(0).getAutor().getNome());
	}
	
	public void removeTweet(int id){
		tweets.remove(id);
	}
	
	public List<Tweet> todosTweets(){
		return tweets;
	}
	
	public void editaTweet(int id, String mensagem) {
		Date dt = new Date();
		
		tweets.get(id).setMensagem(mensagem);
		tweets.get(id).setHoraTweet(dt);
	}
	
	public List<Tweet> ordenarPorData(List<Tweet> tweets){
		List<Tweet> listaOrdenada = tweets;
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
