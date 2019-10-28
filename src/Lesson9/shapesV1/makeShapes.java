package Lesson9.shapesV1;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class makeShapes {

    public static void main(String[] args) {
        Shape shp[] = new Shape[10];
        for (int i = 0; i < shp.length; i++) {
            if (i < 5) {
                shp[i] = getRandCircle();
            }
            else shp[i] = getRandRect();
        }
        
        StandardPen p = new StandardPen(new SketchPadWindow(640,480));
        for (Shape shape : shp) {
            shape.draw(p);
        }
        
        Scanner scan = new Scanner(System.in);
        for(Shape shape : shp){
            System.out.println("Press <ENTER> to shrink a shape");
            scan.nextLine();
            shape.erase(p);
            shape.stretchBy(.5);
            shape.draw(p);
        }
        
        for(Shape shape : shp){
            System.out.println("Press <ENTER> to move a shape");
            scan.nextLine();
            shape.erase(p);
            shape.move(shape.getXPos()+50, shape.getYPos()+50);
            shape.draw(p);
        }
        
        System.out.println("Press <ENTER> to move a shape");
        scan.nextLine();
        for (Shape shape: shp){
            if(shape instanceof Circle){
                ((Circle)shape).turnGreen(p); //this is what casting an object looks like
            }
            
        }

    }

    public static Circle getRandCircle() {
        Circle temp = new Circle((Math.random() * 400 - 200), (Math.random() * 400 - 200), (Math.random() * 50 + 50));
        return temp;
    }

    public static Rect getRandRect() {
        Rect temp = new Rect((Math.random() * 400 - 200), (Math.random() * 400 - 200), (Math.random() * 100 + 50), (Math.random() * 100 + 50));
        return temp;
    }

}
