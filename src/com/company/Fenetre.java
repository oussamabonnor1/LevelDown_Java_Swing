package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Oussama on 01/10/2016.
 */
public class Fenetre extends JFrame implements KeyListener {
    Pannau pan = new Pannau();

    public Fenetre() {
        this.setContentPane(pan);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setName("meh");
        this.setSize(640, 980);
        this.setLocation((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - 320, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - 490);
        addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();

        if (k == KeyEvent.VK_UP) {
            if (pan.y > 69) {
                pan.y -= 50;
                pan.repaint();
            }
        }
        if (k == KeyEvent.VK_DOWN) {
            pan.y += 50;
            pan.repaint();
        }
        if (k == KeyEvent.VK_RIGHT) {
            pan.x += 30;
            pan.repaint();
        }
        if (k == KeyEvent.VK_LEFT) {
            pan.x -= 30;
            pan.repaint();
        }
        //

        if (pan.x < 10) {
            pan.x = getWidth() - 30;
        }
        if (pan.x > getWidth() - 30) {
            pan.x = 30;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
