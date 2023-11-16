package formularios;

import entidades.Aluno;
import entidades.Curso;
import entidades.Professor;
import ficharios.FichaAluno;
import ficharios.FichaCurso;
import ficharios.FichaProf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCurso extends javax.swing.JFrame {

    FichaCurso fichaCurso;
    FichaAluno fichaAluno;
    ArrayList<Aluno> alunos = new ArrayList<>();
    FichaProf fichaProf;
    ArrayList<Professor> profs = new ArrayList<>();
    DefaultTableModel modeloCurso, modeloAluno, modeloProf;

    public FormCurso(FichaCurso fichaCurso, FichaAluno fichaAluno, FichaProf fichaProf) {
        initComponents();
        this.fichaCurso = fichaCurso;
        this.fichaAluno = fichaAluno;
        this.fichaProf = fichaProf;
        String[] titCursos = {"Nome", "Nº de disc. obg.", "Nº de disc. opc."};
        modeloCurso = new DefaultTableModel(titCursos, 0);
        jtCursos.setModel(modeloCurso);
        String[] titAlunos = {"CPF", "Aluno"};
        modeloAluno = new DefaultTableModel(titAlunos, 0);
        jtAlunos.setModel(modeloAluno);
        String[] titProfs = {"CPF", "Professor"};
        modeloProf = new DefaultTableModel(titProfs, 0);
        jtProfs.setModel(modeloProf);
        jbSair.setBackground(Color.red);
        preencheDados();
    }

    private FormCurso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaCursos = new javax.swing.JLabel();
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
        jlaNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jbAddAlunos = new javax.swing.JButton();
        jbAddProfs = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAlunos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProfs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));

        jlaCursos.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaCursos.setText("Cursos");

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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Nº de disc. obg.", "Nº de disc. opc."
            }
        ));
        jScrollPane1.setViewportView(jtCursos);
        if (jtCursos.getColumnModel().getColumnCount() > 0) {
            jtCursos.getColumnModel().getColumn(2).setResizable(false);
        }

        jlaNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNome.setForeground(new java.awt.Color(246, 248, 255));
        jlaNome.setText("Nome: ");

        jbAddAlunos.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbAddAlunos.setText("Adicionar alunos");
        jbAddAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddAlunosActionPerformed(evt);
            }
        });

        jbAddProfs.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbAddProfs.setText("Adicionar profs.");
        jbAddProfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddProfsActionPerformed(evt);
            }
        });

        jtAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CPF", "Aluno"
            }
        ));
        jScrollPane2.setViewportView(jtAlunos);

        jtProfs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CPF", "Professor"
            }
        ));
        jScrollPane3.setViewportView(jtProfs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlaCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270)
                        .addComponent(jbSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlaNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfNome))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlaNumDiscObg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfNumDiscObg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlaNumDiscOpc)
                                    .addComponent(jbCadastrar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfNumDiscOpc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbAddAlunos)
                                        .addGap(80, 80, 80)
                                        .addComponent(jbAddProfs))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSair)
                    .addComponent(jlaCursos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNumDiscObg)
                    .addComponent(jtfNumDiscObg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAddAlunos)
                    .addComponent(jbAddProfs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNumDiscOpc)
                    .addComponent(jtfNumDiscOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCadastrar))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        Curso c = new Curso();

        c.setNome(jtfNome.getText());
        c.setNumDiscObg(Integer.valueOf(jtfNumDiscObg.getText()));
        c.setNumDiscOpc(Integer.valueOf(jtfNumDiscOpc.getText()));

        fichaCurso.cadastrar(c);
        modeloCurso.addRow(new String[]{c.getNome(), String.valueOf(c.getNumDiscObg()), String.valueOf(c.getNumDiscOpc())});
        JOptionPane.showMessageDialog(this, "Curso cadastrado com sucesso!");
        jtfNome.setText(null);
        jtfNumDiscObg.setText(null);
        jtfNumDiscOpc.setText(null);
        jtCursos.setModel(modeloCurso);
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
                modeloCurso.removeRow(jtCursos.getSelectedRow());
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

                c.setNome(jtfNome.getText());
                c.setNumDiscObg(Integer.valueOf(jtfNumDiscObg.getText()));
                c.setNumDiscOpc(Integer.valueOf(jtfNumDiscOpc.getText()));

//                fichaCurso.alterar(c, jtCursos.getSelectedRow());
//                modelo.setValueAt(c.getNome(), jtCursos.getSelectedRow(), 0);
//                modelo.setValueAt(c.getNumDiscObg(), jtCursos.getSelectedRow(), 1);
//                modelo.setValueAt(c.getNumDiscOpc(), jtCursos.getSelectedRow(), 2);
//                modelo.setValueAt(c.getAlunos(), jtCursos.getSelectedRow(), 3);
//                modelo.setValueAt(c.getProfs(), jtCursos.getSelectedRow(), 4);
//                jtCursos.setModel(modelo);
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
                    "Nome: " + c.getNome()
                    + "\nNúmero de disciplinas obrigatórias: " + c.getNumDiscObg()
                    + "\nNúmero de disciplinas opcionais: " + c.getNumDiscOpc()
                    + "\nAlunos: " + c.getAlunos()
                    + "\nProfessores: " + c.getProfs());
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbAddAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAddAlunosActionPerformed

    private void jbAddProfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddProfsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAddProfsActionPerformed

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
    
    public void preencheDados() {
        try {
            jtCursos.removeAll();
            Iterator<Curso> i = fichaCurso.relatorio().iterator();
            while(i.hasNext()) {
                Curso aux = (Curso)i.next();
                modeloCurso.addRow(new String[]{aux.getNome(), String.valueOf(aux.getNumDiscObg()),
                    String.valueOf(aux.getNumDiscOpc())});
            }
            jtCursos.setModel(modeloCurso);
        } catch (Exception e) {
        }
        
        try {
            jtAlunos.removeAll();
            jtProfs.removeAll();
            for(int c = 0; c < alunos.size(); c++) {
                Aluno a = new Aluno();
                modeloAluno.addRow(new String[]{a.getCpf(), a.getNome()});
            }
            for(int c = 0; c < profs.size(); c++) {
                Professor p = new Professor();
                modeloProf.addRow(new String[]{p.getCpf(), p.getNome()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum aluno ou professor cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAddAlunos;
    private javax.swing.JButton jbAddProfs;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlaCursos;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaNumDiscObg;
    private javax.swing.JLabel jlaNumDiscOpc;
    private javax.swing.JTable jtAlunos;
    private javax.swing.JTable jtCursos;
    private javax.swing.JTable jtProfs;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumDiscObg;
    private javax.swing.JTextField jtfNumDiscOpc;
    // End of variables declaration//GEN-END:variables
}
