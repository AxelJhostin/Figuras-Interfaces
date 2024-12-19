package paquete.vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import paquete.clases.Rectangulo;

public class CalcRectangulo extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txfLargo;
    private JTextField txfCorto;
    private JLabel lblResultado;

    /**
     * Create the frame.
     */
    public CalcRectangulo() {
        setBounds(100, 100, 356, 237);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Calculador de Rectangulo");
        lblNewLabel.setFont(new Font("Uni Neue Regular", Font.BOLD, 16));
        lblNewLabel.setBounds(10, 11, 269, 35);
        getContentPane().add(lblNewLabel);

        JLabel lblLargo = new JLabel("Largo:");
        lblLargo.setFont(new Font("Uni Neue Regular", Font.PLAIN, 13));
        lblLargo.setBounds(24, 71, 76, 25);
        getContentPane().add(lblLargo);

        JLabel lblCorto = new JLabel("Corto:");
        lblCorto.setFont(new Font("Uni Neue Regular", Font.PLAIN, 13));
        lblCorto.setBounds(24, 112, 76, 25);
        getContentPane().add(lblCorto);

        txfLargo = new JTextField();
        txfLargo.setBounds(76, 74, 86, 20);
        getContentPane().add(txfLargo);
        txfLargo.setColumns(10);

        txfCorto = new JTextField();
        txfCorto.setBounds(76, 115, 86, 20);
        getContentPane().add(txfCorto);
        txfCorto.setColumns(10);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(237, 57, 89, 23);
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double largo = Double.parseDouble(txfLargo.getText());
                    double corto = Double.parseDouble(txfCorto.getText());
                    Rectangulo rectangulo = new Rectangulo(largo, corto);
                    double area = rectangulo.calcularArea();
                    lblResultado.setText("Área: " + String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Entrada inválida");
                }
            }
        });
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado");
        lblResultado.setFont(new Font("Uni Neue Regular", Font.BOLD, 16));
        lblResultado.setBounds(98, 152, 200, 42);
        getContentPane().add(lblResultado);

        JButton btnNuevo = new JButton("Nuevo");
        btnNuevo.setBounds(237, 96, 89, 23);
        btnNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txfLargo.setText("");
                txfCorto.setText(""); 
                lblResultado.setText("Resultado"); 
            }
        });
        getContentPane().add(btnNuevo);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(237, 140, 89, 23);
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        getContentPane().add(btnSalir);
    }
}
