
package Lesson9.Employee;

public class StaticExample {

    public static void main(String[] args) {
        System.out.println(Blob.identify());
        System.out.println("Currently, there are " + Blob.getBlobCount() + " blobs.");
        Blob b1, b2, b3;
        
        b1 = new Blob("Sammy");
        b2 = new Blob("Chloe");
        b3 = new Blob("Mickey");
        
        System.out.println("Hello, I am " + b1.getName());
        System.out.println("Hello, I am " + b2.getName());
        System.out.println("Hello, I am " + b3.getName());
        
        System.out.println(Blob.identify());
        System.out.println("Currently, there are " + Blob.getBlobCount() + " blobs.");
        
    }
    
}
