package formularios;

import entidades.Disciplina;
import ficharios.FichaDisc;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormDisc extends javax.swing.JFrame {

    FichaDisc fichaDisc = new FichaDisc();
    DefaultTableModel modelo;

    public FormDisc() {
        initComponents();
        String titulos[] = {"Nome", "Aluno", "Prof.", "Mat.", "Nota", "Ano", "Sem.", "Freq.", "Aprov."};
        modelo = new DefaultTableModel(titulos, 0);
        jtDisc.setModel(modelo);
        jbVoltar.setBackground(Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpAprov = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlaDisc = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jlaAluno = new javax.swing.JLabel();
        jtfAluno = new javax.swing.JTextField();
        jlaProf = new javax.swing.JLabel();
        jtfProf = new javax.swing.JTextField();
        jlaMat = new javax.swing.JLabel();
        jtfMat = new javax.swing.JTextField();
        jlaNota = new javax.swing.JLabel();
        jtfNota = new javax.swing.JTextField();
        jlaAno = new javax.swing.JLabel();
        jtfAno = new javax.swing.JTextField();
        jlaSemestre = new javax.swing.JLabel();
        jtfSemestre = new javax.swing.JTextField();
        jlaFrequencia = new javax.swing.JLabel();
        jtfFrequencia = new javax.swing.JTextField();
        jlaAprov = new javax.swing.JLabel();
        jrbSim = new javax.swing.JRadioButton();
        jrbNao = new javax.swing.JRadioButton();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDisc = new javax.swing.JTable();
        jlaNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));

        jlaDisc.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaDisc.setText("Disciplinas");

        jbVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jbVoltar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jlaAluno.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaAluno.setForeground(new java.awt.Color(246, 248, 255));
        jlaAluno.setText("Aluno: ");

        jlaProf.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaProf.setForeground(new java.awt.Color(246, 248, 255));
        jlaProf.setText("Professor: ");

        jlaMat.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaMat.setForeground(new java.awt.Color(246, 248, 255));
        jlaMat.setText("Matéria: ");

        jlaNota.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNota.setForeground(new java.awt.Color(246, 248, 255));
        jlaNota.setText("Nota: ");

        jlaAno.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaAno.setForeground(new java.awt.Color(246, 248, 255));
        jlaAno.setText("Ano: ");

        jlaSemestre.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaSemestre.setForeground(new java.awt.Color(246, 248, 255));
        jlaSemestre.setText("Semestre: ");

        jlaFrequencia.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaFrequencia.setForeground(new java.awt.Color(246, 248, 255));
        jlaFrequencia.setText("Frequência: ");

        jlaAprov.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaAprov.setForeground(new java.awt.Color(246, 248, 255));
        jlaAprov.setText("Aprovação: ");

        btnGrpAprov.add(jrbSim);
        jrbSim.setText("Sim");

        btnGrpAprov.add(jrbNao);
        jrbNao.setText("Não");

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

        jtDisc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Aluno", "Prof.", "Mat.", "Nota", "Ano", "Sem.", "Freq.", "Aprov."
            }
        ));
        jScrollPane2.setViewportView(jtDisc);

        jlaNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNome.setForeground(new java.awt.Color(246, 248, 255));
        jlaNome.setText("Nome: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbCadastrar)
                            .addGap(111, 111, 111)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(98, 98, 98)
                            .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlaFrequencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlaMat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfMat, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlaDisc)
                            .addGap(237, 237, 237)
                            .addComponent(jbVoltar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlaAluno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jlaProf))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlaNota)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfNota, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jlaAno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfProf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jlaSemestre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jlaNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jlaAprov)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbSim)))
                        .addGap(18, 18, 18)
                        .addComponent(jrbNao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbVoltar)
                    .addComponent(jlaDisc))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaAluno)
                    .addComponent(jtfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaProf)
                    .addComponent(jlaMat)
                    .addComponent(jtfMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNota)
                    .addComponent(jtfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaAno)
                    .addComponent(jtfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaSemestre)
                    .addComponent(jtfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaFrequencia)
                    .addComponent(jtfFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaAprov)
                    .addComponent(jrbSim)
                    .addComponent(jrbNao)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbCadastrar)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Disciplina d = new Disciplina();
        
        d.setNome(jtfNome.getText());
