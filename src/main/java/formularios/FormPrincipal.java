package formularios;

import ficharios.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {
    
    private FichaAluno fichaAluno = new FichaAluno();
    private FichaProf fichaProf = new FichaProf();
    private FichaCurso fichaCurso = new FichaCurso();
    private FichaDep fichaDep = new FichaDep();
    private FichaDisc fichaDisc = new FichaDisc();
    private FichaMat fichaMat = new FichaMat();
    private FichaPpc fichaPpc = new FichaPpc();
    
    public FormPrincipal() {
        initComponents();
        jbSair.setBackground(Color.red);
//        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaLogo = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmiAluno = new javax.swing.JMenuItem();
        jmiProf = new javax.swing.JMenuItem();
        jmiCurso = new javax.swing.JMenuItem();
        jmiDept = new javax.swing.JMenuItem();
        jmiMat = new javax.swing.JMenuItem();
        jmiPpc = new javax.swing.JMenuItem();
        jmiDisc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UniFed");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(173, 189, 255));

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));
        jPanel1.setForeground(new java.awt.Color(53, 40, 29));

        jlaLogo.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaLogo.setForeground(new java.awt.Color(20, 27, 65));
        jlaLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

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
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbSair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSair)
                .addGap(18, 18, 18)
                .addComponent(jlaLogo)
                .addGap(0, 108, Short.MAX_VALUE))
        );

        jmCadastros.setText("Cadastros");
        jmCadastros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jmiAluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmiAluno.setText("Aluno");
        jmiAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlunoActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiAluno);

        jmiProf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmiProf.setText("Professor");
        jmiProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProfActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiProf);

        jmiCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmiCurso.setText("Curso");
        jmiCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCursoActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCurso);

        jmiDept.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmiDept.setText("Departamento");
        jmiDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDeptActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiDept);

        jmiMat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmiMat.setText("Matéria");
        jmiMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMatActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiMat);

        jmiPpc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmiPpc.setText("PPC");
        jmiPpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPpcActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiPpc);

        jmiDisc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmiDisc.setText("Disciplina");
        jmiDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDiscActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiDisc);

        jMenuBar1.add(jmCadastros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jmiAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlunoActionPerformed
        FormAluno formAluno = new FormAluno(fichaAluno);
        formAluno.setVisible(true);
    }//GEN-LAST:event_jmiAlunoActionPerformed

    private void jmiProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProfActionPerformed
        FormProf formProf = new FormProf(fichaProf);
        formProf.setVisible(true);
    }//GEN-LAST:event_jmiProfActionPerformed

    private void jmiCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCursoActionPerformed
        if(fichaAluno.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há alunos cadastrados!", "Erro", JOptionPane.ERROR_MESSAGE);
        else {
            if(fichaProf.isEmpty())
                JOptionPane.showMessageDialog(this, "Não há professores cadastrados!", "Erro", JOptionPane.ERROR_MESSAGE);
            else {
                FormCurso formCurso = new FormCurso(fichaCurso, fichaAluno, fichaProf);
                formCurso.setVisible(true);
            }
        }
    }//GEN-LAST:event_jmiCursoActionPerformed

    private void jmiDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDeptActionPerformed
        if(fichaCurso.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há cursos cadastrados!", "Erro", JOptionPane.ERROR_MESSAGE);
        else {
            FormDep formDep = new FormDep(fichaDep, fichaCurso);
            formDep.setVisible(true); 
        }
    }//GEN-LAST:event_jmiDeptActionPerformed

    private void jmiMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMatActionPerformed
        if(fichaProf.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há professores cadastrados!", "Erro", JOptionPane.ERROR_MESSAGE);
        else {
            FormMateria formMateria = new FormMateria(fichaMat, fichaProf);
            formMateria.setVisible(true); 
        }
    }//GEN-LAST:event_jmiMatActionPerformed

    private void jmiPpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPpcActionPerformed
        if(fichaCurso.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há cursos cadastrados!", "Erro", JOptionPane.ERROR_MESSAGE);
        else {
            if(fichaMat.isEmpty())
                JOptionPane.showMessageDialog(this, "Não há matérias cadastradas!", "Erro", JOptionPane.ERROR_MESSAGE);
            else {
                FormPpc formPpc = new FormPpc(fichaPpc, fichaCurso, fichaMat);
                formPpc.setVisible(true);
            }
        }
    }//GEN-LAST:event_jmiPpcActionPerformed

    private void jmiDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDiscActionPerformed
        FormDisc formDisc = new FormDisc();
        formDisc.setVisible(true);
    }//GEN-LAST:event_jmiDiscActionPerformed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlaLogo;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenuItem jmiAluno;
    private javax.swing.JMenuItem jmiCurso;
    private javax.swing.JMenuItem jmiDept;
    private javax.swing.JMenuItem jmiDisc;
    private javax.swing.JMenuItem jmiMat;
    private javax.swing.JMenuItem jmiPpc;
    private javax.swing.JMenuItem jmiProf;
    // End of variables declaration//GEN-END:variables
}
