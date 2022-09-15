package br.senai.sp.jandira.model;

public class Paciente {
	//atributos
	private String nome;
	private String email;
	private PlanoDeSaude planoDeSaude;
	
	//métodos de acesso
	// ***Pegar nome do Paciente***
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	// ***Retornar nome do Paciente***
	public String getNome() {
		
		return this.nome;
		
	}
	// ***Pegar email do Paciente***
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	// ***Retornar email do Paciente***
	public String getEmail() {
		
		return this.email;
		
	}
	// ***Pegar Plano de Saúde do Paciente***
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		
		this.planoDeSaude = planoDeSaude;
		
	}
	// ***Retornar Plano de Saúde do Paciente***
	public PlanoDeSaude getPlanoDeSaude() {
		
		return this.planoDeSaude;
		
	}

}
