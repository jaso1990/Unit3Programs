
package Lesson8.SamplePrograms;


public class IceCreamSurvey {

    public static void main(String[] args) {
        String survey[][] = {
            {"Emily", "Chocolate"},
            {"Matt", "Vanilla"},
            {"Joe", "Strawberry"},
            {"Luke", "Chocolate"},
            {"Tom", "Strawberry"},
            {"Dave", "Vanilla"},
            {"Bob", "Chocolate"},
            {"Sal", "Strawberry"},
            {"Jason", "Chocolate"},
            {"Matej", "Strawberry"}
        };
        
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print(j==0? "Name:" : "Flavour:");
                System.out.print("\t" + survey[i][j] + "\t");
            }
            System.out.println("");
            
        }
        System.out.println("");
        String cpeople[] = filter(survey, "Chocolate");
        String vpeople[] = filter(survey, "Vanilla");
        String speople[] = filter(survey, "Strawberry");
        
        System.out.println("Here is a list of chocolate people");
        for (int i = 0; i < cpeople.length; i++) {
            System.out.print(cpeople[i] + ", ");
        }
        System.out.println("\n\nHere is a list of vanilla people");
        for (int i = 0; i < vpeople.length; i++) {
            System.out.print(vpeople[i] + ", ");
        }
        System.out.println("\n\nHere is a list of strawberry people");
        for (int i = 0; i < speople.length; i++) {
            System.out.print(speople[i] + ", ");
        }
        
    }
    
    public static String[] filter(String data[][], String flav){
        String results = "";
        //go thru data looking for flav in spot [1]
        for (int i = 0; i < data.length; i++) {
            if (flav.equals(data[i][1]))
                results += data[i][0] + ", "; //Matt, Dave
        
        }
        return results.split(", "); //splits String at every comma into an array item
    }
    
}
