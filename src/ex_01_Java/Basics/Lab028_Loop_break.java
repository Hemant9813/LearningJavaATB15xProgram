package ex_01_Java.Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab028_Loop_break {
    public static void main(String [] args){

        System.out.println("Enter the no");
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();

        for(int i=0; i<num; i++){
            System.out.println(i);
            if(i==10){
                break;
            }
            //System.out.println(i);
        }
        System.out.println("End of program");
    }
}
