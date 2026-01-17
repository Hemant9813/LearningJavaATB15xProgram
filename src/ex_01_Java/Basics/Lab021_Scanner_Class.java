package ex_01_Java.Basics;

import java.util.Scanner;

public class Lab021_Scanner_Class {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name");
        String name =scanner.nextLine();

        System.out.println("Your age");
        int age =scanner.nextInt();

        System.out.println("Your name is"+" "+name+" "+"Your age is"+" "+age);
    }
}
