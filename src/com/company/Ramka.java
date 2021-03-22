package com.company;

import javax.swing.*;

public class Ramka extends JFrame {
    public Ramka(){
        super("Wygibajtus");

        JPanel panel = new Panel();
        add(panel);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
