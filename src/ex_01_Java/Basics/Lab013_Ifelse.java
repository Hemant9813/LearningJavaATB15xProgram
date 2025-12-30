package ex_01_Java.Basics;

public class Lab013_Ifelse {
    static void main(String[] args) {
       System.out.println("Take the Input as a User from CLI/Command");
        int age =Integer.parseInt(args[0]);
 if (age >18) {
     System.out.println("can goto bar");
 }
 else {
     System.out.println("can not");
 }



    }
}
