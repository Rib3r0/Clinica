package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class testeDAO {

    public static void main(String[] args) {
        
//        String[] linha0 = {"Cotia","Itapevi", "Carapicuiba"};
//        String[] linha1 = {"Sãopaulo","Itapevi", "Jandira"};
//        String[] linha2 = {"Cotia","Osasco", "Jandira"};
//        String[] linha3 = {"Cotia","Pará", "Jandira"};
//        
//        String[][] linhas = {linha0, linha1, linha2, linha3};
//        
//        System.out.println(linhas[2][0]);
//        
//        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
//        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
//        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
//        PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Ouro");
//
//        PlanoDeSaudeDAO.gravar(plano1);
//        PlanoDeSaudeDAO.gravar(plano2);
//
//        for (PlanoDeSaude plano : PlanoDeSaudeDAO.listarTodos()) {
//            System.out.println(plano.getOperadora());
//        }
//        System.out.println("-----------------------------");
//
//        PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
//        dao2.gravar(plano3);
//        dao2.gravar(plano4);
//
//        for (PlanoDeSaude plano : PlanoDeSaudeDAO.listarTodos()) {
//            System.out.println(plano.getOperadora());
//        }
        Especialidade especialidade1 = new Especialidade("Cardiologia","Area que cuida do coração");
        Especialidade especialidade2 = new Especialidade("Pediatria","Area que cuida da saúde das crianças");
        Especialidade especialidade3 = new Especialidade("Otorrinolaringologia","Area que cuida do nariz ouvidos e garganta");
        Especialidade especialidade4 = new Especialidade("Clinico Geral","Area que cuida da saúde em geral");
        
        EspecialidadeDAO.gravar(especialidade1);
        EspecialidadeDAO.gravar(especialidade2);
        EspecialidadeDAO.gravar(especialidade3);
        EspecialidadeDAO.gravar(especialidade4);
        
        for (Especialidade especialidade : EspecialidadeDAO.listarTodos()) {
           System.out.println(especialidade.getCodigo());
           System.out.println(especialidade.getNome());
           System.out.println(especialidade.getDescricao());
           System.out.println("-----------------------------");   
        }
        EspecialidadeDAO.excluir(100);
        for (Especialidade especialidade : EspecialidadeDAO.listarTodos()) {
           System.out.println(especialidade.getCodigo());
           System.out.println(especialidade.getNome());
           System.out.println(especialidade.getDescricao());
           System.out.println("-----------------------------");   
        }
        

    }

}
