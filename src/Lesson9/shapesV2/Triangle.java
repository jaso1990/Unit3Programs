
package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import java.awt.Color;


public class Triangle extends AbstractShape{
    
    private double  base;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    boolean isEqual; //equalatieral triangle?
    
    public Triangle(){
        super();
        base = 1;
    }
    
    //will create equilatral
    public Triangle(double x, double y, double b){
        super(x, y);
        base = b;  
        x2 = xPos + (base /2);
        y2 = yPos + base;
        x3 = xPos + base;
        y3 = yPos;
        isEqual = true;
    }
    
    public Triangle(double x, double y, double xtwo, double ytwo, double xthree, double ythree){
        super(x,y);
        x2 = xtwo;
        y2 = ytwo;
        x3 = xthree;
        y3 = ythree;
        isEqual = false;
    }
    
    
    public void draw (Pen p){
        p.up();
        p.move(xPos, yPos);
        p.down();       
        p.move(x2, y2 );
        p.move(x3, y3);
        p.move(xPos, yPos);       
    }
    
    public double area(){
        return 0;//return Math.abs((1*y2-x2*y1) + (x2*y3-x3*y2) + (x3*y1-x1*y3)) / 2);
    }
    
    public void stretchBy(double f){
        x2 = (x2 - xPos) * f + xPos;
        y2 = (yPos - y2) * f + y2;
        x3 = (x3 - xPos) * f + xPos;
        //y3 will always be the same as yPos
    }
    
    //works for equilateral
    public void Equalmove(double x, double y){
        xPos = x;
        yPos = y;
        x2 = xPos +(base /2);
        y2 = yPos + base;
        x3 = xPos + base;
        y3 = yPos;
    }
    
    public void move (double x, double y){    
        xPos = x;
        yPos = y;
        x2 =  x2 - x;
    }
    
    public String toString(){
        String str = "This is a Triangle\n";
        str += "Base Length: " + base;
        str += "\n" + super.toString();
        return str;
    }
    
    
    
}
