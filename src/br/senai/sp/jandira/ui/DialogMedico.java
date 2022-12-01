
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class DialogMedico extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;
    
    private DefaultListModel<String> listaDasEspecialidades = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesNSelecionadas = EspecialidadeDAO.listarTodos();
    
    private DefaultListModel<String> listaDasEspecialidadesDoMedico = new DefaultListModel<>();
    private ArrayList<String> selecionadas = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadas = new ArrayList<>();

    public DialogMedico(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico
    ) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        atualizarListasEspecialidades();

        // Preencher os campos, caso o tipo de operação for ALTERAR
        if (tipoOperacao == tipoOperacao.ALTERAR) {
            preencherFormulario();           
        }

    }

    private void preencherFormulario() {
        tituloLabel.setText("Medico - " + tipoOperacao);
        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit.png")));
        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldNomeDoMedico.setText(medico.getNome());
        textFieldCrm.setText(medico.getCrm());
        formattedTextFieldDataDeNascimento.setText(medico.getDataNascimentoComBarra());
        textFieldEmail.setText(medico.getEmail());
        textFieldTelefone.setText(medico.getTelefone());
        atualizarListasEspecialidades();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelIcon = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textFieldCrm = new javax.swing.JTextField();
        textFieldNomeDoMedico = new javax.swing.JTextField();
        textFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonRetirar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        formattedTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListEspecialidades = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListEspecialidadesDoMedico = new javax.swing.JList<>();
        textFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        jPanel1.add(LabelIcon);
        LabelIcon.setBounds(30, 20, 30, 40);

        tituloLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 153, 255));
        tituloLabel.setText("Médico - ADICIONAR");
        jPanel1.add(tituloLabel);
        tituloLabel.setBounds(70, 25, 660, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel2.setLayout(null);

        textFieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrmActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCrm);
        textFieldCrm.setBounds(130, 70, 110, 30);
        jPanel2.add(textFieldNomeDoMedico);
        textFieldNomeDoMedico.setBounds(250, 70, 480, 30);

        textFieldCodigo.setEditable(false);
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 70, 80, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("CRM:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(130, 50, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Nome do(a) médico(a):");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(250, 50, 150, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Código:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 50, 50, 20);

        buttonSalvar.setBackground(new java.awt.Color(255, 255, 254));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salvar.png"))); // NOI18N
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(620, 310, 50, 40);

        buttonCancelar.setBackground(new java.awt.Color(255, 255, 254));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(680, 310, 50, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Especialidades do Médico(a):");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(250, 170, 180, 20);

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldEmail);
        textFieldEmail.setBounds(190, 130, 390, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("E-mail:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(190, 110, 70, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Data de Nascimento:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(590, 110, 140, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Telefone:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 110, 70, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Especialidades:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 170, 90, 20);

        buttonRetirar.setBackground(new java.awt.Color(255, 124, 101));
        buttonRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta_esquerda.png"))); // NOI18N
        buttonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetirarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonRetirar);
        buttonRetirar.setBounds(190, 270, 50, 40);

        buttonAdicionar.setBackground(new java.awt.Color(119, 229, 255));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta_direita.png"))); // NOI18N
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAdicionar);
        buttonAdicionar.setBounds(190, 220, 50, 40);

        try {
            formattedTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTextFieldDataDeNascimento.setToolTipText("dd/mm/aaaa");
        formattedTextFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(formattedTextFieldDataDeNascimento);
        formattedTextFieldDataDeNascimento.setBounds(590, 130, 130, 30);

        ListEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListEspecialidades);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(50, 200, 110, 150);

        jScrollPane2.setViewportView(ListEspecialidadesDoMedico);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(260, 200, 110, 150);

        try {
            textFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldTelefone);
        textFieldTelefone.setBounds(40, 130, 140, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 750, 360);

        setBounds(0, 0, 805, 528);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCrmActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (tipoOperacao == tipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void buttonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetirarActionPerformed
        List<String> removerEspecialidades = ListEspecialidadesDoMedico.getSelectedValuesList();
        
        for(String e : removerEspecialidades){
            especialidades.add(e);
        }
        for(Especialidade e : especialidadesNSelecionadas){
            if(removerEspecialidades.contains(e.getNome())){
                especialidadesSelecionadas.remove(e);
            }
        }
        
        listaDasEspecialidades.clear();
        listaDasEspecialidades.addAll(especialidades);
        ListEspecialidades.setModel(listaDasEspecialidades);
        
        List<String> excluir = ListEspecialidadesDoMedico.getSelectedValuesList();
        for(String e : excluir){
            listaDasEspecialidadesDoMedico.removeElement(e);
            selecionadas.remove(e);
        }
        
        
    }//GEN-LAST:event_buttonRetirarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        List<String> especialidadesDoMedico = ListEspecialidades.getSelectedValuesList();
        
        for(String e : especialidadesDoMedico){
            selecionadas.add(e);
        }
        for(Especialidade e : especialidadesNSelecionadas){
            if(especialidadesDoMedico.contains(e.getNome())){
                especialidadesSelecionadas.add(e);
            }
        }
        
        listaDasEspecialidadesDoMedico.clear();
        listaDasEspecialidadesDoMedico.addAll(selecionadas);
        ListEspecialidadesDoMedico.setModel(listaDasEspecialidadesDoMedico);
        
        List<String> excluir = ListEspecialidades.getSelectedValuesList();
        
        for(String e : excluir){
            listaDasEspecialidades.removeElement(e);
            especialidades.remove(e);
        }
        
        
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void formattedTextFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldDataDeNascimentoActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void gravar() {
        // Criar um objeto plano de saúde
        Medico medico = new Medico();
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setCrm(textFieldCrm.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataNascimento(dataCorreta());
        medico.setEspecialidades(especialidadesSelecionadas);

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);
            JOptionPane.showMessageDialog(
                    this,
                    "Medico(a) registrado(a) com sucesso!",
                    "Medico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
    
    private void atualizar(){
        if(validarCadastro()){
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setCrm(textFieldCrm.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataNascimento(dataCorreta());
        medico.setEspecialidades(especialidadesSelecionadas);
        MedicoDAO.atualizar(medico);
        JOptionPane.showMessageDialog(
                    this,
                    "Medico(a) atualizado com sucesso!",
                    "Medico",
                    JOptionPane.INFORMATION_MESSAGE);
        dispose();
        }
    }
    

    private boolean validarCadastro() {
        if (textFieldNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome do(a) medico(a)!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textFieldNomeDoMedico.requestFocus();
            return false;
        }
        if (textFieldCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o CRM!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textFieldCrm.requestFocus();
            return false;
        }
        if (textFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o E-mail!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textFieldEmail.requestFocus();
            return false;
        }
        if (textFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o Telefone!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            textFieldTelefone.requestFocus();
            return false;
        }
        if (formattedTextFieldDataDeNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha a data de nascimeto!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            formattedTextFieldDataDeNascimento.requestFocus();
            return false;
        }
        if (null == dataCorreta()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Data de nascimento invalida!",
                    "Medico",
                    JOptionPane.ERROR_MESSAGE);
            formattedTextFieldDataDeNascimento.requestFocus();
            return false;
        }
        
        return true;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JList<String> ListEspecialidades;
    private javax.swing.JList<String> ListEspecialidadesDoMedico;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRetirar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextFieldDataDeNascimento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeDoMedico;
    private javax.swing.JFormattedTextField textFieldTelefone;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
    private LocalDate dataCorreta(){
        String[] data = formattedTextFieldDataDeNascimento.getText().split("/");
        if(validarData()){
        return LocalDate.of(Integer.parseInt(data[2]), Integer.parseInt(data[1]), Integer.parseInt(data[0]));
        }
         return null;
     
    }
    private boolean validarData(){
    String dateFormat = "dd/MM/uuuu";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat).withResolverStyle(ResolverStyle.STRICT);
        
    try {
        LocalDate date = LocalDate.parse(formattedTextFieldDataDeNascimento.getText(), dateTimeFormatter);
        return true;
    } catch (DateTimeParseException e) {
       return false;
    }
        
    }
    
    public void atualizarListasEspecialidades(){
        especialidades = EspecialidadeDAO.getListaDeNomes();
        listaDasEspecialidades.addAll(especialidades);
        ListEspecialidades.setModel(listaDasEspecialidades);
        if(tipoOperacao == TipoOperacao.ADICIONAR){
            
        }else{
            
            especialidadesSelecionadas = medico.getEspecialidades();
            selecionadas = medico.getListaDeEspecialidadesDoMedico();
            listaDasEspecialidadesDoMedico.clear();
            listaDasEspecialidadesDoMedico.addAll(selecionadas);         
            ListEspecialidadesDoMedico.setModel(listaDasEspecialidadesDoMedico);

        int i = 0;
        for(String e : selecionadas){
            if(especialidades.contains(e)){
                especialidades.remove(e);
            }
        }
        listaDasEspecialidades.clear();
        listaDasEspecialidades.addAll(especialidades);
            
            
        }

    }
        
        
    
}
