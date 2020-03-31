/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Lenovo
 */
public class Intro extends Space {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
        g.drawString("Space Invaders", 100, 100);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
        g.drawString("          by Giacomo Morello", 110, 110);
    }

    void run() {
        this.repaint();
    }

}
