package Discussion1;
import java.util.Scanner;

class Triangle {

    double base, height;
    double sideA, sideB, sideC;
    double side;

    Triangle(double side) {
        this.side = side;
    }

    Triangle(double s1, double s2, double s3) {
        sideA = s1;
        sideB = s2;
        sideC = s3;
    }

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        if (base > 0 && height > 0) {
            return 0.5 * base * height;
        } 
        else if (sideA > 0 && sideB > 0 && sideC > 0) {
            double s = (sideA + sideB + sideC) / 3;
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        } 
        else if (side > 0) 
            return (Math.sqrt(3) / 4.0) * side * side;

        return 0;

    }

}


class Ball {
    double r;

    Ball(double ballR) {
        r = ballR;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
}

class Circle {
    double r;

    Circle(double circleR) {
        r = circleR;
    }

    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

}

public class problem01 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        Triangle t1;

        System.out.print("Enter the base and height of the triangle: ");

        double base = sc.nextDouble();
        double height = sc.nextDouble();
        t1 = new Triangle(base, height);
        System.out.println("Area of the triangle is: " + t1.area());


        Triangle t2;
        System.out.print("Enter the three sides of the triangle: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        t2 = new Triangle(s1, s2, s3);
        System.out.println("Area of the triangle is: " + t2.area());    


        Triangle t3;
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = sc.nextDouble();
        t3 = new Triangle(side);
        System.out.println("Area of the  equilateral triangle is: " + t3.area());



        Ball b;
        System.out.print("Enter the radius of  ball: ");
        double radius = sc.nextDouble();
        b = new Ball(radius);
        System.out.println("Volume of the ball is: " + b.volume()); 


        Circle c;
        System.out.print("Enter the radius of circle: ");
        double cRadius = sc.nextDouble();
        c = new Circle(cRadius);
        System.out.println("Area of the circle is: " + c.area());   


        System.out.print("Enter a number :");
        int n = sc.nextInt();

        if(n % 2 == 0)
            System.out.println(n + " is even.");
        else
            System.out.println(n + " is odd.");


        System.out.print("Enter a number :");
        int a=sc.nextInt();

        if(a > 0)
            System.out.println(a + " is positive.");
        else if(a < 0)
            System.out.println(a + " is negative.");
        else 
            System.out.println(a + " is zero.");
        
    }
}