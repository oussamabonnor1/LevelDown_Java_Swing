package com.company;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Oussama on 01/10/2016.
 */
public class Fenetre extends JFrame implements KeyListener {
    Pannau pan = new Pannau();
    public Fenetre(){
        this.setContentPane(pan);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setName("meh");
        this.setSize(720,480);
        addKeyListener(this);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    int k = e.getKeyCode();
        int k1 = e.getExtendedKeyCode();
        if(k == KeyEvent.VK_UP){
            pan.y--;
            pan.repaint();
        }
        if(k == KeyEvent.VK_DOWN){
            pan.y++;
            pan.repaint();
        }
        if(k == KeyEvent.VK_RIGHT){
            pan.x++;
            pan.repaint();
        }
        if(k == KeyEvent.VK_LEFT){
            pan.x--;
            pan.repaint();
        }
        if(k == KeyEvent.VK_UP && k1 == KeyEvent.VK_RIGHT ){
            pan.x++;
            pan.y++;
            pan.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
