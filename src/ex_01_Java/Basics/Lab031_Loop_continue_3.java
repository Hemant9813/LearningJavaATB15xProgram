package ex_01_Java.Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab031_Loop_continue_3 {
    public static void main (String[] args){
        System.out.println("Enter the no");
        Scanner scanner =new Scanner(System.in);
        int num =scanner.nextInt();

        for (int i=1; i<num; i++){
            if(i%2!=0){
                continue;


            }
            System.out.println("The no is even=>"+i);

        }
        System.out.println("End of program");

    }
}
