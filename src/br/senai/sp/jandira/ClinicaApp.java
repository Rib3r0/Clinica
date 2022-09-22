package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		
		//criar um plano de saúde
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDoPlano("Prata");
		
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Bradesco");
		plano1.setTipoDoPlano("Ouro");
		
		PlanoDeSaude plano2 = new PlanoDeSaude("Amil");
		plano2.setTipoDoPlano("Prata");
		
		//criar um endereço
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Urano");
		endereco.setNumero("257");
		endereco.setCidade("Jandira");
		endereco.setBairro("Vila Eunice");
		endereco.setEstados(Estados.SAO_PAULO);
		endereco.setTipo("Apartamento");
		endereco.setComplemento("Bloco 03 apt 41");
		endereco.setPontoDeReferencia("cêmiterio municipal");
		endereco.setCep("06602-220");
		
		//criar um paciente
		Paciente paciente = new Paciente();
		paciente.setNome("Eduardo");
		paciente.setEmail("eduardorpimentaa@gmail.com");
		paciente.setCpf("123.456.789-00");
		paciente.setRg("123.456-99");
		paciente.setTelefone("(11)98877-5183");
		paciente.setTipoSanguineo("O+");
		paciente.setGenero(Genero.MASCULINO);
		paciente.setEndereco(endereco);
		paciente.setPlanoDeSaude(plano);
		
		
		//criar uma especialidade
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clinica Geral");
		
		
		//criar medico
		Medico medico1 = new Medico();
		medico1.setNome("Marcos Pereira");
		medico1.setCrm("4562-9");
		medico1.setSexo("Masculino");
		medico1.setDataDeNascimento(LocalDate.of(1990, 6, 8)); // 08/06/1990
		
		//criar lista de especialidades do marcos
		Especialidade[] especialidadesMedico1 = {especialidade1, especialidade3};
		
		medico1.setEspecialidades(especialidadesMedico1);
		
		//criar medico
		Medico medico2 = new Medico();
		medico2.setNome("Fabiana Gomes");
		medico2.setCrm("3214-5");
		medico2.setSexo("Feminino");
		medico2.setDataDeNascimento(LocalDate.of(1984, 11, 27)); // 27/11/1984
		
		//criar lista de especialidades do marcos
		Especialidade[] especialidadesMedico2 = {especialidade2};
		
		medico1.setEspecialidades(especialidadesMedico2);
		
		
		//criar uma agenda
		//paciente patricia ligou na clinica para agendar uma consulta com um clinico geral para dia 22 de setembro às 14h20
		
		//paciente da patricia
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Patricia");
		paciente1.setEmail("patricia@gmail.com");
		paciente1.setCpf("123.456.789-00");
		paciente1.setRg("123.456-99");
		paciente1.setTelefone("(11)98877-5183");
		paciente1.setTipoSanguineo("O+");
		paciente1.setGenero(Genero.FEMININO);
		paciente1.setEndereco(endereco);
		paciente1.setPlanoDeSaude(plano);
		
		Agenda agendapatricia = new Agenda();
		agendapatricia.setPaciente(paciente1);
		agendapatricia.setEspecialidade(especialidade3);
		agendapatricia.setMedico(medico1);
		agendapatricia.setHoraDaConsulta(LocalTime.of(14, 20));
		agendapatricia.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agendapatricia.setObservacoes("");
		agendapatricia.setCompareceu(false);
		
		//imprimir os dados do paciente
		//nome do paciente
		//node do medico
		//especialidade
		//dia e hora da consulta
		System.out.println("Nome do paciente: " + agendapatricia.getPaciente().getNome() + ".");
		System.out.println("Nome do médico: " + agendapatricia.getMedico().getNome() + ".");
		System.out.println("Especialidade: " + agendapatricia.getEspecialidade().getNome() + ".");
		System.out.println("dia e hora: " + agendapatricia.getDataDaConsulta() + " " +agendapatricia.getHoraDaConsulta() + ".");
		System.out.println("Plano de saúde: " + agendapatricia.getPaciente().getPlanoDeSaude().getDadosDoPlano());
		
	}

}
