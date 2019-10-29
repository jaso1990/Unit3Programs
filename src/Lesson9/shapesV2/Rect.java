
package Lesson9.shapesV2;

import Lesson9.shapesV1.*;
import TurtleGraphics.Pen;
import java.awt.Color;


public class Rect extends AbstractShape{
    
    private double width, height;
    
    public Rect(){
        super();
        height = 1;
        width = 1;
    }
    
    public Rect(double x, double y, double w, double h){
        super();
        height = h;
        width = w;
    }
    
    public double area() {
        return width * height;
    }
    
    public void stretchBy(double factor) {
        width = width * factor;
        height = height * factor;
    }

    
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

    public String toString(){
        String str = "This is a Rectangle\n";
        str += "Width: " + width + "\tHeight: " + height;
        str += "\n" + super.toString();
        return str;
    }
   
    public void erase(Pen p) {
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
}
