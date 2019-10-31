package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Circle extends AbstractShape{
    
    protected double radius; //protected means only for 'me and my children' 
    
    public Circle(){
        super();
        radius = 10;
    }
    
    public Circle(double x, double y, double r){
        super(x ,y);
        radius = r;
    }
   
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public void stretchBy(double factor) {
        radius = radius * factor;
    }
    
    public void draw(Pen p) {
        double side = (2 * Math.PI * radius) / 120;
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.move(radius);
        p.turn(90);
        p.down();
        
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }
    
    public String toString(){
        String str = "This is a Circle\n";
        str += "Radius: " + radius;
        str += "\n" + super.toString();
        return str;
    }
    
    public void erase(Pen p) {
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
    public void turnGreen(Pen p){
        erase(p);
        p.setColor(Color.green);
        draw(p);
    }
    
}
