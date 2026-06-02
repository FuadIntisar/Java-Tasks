package Discussion1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double a,b;
        char ch;
        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();
        System.out.print("Enter an operator: ");
        ch = sc.next().charAt(0);

        if(ch == '+') {
            System.out.println("Output: " + (a + b));
        } else if(ch == '-') {
            System.out.println("Output: " + (a - b));
        } else if(ch == '*') {
            System.out.println("Output: " + (a * b));
        } else if(ch == '/') 
            if(b != 0) {
                System.out.println("Output: " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }
    }
}

