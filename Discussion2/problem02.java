package Discussion2;

import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }

        
        System.out.println("\nEven Series:");
        int evenSum = 0;

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            evenSum += i;
        }

        System.out.println("\nSum of Even Series = " + evenSum);

    
        System.out.println("\nOdd Series:");
        int oddSum = 0;

        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
            oddSum += i;
        }

        System.out.println("\nSum of Odd Series = " + oddSum);
    
    }
}