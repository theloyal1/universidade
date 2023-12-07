package formularios;

import entidades.Curso;
import entidades.Materia;
import entidades.Ppc;
import ficharios.FichaCurso;
import ficharios.FichaMat;
import ficharios.FichaPpc;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPpc extends javax.swing.JFrame {

    FichaPpc fichaPpc;
    FichaCurso fichaCurso;
    FichaMat fichaMat;
    ArrayList<Curso> cursos, cursosCb;
    DefaultTableModel modeloPpc, modeloMat;

    public FormPpc(FichaPpc fichaPpc, FichaCurso fichaCurso, FichaMat fichaMat) {
        initComponents();
        this.fichaPpc = fichaPpc;
        this.fichaCurso = fichaCurso;
        this.fichaMat = fichaMat;
        String[] titulos = {"Curso", "Ano de início"};
        modeloPpc = new DefaultTableModel(titulos, 0);
        jtPpcs.setModel(modeloPpc);
        String[] titMat = {"Matérias"};
        modeloMat = new DefaultTableModel(titMat, 0);
        jtMaterias.setModel(modeloMat);
        jbVoltar.setBackground(Color.RED);
        preencheDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaPpc = new javax.swing.JLabel();
        jlaCurso = new javax.swing.JLabel();
        jlaMats = new javax.swing.JLabel();
        jlaAnoInicio = new javax.swing.JLabel();
        jtfAnoInicio = new javax.swing.JTextField();
        jbVoltar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPpcs = new javax.swing.JTable();
        jcbCurso = new javax.swing.JComboBox<>();
        jcbMats = new javax.swing.JComboBox<>();
        jbAddMats = new javax.swing.JButton();
        jbRemMats = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));

        jlaPpc.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaPpc.setText("PPC");

        jlaCurso.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaCurso.setForeground(new java.awt.Color(246, 248, 255));
        jlaCurso.setText("Curso: ");

        jlaMats.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaMats.setForeground(new java.awt.Color(246, 248, 255));
        jlaMats.setText("Seleção de matérias: ");

        jlaAnoInicio.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaAnoInicio.setForeground(new java.awt.Color(246, 248, 255));
        jlaAnoInicio.setText("Ano de início: ");

        jbVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jbVoltar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
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
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Curso", "Ano de início"
            }
        ));
        jScrollPane1.setViewportView(jtPpcs);

        jbAddMats.setFont(new java.awt.Font("Yu Gothic Medium", 1, 22)); // NOI18N
        jbAddMats.setText("↓");
        jbAddMats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddMatsActionPerformed(evt);
            }
        });

        jbRemMats.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jbRemMats.setText("↑");
        jbRemMats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemMatsActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Matérias"
            }
        ));
        jScrollPane2.setViewportView(jtMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlaPpc)
                        .addGap(237, 237, 237)
                        .addComponent(jbVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jlaAnoInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAnoInicio))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlaMats)
                                .addComponent(jcbMats, javax.swing.GroupLayout.Alignment.TRAILING, 0, 263, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbAddMats)
                                    .addGap(72, 72, 72)
                                    .addComponent(jbRemMats)
                                    .addGap(44, 44, 44))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaPpc)
                    .addComponent(jbVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaCurso)
                    .addComponent(jlaAnoInicio)
                    .addComponent(jtfAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaMats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbMats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAddMats, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbRemMats, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Tem certeza de que queira voltar para o menu principal?",
                "Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res == JOptionPane.YES_OPTION) {
            setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Ppc p = new Ppc();
        Curso c = fichaCurso.consultar(jcbCurso.getSelectedIndex());
        
        p.setCurso(c);
        p.setAnoInicio(Integer.valueOf(jtfAnoInicio.getText()));

        fichaPpc.cadastrar(p);
        modeloMat.addRow(new String[]{String.valueOf(p.getCurso()), String.valueOf(p.getAnoInicio())});
        JOptionPane.showMessageDialog(this, "PPC cadastrado com sucesso!");
        jcbCurso.removeItem(c);
        jtfAnoInicio.setText(null);
        jtPpcs.setModel(modeloPpc);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (fichaPpc.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há PPCs cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Ppc p = fichaPpc.consultar(jtPpcs.getSelectedRow());
                Iterator<Materia> im = p.getMaterias().iterator();
                while(im.hasNext()) {
                    Materia aux = (Materia)im.next();
                    jcbMats.addItem(aux);
                }
                fichaPpc.excluir(jtPpcs.getSelectedRow());
                modeloPpc.removeRow(jtPpcs.getSelectedRow());
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
                Curso c = fichaCurso.consultar(jcbCurso.getSelectedIndex());
        
                p.setCurso(c);
                p.setAnoInicio(Integer.valueOf(jtfAnoInicio.getText()));

                fichaPpc.alterar(p, jtPpcs.getSelectedRow());
                modeloPpc.setValueAt(p.getCurso(), jtPpcs.getSelectedRow(), 0);
                modeloPpc.setValueAt(p.getAnoInicio(), jtPpcs.getSelectedRow(), 1);
                jtPpcs.setModel(modeloPpc);
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

    private void jbAddMatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddMatsActionPerformed
        if(jtPpcs.getSelectedRow() != -1) {
            Materia m = fichaMat.consultar(jcbMats.getSelectedIndex());
            modeloProf.addRow(new String[]{p.getCpf(), p.getNome()});
            JOptionPane.showMessageDialog(this, "Professor selecionado com sucesso!");
            fichaMat.consultar(jtMats.getSelectedRow()).setProf(p);
            jcbProfs.removeItemAt(jcbProfs.getSelectedIndex());
            profsCb.remove(p);
            fichaProf.cadastrar(p);
            jtProfs.setModel(modeloProf);
        }
    }//GEN-LAST:event_jbAddMatsActionPerformed

    private void jbRemMatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemMatsActionPerformed
        if(jtPpcs.getSelectedRow() != -1) {
            Professor p = fichaProf.consultar(jtProfs.getSelectedRow());
            modeloProf.removeRow(jtProfs.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Professor removido com sucesso!");
            fichaMat.consultar(jtMats.getSelectedRow()).removeProf(p);
            jcbProfs.addItem(p);
            profsCb.add(p);
        }
    }//GEN-LAST:event_jbRemMatsActionPerformed

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
    
    public void preencheDados() {
        try {
            jtPpcs.removeAll();
            Iterator<Ppc> i = fichaPpc.relatorio().iterator();
            while(i.hasNext()) {
                Ppc aux = (Ppc)i.next();
                modelo.addRow(new String[]{String.valueOf(aux.getCurso()), 
                    String.valueOf(aux.getMaterias()), 
                    String.valueOf(aux.getAnoInicio())});
            }
            jtPpcs.setModel(modelo);
        } catch (Exception e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAddMats;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbRemMats;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbMats;
    private javax.swing.JLabel jlaAnoInicio;
    private javax.swing.JLabel jlaCurso;
    private javax.swing.JLabel jlaMats;
    private javax.swing.JLabel jlaPpc;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JTable jtPpcs;
    private javax.swing.JTextField jtfAnoInicio;
    // End of variables declaration//GEN-END:variables
}
