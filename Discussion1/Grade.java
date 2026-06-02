package Discussion1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        int grade;
        System.out.print("Enter a mark between (0-100) : ");
        grade = sc.nextInt();
        if(grade >= 90) {
            System.out.println("Grade: A+");
        } else if(grade >= 80){
            System.out.println("Grade: A");
        } else if(grade >= 70){
            System.out.println("Grade: A-");
        } else if(grade >= 60){
            System.out.println("Grade: B");
        } else if(grade >= 40){
            System.out.println("Grade: C+");
        } else {
            System.out.println("Grade: F");
        }
    }
}

