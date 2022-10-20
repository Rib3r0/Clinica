package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList();

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                return true;
            }
        }
        return false;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }

        }
    }
    

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }
    
    public static ArrayList<Especialidade> listarTodos(){
        return especialidades;
    }

    
    public static void criarEspecialidadesTeste(){
        Especialidade especialidade1 = new Especialidade("Cardiologia","Area que cuida do coração");
        Especialidade especialidade2 = new Especialidade("Pediatria","Area que cuida da saúde das crianças");
        Especialidade especialidade3 = new Especialidade("Otorrinolaringologia","Area que cuida do nariz ouvidos e garganta");
        Especialidade especialidade4 = new Especialidade("Clinico Geral","Area que cuida da saúde em geral");
        
        EspecialidadeDAO.gravar(especialidade1);
        EspecialidadeDAO.gravar(especialidade2);
        EspecialidadeDAO.gravar(especialidade3);
        EspecialidadeDAO.gravar(especialidade4);
    }
    
        public static DefaultTableModel getTableModel() {
        // Matriz receberá os planos de saúde
        //que serão usados na tabela (JTable)
        Object[][] dados = new Object[especialidades.size()][3];

        // For Each, para extrair cada objeto plano de saúde
        // arrayList planos e separar cada dado na matriz dados
        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        // Definir o vetor com os nomes das tabelas
        String[] titulos = {"Código", "Nome da especialidade", "Descrição"};

        // Criar o modelo que será utilizado pelo JTabel
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;

    }
}
