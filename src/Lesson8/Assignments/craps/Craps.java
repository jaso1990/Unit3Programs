
package Lesson8.Assignments.craps;

import java.awt.Color;
import java.awt.Graphics;

public class Craps {
    private Dice d1, d2;
    private int rnum, point;
    private boolean newGame;
    
    public Craps (Graphics g1, Graphics g2, int s1, int s2){
        //make 2 dice for 2 panels
        d1 = new Dice(g1, s1);
        d2 = new Dice(g2, s2);
        //set Color
        d1.setColor(Color.red, Color.white);
        d2.setColor(Color.red, Color.white);
        rnum = 0;
        point = 0;
        newGame = true;
    }
    
    public void roll(){
        newGame = false;
        rnum++;
        d1.roll();
        d2.roll();
        if (rnum==1)
            point = getTotal();
        d1.draw();
        d2.draw();
    }
    
    public boolean isNewGame(){
        return newGame;
    }
    
    public int getTotal(){
        return d1.getValue() + d2.getValue();
    }
    
    public int getPoint(){
        return point;
    }
    
    public boolean hasWon(){
        boolean isWinner = false;
        if (rnum==1){
            if (getTotal()== 7 || getTotal() == 11)
                isWinner = true;
        }
        else if (rnum>1){
            if (getTotal()== point)
                isWinner = true;
    }
        return isWinner;
    }
    public boolean hasLost(){
        boolean isLoser = false;
        if (rnum==1){
            if (getTotal() == 2 || getTotal() == 3 || getTotal() == 12 )
                return true; 
        }
        else if (rnum>1){
            if (getTotal() == 7)
                return true;
        }
        return isLoser;
    }
        
        
    
}
