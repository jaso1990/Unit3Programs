
package Lesson9.shapesV2;
import Lesson9.shapesV1.*;
import TurtleGraphics.Pen;
import java.awt.Color;

abstract public class AbstractShape implements Shape{
    
    protected double xPos, yPos;
    
    public AbstractShape(){
        xPos = 0;
        yPos = 0;
    }
    
    public AbstractShape(double x, double y){
        xPos = x;
        yPos = y;
    }
    
    //abstract methods are diff in each child class so must be defined there
    abstract public double area();
    abstract public void draw(Pen p);
    abstract public void stretchBy(double fact);
    
    //since the following methods are identical in all children classes, we make one method in parent class
    //called final methods
    public final double getXPos(){
        return xPos;
    }

    public final double getYPos(){
        return yPos;
    }
    
    public void move(double x, double y){
        xPos = x;
        yPos = y;
    }
    
    //toString is neither abstract OR final
    //child classes have permission to override or extend 
    public String toString(){
        String str = "X-Y Position= " + xPos + ", " + yPos;
        str += "\nArea= " + area();
        return str;
    }
    
    public final void erase(Pen p) {
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
    
   
    
}
