package Interfaces;

import Dominio.IngresarUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarVentana extends JFrame implements ActionListener {

    private JPanel IngresarPanel;
    private JTextField correoField;
    private JTextField claveField;
    private JButton button1;
    private JButton ingresarButton;

    public IngresarVentana() throws HeadlessException {
        setup();
    }

    public JPanel setup(){
        JFrame frame = new JFrame("INGRESAR");
        frame.setContentPane(IngresarPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        ingresarButton.addActionListener(this);
        return IngresarPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String correo = correoField.getText();
        String clave = claveField.getText();

        if (ingresarButton == e.getSource()){
            IngresarUsuario.verificarUsuario(correo,clave);
        }



    }
}


