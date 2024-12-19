package paquete.principal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import paquete.vistas.CalcRectangulo;
import paquete.vistas.CalcCirculo;
import paquete.vistas.CalcTriangulo;

public class PrincipalFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JDesktopPane desktopPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PrincipalFrame frame = new PrincipalFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public PrincipalFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 873, 584);

        
        desktopPane = new JDesktopPane(); 
        setContentPane(desktopPane);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnArea = new JMenu("Calculo de Area");
        menuBar.add(mnArea);

    
        JMenuItem mntmRectangulo = new JMenuItem("Rectangulo");
        mntmRectangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                CalcRectangulo frmCalcRectangulo = new CalcRectangulo();
                frmCalcRectangulo.setVisible(true);
                desktopPane.add(frmCalcRectangulo);
            }
        });
        mnArea.add(mntmRectangulo);


        JMenuItem mntmCirculo = new JMenuItem("Circulo");
        mntmCirculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                CalcCirculo frmCalcCirculo = new CalcCirculo();
                frmCalcCirculo.setVisible(true);
                desktopPane.add(frmCalcCirculo);
            }
        });
        mnArea.add(mntmCirculo);

        JMenuItem mntmTriangulo = new JMenuItem("Triangulo");
        mntmTriangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                CalcTriangulo frmCalcTriangulo = new CalcTriangulo();
                frmCalcTriangulo.setVisible(true);
                desktopPane.add(frmCalcTriangulo);
            }
        });
        mnArea.add(mntmTriangulo);
    }
}
