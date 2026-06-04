package Discussion10;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stu = 5;
        int sub = 5;

        double[][] grade = new double[stu][sub];
        double[] credits = new double[sub];

        System.out.println("Enter credits for 5 subjects:");
        for (int i = 0; i < sub; i++) {
            credits[i] = sc.nextDouble();
        }

        System.out.println("Enter GPA of each student in each subject:");

        for (int i = 0; i < stu; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < sub; j++) {
                grade[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < stu; i++) {
            double totalPoints = 0;
            double sumCredit = 0;

            for (int j = 0; j < sub; j++) {
                totalPoints += grade[i][j] * credits[j];
                sumCredit += credits[j];
            }
            double cgpa = totalPoints / sumCredit;

            System.out.printf("Student of  CGPA " + (i + 1) +"=" + cgpa);
        }
    }
}