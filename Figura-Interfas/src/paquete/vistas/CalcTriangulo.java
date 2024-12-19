package paquete.vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import paquete.clases.Triangulo; 

public class CalcTriangulo extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txfBase;
    private JTextField txfAltura;
    private JLabel lblResultado;

    /**
     * Create the frame.
     */
    public CalcTriangulo() {
        setBounds(100, 100, 356, 237);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Calculador de Triangulo");
        lblNewLabel.setFont(new Font("Uni Neue Regular", Font.BOLD, 16));
        lblNewLabel.setBounds(10, 11, 269, 35);
        getContentPane().add(lblNewLabel);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setFont(new Font("Uni Neue Regular", Font.PLAIN, 13));
        lblBase.setBounds(24, 71, 76, 25);
        getContentPane().add(lblBase);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setFont(new Font("Uni Neue Regular", Font.PLAIN, 13));
        lblAltura.setBounds(24, 112, 76, 25);
        getContentPane().add(lblAltura);

        txfBase = new JTextField();
        txfBase.setBounds(76, 74, 86, 20);
        getContentPane().add(txfBase);
        txfBase.setColumns(10);

        txfAltura = new JTextField();
        txfAltura.setBounds(76, 115, 86, 20);
        getContentPane().add(txfAltura);
        txfAltura.setColumns(10);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(237, 57, 89, 23);
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(txfBase.getText());
                    double altura = Double.parseDouble(txfAltura.getText());
                    Triangulo triangulo = new Triangulo(base, altura);
                    double area = triangulo.calcularArea();
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
                txfBase.setText("");
                txfAltura.setText(""); 
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

