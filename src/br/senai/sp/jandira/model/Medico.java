package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {
	// atributos
	private String nome;
	private LocalDate dataDeNascimento;
	private String sexo;
	private Especialidade[] especialidades;
	private String crm;

	// métodos de acesso
	// nome
	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getNome() {

		return nome;

	}

	// data de nascimento
	public void setDataDeNascimento(LocalDate dataDeNascimento) {

		this.dataDeNascimento = dataDeNascimento;

	}

	public LocalDate getDataDeNascimento() {

		return dataDeNascimento;

	}

	// sexo
	public void setSexo(String sexo) {

		this.sexo = sexo;

	}

	public String getSexo() {

		return sexo;

	}

	// especialidades
	public void setEspecialidades(Especialidade[] especialidades) {

		this.especialidades = especialidades;

	}

	public Especialidade[] getEspecialidades() {

		return especialidades;

	}

	// CRM
	public void setCrm(String crm) {

		this.crm = crm;

	}

	public String getCrm() {

		return crm;

	}
}
