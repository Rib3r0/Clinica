package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;

public class testeDAOxpto {

	public static void main(String[] args) {
		
		testeDAO.main(args);

//		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		
		System.out.println(PlanoDeSaudeDAO.listarTodos());

	}

}
