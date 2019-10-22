
package Lesson8.SamplePrograms;

import java.util.Scanner;

public class ParellelSearch {
    
    public static void main(String args[]){
        
    
    String name[] = {"BOB", "SUE", "JOE", "ANDY", "KIM"};
    //ages are in same order as names means its parallel
    int age[] = {45, 17, 21, 35, 57};
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter name to search for age: ");
    String searchName = s.nextLine();
    
    //search for name
    int loc = -1;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(searchName))
                loc = i;   
        }
        
        if (loc == -1)
            System.out.println(searchName + " not found");
        else
            System.out.println(searchName + "'s age is " + age[loc]);
    
    }
}
