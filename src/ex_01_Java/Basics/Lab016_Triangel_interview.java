package ex_01_Java.Basics;

import java.util.Scanner;

public class Lab016_Triangel_interview {
    static void main(String[] args) {
        System.out.println("Enter the sides of triangle!");

        Scanner scanner= new Scanner(System.in);
        int side1 =scanner.nextInt();
        int side2 =scanner.nextInt();
        int side3=scanner.nextInt();

        if (side1==side2 && side2==side3 && side3==side1) {
            System.out.println(" triangle is equilateral (all sides are equal)1");
        }
        else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println(" isosceles (exactly two sides are equal)");
        }
        else {
            System.out.println(" scalene (no sides are equal)");

        }
    }
}
