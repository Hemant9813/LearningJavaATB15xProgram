package ex_01_Java.Basics;

import java.util.Scanner;

public class Lab029_Loop_continue {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        for (int i=1; i<num; i++){
            if(i>5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End of program");
    }
}
