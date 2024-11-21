package Interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Home extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton ingresarButton;
    private JButton registrarseButton;

    public Home() throws HeadlessException {
        setup();
    }

    public JPanel setup(){

        JFrame frame = new JFrame("HOME");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        ingresarButton.addActionListener(this);
        registrarseButton.addActionListener(this);


        return mainPanel;
    }

    @Override
    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == ingresarButton){
            new IngresarVentana();
            mainPanel.setVisible(false);
        }
        if (ae.getSource() == registrarseButton){
            new RegistrarseVentana();
            mainPanel.setVisible(false);
        }

    }
}


