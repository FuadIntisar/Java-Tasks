package Discussion3;

import java.util.Scanner;

public class p03_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums = {12, 45, 7, 89, 23, 56,39,48,97};

        int even = 0;
        int odd = 0;

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        
        System.out.print("Fibonacci Series: ");

        int first = 0, second = 1;
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " " );

            int next = first + second;
            first = second;
            second = next;
        }
    }
}


