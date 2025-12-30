package ex_01_Java.Basics;

public class Lab014_ifelse2 {
    static void main(String[] args) {
        System.out.println("take input from CLI");
        int age =Integer.parseInt(args[0]);
        System.out.println(age);

        if (age<18) {
            System.out.println("valid for voting");
        }
            else{
            System.out.println("not valid");

        }
    }
}
