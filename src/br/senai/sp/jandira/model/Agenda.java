package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
	private Paciente paciente;
	private Especialidade especialidade;
	private Medico medico;
	private LocalDate dataDaConsulta;
	private LocalTime horaDaConsulta;
	private String observacoes;
	private boolean compareceu;

	// paciente
	public Paciente getPaciente() {

		return paciente;

	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	// especialidade
	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	// medico
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	// data da consulta
	public LocalDate getDataDaConsulta() {
		return dataDaConsulta;
	}

	public void setDataDaConsulta(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}

	// hora da consulta
	public LocalTime getHoraDaConsulta() {
		return horaDaConsulta;
	}

	public void setHoraDaConsulta(LocalTime horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}

	// observações
	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	// se compareceu
	public boolean isCompareceu() {
		return compareceu;
	}

	public void setCompareceu(boolean compareceu) {
		this.compareceu = compareceu;
	}

}
