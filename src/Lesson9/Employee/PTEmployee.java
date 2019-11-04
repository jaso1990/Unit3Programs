
package Lesson9.Employee;


public class PTEmployee extends Employee {
    
    public PTEmployee(){
        super();
    }

    @Override
    public double getPay() {
        totalPay += rate * hours; //adding to total pay
        return hours * rate;
    }
    
}
