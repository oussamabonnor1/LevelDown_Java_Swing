package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Oussama on 01/10/2016.
 */
public class Pannau extends JPanel {
    int x = 290, y = 69;

    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.blue);
        g.fillOval(x, y, 30, 30);

        for (int i = 2; i < 18; i++) {
            g.setColor(Color.white);
            g.drawLine(0, i * 50, getWidth(), i * 50);
        }
    }
}
