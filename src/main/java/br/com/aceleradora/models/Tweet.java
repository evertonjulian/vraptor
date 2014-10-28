package br.com.aceleradora.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tweet {

	private String mensagem;
	private Pessoa autor;
	private Date horaTweet;

	public Date getHoraTweet() {
		return horaTweet;
	}
	
	public void setHoraTweet(Date horaTweet) {
		this.horaTweet = horaTweet;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Pessoa getAutor() {
		return autor;
	}

	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}	
}
