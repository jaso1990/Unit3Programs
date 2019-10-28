package Lesson9.shapesV1;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class makeShapes {

    public static void main(String[] args) {
        
        Wheel w = new Wheel(10,10,50,6);
        System.out.println("Wheel is at " +w.getXPos() + ", " + w.getYPos());
        
        Shape shp[] = new Shape[10];
        for (int i = 0; i < shp.length; i++) {
            if (i < 3) 
                shp[i] = getRandCircle(); 
            else if (i < 8) 
                shp[i] = getRandRect();
            else{
                shp[i] = getRandWheel();
                System.out.println(shp[i]);
            }
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
        
        System.out.println("Press <ENTER> to make all circles green");
        scan.nextLine();
        for (Shape shape: shp){
            if(shape instanceof Circle || shape instanceof Wheel)
                ((Circle)shape).turnGreen(p); //this is what casting an object looks like   
            if (shape instanceof Wheel)
                System.out.println(shape);           
        }
        
        System.out.println("And wheels have had their spokes set to 20");
        for (Shape shape : shp) {
            if (shape instanceof Wheel){
                shape.erase(p);
                ((Wheel)shape).setSpoke(20);
                shape.draw(p);
            }
        }

    }

    public static Circle getRandCircle() {
        Circle temp = new Circle((Math.random() * 400 - 200), (Math.random() * 400 - 200), (Math.random() * 50 + 50));
        return temp;
    }
    
     public static Wheel getRandWheel() {
        Wheel temp = new Wheel((Math.random() * 400 - 200), (Math.random() * 400 - 200), (Math.random() * 50 + 50),10 );
        return temp;
    }

    public static Rect getRandRect() {
        Rect temp = new Rect((Math.random() * 400 - 200), (Math.random() * 400 - 200), (Math.random() * 100 + 50), (Math.random() * 100 + 50));
        return temp;
    }

}
