package br.senai.sp.jandira.testes;

import java.util.ArrayList;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) {
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil","Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz","Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed","Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame","Ouro");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		
		int i = 0;
		
		while(i < planos.size()) {
			System.out.println(planos.get(i).getOperadora());
			i++;
		}
		
		//looping FOR
		//for (contador; condição; acumulador){}
		System.out.println("------------------------------------------");
		for (int contador = 0; contador < planos.size(); contador++) {
			System.out.println(planos.get(contador).getOperadora());
		}
		
		System.out.println("------------------------------------------");
		for (PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		
//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
//		dao.gravar(plano1);
//		dao.gravar(plano2);
//		
//		System.out.println(dao.listarTodos());
//		
//		
//		
		// Criar 3 especialidades e exibir o nome das especialidades usando ofor each
		
		Especialidade cardiologia = new Especialidade();
		cardiologia.setNome("Cardiologia");
		cardiologia.setDescricao("Cuida do coração");
		
		Especialidade pediatria = new Especialidade();
		pediatria.setNome("Pediatria");
		pediatria.setDescricao("Cuidada de criança");
		
		Especialidade clinicoGeral = new Especialidade();
		clinicoGeral.setNome("ClinicoGeral");
		clinicoGeral.setDescricao("Geral");
		
		Especialidade podologia = new Especialidade();
		podologia.setNome("Podologia");
		podologia.setDescricao("Cuida dos pés");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(cardiologia);
		especialidades.add(pediatria);
		especialidades.add(clinicoGeral);
		especialidades.add(podologia);
		
		
		System.out.println("---------------------------------------------");
		for(Especialidade especialidade : especialidades) {
			System.out.println(especialidade.getNome() + " --> " + especialidade.getDescricao());
		}
		
		
		
		
		
	}

}
