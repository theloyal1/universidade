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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class FormCurso extends javax.swing.JFrame {

    FichaCurso fichaCurso;
    FichaAluno fichaAluno;
    ArrayList<Aluno> alunos;
    FichaProf fichaProf;
    ArrayList<Professor> profs;
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
        alunos = fichaAluno.relatorio();
        String[] titProfs = {"CPF", "Professor"};
        modeloProf = new DefaultTableModel(titProfs, 0);
        jtProfs.setModel(modeloProf);
        profs = fichaProf.relatorio();
        jbSair.setBackground(Color.red);
        preencheDados();
    }

    private FormCurso() {
        throw new UnsupportedOperationException("Not supported yet.");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAlunos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProfs = new javax.swing.JTable();
        jcbAlunos = new javax.swing.JComboBox<>();
        jlaAddAlunos = new javax.swing.JLabel();
        jbRemAlunos = new javax.swing.JButton();
        jlaAddProfs = new javax.swing.JLabel();
        jcbProfs = new javax.swing.JComboBox<>();
        jbAddProfs = new javax.swing.JButton();
        jbRemProfs = new javax.swing.JButton();

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
        jtCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCursos);
        if (jtCursos.getColumnModel().getColumnCount() > 0) {
            jtCursos.getColumnModel().getColumn(2).setResizable(false);
        }

        jlaNome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jlaNome.setForeground(new java.awt.Color(246, 248, 255));
        jlaNome.setText("Nome: ");

        jbAddAlunos.setFont(new java.awt.Font("Yu Gothic Medium", 1, 22)); // NOI18N
        jbAddAlunos.setText("↓");
        jbAddAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddAlunosActionPerformed(evt);
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

        jlaAddAlunos.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jlaAddAlunos.setForeground(new java.awt.Color(246, 248, 255));
        jlaAddAlunos.setText("Selecionar aluno:");

        jbRemAlunos.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jbRemAlunos.setText("↑");
        jbRemAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemAlunosActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlaNumDiscObg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumDiscObg))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaNumDiscOpc)
                            .addComponent(jbCadastrar)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtfNumDiscOpc))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAddProfs)
                .addGap(104, 104, 104)
                .addComponent(jbRemProfs)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlaAddAlunos)
                                .addComponent(jcbAlunos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jlaAddProfs)
                                .addComponent(jcbProfs, 0, 290, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlaCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(224, 224, 224)
                                .addComponent(jbSair)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbAddAlunos)
                        .addGap(110, 110, 110)
                        .addComponent(jbRemAlunos)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jbSair)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlaCursos)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaNome)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlaAddAlunos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlaNumDiscObg)
                        .addComponent(jtfNumDiscObg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAddAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbRemAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jlaAddProfs))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaNumDiscOpc)
                            .addComponent(jtfNumDiscOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCadastrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jcbProfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbRemProfs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbAddProfs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
//                Curso c = new Curso();
//                Iterator<Aluno> ia = c.getAlunos().iterator();
//                while(ia.hasNext()) {
//                    Aluno aux = (Aluno)ia.next();
//                    jcbAlunos.addItem(aux);
//                }
//                jtAlunos.removeAll();
//                Iterator<Professor> ip = c.getProfs().iterator();
//                while(ip.hasNext()) {
//                    Professor aux = (Professor)ip.next();
//                    jcbProfs.addItem(aux);
//                }
//                jtProfs.removeAll();
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

                fichaCurso.alterar(c, jtCursos.getSelectedRow());
                modeloCurso.setValueAt(c.getNome(), jtCursos.getSelectedRow(), 0);
                modeloCurso.setValueAt(c.getNumDiscObg(), jtCursos.getSelectedRow(), 1);
                modeloCurso.setValueAt(c.getNumDiscOpc(), jtCursos.getSelectedRow(), 2);
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
            jtAlunos.removeAll();
            
            atualizaTabelas();
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbAddAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddAlunosActionPerformed
        if (jtCursos.getSelectedRow() != -1) {
            Aluno a = fichaAluno.consultar(jcbAlunos.getSelectedIndex());
            modeloAluno.addRow(new String[]{a.getCpf(), a.getNome()});
            JOptionPane.showMessageDialog(this, "Aluno selecionado com sucesso!");
            fichaCurso.consultar(jtCursos.getSelectedRow()).setAluno(a);
            jcbAlunos.removeItemAt(jcbAlunos.getSelectedIndex());
            jtAlunos.setModel(modeloAluno);
        }
    }//GEN-LAST:event_jbAddAlunosActionPerformed

    private void jbRemAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemAlunosActionPerformed
        Aluno a = fichaAluno.consultar(jtAlunos.getSelectedRow());
        modeloAluno.removeRow(jtAlunos.getSelectedRow());
        JOptionPane.showMessageDialog(this, "Aluno removido com sucesso!");
        fichaCurso.consultar(jtCursos.getSelectedRow()).removeAluno(a);
        jcbAlunos.addItem(a);
        jtAlunos.setModel(modeloAluno);
    }//GEN-LAST:event_jbRemAlunosActionPerformed

    private void jbAddProfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddProfsActionPerformed
        if(jtCursos.getSelectedRow() != -1) {
            Professor p = fichaProf.consultar(jcbProfs.getSelectedIndex());
            modeloProf.addRow(new String[]{p.getCpf(), p.getNome()});
            JOptionPane.showMessageDialog(this, "Professor selecionado com sucesso!");
            fichaCurso.consultar(jtCursos.getSelectedRow()).setProf(p);
            jcbProfs.removeItemAt(jcbProfs.getSelectedIndex());
            jtProfs.setModel(modeloProf);
        }
    }//GEN-LAST:event_jbAddProfsActionPerformed

    private void jbRemProfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemProfsActionPerformed
        Professor p = fichaProf.consultar(jtProfs.getSelectedRow());
        modeloProf.removeRow(jtProfs.getSelectedRow());
        JOptionPane.showMessageDialog(this, "Professor removido com sucesso!");
        fichaCurso.consultar(jtCursos.getSelectedRow()).removeProf(p);
        jcbProfs.addItem(p);
        jtProfs.setModel(modeloProf);
    }//GEN-LAST:event_jbRemProfsActionPerformed

    private void jtCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCursosMouseClicked
        try {
            jtfNome.setText(jtCursos.getModel().getValueAt(jtCursos.getSelectedRow(), 0).toString());
            jtfNumDiscObg.setText(jtCursos.getModel().getValueAt(jtCursos.getSelectedRow(), 1).toString());
            jtfNumDiscOpc.setText(jtCursos.getModel().getValueAt(jtCursos.getSelectedRow(), 2).toString());
            
            atualizaTabelas();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtCursosMouseClicked

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
            while (i.hasNext()) {
                Curso aux = (Curso) i.next();
                modeloCurso.addRow(new String[]{aux.getNome(), String.valueOf(aux.getNumDiscObg()),
                    String.valueOf(aux.getNumDiscOpc())});
            }
            jtCursos.setModel(modeloCurso);
            jcbAlunos.removeAll();
            for (Aluno a : alunos)
                jcbAlunos.addItem(a);
            jcbProfs.removeAll();
            for (Professor p : profs)
                jcbProfs.addItem(p);
        } catch (Exception e) {
        }
    }
    
    public void atualizaTabelas() {
        try {
            jtAlunos.removeAll();
            Curso c = new Curso();
            Iterator<Aluno> ia = c.getAlunos().iterator();
            while(ia.hasNext()) {
                Aluno aux = (Aluno)ia.next();
                modeloAluno.addRow(new String[]{aux.getCpf(), aux.getNome()});
            }
            jtAlunos.setModel(modeloAluno);
        } catch (Exception e) {
        }
        try {
            jtProfs.removeAll();
            Curso c = new Curso();
            Iterator<Professor> ip = c.getProfs().iterator();
            while(ip.hasNext()) {
                Professor aux = (Professor)ip.next();
                modeloProf.addRow(new String[]{aux.getCpf(), aux.getNome()});
            }
            jtProfs.setModel(modeloProf);
        } catch (Exception e) {
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
    private javax.swing.JButton jbRemAlunos;
    private javax.swing.JButton jbRemProfs;
    private javax.swing.JButton jbSair;
    private javax.swing.JComboBox<Aluno> jcbAlunos;
    private javax.swing.JComboBox<Professor> jcbProfs;
    private javax.swing.JLabel jlaAddAlunos;
    private javax.swing.JLabel jlaAddProfs;
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
