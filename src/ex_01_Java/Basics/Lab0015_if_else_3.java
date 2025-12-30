package ex_01_Java.Basics;

import java.util.Scanner;

public class Lab0015_if_else_3 {
    static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the age");
        int age =scanner.nextInt();
        System.out.println(age);

        if (age > 18) {
            System.out.println("we can vote");
        }
        else{
            System.out.println("we cant");
        }
    }
}
