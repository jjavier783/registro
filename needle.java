/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author RA302
 */
public class needle {
    private double x, y, x2, y2;
    
    public needle(double width, double height, double lineSpace){
        x=(Math.random()*width-10);
        y=(Math.random()*height-10);
        double ang=(Math.random()*360);
        double rad=Math.toRadians(ang);
        x2= (lineSpace*Math.sin(rad))+x;
        y2=(lineSpace*Math.cos(rad))+y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(double y2) {
        this.y2 = y2;
    }

   
}
