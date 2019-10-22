package Lesson8.SamplePrograms;

public class QuizReview {

    public static void main(String[] args) {
        /*
        5 Definitions: Parallel Arrays, 2D Arrays, Ragged Array, Phyiscal/Logical Size
        
        Coding: 
        Write a method that adds up (and returns the total) of all numbers in a 2D Array
        Write a method that counts how many of a certain number are in a 1D Array
        
        1 CodingBat (1 of 2)
         */
        System.out.println("Program 1\n");
        int nums[][] = new int[4][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = i * 10 + j;
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.print("The total of all numbers is: ");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        System.out.println(sum);
        
        System.out.println("\n=========================================\nProgram 2");
        int x[] = {7, 4, 8, 9, 6, 7, 5, 3, 5, 7, 4, 2, 4, 6};
        int y[] = {7, 8, 9, 4, 5, 6};
        //         0 1 2 3 4 5 6 7 8 9 ... 

        int numx7 = count7(x);
        int numy7 = count7(y);
        System.out.format("There are %d 7(s) in X and %d 7(s) in Y", numx7, numy7);
        System.out.println("\n============================================================");

        //CODING BAT 1
        System.out.println("\nCoding Bat Review 1");
        int cb1[] = fizzArray3(11, 18);
        System.out.print("[");
        for (int i = 0; i < cb1.length; i++) {
            System.out.print(cb1[i] + ", ");
        }
        System.out.print("]");
        
        //CODING BAT 2
        System.out.println("\n============================================\nCoding Bat 2");
        int cb2[] = {6,2,5,3};
        cb2 = shiftLeft(cb2);
        System.out.print("[");
        for (int i = 0; i < cb2.length; i++) {
            System.out.print(cb2[i] + ", ");
        }
        System.out.print("]\n");
    }

    public static int count7(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                total++;
            }
        }
        return total;
    }

    public static int[] fizzArray3(int start, int end) {
        int arr[] = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            arr[index] = i;
            index++;
        }

        return arr;

    }

    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 0) 
            return nums;       
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) 
            nums[i] = nums[i + 1];
        nums[nums.length - 1] = first;
        return nums;
    }

}
