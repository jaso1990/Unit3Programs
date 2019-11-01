
package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class test {

    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        Triangle t = new Triangle(10, 10, 100, 50, 200, 30);
        Triangle t2 = new Triangle (10, 10, 20);
        
        t2.draw(p);
        t2.move(-100, -100);
        t2.draw(p);
        
        
    }
    
}
