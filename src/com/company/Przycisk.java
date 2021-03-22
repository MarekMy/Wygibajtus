package com.company;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Font;

class Przycisk extends JButton implements ActionListener {

    private Color[] colors = {Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW};
    private String[] strings = {"Lewa Noga", "Prawa Noga", "Lewa Ręka", "Prawa Ręka"};



    private JPanel przyciskPanel;

  private String text = new String();{
        Random generator = new Random();
        int a;
        a = generator.nextInt(4)+1;
        if ( a == 1 ) text = "Prawa ręka";
        if ( a == 2 ) text = "Lewa ręka";
        if ( a == 3 ) text = "Prawa noga";
        if ( a == 4 ) text = "Lewa noga";
}

    Przycisk(JPanel przyciskPanel){
        super();
        this.przyciskPanel = przyciskPanel;
        addActionListener(this);


    }




    @Override
    public void actionPerformed(ActionEvent e) {
       int index = new Random().nextInt(colors.length);
       int text = new  Random().nextInt(strings.length);
        przyciskPanel.setBackground(colors[index]);
        setText(strings[text]);





    }

}
