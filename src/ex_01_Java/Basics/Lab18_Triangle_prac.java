package ex_01_Java.Basics;

import java.util.Scanner;
//Write a program that classifies a triangle based on its side lengths. Given three input values representing
//the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles
 //(exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify
// the triangle.

public class Lab18_Triangle_prac {
    static void main(String[] args) {
        System.out.println("Take the input from user");
        Scanner scanner= new Scanner(System.in);
        int side1 =scanner.nextInt();
        int side2 = scanner.nextInt();
        float side3 = scanner.nextFloat();

        if (side1==side2 && side2==side3 && side3==side1){
            System.out.println("equilateral (all sides are equal)");
        }else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("isosceles (exactly two sides are equal)");
        }else {
            System.out.println("scalene (no sides are equal)");
        }
    }
}
