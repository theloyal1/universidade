package formularios;

import ficharios.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {

    FichaAluno fichaAluno = new FichaAluno();
    FichaProf fichaProf = new FichaProf();

    public FormPrincipal() {
        initComponents();
        jbSair.setBackground(Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbAluno = new javax.swing.JButton();
        jbDept = new javax.swing.JButton();
        jbDisciplina = new javax.swing.JButton();
        jbCurso = new javax.swing.JButton();
        jbProfessor = new javax.swing.JButton();
        jlaLogo = new javax.swing.JLabel();
        jbPpc = new javax.swing.JButton();
        jbMateria = new javax.swing.JButton();
        jlaIcone = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UniFed");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(173, 189, 255));

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));
        jPanel1.setForeground(new java.awt.Color(53, 40, 29));

        jbAluno.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbAluno.setText("Aluno");
        jbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlunoActionPerformed(evt);
            }
        });

        jbDept.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbDept.setText("Departamento");

        jbDisciplina.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbDisciplina.setText("Disciplina");

        jbCurso.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbCurso.setText("Curso");
        jbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCursoActionPerformed(evt);
            }
        });

        jbProfessor.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbProfessor.setText("Professor");
        jbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProfessorActionPerformed(evt);
            }
        });

        jlaLogo.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaLogo.setForeground(new java.awt.Color(20, 27, 65));
        jlaLogo.setText("UniFed");

        jbPpc.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbPpc.setText("PPC");

        jbMateria.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jbMateria.setText("Matéria");

        jlaIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone.png"))); // NOI18N

        jbSair.setBackground(new java.awt.Color(0, 0, 0));
        jbSair.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jlaIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jbAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbPpc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jbDept)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSair)
                            .addComponent(jlaLogo))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAluno)
                    .addComponent(jbProfessor)
                    .addComponent(jbMateria))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDisciplina)
                    .addComponent(jbPpc)
                    .addComponent(jbCurso))
                .addGap(18, 18, 18)
                .addComponent(jbDept)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlunoActionPerformed
        FormAluno formAluno = new FormAluno();
        formAluno.setVisible(true);
    }//GEN-LAST:event_jbAlunoActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Tem certeza de que queira sair?",
                "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res == JOptionPane.YES_OPTION) {
            setVisible(false);
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProfessorActionPerformed
        FormProf formProf = new FormProf();
        formProf.setVisible(true);
    }//GEN-LAST:event_jbProfessorActionPerformed

    private void jbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCursoActionPerformed
        if ((fichaAluno.isEmpty()) || fichaProf.isEmpty())
            JOptionPane.showMessageDialog(this,
                    "Não há alunos e/ou professores cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            FormCurso formCurso = new FormCurso();
            formCurso.setVisible(true);
        }
    }//GEN-LAST:event_jbCursoActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAluno;
    private javax.swing.JButton jbCurso;
    private javax.swing.JButton jbDept;
    private javax.swing.JButton jbDisciplina;
    private javax.swing.JButton jbMateria;
    private javax.swing.JButton jbPpc;
    private javax.swing.JButton jbProfessor;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlaIcone;
    private javax.swing.JLabel jlaLogo;
    // End of variables declaration//GEN-END:variables
}
