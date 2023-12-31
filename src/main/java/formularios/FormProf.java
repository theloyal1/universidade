package formularios;

import entidades.Professor;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormProf extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public FormProf() {
        initComponents();
        String[] titulos = {"CPF", "Nome", "Email", "Endereço", "Telefone", "Espec."};
        modelo = new DefaultTableModel(titulos, 0);
        jtProfs.setModel(modelo);
        jbVoltar.setBackground(Color.red);
//        preencheDados();
    }

//    private FormProf() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaProfs = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jlaCpf = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlaEndereco = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jlaEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlaTelefone = new javax.swing.JLabel();
        jlaEspec = new javax.swing.JLabel();
        jtfEspec = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProfs = new javax.swing.JTable();
        jtfCpf = new javax.swing.JFormattedTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Professores");

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));
        jPanel1.setForeground(new java.awt.Color(111, 156, 235));

        jlaProfs.setBackground(new java.awt.Color(20, 27, 65));
        jlaProfs.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaProfs.setForeground(new java.awt.Color(20, 27, 65));
        jlaProfs.setText("Professores");

        jbVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jbVoltar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jlaCpf.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaCpf.setForeground(new java.awt.Color(246, 248, 255));
        jlaCpf.setText("CPF: ");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(246, 248, 255));
        jLabel1.setText("Nome: ");

        jlaEndereco.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaEndereco.setForeground(new java.awt.Color(246, 248, 255));
        jlaEndereco.setText("Endereço: ");

        jlaEmail.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaEmail.setForeground(new java.awt.Color(246, 248, 255));
        jlaEmail.setText("Email: ");

        jlaTelefone.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaTelefone.setForeground(new java.awt.Color(246, 248, 255));
        jlaTelefone.setText("Telefone: ");

        jlaEspec.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaEspec.setForeground(new java.awt.Color(246, 248, 255));
        jlaEspec.setText("Especialização: ");

        jbCadastrar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setMaximumSize(new java.awt.Dimension(123, 39));
        jbExcluir.setMinimumSize(new java.awt.Dimension(123, 39));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setMaximumSize(new java.awt.Dimension(123, 39));
        jbAlterar.setMinimumSize(new java.awt.Dimension(123, 39));
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbConsultar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.setMaximumSize(new java.awt.Dimension(123, 39));
        jbConsultar.setMinimumSize(new java.awt.Dimension(123, 39));
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jtProfs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Email", "Endereço", "Telefone", "Espec."
            }
        ));
        jtProfs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProfsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProfs);

        try {
            jtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlaProfs)
                .addGap(134, 134, 134)
                .addComponent(jbVoltar)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlaTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfTelefone))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlaEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlaCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfCpf)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlaEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlaEspec)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfEspec)))))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbVoltar)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlaProfs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlaCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlaEspec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Tem certeza de que queira voltar para o menu principal?",
                "Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res == JOptionPane.YES_OPTION) {
            setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
