package formularios;

import entidades.Ppc;
import ficharios.FichaPpc;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPpc extends javax.swing.JFrame {

    FichaPpc fichaPpc = new FichaPpc();
    DefaultTableModel modelo;

    public FormPpc() {
        initComponents();
        String[] titulos = {"Curso", "Matérias", "Ano de início"};
        modelo = new DefaultTableModel(titulos, 0);
        jtPpcs.setModel(modelo);
        jbSair.setBackground(Color.RED);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaPpc = new javax.swing.JLabel();
        jlaCurso = new javax.swing.JLabel();
        jtfCurso = new javax.swing.JTextField();
        jlaMats = new javax.swing.JLabel();
        jtfMats = new javax.swing.JTextField();
        jlaAnoInicio = new javax.swing.JLabel();
        jtfAnoInicio = new javax.swing.JTextField();
        jbSair = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPpcs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));

        jlaPpc.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaPpc.setText("PPC");

        jlaCurso.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaCurso.setForeground(new java.awt.Color(246, 248, 255));
        jlaCurso.setText("Curso: ");

        jlaMats.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaMats.setForeground(new java.awt.Color(246, 248, 255));
        jlaMats.setText("Matérias: ");

        jlaAnoInicio.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaAnoInicio.setForeground(new java.awt.Color(246, 248, 255));
        jlaAnoInicio.setText("Ano de início: ");

        jbSair.setBackground(new java.awt.Color(0, 0, 0));
        jbSair.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

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

        jtPpcs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Curso", "Matérias", "Ano de início"
            }
        ));
        jScrollPane1.setViewportView(jtPpcs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlaPpc)
                        .addGap(259, 259, 259)
                        .addComponent(jbSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jlaMats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfMats, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlaAnoInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAnoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCadastrar)
                        .addGap(89, 89, 89)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaPpc)
                    .addComponent(jbSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaCurso)
                    .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaMats)
                    .addComponent(jtfMats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaAnoInicio)
                    .addComponent(jtfAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Tem certeza de que queira sair?",
                "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res == JOptionPane.YES_OPTION) {
            setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Ppc p = new Ppc();

//        fichaPpc.procurarCurso();
//        fichaPpc.procurarMat();
        p.setAnoInicio(Integer.valueOf(jtfAnoInicio.getText()));

        fichaPpc.cadastrar(p);
        modelo.addRow(new String[]{String.valueOf(p.getCurso()),
            String.valueOf(p.getMaterias()), String.valueOf(p.getAnoInicio())});
        JOptionPane.showMessageDialog(this, "PPC cadastrado com sucesso!");
        jtfCurso.setText(null);
        jtfMats.setText(null);
        jtfAnoInicio.setText(null);
        jtPpcs.setModel(modelo);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (fichaPpc.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há PPCs cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                fichaPpc.excluir(jtPpcs.getSelectedRow());
                modelo.removeRow(jtPpcs.getSelectedRow());
                JOptionPane.showMessageDialog(this, "PPC excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Exclusão não sucedida!");
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        if (fichaPpc.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há PPCs cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar alteração?",
                    "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Ppc p = new Ppc();

//                fichaPpc.procurarCurso();
//                fichaPpc.procurarMat();
                p.setAnoInicio(Integer.valueOf(jtfAnoInicio.getText()));

                fichaPpc.alterar(p, jtPpcs.getSelectedRow());
                modelo.setValueAt(p.getCurso(), jtPpcs.getSelectedRow(), 0);
                modelo.setValueAt(p.getMaterias(), jtPpcs.getSelectedRow(), 1);
                modelo.setValueAt(p.getAnoInicio(), jtPpcs.getSelectedRow(), 2);
                jtPpcs.setModel(modelo);
                JOptionPane.showMessageDialog(this, "PPC alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Alteração não sucedida!");
            }
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        if (fichaPpc.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há PPCs cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            Ppc p = fichaPpc.consultar(jtPpcs.getSelectedRow());
            JOptionPane.showMessageDialog(this,
                    "Curso: " + p.getCurso() + 
                    "\nMatérias: " + p.getMaterias() + 
                    "\nAno de início: " + p.getAnoInicio());
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(FormPpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPpc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlaAnoInicio;
    private javax.swing.JLabel jlaCurso;
    private javax.swing.JLabel jlaMats;
    private javax.swing.JLabel jlaPpc;
    private javax.swing.JTable jtPpcs;
    private javax.swing.JTextField jtfAnoInicio;
    private javax.swing.JTextField jtfCurso;
    private javax.swing.JTextField jtfMats;
    // End of variables declaration//GEN-END:variables
}
