package formularios;

import entidades.Curso;
import entidades.Departamento;
import ficharios.FichaCurso;
import ficharios.FichaDep;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormDep extends javax.swing.JFrame {

    FichaDep fichaDep;
    FichaCurso fichaCurso;
    ArrayList<Curso> cursos, cursosCb;
    DefaultTableModel modeloDep, modeloCurso;

    public FormDep(FichaDep fichaDep, FichaCurso fichaCurso) {
        initComponents();
        this.fichaDep = fichaDep;
        this.fichaCurso = fichaCurso;
        String[] titDeps = {"Código", "Nome"};
        modeloDep = new DefaultTableModel(titDeps, 0);
        jtDep.setModel(modeloDep);
        String[] titCursos = {"Cursos"};
        modeloCurso = new DefaultTableModel(titCursos, 0);
        jtCursos.setModel(modeloCurso);
        cursos = fichaCurso.relatorio();
        cursosCb = fichaCurso.relatorio();
        jbVoltar.setBackground(Color.RED);
        preencheDados();
    }

    private FormDep() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaDep = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jlaCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jlaNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlaCursos = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDep = new javax.swing.JTable();
        jcbCursos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCursos = new javax.swing.JTable();
        jbAddCursos = new javax.swing.JButton();
        jbRemCursos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));

        jlaDep.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaDep.setText("Departamentos");

        jbVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jbVoltar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jlaCodigo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaCodigo.setForeground(new java.awt.Color(246, 248, 255));
        jlaCodigo.setText("Código: ");

        jlaNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNome.setForeground(new java.awt.Color(246, 248, 255));
        jlaNome.setText("Nome: ");

        jlaCursos.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaCursos.setForeground(new java.awt.Color(246, 248, 255));
        jlaCursos.setText("Selecionar curso:");

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

        jtDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jtDep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDepMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDep);

        jtCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cursos"
            }
        ));
        jScrollPane2.setViewportView(jtCursos);

        jbAddCursos.setFont(new java.awt.Font("Yu Gothic Medium", 1, 22)); // NOI18N
        jbAddCursos.setText("↓");
        jbAddCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddCursosActionPerformed(evt);
            }
        });

        jbRemCursos.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jbRemCursos.setText("↑");
        jbRemCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemCursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaDep, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jbVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlaCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jlaNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlaCursos)
                                    .addComponent(jcbCursos, 0, 258, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jbAddCursos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(jbRemCursos)
                                .addGap(38, 38, 38)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbVoltar)
                    .addComponent(jlaDep))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaCodigo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaCursos))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAddCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbRemCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCadastrar)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        Departamento d = new Departamento();

        d.setCodigo(Integer.valueOf(jtfCodigo.getText()));
        d.setNome(jtfNome.getText());

        fichaDep.cadastrar(d);
        modeloDep.addRow(new String[]{String.valueOf(d.getCodigo()), d.getNome()});
        JOptionPane.showMessageDialog(this, "Departamento cadastrado com sucesso!");
        limparDados();
        jtDep.setModel(modeloDep);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (fichaDep.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há departamentos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Departamento d = fichaDep.consultar(jtDep.getSelectedRow());
                Iterator<Curso> ic = d.getCursos().iterator();
                while(ic.hasNext()) {
                    Curso aux = (Curso)ic.next();
                    jcbCursos.addItem(aux);
                }
                modeloCurso.setRowCount(0);
                fichaDep.excluir(jtDep.getSelectedRow());
                modeloDep.removeRow(jtDep.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Departamento excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Exclusão não sucedida!");
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        if (fichaDep.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há departamentos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar alteração?",
                    "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Departamento d = new Departamento();

                d.setCodigo(Integer.valueOf(jtfCodigo.getText()));
                d.setNome(jtfNome.getText());

                fichaDep.alterar(d, jtDep.getSelectedRow());
                modeloDep.setValueAt(d.getCodigo(), jtDep.getSelectedRow(), 0);
                modeloDep.setValueAt(d.getNome(), jtDep.getSelectedRow(), 1);
                jtDep.setModel(modeloDep);
                JOptionPane.showMessageDialog(this, "Departamento alterado com sucesso!");
                limparDados();
            } else {
                JOptionPane.showMessageDialog(this, "Alteração não sucedida!");
            }
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        if (fichaDep.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há departamentos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            Departamento d = fichaDep.consultar(jtDep.getSelectedRow());
            JOptionPane.showMessageDialog(this,
                    "Código: " + d.getCodigo()
                    + "\nNome: " + d.getNome()
                    + "\nCursos: " + d.getCursos());
            jtCursos.removeAll();
            limparDados();
            atualizaTabelas();
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbAddCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddCursosActionPerformed
        if(jtDep.getSelectedRow() != 1) {
            Curso c = fichaCurso.consultar(jcbCursos.getSelectedIndex());
            modeloCurso.addRow(new String[]{c.getNome(), String.valueOf(c.getNumDiscObg()), String.valueOf(c.getNumDiscOpc())});
            JOptionPane.showMessageDialog(this, "Curso selecionado com sucesso!");
            fichaDep.consultar(jtDep.getSelectedRow()).setCurso(c);
            jcbCursos.removeItemAt(jcbCursos.getSelectedIndex());
            cursosCb.remove(c);
            fichaCurso.cadastrar(c);
            jtCursos.setModel(modeloCurso);
        }
    }//GEN-LAST:event_jbAddCursosActionPerformed

    private void jbRemCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemCursosActionPerformed
        if(jtDep.getSelectedRow() != 1) {
            Curso c = fichaCurso.consultar(jcbCursos.getSelectedIndex());
            modeloCurso.removeRow(jtCursos.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Curso removido com sucesso!");
            fichaDep.consultar(jtCursos.getSelectedRow()).removeCurso(c);
            jcbCursos.addItem(c);
            cursosCb.add(c);
        }
    }//GEN-LAST:event_jbRemCursosActionPerformed

    private void jtDepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDepMouseClicked
        try {
            jtfCodigo.setText(jtDep.getModel().getValueAt(jtDep.getSelectedRow(), 0).toString());
            jtfNome.setText(jtDep.getModel().getValueAt(jtDep.getSelectedRow(), 1).toString());
            
            atualizaTabelas();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtDepMouseClicked

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
            java.util.logging.Logger.getLogger(FormDep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDep().setVisible(true);
            }
        });
    }
    
    public void preencheDados() {
        try {
            modeloDep.setRowCount(0);
            Iterator<Departamento> i = fichaDep.relatorio().iterator();
            while(i.hasNext()) {
                Departamento aux = (Departamento)i.next();
                modeloDep.addRow(new String[]{String.valueOf(aux.getCodigo()), aux.getNome()});
            }
            jtDep.setModel(modeloDep);
            jcbCursos.removeAll();
            for (Curso c : cursos)
                jcbCursos.addItem(c);
        } catch (Exception e) {
        }
    }
    
    public void atualizaTabelas() {
        try {
            modeloCurso.setRowCount(0);
            Iterator<Curso> ic = fichaDep.consultar(jtDep.getSelectedRow()).getCursos().iterator();
            while(ic.hasNext()) {
                Curso aux = (Curso)ic.next();
                modeloDep.addRow(new String[]{aux.getNome()});
            }
            modeloDep.fireTableDataChanged();
            jtDep.setModel(modeloDep);
        } catch (Exception e) {
        }
    }
    
    public void limparDados() {
        jtfCodigo.setText(null);
        jtfNome.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAddCursos;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbRemCursos;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<Curso> jcbCursos;
    private javax.swing.JLabel jlaCodigo;
    private javax.swing.JLabel jlaCursos;
    private javax.swing.JLabel jlaDep;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JTable jtCursos;
    private javax.swing.JTable jtDep;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
