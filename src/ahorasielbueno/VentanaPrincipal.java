package ahorasielbueno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JPanel {

    private JLabel jLabel2,  jLabel3;
    private JTextField txtcurp;
    private JButton jButton2;
    private JPanel jPanel1;
    private GeneradorCurp curp;

    public VentanaPrincipal() {
        initComponents();
        
    }

    private void initComponents() {
        setSize(500,200);
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        txtcurp = new JTextField();
        jButton2 = new JButton();
       
        jLabel3 = new JLabel();

        setBackground(new Color(255, 255, 255));
        setLayout(new BorderLayout());

        jPanel1.setLayout(null);

        jLabel2.setFont(new Font("Bookman Old Style", 10, 18));
        jLabel2.setText("Curp:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(24, 27, 80, 40);

        txtcurp.setFont(new Font("Bookman Old Style", 0, 18));
        jPanel1.add(txtcurp);
        txtcurp.setBounds(80, 28, 240, 30); //este es el txtfield

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 80, 90, 23);

       

        jLabel3.setFont(new Font("Segoe UI Semibold", 2, 12));
        jLabel3.setForeground(new Color(51, 51, 255));
        jLabel3.setText("No Conozco Mi Curp");
        jLabel3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 80, 124, 23);

        add(jPanel1, BorderLayout.CENTER);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        try {
            String curp, nombre, Fecha, sexo, entidad, consonante, digitos;
            curp = txtcurp.getText();

            nombre = curp.substring(0, 4);
            Fecha = curp.substring(4, 10);
            sexo = curp.substring(10, 11);
            entidad = curp.substring(11, 13);
            consonante = curp.substring(13, 16);
            digitos = curp.substring(16, 18);

            if (nombre.matches("[A-Za-z]+") && Fecha.matches("\\d+") && sexo.matches("[A-Za-z]+") && entidad.matches("[A-Za-z]+") && consonante.matches("[A-Za-z]+") && digitos.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "La Curp Es Correcta");
                
            } else {
                JOptionPane.showMessageDialog(null, "El Formato Es Incorrecto");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al procesar la CURP: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {
        try {
            if (curp == null) {
                curp = new GeneradorCurp(null, true);
            }
            this.setVisible(false);
            curp.setVisible(true);
            if (curp.getBotonPulsado() == 0) {
                txtcurp.setText(curp.getGeneradorCurp());
                this.setVisible(true);
                jLabel3.setVisible(false);
                
            } else {
                txtcurp.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar la ventana de generación de CURP: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   
}
