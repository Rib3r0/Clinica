package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    private Medico medico;
    private static ArrayList<Medico> medicos = new ArrayList();
    
    private static final String arquivo ="C:\\Users\\22282115\\Java\\Medico.txt";
    private static final String arquivo_temp ="C:\\Users\\22282115\\Java\\Medico_temp.txt";
    private static final Path path = Paths.get(arquivo) ;
    private static final Path path_temp = Paths.get(arquivo_temp) ;
    public static BufferedWriter bw;
    
    
    public static void gravar(Medico medico) {
        try {         
            bw = Files.newBufferedWriter(path,StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            bw.write(medico.getInformacoesMedicoComPontoVirgula());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte.", 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        medicos.add(medico);
    }
    
    
    public static boolean excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }            
        atualizarArquivo();
        
        return false;
    }
    
    
    public static void atualizar(Medico medico) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicos.set(medicos.indexOf(m), medico);
                break;
            }
            atualizarArquivo();
        }

    }
    
    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }
    
    public static ArrayList<Medico> listarTodos(){
        return medicos;
    }
    
    private static void atualizarArquivo(){
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
            
            for(Medico m : medicos){
                bwTemp.write(m.getInformacoesMedicoComPontoVirgula());
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
    
        public static void getListaMedicos(){
        try {     
            BufferedReader br = Files.newBufferedReader(path);
            String linha = "";
            linha = br.readLine();
            while(linha != null && !linha.isEmpty()){
                String[] linhavetor = linha.split(";");
                
                int i = 0;
                ArrayList<Especialidade> especialidades = new ArrayList<>();
                while(linhavetor.length > i +6){
                   especialidades.add(EspecialidadeDAO.getEspecialidade( Integer.getInteger(linhavetor[6+i])));
                   i++;
                }
                
                String[] data = linhavetor[5].split("/");
                int ano = Integer.parseInt(data[2]);
                int mes = Integer.parseInt(data[1]);
                int dia = Integer.parseInt(data[0]);
                LocalDate dataDeNascimento = LocalDate.of(ano,mes, dia);
                
                Medico m = new Medico
                (Integer.valueOf(linhavetor[0]), linhavetor[1], linhavetor[2], linhavetor[3], linhavetor[4], dataDeNascimento, especialidades);
                medicos.add(m);
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
        Object[][] dados = new Object[medicos.size()][4];

        // For Each, para extrair cada objeto plano de saúde
        // arrayList planos e separar cada dado na matriz dados
        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            i++;
        }
        // Definir o vetor com os nomes das tabelas
        String[] titulos = {"Código", "CRM", "Nome do Medico","Telefone"};

        // Criar o modelo que será utilizado pelo JTabel
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;

        }
}
    


