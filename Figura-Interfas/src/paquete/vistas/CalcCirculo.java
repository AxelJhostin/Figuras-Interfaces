package paquete.vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import paquete.clases.Circulo;

public class CalcCirculo extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txfDiametro;
    private JLabel lblResultado;

    /**
     * Create the frame.
     */
    public CalcCirculo() {
        setBounds(100, 100, 369, 220);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Calculador de Circulo");
        lblNewLabel.setFont(new Font("Uni Neue Regular", Font.BOLD, 16));
        lblNewLabel.setBounds(10, 11, 269, 35);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Diametro:");
        lblNewLabel_1.setFont(new Font("Uni Neue Regular", Font.PLAIN, 13));
        lblNewLabel_1.setBounds(20, 67, 76, 25);
        getContentPane().add(lblNewLabel_1);

        txfDiametro = new JTextField();
        txfDiametro.setBounds(95, 70, 86, 20);
        getContentPane().add(txfDiametro);
        txfDiametro.setColumns(10);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(237, 57, 89, 23);
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double diametro = Double.parseDouble(txfDiametro.getText());
                    Circulo circulo = new Circulo(diametro); 
                    double area = circulo.calcularArea();
                    lblResultado.setText("Área: " + String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Entrada inválida");
                }
            }
        });
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado");
        lblResultado.setFont(new Font("Uni Neue Regular", Font.BOLD, 16));
        lblResultado.setBounds(60, 103, 86, 42);
        getContentPane().add(lblResultado);

        JButton btnNuevo = new JButton("Nuevo");
        btnNuevo.setBounds(237, 96, 89, 23);
        btnNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txfDiametro.setText("");
                lblResultado.setText("Resultado"); 
            }
        });
        getContentPane().add(btnNuevo);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(237, 143, 89, 23);
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        getContentPane().add(btnSalir);
    }
}

