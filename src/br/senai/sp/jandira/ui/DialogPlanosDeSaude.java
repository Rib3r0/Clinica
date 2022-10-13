/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282115
 */
public class DialogPlanosDeSaude extends javax.swing.JDialog {

    /**
     * Creates new form DialogPlanosDeSaude
     */
    public DialogPlanosDeSaude(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textFieldTipoDoPlano = new javax.swing.JTextField();
        textFieldNomeDaOperadora = new javax.swing.JTextField();
        textFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 30, 40);

        tituloLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 153, 255));
        tituloLabel.setText("Planos de Saude - ADICIONAR");
        jPanel1.add(tituloLabel);
        tituloLabel.setBounds(60, 25, 660, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano de Saúde:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel2.setLayout(null);

        textFieldTipoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTipoDoPlanoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldTipoDoPlano);
        textFieldTipoDoPlano.setBounds(40, 190, 280, 30);
        jPanel2.add(textFieldNomeDaOperadora);
        textFieldNomeDaOperadora.setBounds(40, 130, 280, 30);

        textFieldCodigo.setEditable(false);
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 70, 80, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Tipo do Plano:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 170, 90, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Nome da Operadora:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 110, 130, 20);

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

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 110, 750, 360);

        setBounds(0, 0, 805, 528);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldTipoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTipoDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTipoDoPlanoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

        dispose();

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // Criar um objeto plano de saúde
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textFieldNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textFieldTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            JOptionPane.showMessageDialog(
                    this,
                    "Plano de saúde gravado com sucesso!",
                    "Plano de Saúde",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private boolean validarCadastro() {
        if (textFieldNomeDaOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome da operadora!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
            textFieldNomeDaOperadora.requestFocus();
            return false;
        }
        if (textFieldTipoDoPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o tipo do plano!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);
            textFieldTipoDoPlano.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogPlanosDeSaude dialog = new DialogPlanosDeSaude(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNomeDaOperadora;
    private javax.swing.JTextField textFieldTipoDoPlano;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
