package formularios;

import entidades.Curso;
import ficharios.FichaCurso;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCurso extends javax.swing.JFrame {

    FichaCurso fichaCurso = new FichaCurso();
    DefaultTableModel modelo;

    public FormCurso() {
        initComponents();
        String[] titulos = {"Nº de disc. obg.", "Nº de disc. opc.", "Alunos", "Professores"};
        modelo = new DefaultTableModel(titulos, 0);
        jtCursos.setModel(modelo);
        jbSair.setBackground(Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();
        jlaNumDiscObg = new javax.swing.JLabel();
        jtfNumDiscObg = new javax.swing.JTextField();
        jlaNumDiscOpc = new javax.swing.JLabel();
        jtfNumDiscOpc = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCursos = new javax.swing.JTable();
        jlaAluno = new javax.swing.JLabel();
        jtfAluno = new javax.swing.JTextField();
        jlaProf = new javax.swing.JLabel();
        jtfProf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setText("Cursos");

        jbSair.setBackground(new java.awt.Color(0, 0, 0));
        jbSair.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jlaNumDiscObg.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlaNumDiscObg.setForeground(new java.awt.Color(246, 248, 255));
        jlaNumDiscObg.setText("Nº de disciplinas obrigatórias: ");

        jlaNumDiscOpc.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jlaNumDiscOpc.setForeground(new java.awt.Color(246, 248, 255));
        jlaNumDiscOpc.setText("Nº de disciplinas opcionais: ");

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

        jtCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nº de disc. obg.", "Nº de disc. opc.", "Alunos", "Professores"
            }
        ));
        jScrollPane1.setViewportView(jtCursos);

        jlaAluno.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaAluno.setForeground(new java.awt.Color(246, 248, 255));
        jlaAluno.setText("Alunos: ");

        jlaProf.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaProf.setForeground(new java.awt.Color(246, 248, 255));
        jlaProf.setText("Professores: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbCadastrar)
                                        .addGap(69, 69, 69)
                                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlaNumDiscOpc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfNumDiscOpc))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlaNumDiscObg)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfNumDiscObg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlaProf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfProf))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlaAluno)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbSair)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNumDiscObg)
                    .addComponent(jtfNumDiscObg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaAluno)
                    .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNumDiscOpc)
                    .addComponent(jtfNumDiscOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaProf)
                    .addComponent(jtfProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
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
        Curso c = new Curso();

        c.setNumDiscObg(Integer.valueOf(jtfNumDiscObg.getText()));
        c.setNumDiscOpc(Integer.valueOf(jtfNumDiscOpc.getText()));
        fichaCurso.procurarAluno();
        fichaCurso.procurarProf();

        fichaCurso.cadastrar(c);
        fichaCurso.salvarCurso(c);
        modelo.addRow(new String[]{String.valueOf(c.getNumDiscObg()),
            String.valueOf(c.getNumDiscOpc()), String.valueOf(c.getAluno()),
            String.valueOf(c.getProfessor())});
        JOptionPane.showMessageDialog(this, "Curso cadastrado com sucesso!");
        jtfNumDiscObg.setText(null);
        jtfNumDiscOpc.setText(null);
        jtCursos.setModel(modelo);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (fichaCurso.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há cursos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                fichaCurso.excluir(jtCursos.getSelectedRow());
                modelo.removeRow(jtCursos.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Curso excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Exclusão não sucedida!");
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        if (fichaCurso.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há cursos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar alteração?",
                    "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Curso c = new Curso();

                c.setNumDiscObg(Integer.valueOf(jtfNumDiscObg.getText()));
                c.setNumDiscOpc(Integer.valueOf(jtfNumDiscOpc.getText()));
                fichaCurso.procurarAluno();
                fichaCurso.procurarProf();

                fichaCurso.alterar(c, jtCursos.getSelectedRow());
                modelo.setValueAt(c.getNumDiscObg(), jtCursos.getSelectedRow(), 0);
                modelo.setValueAt(c.getNumDiscOpc(), jtCursos.getSelectedRow(), 1);
                modelo.setValueAt(c.getAluno(), jtCursos.getSelectedRow(), 2);
                modelo.setValueAt(c.getProfessor(), jtCursos.getSelectedRow(), 3);
                jtCursos.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Curso alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Alteração não sucedida!");
            }
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        if (fichaCurso.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há cursos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            Curso c = fichaCurso.consultar(jtCursos.getSelectedRow());
            JOptionPane.showMessageDialog(this,
                    "Número de disciplinas obrigatórias: " + c.getNumDiscObg()
                    + "\nNúmero de disciplinas opcionais: " + c.getNumDiscOpc()
                    + "\nAlunos: " + c.getAluno()
                    + "\nProfessores: " + c.getProfessor());
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
            java.util.logging.Logger.getLogger(FormCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlaAluno;
    private javax.swing.JLabel jlaNumDiscObg;
    private javax.swing.JLabel jlaNumDiscOpc;
    private javax.swing.JLabel jlaProf;
    private javax.swing.JTable jtCursos;
    private javax.swing.JTextField jtfAluno;
    private javax.swing.JTextField jtfNumDiscObg;
    private javax.swing.JTextField jtfNumDiscOpc;
    private javax.swing.JTextField jtfProf;
    // End of variables declaration//GEN-END:variables
}
