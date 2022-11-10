package br.senai.sp.jandira.dao;

import java.util.ArrayList;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    
    private static final String arquivo ="C:\\Users\\22282115\\Java\\Plano_de_Saude.txt";
    private static final String arquivo_temp ="C:\\Users\\22282115\\Java\\Plano_de_Saude_temp.txt";
    private static final Path path = Paths.get(arquivo) ;
    private static final Path path_temp = Paths.get(arquivo_temp) ;
    public static BufferedWriter bw;

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        try {
            
            bw = Files.newBufferedWriter(path,StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            bw.write(planoDeSaude.getPlanoDeSaudeComPontoVirgula());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte.", 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        planos.add(planoDeSaude);
    }

    public static boolean excluir(Integer codigo) {
        for(PlanoDeSaude ps : planos){
            if(ps.getCodigo().equals(codigo)){
                planos.remove(ps);
                break;
            }
        }
        
        //reconstruir um arquivo atualizado
        
        //Passo 01 - Criar uma representação dos arquivos que vão ser manipulados
        File arquivoAtual = new File(arquivo);
        File arquivoTemp = new File(arquivo_temp);
        
        try {
            //criar arquivo temporário
            arquivoTemp.createNewFile();
            //abre o arquivo para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    path_temp, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(PlanoDeSaude p : planos){
                bwTemp.write(p.getPlanoDeSaudeComPontoVirgula());
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
        
        return false;
    }
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo){
        
        for(PlanoDeSaude ps : planos){
            if(ps.getCodigo().equals(codigo)){
                return ps;
            }
        }
        
        
        return null;
    }
    
    public static void atualizar(PlanoDeSaude planoDeSaude){
         for(PlanoDeSaude ps : planos){
            if(ps.getCodigo().equals(planoDeSaude.getCodigo())){
                planos.set(planos.indexOf(ps), planoDeSaude);
                break;
            }
        }
                 
        //reconstruir um arquivo atualizado
        
        //Passo 01 - Criar uma representação dos arquivos que vão ser manipulados
        File arquivoAtual = new File(arquivo);
        File arquivoTemp = new File(arquivo_temp);
        
        try {
            //criar arquivo temporário
            arquivoTemp.createNewFile();
            //abre o arquivo para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    path_temp, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(PlanoDeSaude p : planos){
                bwTemp.write(p.getPlanoDeSaudeComPontoVirgula());
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

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void getListaPlanosDeSaude() {
        try {     
            BufferedReader br = Files.newBufferedReader(path);
            String linha = "";
            linha = br.readLine();
            while(linha != null && !linha.isEmpty()){
                String[] linhavetor = linha.split(";");
                PlanoDeSaude p = new PlanoDeSaude(Integer.valueOf(linhavetor[0]),linhavetor[1], linhavetor[2]);
                planos.add(p);
                linha = br.readLine();  
            }
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "DEU MERDA!!!");
        }

    }

    public static DefaultTableModel getTableModel() {
        // Matriz receberá os planos de saúde
        //que serão usados na tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        // For Each, para extrair cada objeto plano de saúde
        // arrayList planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }
        // Definir o vetor com os nomes das tabelas
        String[] titulos = {"Código", "Nome da operadora", "Tipo do plano"};

        // Criar o modelo que será utilizado pelo JTabel
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;

    }

}
