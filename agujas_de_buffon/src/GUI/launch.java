/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import logic.buffon;
import logic.needle;

/**
 *
 * @author Javier
 */
public class launch extends javax.swing.JFrame {

    int lineSpace;
    boolean play;
    int needles;
    double attempts;
    int tr;
    int n = 0;

    public launch(int lineSpace, int needles, double attempts, int tr) {

        initComponents();
        this.setTitle("Play Board");
        this.lineSpace = lineSpace;
        repaint();
        this.needles = needles;
        this.attempts = attempts;
        this.tr = tr;
        play = true;

    }

    public void paint(Graphics g) {

        if (n < 1) {
            g.setColor(Color.white);
            g.fillRect(5, 5, this.getWidth() - 5, this.getHeight() - 5);
            for (int i = 0; i < this.getWidth(); i += lineSpace) {
                g.setColor(Color.BLACK);
                g.drawLine(i, 0, i, this.getHeight());
            }
            for (int j = 0; j < tr; j++) {
                g.setColor(Color.red);
                int iter = 0;
                for (int i = 0; i < needles; i++) {
                    needle n = new needle(this.getWidth(), this.getHeight(), lineSpace);
                    g.drawLine((int) n.getX(), (int) n.getY(), (int) n.getX2(), (int) n.getY2());
                    if ((int) n.getX() / lineSpace != (int) n.getX2() / lineSpace) {
                        iter++;
                    }
                }
                buffon b = new buffon();
                attempts += b.solve(needles, iter);
                System.out.println("att" + attempts);
            }
            Solution sol = new Solution(attempts / tr, needles);
            sol.setVisible(true);
            play = false;
            n++;
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
