package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {

    int linha;

    public PanelMedico() {
        initComponents();
        criarTabelaMedico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMedico = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        setLayout(null);

        tableMedico.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMedico.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        scrollMedico.setViewportView(tableMedico);

        add(scrollMedico);
        scrollMedico.setBounds(10, 30, 870, 290);

        buttonEditar.setBackground(new java.awt.Color(255, 255, 254));
        buttonEditar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit.png"))); // NOI18N
        buttonEditar.setToolTipText("editar plano de saúde selecionado ");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(780, 330, 40, 40);

        buttonAdicionar.setBackground(new java.awt.Color(255, 255, 254));
        buttonAdicionar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        buttonAdicionar.setToolTipText("adicionar plano de saúde");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(830, 330, 40, 40);

        buttonExcluir.setBackground(new java.awt.Color(255, 255, 254));
        buttonExcluir.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete.png"))); // NOI18N
        buttonExcluir.setToolTipText("deletar plano de saúde selecionado");
        buttonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(730, 330, 40, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

        linha = tableMedico.getSelectedRow();
        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione um(a) medico(a) para alterar.",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        }

        criarTabelaMedico();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        DialogMedico dialogMedico = new DialogMedico(null, true, TipoOperacao.ADICIONAR, null);
        dialogMedico.setVisible(true);

        criarTabelaMedico();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        //obtemos o índice da linha selecionada na tabela
        linha = tableMedico.getSelectedRow();

        //verificamos se a linha é diferente de -1
        //-1 significa que o usuario n selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja excluir!",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirActionPerformed
    private void editar() {

        Medico medico = MedicoDAO.getMedico(getCodigo());

        DialogMedico dialogMedico = new DialogMedico(null, true, TipoOperacao.ALTERAR, medico);
        dialogMedico.setVisible(true);
        dialogMedico.atualizarListasEspecialidades();
        criarTabelaMedico();
    }

    private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão do(a) medico(a) selecionado?",
                "Medico",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            criarTabelaMedico();
        }

    }

    private Integer getCodigo() {
        String codigoStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane scrollMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables
    private void criarTabelaMedico() {
        tableMedico.setModel(MedicoDAO.getTableModel());

        // Desativar
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Definir a largura de cada coluna
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(367);
        tableMedico.getColumnModel().getColumn(3).setPreferredWidth(100);
        

        //impedir movimentação da coluna
        tableMedico.getTableHeader().setReorderingAllowed(false);

        //impedir edição das linhas
        tableMedico.setDefaultEditor(Object.class, null);

    }

}
