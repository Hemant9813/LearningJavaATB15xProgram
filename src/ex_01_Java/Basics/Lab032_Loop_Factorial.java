package ex_01_Java.Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab032_Loop_Factorial {
    public static void main(String[] args){
        System.out.println("Enter the No");
        Scanner scanner=new Scanner(System.in);
        //int fact = 1;

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println(num);
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
                //System.out.println("Factorial is"+fact);
            }
            System.out.println("Factorial is" + " " + fact);
        }
        else{
            System.out.println("Enter the valid number");
        }
        scanner.close();
    }
}
