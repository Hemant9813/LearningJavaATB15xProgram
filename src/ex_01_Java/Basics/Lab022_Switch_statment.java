package ex_01_Java.Basics;

import java.util.Scanner;

public class Lab022_Switch_statment {
   static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number from 1 to 7");

if (scanner.hasNextInt()){
       int day= scanner.nextInt();
       switch(day) {
           case 1:
               System.out.println("Mon");
               break;
           default:
               System.out.println("Enter valid data");
               break;
           case 2:
               System.out.println("Tue");
               break;
           case 3:
               System.out.println("Wed");
               break;
           case 4:
               System.out.println("Thursday");
       }
       }
else {
    System.out.println("Enter only digit");
}
       System.out.println("End of the program");
}

    }

