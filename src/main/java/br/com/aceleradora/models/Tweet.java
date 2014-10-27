package br.com.aceleradora.models;

import org.joda.time.DateTime;

public class Tweet {

	private String mensagem;
	private Pessoa pessoa;
	private DateTime horaTweet;
		

	public DateTime getHoraTweet() {
		return horaTweet;
	}
	
	public void setHoraTweet(DateTime horaTweet) {
		this.horaTweet = horaTweet;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
}
