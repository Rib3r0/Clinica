package br.senai.sp.jandira.model;

public class Especialidade {
	//atributos
	private String nome;
	private String descricao;
	private static int quantidade;
	
	// Métodos de acesso / getters and setters
	
	// ***Pegar nome da Especialidade***
						//parametro do método
	public Especialidade() {
		quantidade++;		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	// ***Retornar nome da Especilidade***
	public String getNome() {
		
		return nome;
	}
	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
}
