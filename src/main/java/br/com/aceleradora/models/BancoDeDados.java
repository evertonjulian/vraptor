package br.com.aceleradora.models;

import java.util.ArrayList;
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
	
	public void adicionaTweet(Tweet tweet){
		tweets.add(tweet);
	}
	
	public void removeTweet(){
		tweets.remove(0);
	}
	
	public List<Tweet> todosTweets(){
		return tweets;
	}
}
