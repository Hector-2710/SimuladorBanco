package Interfaces;

import Dominio.CrearUsuario;
import Dominio.Tarjeta;
import Dominio.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarseVentana extends JFrame implements ActionListener {
    private JPanel registrarPanel;
    private JButton button1;
    private JTextField nombreField;
    private JTextField claveField;
    private JTextField correoField;
    private JTextField pinField;
    private JButton ingresarButton;

    public RegistrarseVentana() throws HeadlessException {
        setup();
    }

    public JPanel setup(){
        JFrame frame = new JFrame("REGISTRAR");
        frame.setContentPane(registrarPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        ingresarButton.addActionListener(this);

        return registrarPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String nombre = nombreField.getText();
        String correo = correoField.getText();
        String clave = claveField.getText();
        int pin = Integer.parseInt(pinField.getText());

        if (ingresarButton == e.getSource()){
            Tarjeta tarjeta = CrearUsuario.crearTarjeta(pin);
            Usuario user = CrearUsuario.crearUsuario(nombre,clave,correo,tarjeta);
        }


    }
}

