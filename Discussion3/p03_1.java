package Discussion3;

import java.util.Scanner;

public class p03_1 {
    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 89, 23, 56,39,48,97};
        Scanner sc=new Scanner(System.in);
        
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > temp) {
                temp = nums[i];
            }
        }

        System.out.println("Greatest number = " + temp);

        System.out.print("Reversed series: ");

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

       
        System.out.print("\nEnter a number to check if prime :");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }

    }
}
