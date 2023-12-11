package formularios;

import entidades.Aluno;
import ficharios.FichaAluno;
import java.awt.Color;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAluno extends javax.swing.JFrame {

    FichaAluno fichaAluno;
    DefaultTableModel modelo;

    public FormAluno(FichaAluno fichaAluno) {
        initComponents();
        this.fichaAluno = fichaAluno;
        String[] titulos = {"CPF", "Nome", "Email", "Endereço", "Telefone", "Nº de mat.",
            "Nº de conc.", "Nº de dep.", "Data da mat."};
        modelo = new DefaultTableModel(titulos, 0);
        jtAlunos.setModel(modelo);
        jbVoltar.setBackground(Color.red);
        preencheDados();
    }

    private FormAluno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaAlunos = new javax.swing.JLabel();
        jlaNumConc = new javax.swing.JLabel();
        jtfNumConc = new javax.swing.JTextField();
        jlaDataMat = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlaEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlaCpf = new javax.swing.JLabel();
        jlaNome = new javax.swing.JLabel();
        jlaEndereco = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jlaTelefone = new javax.swing.JLabel();
        jlaNumMat = new javax.swing.JLabel();
        jtfNumMat = new javax.swing.JTextField();
        jlaNumDep = new javax.swing.JLabel();
        jtfNumDep = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlunos = new javax.swing.JTable();
        jbVoltar = new javax.swing.JButton();
        jtfDataMat = new javax.swing.JFormattedTextField();
        jtfCpf = new javax.swing.JFormattedTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alunos");

        jPanel1.setBackground(new java.awt.Color(111, 156, 235));
        jPanel1.setForeground(new java.awt.Color(111, 156, 235));

        jlaAlunos.setBackground(new java.awt.Color(20, 27, 65));
        jlaAlunos.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jlaAlunos.setForeground(new java.awt.Color(20, 27, 65));
        jlaAlunos.setText("Alunos");

        jlaNumConc.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNumConc.setForeground(new java.awt.Color(246, 248, 255));
        jlaNumConc.setText("Nº de conclusões: ");

        jlaDataMat.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaDataMat.setForeground(new java.awt.Color(246, 248, 255));
        jlaDataMat.setText("Data da matrícula: ");

        jlaEmail.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaEmail.setForeground(new java.awt.Color(246, 248, 255));
        jlaEmail.setText("Email: ");

        jlaCpf.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaCpf.setForeground(new java.awt.Color(246, 248, 255));
        jlaCpf.setText("CPF: ");

        jlaNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNome.setForeground(new java.awt.Color(246, 248, 255));
        jlaNome.setText("Nome: ");

        jlaEndereco.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaEndereco.setForeground(new java.awt.Color(246, 248, 255));
        jlaEndereco.setText("Endereço: ");

        jlaTelefone.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaTelefone.setForeground(new java.awt.Color(246, 248, 255));
        jlaTelefone.setText("Telefone: ");

        jlaNumMat.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNumMat.setForeground(new java.awt.Color(246, 248, 255));
        jlaNumMat.setText("Nº de matrículas: ");

        jlaNumDep.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNumDep.setForeground(new java.awt.Color(246, 248, 255));
        jlaNumDep.setText("Nº de dependências: ");

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

        jtAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Email", "Endereço", "Telefone", "Nº de mat.", "Nº de conc.", "Nº de dep.", "Data da mat."
            }
        ));
        jtAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlunos);

        jbVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jbVoltar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        try {
            jtfDataMat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfDataMat.setToolTipText("");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaNumConc)
                            .addComponent(jbCadastrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfNumConc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlaCpf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jlaNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(jlaEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlaNumMat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfNumMat, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlaNumDep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfNumDep, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlaTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfTelefone))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlaDataMat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfDataMat, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(273, 273, 273)
                            .addComponent(jlaAlunos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbVoltar))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlaAlunos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jbVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNome)
                    .addComponent(jlaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfEmail)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfEndereco)
                    .addComponent(jlaTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNumMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNumMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaNumDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNumConc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNumConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaDataMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfDataMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Aluno a = new Aluno();

        a.setCpf(Integer.valueOf(jtfCpf.getText()));
        a.setNome(jtfNome.getText());
        a.setEmail(jtfEmail.getText());
        a.setEndereco(jtfEndereco.getText());
        a.setTelefone(jtfTelefone.getText());
        a.setNumMatriculas(Integer.valueOf(jtfNumMat.getText()));
        a.setNumConclusoes(Integer.valueOf(jtfNumConc.getText()));
        a.setNumDiscDep(Integer.valueOf(jtfNumDep.getText()));
        a.setDataMatricula(jtfDataMat.getText());

        fichaAluno.cadastrar(a);
        modelo.addRow(new String[]{String.valueOf(a.getCpf()), a.getNome(), a.getEmail(), a.getEndereco(),
            a.getTelefone(), String.valueOf(a.getNumMatriculas()), String.valueOf(a.getNumConclusoes()),
            String.valueOf(a.getNumDiscDep()), String.valueOf(a.getDataMatricula())});
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
        limparDados();
        jtAlunos.setModel(modelo);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Tem certeza de que queira voltar para o menu principal?",
                "Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (res == JOptionPane.YES_OPTION) {
            setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (fichaAluno.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há alunos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar exclusão?",
                    "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Aluno a = fichaAluno.consultar(jtAlunos.getSelectedRow());
                fichaAluno.excluir(a, jtAlunos.getSelectedRow());
                modelo.removeRow(jtAlunos.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Aluno excluído com sucesso!");
                limparDados();
            } else {
                JOptionPane.showMessageDialog(this, "Exclusão não sucedida!");
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        if (fichaAluno.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há alunos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            Aluno a = fichaAluno.consultar(jtAlunos.getSelectedRow());
            JOptionPane.showMessageDialog(this, "CPF: " + a.getCpf()
                    + "\nNome: " + a.getNome()
                    + "\nEmail: " + a.getEmail()
                    + "\nEndereço: " + a.getEndereco()
                    + "\nTelefone: " + a.getTelefone()
                    + "\nNúmero de matrículas: " + a.getNumMatriculas()
                    + "\nNúmero de conclusões: " + a.getNumConclusoes()
                    + "\nNúmero de dependências: " + a.getNumDiscDep()
                    + "\nData da matrícula: " + a.getDataMatricula());
            limparDados();
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        if (fichaAluno.isEmpty())
            JOptionPane.showMessageDialog(this, "Não há alunos cadastrados!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        else {
            int res = JOptionPane.showConfirmDialog(this, "Confirmar alteração?",
                    "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                Aluno a = new Aluno();

                a.setCpf(Integer.valueOf(jtfCpf.getText()));
                a.setNome(jtfNome.getText());
                a.setEmail(jtfEmail.getText());
                a.setEndereco(jtfEndereco.getText());
                a.setTelefone(jtfTelefone.getText());
                a.setNumMatriculas(Integer.valueOf(jtfNumMat.getText()));
                a.setNumConclusoes(Integer.valueOf(jtfNumConc.getText()));
                a.setNumDiscDep(Integer.valueOf(jtfNumDep.getText()));
                a.setDataMatricula(jtfDataMat.getText());
                
                fichaAluno.alterar(a, jtAlunos.getSelectedRow());
                modelo.setValueAt(a.getCpf(), jtAlunos.getSelectedRow(), 0);
                modelo.setValueAt(a.getNome(), jtAlunos.getSelectedRow(), 1);
                modelo.setValueAt(a.getEmail(), jtAlunos.getSelectedRow(), 2);
                modelo.setValueAt(a.getEndereco(), jtAlunos.getSelectedRow(), 3);
                modelo.setValueAt(a.getTelefone(), jtAlunos.getSelectedRow(), 4);
                modelo.setValueAt(a.getNumMatriculas(), jtAlunos.getSelectedRow(), 5);
                modelo.setValueAt(a.getNumConclusoes(), jtAlunos.getSelectedRow(), 6);
                modelo.setValueAt(a.getNumDiscDep(), jtAlunos.getSelectedRow(), 7);
                modelo.setValueAt(a.getDataMatricula(), jtAlunos.getSelectedRow(), 8);
                jtAlunos.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Aluno alterado com sucesso!");
                limparDados();
                
            } else {
                JOptionPane.showMessageDialog(this, "Alteração não sucedida!");
            }
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlunosMouseClicked
        try {
            jtfCpf.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 0).toString());
            jtfNome.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 1).toString());
            jtfEmail.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 2).toString());
            jtfEndereco.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 3).toString());
            jtfTelefone.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 4).toString());
            jtfNumMat.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 5).toString());
            jtfNumConc.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 6).toString());
            jtfNumDep.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 7).toString());
            jtfDataMat.setText(jtAlunos.getModel().getValueAt(jtAlunos.getSelectedRow(), 8).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtAlunosMouseClicked

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
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluno().setVisible(true);
            }
        });
    }

    public void preencheDados() {
        try {
            jtAlunos.removeAll();
            Iterator<Aluno> i = fichaAluno.relatorio().iterator();
            while(i.hasNext()) {
                Aluno aux = (Aluno)i.next();
                modelo.addRow(new String[]{String.valueOf(aux.getCpf()), 
                    aux.getNome(), aux.getEmail(), aux.getEndereco(), 
                    aux.getTelefone(), 
                    String.valueOf(aux.getNumMatriculas()), 
                    String.valueOf(aux.getNumConclusoes()),
                    String.valueOf(aux.getNumDiscDep()), 
                    String.valueOf(aux.getDataMatricula())});
            }
            jtAlunos.setModel(modelo);
        } catch (Exception e) {
        }
    }
    
    public void limparDados() {
        jtfCpf.setText(null);
        jtfNome.setText(null);
        jtfEmail.setText(null);
        jtfEndereco.setText(null);
        jtfTelefone.setText(null);
        jtfNumMat.setText(null);
        jtfNumConc.setText(null);
        jtfNumDep.setText(null);
        jtfDataMat.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlaAlunos;
    private javax.swing.JLabel jlaCpf;
    private javax.swing.JLabel jlaDataMat;
    private javax.swing.JLabel jlaEmail;
    private javax.swing.JLabel jlaEndereco;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaNumConc;
    private javax.swing.JLabel jlaNumDep;
    private javax.swing.JLabel jlaNumMat;
    private javax.swing.JLabel jlaTelefone;
    private javax.swing.JTable jtAlunos;
    private javax.swing.JFormattedTextField jtfCpf;
    private javax.swing.JFormattedTextField jtfDataMat;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumConc;
    private javax.swing.JTextField jtfNumDep;
    private javax.swing.JTextField jtfNumMat;
    private javax.swing.JFormattedTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
