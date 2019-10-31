
package Lesson9.shapesV2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class makeShapes2 {

    public static void main(String[] args) {
        StandardPen p = new StandardPen(new SketchPadWindow(800,600));
        Circle c  = new Circle();
        Rect r = new Rect();
        c.draw(p);
        r.draw(p);
        
    }
    
}
