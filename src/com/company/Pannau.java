package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Oussama on 01/10/2016.
 */
public class Pannau extends JPanel {
    int x = 290, y = 69;
    boolean begin = false;
    ArrayList[] table = new ArrayList[16];
    Random r = new Random();


    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.blue);
        g.fillOval(x, y, 30, 30);
        stagesCreator(g);
    }

    public void stagesCreator(Graphics g) {
        for (int i = 2; i < 18; i++) {
            g.setColor(Color.white);
            g.drawLine(0, i * 50, getWidth(), i * 50);

            if (!begin) {
                table[i - 2] = new ArrayList<Enemy>();
                enemyCreator(table[i - 2], i);

                if (!begin) {
                    enemiesMover(table);
                }
            }
            g.setColor(Color.white);
            for (int j = 0; j < table[i - 2].size(); j++) {
                Enemy e = (Enemy) table[i - 2].get(j);
                g.fillRect(e.getPosX(), e.getPosY(), e.getWidth(), e.getHeight());
            }
        }
        begin = true;


    }

    public void enemyCreator(ArrayList<Enemy> arrayList, int level) {
        int lenght = r.nextInt(3) + 3;
        for (int i = 0; i < getWidth() / lenght; i++) {
            Enemy e = new Enemy(30, 50, i * (getWidth() / lenght), level * 50);
            arrayList.add(e);
        }
    }

    public void enemiesMover(ArrayList[] table) {


        for (int k = 0; k < 3; k++) {

            //for (int i = 0; i < table.length; i++) {
                //int a = i;
                for (int j = 0; j < table[0].size(); j++) {
                    Enemy e = (Enemy) table[0].get(j);
                    e.setPosX(e.getPosX() + 20);
                    table[0].set(j, e);
                }
            //}
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }


}
