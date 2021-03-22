package com.company;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public  static final int HEIGHT = 300;
    public  static final int WIDTH = 300;

    private JButton button;

    public Panel(){
        button = new Przycisk(this);

        setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(button);
        button.setPreferredSize(new Dimension(150, 50));




    }
}
