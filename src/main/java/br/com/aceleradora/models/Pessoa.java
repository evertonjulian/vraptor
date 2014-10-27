package br.com.aceleradora.models;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;	
	private String caminhoFoto;
	//private List<Tweet> tweets;
	private int quantidadeTweets;
	
	public Pessoa(String nome) {
		//setTweets(new ArrayList<Tweet>());
		quantidadeTweets = 0;
		this.nome = nome;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminhoFoto() {
		return caminhoFoto;
	}

	public void setCaminhoFoto(String caminhoFoto) {
		this.caminhoFoto = caminhoFoto;
	}

//	public List<Tweet> getTweets() {
//		return tweets;
//	}
//
//	public void setTweets(List<Tweet> tweets) {
//		this.tweets = tweets;
//	}

	public int getQuantidadeTweets() {
		return quantidadeTweets;
	}

	public void addQuantidadeTweets() {
		quantidadeTweets++;
	}	
	
}
