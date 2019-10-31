
package Lesson9.shapesV2;

import Lesson9.shapesV1.*;
import TurtleGraphics.Pen;

public class Wheel extends Circle {
    
    private double spokes;
    //wheel has 4 properties
    //it inherits x, y, and radius from circle
    
    public Wheel(double x, double y, double r, double s) {
        super(x, y, r); // 'super' calls the Parent class connstructor
        spokes = s;
    }
    
    public Wheel(){
        super();
        spokes = 5;
    }
    
    //all methods from circle are available to wheel by default
    
    //some methods -> area, get x & get y, stretchBy, move are fine as is from circle class
    //others like draw are a good start, but need to be added on (extended)  
    //toString must be overridden
    
    public void draw(Pen p){
        //call parent version (will do what circle's draw method does)
        super.draw(p);
        
        //draw the spokes (special to wheel)
        for (int i = 0; i <= spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection(i * (360/spokes));
            p.move(radius);
        }
    }
    
    
    public String toString(){
        String str = "Wheel\n======\n";
        str += "xPos: " + xPos + ", Ypos " + yPos;
        str += "\nRadius: " + radius;
        str += "\nSpokes: " + spokes;
        str += String.format("\nArea: %.2f", area());
        return str;
    }
    
    public void setSpoke(int s){
        spokes = s;
    }
    
}
