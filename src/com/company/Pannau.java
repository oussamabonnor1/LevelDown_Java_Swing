package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Oussama on 01/10/2016.
 */
public class Pannau extends JPanel  {
    int x=100,y=100;
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.blue);
        g.fillOval(x,y,20,20);

    }
}
