package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidades = new ArrayList();
    
    private static final String arquivo ="C:\\Users\\22282115\\Java\\especialidade.txt";
    private static final String arquivo_temp ="C:\\Users\\22282115\\Java\\especialidade_temp.txt";
    private static final Path path = Paths.get(arquivo) ;
    private static final Path path_temp = Paths.get(arquivo_temp) ;
    public static BufferedWriter bw;
   

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        try {
            
            bw = Files.newBufferedWriter(path,StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            bw.write(especialidade.getEspecialidadeComPontoVirgula());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte.", 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        especialidades.add(especialidade);
    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }            
        atualizarArquivo();
        
        return false;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
            atualizarArquivo();
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

    
    private static void atualizarArquivo(){
                        //reconstruir um arquivo atualizado
        
        //Passo 01 - Criar uma representa????o dos arquivos que v??o ser manipulados
        File arquivoAtual = new File(arquivo);
        File arquivoTemp = new File(arquivo_temp);
        
        try {
            //criar arquivo tempor??rio
            arquivoTemp.createNewFile();
            //abre o arquivo para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    path_temp, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(Especialidade e : especialidades){
                bwTemp.write(e.getEspecialidadeComPontoVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro na hora de criar o arquivo!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public static void getListaEspecialidades(){
        try {     
            BufferedReader br = Files.newBufferedReader(path);
            String linha = "";
            linha = br.readLine();
            while(linha != null && !linha.isEmpty()){
                String[] linhavetor = linha.split(";");
                Especialidade e = new Especialidade(Integer.valueOf(linhavetor[0]),linhavetor[1], linhavetor[2]);
                especialidades.add(e);
                linha = br.readLine();  
            }
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "DEU MERDA!!!");
        }
       
    }
    
        public static DefaultTableModel getTableModel() {
        // Matriz receber?? os planos de sa??de
        //que ser??o usados na tabela (JTable)
        Object[][] dados = new Object[especialidades.size()][3];

        // For Each, para extrair cada objeto plano de sa??de
        // arrayList planos e separar cada dado na matriz dados
        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        // Definir o vetor com os nomes das tabelas
        String[] titulos = {"C??digo", "Nome da especialidade", "Descri????o"};

        // Criar o modelo que ser?? utilizado pelo JTabel
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;

        }
        public static ArrayList<String> getListaDeNomes() {
        ArrayList<String> dados = new ArrayList<>();
        for (Especialidade e : especialidades) {
            dados.add(e.getNome());
        }
        DefaultListModel<String> ListaModel = new DefaultListModel<>();
        
        ListaModel.addAll(dados);
        
        return dados;

        }
}
