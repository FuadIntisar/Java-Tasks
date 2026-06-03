package Discussion3;

import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 30, 40, 50};
        double sum = 0;


        for (int i = 0; i < numbers.length; i++) 
            sum += numbers[i];
        

        double average = sum / numbers.length;

        System.out.println("Average = " + average);

        
        double Grade;
        System.out.print("Enter grade point :");
        Scanner sc=new Scanner(System.in);
        Grade=sc.nextDouble();
        
    
        if (Grade >= 3.5) {
            System.out.println("Student gets a medal.");
        } else {
            System.out.println("No medal. Grade is below 3.5.");
        }
       
    }
}
