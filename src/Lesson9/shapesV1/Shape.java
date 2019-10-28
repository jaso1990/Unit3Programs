
package Lesson9.shapesV1;
import TurtleGraphics.Pen;

public interface Shape {
    
    public double area();
    public void draw(Pen p);
    public double getXPos();
    public double getYPos();
    public void move(double xloc, double yloc);
    public void stretchBy(double factor);
    public void erase(Pen p);
    public String toString();
    
}
