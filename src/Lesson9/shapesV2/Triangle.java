
package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import java.awt.Color;


public class Triangle extends AbstractShape{
    
    private double  base;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    
    
    
    //will create equilatral
    public Triangle(double x, double y, double b){
        super(x, y);
        base = b;  
        x2 = xPos + (base /2);
        y2 = yPos + base;
        x3 = xPos + base;
        y3 = yPos;
        
    }
    
    public Triangle(double x, double y, double xtwo, double ytwo, double xthree, double ythree){
        super(x,y);
        x2 = xtwo;
        y2 = ytwo;
        x3 = xthree;
        y3 = ythree;

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
        return Math.abs((1*y2-x2*yPos) + (x2*y3-x3*y2) + (x3*yPos-xPos*y3)) / 2;
    }
    
    public double perimeter(){
        double p = Math.sqrt((xPos-x2)*(xPos-x2) + (yPos-y2) * (yPos-y2));
        p += Math.sqrt((x2-x3)*(x2-x3) + (y2-y3) * (y2-y3));
        p += Math.sqrt((x3-xPos)*(x3-xPos) + (y3-yPos) * (y3-yPos));
        return p;
    }
    
    public void stretchBy(double f){
        x2 = (x2 - xPos) * f + xPos;
        x3 = (x3 - xPos) * f + xPos;
        y2 = (y2 - yPos) * f + yPos;
        
    }
    
    public void move(double x, double y){
        double xc = x - xPos;
        double yc = y - yPos;
        xPos =x;
        yPos =y;
        x2 += xc;
        y2 += yc;
        x3 += xc;
        y3 += yc;
        
    }
    
    public String toString(){
        String str = "This is a Triangle\n";
        str += "=====================";
        str += "\n" + super.toString();
        return str;
    } 
    
}