//        fichaDisc.procurarAluno();
//        fichaDisc.procurarProf();
//        fichaDisc.procurarMat();
        d.setNota(Float.valueOf(jtfNota.getText()));
        d.setAno(Integer.valueOf(jtfAno.getText()));
        d.setSemestre(Integer.valueOf(jtfSemestre.getText()));
        d.setFrequencia(Float.valueOf(jtfFrequencia.getText()));
        if (jrbSim.isSelected()) {
            d.setAprovacao(true);
        } else {
            d.setAprovacao(false);
        }

        fichaDisc.cadastrar(d);
        modelo.addRow(new String[]{d.getNome(), String.valueOf(d.getAluno()), 
            String.valueOf(d.getProfessor()), String.valueOf(d.getMateria()), 
            String.valueOf(d.getNota()), String.valueOf(d.getAno()),
            String.valueOf(d.getSemestre()), String.valueOf(d.getFrequencia()),
            String.valueOf(d.isAprovacao())});
        JOptionPane.showMessageDialog(this, "Disciplina cadastrada com sucesso!");
        jtfAluno.setText(null);
        jtfProf.setText(null);
        jtfMat.setText(null);
        jtfNota.setText(null);
        jtfAno.setText(null);
        jtfSemestre.setText(null);
        jtfFrequencia.setText(null);
        btnGrpAprov.clearSelection();
        jtDisc.setModel(modelo);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (fichaDisc.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há disciplinas cadastradas!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                fichaDisc.excluir(jtDisc.getSelectedRow());
                modelo.removeRow(jtDisc.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Disciplina excluída com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Exclusão não sucedida!");
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        if (fichaDisc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há disciplinas cadastradas!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar alteração?",
                    "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Disciplina d = new Disciplina();
                
                d.setNome(jtfNome.getText());
//                fichaDisc.procurarAluno();
//                fichaDisc.procurarProf();
//                fichaDisc.procurarMat();
//                d.setNota(Float.valueOf(jtfNota.getText()));
//                d.setAno(Integer.valueOf(jtfAno.getText()));
//                d.setSemestre(Integer.valueOf(jtfSemestre.getText()));
//                d.setFrequencia(Float.valueOf(jtfFrequencia.getText()));
//                if (jrbSim.isSelected())
//                    d.setAprovacao(true);
//                else
//                    d.setAprovacao(false);
//
//                    fichaDisc.alterar(d, jtDisc.getSelectedRow());
//                    modelo.setValueAt(d.getAluno(), jtDisc.getSelectedRow(), 0);
//                    modelo.setValueAt(d.getProfessor(), jtDisc.getSelectedRow(), 1);
//                    modelo.setValueAt(d.getMateria(), jtDisc.getSelectedRow(), 2);
//                    modelo.setValueAt(d.getNota(), jtDisc.getSelectedRow(), 3);
//                    modelo.setValueAt(d.getAno(), jtDisc.getSelectedRow(), 4);
//                    modelo.setValueAt(d.getSemestre(), jtDisc.getSelectedRow(), 5);
//                    modelo.setValueAt(d.getFrequencia(), jtDisc.getSelectedRow(), 6);
//                    modelo.setValueAt(d.isAprovacao(), jtDisc.getSelectedRow(), 7);
//                    jtDisc.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Disciplina alterada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Alteração não sucedida!");
            }
        }

    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        if(fichaDisc.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há disciplinas cadastradas!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            Disciplina d = fichaDisc.consultar(jtDisc.getSelectedRow());
            JOptionPane.showMessageDialog(this, 
                    "Nome: " + d.getNome()
                    + "\nAluno: " + d.getAluno()
                    + "\nProfessor: " + d.getProfessor()
                    + "\nMatéria: " + d.getMateria()
                    + "\nNota: " + d.getNota()
                    + "\nAno: " + d.getAno()
                    + "\nSemestre: " + d.getSemestre()
                    + "\nFrequência: " + d.getFrequencia()
                    + "\nAprovação: " + d.isAprovacao());
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
            java.util.logging.Logger.getLogger(FormDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDisc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDisc().setVisible(true);
            }
        });
    }
    
    public void relatorio() {
        try {
            jtDisc.removeAll();
            Iterator<Disciplina> i = fichaDisc.relatorio().iterator();
            while(i.hasNext()) {
                Disciplina aux = (Disciplina)i.next();
                modelo.addRow(new String[]{aux.getNome(), String.valueOf(aux.getAluno()), 
                    String.valueOf(aux.getProfessor()), String.valueOf(aux.getMateria()), 
                    String.valueOf(aux.getNota()), String.valueOf(aux.getAno()),
                    String.valueOf(aux.getSemestre()), String.valueOf(aux.getFrequencia()), 
                    String.valueOf(aux.isAprovacao())});
            }
            jtDisc.setModel(modelo);
        } catch (Exception e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpAprov;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlaAluno;
    private javax.swing.JLabel jlaAno;
    private javax.swing.JLabel jlaAprov;
    private javax.swing.JLabel jlaDisc;
    private javax.swing.JLabel jlaFrequencia;
    private javax.swing.JLabel jlaMat;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaNota;
    private javax.swing.JLabel jlaProf;
    private javax.swing.JLabel jlaSemestre;
    private javax.swing.JRadioButton jrbNao;
    private javax.swing.JRadioButton jrbSim;
    private javax.swing.JTable jtDisc;
    private javax.swing.JTextField jtfAluno;
    private javax.swing.JTextField jtfAno;
    private javax.swing.JTextField jtfFrequencia;
    private javax.swing.JTextField jtfMat;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNota;
    private javax.swing.JTextField jtfProf;
    private javax.swing.JTextField jtfSemestre;
    // End of variables declaration//GEN-END:variables
}