//        Professor p = new Professor();
//
//        p.setCpf(jtfCpf.getText());;
//        p.setNome(jtfNome.getText());
//        p.setEmail(jtfEmail.getText());
//        p.setEndereco(jtfEndereco.getText());
//        p.setTelefone(jtfTelefone.getText());
//        p.setEspecializacao(jtfEspec.getText());
//
//        fichaProf.cadastrar(p);
//        modelo.addRow(new String[]{String.valueOf(p.getCpf()), p.getNome(), p.getEmail(), p.getEndereco(),
//            p.getTelefone(), p.getEspecializacao()});
//        JOptionPane.showMessageDialog(this, "Professor cadastrado com sucesso!");
//        limparDados();
//        jtProfs.setModel(modelo);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
//        if (fichaProf.isEmpty())
//            JOptionPane.showMessageDialog(this, "Não há professores cadastrados!", "Erro",
//                    JOptionPane.ERROR_MESSAGE);
//        else {
//            int res = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?",
//                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            if (res == JOptionPane.YES_OPTION) {
//                Professor p = fichaProf.consultar(jtProfs.getSelectedRow());
//                fichaProf.excluir(p, jtProfs.getSelectedRow());
//                modelo.removeRow(jtProfs.getSelectedRow());
//                JOptionPane.showMessageDialog(this, "Professor excluído com sucesso!");
//                limparDados();
//            } else {
//                JOptionPane.showMessageDialog(this, "Exclusão não sucedida!");
//            }
//        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
//        if (fichaProf.isEmpty())
//            JOptionPane.showMessageDialog(this, "Não há professores cadastrados!", "Erro",
//                    JOptionPane.ERROR_MESSAGE);
//        else {
//            int res = JOptionPane.showConfirmDialog(this, "Confirmar alteração?",
//                    "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            if (res == JOptionPane.YES_OPTION) {
//                Professor p = new Professor();
//
//                p.setCpf(jtfCpf.getText());
//                p.setNome(jtfNome.getText());
//                p.setEmail(jtfEmail.getText());
//                p.setEndereco(jtfEndereco.getText());
//                p.setTelefone(jtfTelefone.getText());
//                p.setEspecializacao(jtfEspec.getText());
//                
//                fichaProf.alterar(p, jtProfs.getSelectedRow());
//                modelo.setValueAt(p.getCpf(), jtProfs.getSelectedRow(), 0);
//                modelo.setValueAt(p.getNome(), jtProfs.getSelectedRow(), 1);
//                modelo.setValueAt(p.getEmail(), jtProfs.getSelectedRow(), 2);
//                modelo.setValueAt(p.getEndereco(), jtProfs.getSelectedRow(), 3);
//                modelo.setValueAt(p.getTelefone(), jtProfs.getSelectedRow(), 4);
//                modelo.setValueAt(p.getEspecializacao(), jtProfs.getSelectedRow(), 5);
//                jtProfs.setModel(modelo);
//                JOptionPane.showMessageDialog(this, "Professor alterado com sucesso!");
//                limparDados();
//                
//            } else {
//                JOptionPane.showMessageDialog(this, "Alteração não sucedida!");
//            }
//        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
//        if (fichaProf.isEmpty())
//            JOptionPane.showMessageDialog(this, "Não há professores cadastrados!", "Erro",
//                    JOptionPane.ERROR_MESSAGE);
//        else {
//            Professor p = fichaProf.consultar(jtProfs.getSelectedRow());
//            JOptionPane.showMessageDialog(this, "CPF: " + p.getCpf()
//                    + "\nNome: " + p.getNome()
//                    + "\nEmail: " + p.getEmail()
//                    + "\nEndereço: " + p.getEndereco()
//                    + "\nTelefone: " + p.getTelefone()
//                    + "\nEspecialização: " + p.getEspecializacao());
//        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jtProfsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProfsMouseClicked
        try {
            jtfCpf.setText(jtProfs.getModel().getValueAt(jtProfs.getSelectedRow(), 0).toString());
            jtfNome.setText(jtProfs.getModel().getValueAt(jtProfs.getSelectedRow(), 1).toString());
            jtfEmail.setText(jtProfs.getModel().getValueAt(jtProfs.getSelectedRow(), 2).toString());
            jtfEndereco.setText(jtProfs.getModel().getValueAt(jtProfs.getSelectedRow(), 3).toString());
            jtfTelefone.setText(jtProfs.getModel().getValueAt(jtProfs.getSelectedRow(), 4).toString());
            jtfEspec.setText(jtProfs.getModel().getValueAt(jtProfs.getSelectedRow(), 5).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtProfsMouseClicked

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
            java.util.logging.Logger.getLogger(FormProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProf().setVisible(true);
            }
        });
    }
    
//    public void preencheDados() {
//        try {
//            jtProfs.removeAll();
//            Iterator<Professor> i = fichaProf.relatorio().iterator();
//            while(i.hasNext()) {
//                Professor aux = (Professor)i.next();
//                modelo.addRow(new String[]{String.valueOf(aux.getCpf()), 
//                    aux.getNome(), aux.getEmail(), aux.getEndereco(), 
//                    aux.getTelefone(), aux.getEspecializacao()});
//            }
//            jtProfs.setModel(modelo);
//        } catch (Exception e) {
//        }
//    }
//    
//    public void limparDados() {
//        jtfCpf.setText(null);
//        jtfNome.setText(null);
//        jtfEmail.setText(null);
//        jtfEndereco.setText(null);
//        jtfTelefone.setText(null);
//        jtfEspec.setText(null);
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlaCpf;
    private javax.swing.JLabel jlaEmail;
    private javax.swing.JLabel jlaEndereco;
    private javax.swing.JLabel jlaEspec;
    private javax.swing.JLabel jlaProfs;
    private javax.swing.JLabel jlaTelefone;
    private javax.swing.JTable jtProfs;
    private javax.swing.JFormattedTextField jtfCpf;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfEspec;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JFormattedTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
