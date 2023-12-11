
package ficharios;

import entidades.Conexao;
import static entidades.Conexao.fabricaDeConexoes;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class FicharioRelatorioGeral {

    JasperPrint jasperPrint = null;
    JasperViewer jasperViewer = null;
    private Connection conn = null;

    public FicharioRelatorioGeral() {
        conn = fabricaDeConexoes();
    }

    public void relatorioAlunos() {// isso e so voce ir dando ctrl c ctrl v e mudando o caminho e o nome da função
        String src = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\universidade\\RelatorioUniFed\RelatorioAlunos.jasper";
        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        abrirRelatorio();
    }
    
        public void nomeQueVoceQuerDarPraFunção() {// isso e so voce ir dando ctrl c ctrl v e mudando o caminho e o nome da função
        String src = "D:\\PENDRIVE NORMAL\\TrabalhoPV2\\TrabalhoPv\\RelatorioCliente.jasper";
        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        abrirRelatorio();
    }
        
        

    private void abrirRelatorio() {
        jasperViewer = new JasperViewer(jasperPrint, false);
        jasperViewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jasperViewer.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Janela do relatório está sendo fechada");
            }
        });
        jasperViewer.setVisible(true);
    }
}
