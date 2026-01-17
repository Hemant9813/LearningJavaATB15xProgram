package ex_01_Java.Basics;

import java.util.Scanner;

public class Lab036_Practice_loop {
    static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number ");

        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
        else{
            System.out.println("Enter valid no");
        }
        System.out.println("End of the prog");



    }
}
