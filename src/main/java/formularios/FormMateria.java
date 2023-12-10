package formularios;

import entidades.Materia;
import entidades.Professor;
import ficharios.FichaMat;
import ficharios.FichaProf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormMateria extends javax.swing.JFrame {

    FichaMat fichaMat;
    FichaProf fichaProf;
    ArrayList<Professor> profs, profsCb;
    DefaultTableModel modeloMat, modeloProf;

    public FormMateria(FichaMat fichaMat, FichaProf fichaProf) {
        initComponents();
        this.fichaMat = fichaMat;
        this.fichaProf = fichaProf;
        String[] titulos = {"Nome", "Ementa", "Pré-req.", "Carga hor."};
        modeloMat = new DefaultTableModel(titulos, 0);
        String[] titProfs = {"CPF", "Professor"};
        modeloProf = new DefaultTableModel(titProfs, 0);
        jtProfs.setModel(modeloProf);
        profs = fichaProf.relatorio();
        profsCb = fichaProf.relatorio();
        jtMats.setModel(modeloMat);
        jbVoltar.setBackground(Color.RED);
        preencheDados();
    }
    
    private FormMateria() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaMateria = new javax.swing.JLabel();
        jlaNome = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jtfNome = new javax.swing.JTextField();
        jlaCargaHor = new javax.swing.JLabel();
        jtfCargaHor = new javax.swing.JTextField();
        jlaEmenta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaEmenta = new javax.swing.JTextArea();
        jlaPreReq = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaPreReq = new javax.swing.JTextArea();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtMats = new javax.swing.JTable();
        jlaAddProfs = new javax.swing.JLabel();
        jcbProfs = new javax.swing.JComboBox<>();
        jbAddProfs = new javax.swing.JButton();
        jbRemProfs = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtProfs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));

        jlaMateria.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaMateria.setText("Matéria");

        jlaNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNome.setForeground(new java.awt.Color(246, 248, 255));
        jlaNome.setText("Nome: ");

        jbVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jbVoltar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jlaCargaHor.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaCargaHor.setForeground(new java.awt.Color(246, 248, 255));
        jlaCargaHor.setText("Carga horária: ");

        jlaEmenta.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaEmenta.setForeground(new java.awt.Color(246, 248, 255));
        jlaEmenta.setText("Ementa:");

        jtaEmenta.setColumns(20);
        jtaEmenta.setRows(5);
        jScrollPane1.setViewportView(jtaEmenta);

        jlaPreReq.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaPreReq.setForeground(new java.awt.Color(246, 248, 255));
        jlaPreReq.setText("Pré-requisitos: ");

        jtaPreReq.setColumns(20);
        jtaPreReq.setRows(5);
        jScrollPane2.setViewportView(jtaPreReq);

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

        jtMats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Ementa", "Pré-req.", "Carga hor."
            }
        ));
        jtMats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMatsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtMats);

        jlaAddProfs.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jlaAddProfs.setForeground(new java.awt.Color(246, 248, 255));
        jlaAddProfs.setText("Selecionar professor:");

        jbAddProfs.setFont(new java.awt.Font("Yu Gothic Medium", 1, 22)); // NOI18N
        jbAddProfs.setText("↓");
        jbAddProfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddProfsActionPerformed(evt);
            }
        });

        jbRemProfs.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jbRemProfs.setText("↑");
        jbRemProfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemProfsActionPerformed(evt);
            }
        });

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
        jScrollPane4.setViewportView(jtProfs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(jbVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlaNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlaCargaHor)
                                        .addComponent(jbCadastrar))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtfCargaHor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlaAddProfs)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jlaEmenta)
                                                        .addComponent(jlaPreReq))
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jcbProfs, 0, 319, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jbAddProfs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbRemProfs)
                                .addGap(53, 53, 53)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaMateria)
                    .addComponent(jbVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlaNome)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlaEmenta))
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlaCargaHor)
                                .addComponent(jtfCargaHor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlaPreReq)
                                .addComponent(jbCadastrar))
                            .addComponent(jbExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaAddProfs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbProfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAddProfs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbRemProfs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            this.dispose();        }
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Materia m = new Materia();

        m.setNome(jtfNome.getText());
        m.setEmenta(jtaEmenta.getText());
        m.setPreRequisitos(jtaPreReq.getText());
        m.setCargaHoraria(Integer.valueOf(jtfCargaHor.getText()));

        fichaMat.cadastrar(m);
        modeloMat.addRow(new String[]{m.getNome(), m.getEmenta(), m.getPreRequisitos(), String.valueOf(m.getCargaHoraria())});
        JOptionPane.showMessageDialog(this, "Matéria cadastrada com sucesso!");
        limparDados();
        jtMats.setModel(modeloMat);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (fichaMat.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há matérias cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Iterator<Professor> ip = profsCb.iterator();
                while(ip.hasNext()) {
                    Professor aux = (Professor)ip.next();
                    jcbProfs.addItem(aux);
                }
                modeloProf.setRowCount(0);
                fichaMat.excluir(jtMats.getSelectedRow());
                modeloMat.removeRow(jtMats.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Matéria excluída com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Exclusão não sucedida!");
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        if (fichaMat.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há matérias cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar alteração?",
                    "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Materia m = new Materia();

                m.setNome(jtfNome.getText());
                m.setEmenta(jtaEmenta.getText());
                m.setPreRequisitos(jtaPreReq.getText());
                m.setCargaHoraria(Integer.valueOf(jtfCargaHor.getText()));

                fichaMat.alterar(m, jtMats.getSelectedRow());
                modeloMat.setValueAt(m.getNome(), jtMats.getSelectedRow(), 0);
                modeloMat.setValueAt(m.getEmenta(), jtMats.getSelectedRow(), 1);
                modeloMat.setValueAt(m.getPreRequisitos(), jtMats.getSelectedRow(), 2);
                modeloMat.setValueAt(m.getCargaHoraria(), jtMats.getSelectedRow(), 3);
                JOptionPane.showMessageDialog(this, "Matéria alterada com sucesso!");
                limparDados();
            } else {
                JOptionPane.showMessageDialog(this, "Alteração não sucedida!");
            }
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        if (fichaMat.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há matérias cadastradas!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            Materia m = fichaMat.consultar(jtMats.getSelectedRow());
            JOptionPane.showMessageDialog(this,
                    "Nome: " + m.getNome()
                    + "\nEmenta: " + m.getEmenta()
                    + "\nPré-requisitos: " + m.getPreRequisitos()
                    + "\nProfessores: " + m.getProfs()
                    + "\nCarga horária: " + m.getCargaHoraria());
            limparDados();
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbAddProfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddProfsActionPerformed
        if(jtMats.getSelectedRow() != -1) {
            Professor p = fichaProf.consultar(jcbProfs.getSelectedIndex());
            modeloProf.addRow(new String[]{String.valueOf(p.getCpf()), p.getNome()});
            JOptionPane.showMessageDialog(this, "Professor selecionado com sucesso!");
            fichaMat.consultar(jtMats.getSelectedRow()).setProf(p);
            jcbProfs.removeItemAt(jcbProfs.getSelectedIndex());
            profsCb.remove(p);
            fichaProf.cadastrar(p);
            jtProfs.setModel(modeloProf);
        }
    }//GEN-LAST:event_jbAddProfsActionPerformed

    private void jbRemProfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemProfsActionPerformed
        if(jtMats.getSelectedRow() != -1) {
            Professor p = fichaProf.consultar(jtProfs.getSelectedRow());
            modeloProf.removeRow(jtProfs.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Professor removido com sucesso!");
            fichaMat.consultar(jtMats.getSelectedRow()).removeProf(p);
            jcbProfs.addItem(p);
            profsCb.add(p);
        }
    }//GEN-LAST:event_jbRemProfsActionPerformed

    private void jtMatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMatsMouseClicked
        try {
            jtfNome.setText(jtMats.getModel().getValueAt(jtMats.getSelectedRow(), 0).toString());
            jtaEmenta.setText(jtMats.getModel().getValueAt(jtMats.getSelectedRow(), 1).toString());
            jtaPreReq.setText(jtMats.getModel().getValueAt(jtMats.getSelectedRow(), 2).toString());
            jtfCargaHor.setText(jtMats.getModel().getValueAt(jtMats.getSelectedRow(), 3).toString());
            
            atualizaTabelas();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtMatsMouseClicked

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
            java.util.logging.Logger.getLogger(FormMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMateria().setVisible(true);
            }
        });
    }
    
    public void preencheDados() {
        try {
            jtMats.removeAll();
            Iterator<Materia> i = fichaMat.relatorio().iterator();
            while(i.hasNext()) {
                Materia aux = (Materia)i.next();
                modeloMat.addRow(new String[]{aux.getNome(), aux.getEmenta(), 
                    aux.getPreRequisitos(), String.valueOf(aux.getProfs()), 
                    String.valueOf(aux.getCargaHoraria())});
            }
            jtMats.setModel(modeloMat);
        } catch (Exception e) {
        }
    }
    
    public void atualizaTabelas() {
        try {
            modeloProf.setNumRows(0);
            Iterator<Professor> ip = fichaMat.consultar(jtMats.getSelectedRow()).getProfs().iterator();
            while(ip.hasNext()) {
                Professor aux = (Professor)ip.next();
                modeloProf.addRow(new String[]{String.valueOf(aux.getCpf()), aux.getNome()});
            }
            modeloProf.fireTableDataChanged();
            jtProfs.setModel(modeloProf);
        } catch (Exception e) {
        }
    }
    
    public void limparDados() {
        jtfNome.setText(null);
        jtaEmenta.setText(null);
        jtaPreReq.setText(null);
        jtfCargaHor.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbAddProfs;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbRemProfs;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<Professor> jcbProfs;
    private javax.swing.JLabel jlaAddProfs;
    private javax.swing.JLabel jlaCargaHor;
    private javax.swing.JLabel jlaEmenta;
    private javax.swing.JLabel jlaMateria;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaPreReq;
    private javax.swing.JTable jtMats;
    private javax.swing.JTable jtProfs;
    private javax.swing.JTextArea jtaEmenta;
    private javax.swing.JTextArea jtaPreReq;
    private javax.swing.JTextField jtfCargaHor;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
